# 🍽️ API CRUD de Comidas

Este projeto consiste no desenvolvimento de uma API REST para gerenciamento de alimentos (“Comida”), permitindo operações básicas de cadastro, listagem e remoção de registros.

Foi desenvolvido como meu **primeiro projeto utilizando o Spring Boot**, com o objetivo de **consolidar os fundamentos de Java e Programação Orientada a Objetos**, após aproximadamente dois meses de estudo com base no livro *Java How to Program*.

---

## 🚀 Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

---

## 🧠 Conceitos Aplicados

- Arquitetura em camadas (Controller, Service, Repository)
- Injeção de Dependência
- API REST
- Persistência de dados com JPA

## 📌 Funcionalidades

- ✅ Cadastrar alimentos (POST)
- ✅ Listar todos os alimentos (GET)
- ✅ Deletar alimentos (DELETE)

---

## 🔗 Endpoints

### 📤 POST /Comida
Cria um novo registro
<img width="1423" height="932" alt="image" src="https://github.com/user-attachments/assets/aa655c33-39e6-4ad5-93c4-466773fb4e15" />

Outro registro:
<img width="1429" height="935" alt="image" src="https://github.com/user-attachments/assets/e3ba4263-0761-4590-bb1e-0673ac15d352" />

### 📥 GET /Comida
Lista todos os registros
<img width="1427" height="923" alt="image" src="https://github.com/user-attachments/assets/00167952-bc64-41d1-ab95-79d662ac793b" />

### 🗑️ DELETE /Comida
Deleta a comida mediante ao ID passado
<img width="1430" height="934" alt="image" src="https://github.com/user-attachments/assets/a1766e0c-3924-4a79-b359-8ada104139f2" />


## 🛠️ Como rodar o projeto

1. Clone o repositório:
```bash
   git clone https://github.com/seu-usuario/seu-repo.git
```

2. Abra o projeto na IDE (IntelliJ ou Eclipse)

3. Execute a aplicação

4. Acesse o console do H2:
```bash
  http://localhost:8080/h2-console
```

### ⚙️ Configuração do H2

| Campo    | Valor                  |
|----------|------------------------|
| JDBC URL | `jdbc:h2:mem:testdb`   |
| User     | `sa`                   |
| Password | *(vazio)*              |

