# RankRoom – Inloggning med Cognito + Användarspecifik datalagring

Detta projekt är en Spring Boot-applikation där användaren loggar in via **AWS Cognito** och sedan kan:

-  Spara ett filmnamn + betyg (0–10)
-  Visa tidigare sparade betyg (kopplade till inloggad användare)
-  Radera sina sparade betyg

---

## Teknikstack

- **Java 17**
- **Spring Boot**
- **Spring Security + OAuth2 Client**
- **Thymeleaf**
- **MySQL** (lokal databas)
- **AWS Cognito** (användarautentisering)

---

##  Funktionalitet

| Funktion                             
|---------------------------------------
| Inloggning via Cognito
| Spara användarspecifik data
| CRUD (Create + Delete) för ratings
| Formulär med CSRF-skydd
| Logout med Cognito redirect 
| Respons i webbläsare via Thymeleaf

---

##  Demonstration

En video som visar hela flödet (inloggning → spara film → radera film) finns bifogad:  
 **RankRoom.mp4**

---

## Inloggning
Inloggning sker via Cognito på:
http://localhost:8080/oauth2/authorization/cognito

Vid lyckad inloggning omdirigeras användaren till /, där formuläret och tidigare betyg visas.

## Exempel på användning
Gå till startsidan: localhost:8080

Klicka på "Logga in"

Cognito öppnas, logga in som användare

Lägg till en film + betyg via formuläret

Se dina sparade betyg

Radera valfri betygspost
