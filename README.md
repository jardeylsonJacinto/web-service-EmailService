# Email Service - Uber Backend Challenge

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

Este projeto é um microserviço desenvolvido para o [Uber Backend Challenge](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md). A API permite o envio de e-mails utilizando **Java, Spring Boot e AWS Simple Email Service (SES)**, garantindo alta disponibilidade e troca automática de provedores em caso de falha.

## 📌 Tabela de Conteúdos
- [Instalação](#instalação)
- [Configuração](#configuração)
- [Uso](#uso)
- [Endpoints da API](#endpoints-da-api)
- [Contribuição](#contribuição)
- [Licença](#licença)

---

## 🚀 Instalação
### **Requisitos**
- Java 21+
- Maven
- Docker (opcional para banco de dados ou mensageria)

### **Passos para instalação**
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/email-service.git
   cd email-service
   ```
2. Instale as dependências:
   ```bash
   mvn clean install
   ```
3. Configure suas credenciais AWS no `application.properties`:
   ```properties
   aws.region=us-east-1
   aws.accessKeyId=SUA_ACCESS_KEY
   aws.secretKey=SUA_SECRET_KEY
   ```
4. Inicie a aplicação:
   ```bash
   mvn spring-boot:run
   ```
5. A API estará acessível em: [http://localhost:8080](http://localhost:8080)

---

## ⚙️ Uso da API
### **Endpoint: Envio de E-mail**
- **URL:** `/api/email/send`
- **Método:** `POST`
- **Corpo da Requisição:** (JSON)
  ```json
  {
    "to": "destinatario@example.com",
    "subject": "Assunto do Email",
    "body": "Conteúdo do email"
  }
  ```
- **Resposta de Sucesso:**
  ```json
  {
    "message": "Email sent successfully"
  }
  ```
- **Resposta de Erro:**
  ```json
  {
    "error": "Error sending email: <mensagem do erro>"
  }
  ```

---

## 🛠 Contribuição
Contribuições são bem-vindas! Se encontrar problemas ou quiser sugerir melhorias, siga os passos abaixo:
1. Faça um fork do repositório
2. Crie uma branch para sua funcionalidade (`git checkout -b minha-feature`)
3. Commit suas mudanças (`git commit -m 'Adicionando nova feature'`)
4. Faça um push para a branch (`git push origin minha-feature`)
5. Abra um Pull Request

Recomenda-se seguir o padrão de commits [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/).

---

## 📜 Licença
Este projeto está sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.

