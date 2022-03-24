package com.example.demo.email;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class SMTPAuthenticator extends Authenticator {
@Override
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(
"cyk4497@gmail.com", "bggxfacjqygruyhz");
}
}