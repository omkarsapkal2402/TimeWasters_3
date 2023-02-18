<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Properties" %>
<%@ page import="javax.mail.Session" %>
<%@ page import="javax.mail.Message" %>
<%@ page import="javax.mail.Transport" %>
<%@ page import="javax.mail.internet.InternetAddress" %>
<%@ page import="javax.mail.internet.MimeMessage" %>

<!DOCTYPE html>
<html>
<head>
    <title>Send Email</title>
</head>
<body>
    <h1>Send Email</h1>
    <form action="sendemail.jsp" method="post">
        <label for="to">To:</label>
        <input type="email" id="to" name="to" required><br>
        <label for="subject">Subject:</label>
        <input type="text" id="subject" name="subject" required><br>
        <label for="message">Message:</label>
        <textarea id="message" name="message" rows="10" cols="30" required></textarea><br>
        <button type="submit">Send</button>
    </form>
    <br>
    <% 
    // Check if the form has been submitted
    if (request.getMethod().equals("POST")) {
        // Get the form data
        String to = request.getParameter("to");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");

        // Set up mail server properties
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587"); // use the appropriate port for your server
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true"); // enable TLS encryption

        // Set up authentication information
        String username = "vedantdhamale11@gmail.com";
        String password = "vewqxfsjljdpgpve";

        // Create a mail session with the specified properties
        Session ses = Session.getInstance(props);

        try {
            // Create a new message
            Message msg = new MimeMessage(ses);

            // Set the From address
            msg.setFrom(new InternetAddress("vedantdhamale11@gmail.com"));

            // Set the To address
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

            // Set the subject
            msg.setSubject(subject);

            // Set the message text
            msg.setText(message);

            // Authenticate and send the message
            Transport.send(msg, username, password);
            out.println("Message sent successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    %>
</body>
</html>
