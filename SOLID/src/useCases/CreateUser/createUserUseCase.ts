import { User } from "../../entities/User"
import { IMailProvider } from "../../providers/IMailProvide"   
import { IUsersRepository } from "../../repositories/IUsersRepository"   
import { ICreateUserRequestDTO } from "./ICreateUserDTO"

export class CreateUserUseCase {

    constructor(
        private usersRepository: IUsersRepository,
        private mailProvider: IMailProvider,
    ) {}

    async execute(data: ICreateUserRequestDTO){
        const userAlreadyExists = await this.usersRepository.findByEmail(data.email)

        if (userAlreadyExists){
            throw new Error("User already exists.");
        }

        const user = new User(data);

        await this.usersRepository.save(user);

        this.mailProvider.sendMail({
            to: {
                name: data.name,
                email: data.email
            },
            from: {
                name: "jgmarquesm",
                email: "teste.envio.email.jgmarquesm@gmail.com"
            },
            subject: `Welcome, ${data.name}!`,
            body: "<p>You already can login in our plataform!</p>"
        })
    }
}