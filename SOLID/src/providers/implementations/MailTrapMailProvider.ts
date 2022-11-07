import Mail from "nodemailer/lib/mailer";
import nodemailer from "nodemailer"
import { IMailProvider, IMessage } from "../IMailProvide";

export class MailTrapMailProvider implements IMailProvider{
    private transporter: Mail;

    constructor() {
        this.transporter = nodemailer.createTransport({
            host = 'smtp.mailtrap.io',
            port: 2525,
            auth: {
                user: "5d08c14fd839aa",
                password: "255ad93d7a187b",
            },
            
        })
    }

    async sendMail(message: IMessage): Promise<void> {
         await this.transporter.sendMail({
            to: {
                name: message.to.name,
                address: message.to.email
            },
            from: {
                name: message.from.name,
                address: message.from.email
            },
            subject: message.subject,
            html: message.body
         })
    }

}