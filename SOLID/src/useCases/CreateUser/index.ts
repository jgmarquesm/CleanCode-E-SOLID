import { CreateUserUseCase } from "./createUserUseCase"
import { CreateUserController } from "./CreateUserController"
import { MailTrapMailProvider } from "../../providers/implementations/MailTrapMailProvider"
import { PostgresUserRepository } from "../../repositories/implementations/PostgresUserRepository"


const mailTrapProvider = new MailTrapMailProvider() 
const postgresUserRepository = new PostgresUserRepository()

const createUserUseCase = new CreateUserUseCase(
    postgresUserRepository,
    mailTrapProvider
)

const createUserController = new CreateUserController(
    createUserUseCase
)