package br.juliok.HelloWorldLogExampleSpring;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;



@Component
public class LogEmailSender {
	
	@Autowired
	private JavaMailSender mailSender;
	
	
	public void sendLogsByEmail() {
		try {
			MimeMessage message = mailSender.createMimeMessage();
			
			MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
			
			
			helper.setFrom("julio4kbeta@gmail.com");
			helper.setTo("julio4kbeta@gmail.com");
			helper.setSubject("Log da aplicação");
			
			String htmlContent = """
					
					 <html>
                    <body style="font-family: Arial, sans-serif; line-height: 1.6; color: #333;">
                        <div style="text-align: center; margin-bottom: 20px;">
                            <img src="cid:logo" alt="Logo da Empresa" style="width: 150px;"/>
                        </div>
                        <h2 style="color: #4CAF50;">Notificação de Logs da Aplicação</h2>
                        <p>Olá,</p>
                        <p>Os logs da aplicação foram gerados e estão anexados a este e-mail.</p>
                        <p>Se precisar de mais informações, entre em contato conosco.</p>
                        <br/>
                        <p>Atenciosamente,</p>
                        <p><strong>Sua Empresa</strong></p>
                        <hr/>
                        <p style="font-size: 0.8em; color: #888;">Este é um e-mail automático. Por favor, não responda.</p>
                    </body>
                    </html>
					
					
					
					""";
			
			helper.setText(htmlContent,true);
			
			File logFile = new File("log/SpringHello.log");
			if(logFile.exists()) {
				
				//helper.addInline("log",logFile);
				helper.addAttachment("arquivoLog.log",logFile);
				
			}
			
			
			
			mailSender.send(message);
			
			System.out.println("E-mail enviado...");
						
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
