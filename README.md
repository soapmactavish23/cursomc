<h1 align="center">
   <img src="prints/logo.png" width="400">
</h1>

<h4 align="center"> 
	🚧 Pedidos - Back-End 🚀 Concluido...  🚧
</h4>

## ✅ Funções

- [x] Criar Categoria
- [x] Atualizar Categoria
- [x] Deletar Categoria
- [x] Listar Categoria
- [x] Buscar Categoria pelo Id
- [x] Listar Categoria Paginado
- [x] Criar Cliente
- [x] Atualizar Cliente
- [x] Deletar Cliente
- [x] Listar Cliente
- [x] Buscar Cliente pelo Id
- [x] Listar Cliente Paginado
- [x] Criar Pedido
- [x] Buscar Pedido pelo Id
- [x] Listar Pedido Paginado
- [x] Buscar Produto pelo Id
- [x] Listar Produto Paginado

## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" heigth="20" width="20"/> [Spring Boot](https://spring.io/projects/spring-boot)
- <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" heigth="20" width="20"/> [Java](https://www.java.com/pt-BR)
- <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" heigth="20" width="20"/> [MySQL](https://www.mysql.com)

## 🖥️ Plataforma adotada

  - WEB

## User Request

### Path 
`/api/user`
### Method
`POST`
### Request body
    {
	  "id": "string",
	  "email": "string",
	  "password": "string",
	  "profile": "ROLE_ADMIN"
	}
	
### Response
	{
	  "data": {
	    "id": "string",
	    "email": "string",
	    "password": "string",
	    "profile": "ROLE_ADMIN"
	  },
	  "errors": [
	    "string"
	  ]
	}

### Path 
`/api/user`
### Method 
`PUT`
### Request body
    {
	  "id": "string",
	  "email": "string",
	  "password": "string",
	  "profile": "ROLE_ADMIN"
	}
	
### Response:
	{
	  "data": {
	    "id": "string",
	    "email": "string",
	    "password": "string",
	    "profile": "ROLE_ADMIN"
	  },
	  "errors": [
	    "string"
	  ]
	}

### Path 
`/api/user/{page}/{count}`
### Method 
`GET`
### Response
	{
	  "data": {
	    "totalPages": 0,
	    "totalElements": 0,
	    "sort": {
	      "sorted": true,
	      "unsorted": true
	    },
	    "pageable": {
	      "sort": {
		"sorted": true,
		"unsorted": true
	      },
	      "pageNumber": 0,
	      "pageSize": 0,
	      "paged": true,
	      "unpaged": true,
	      "offset": 0
	    },
	    "first": true,
	    "numberOfElements": 0,
	    "last": true,
	    "size": 0,
	    "content": [
	      {
		"id": "string",
		"email": "string",
		"password": "string",
		"profile": "ROLE_ADMIN"
	      }
	    ],
	    "number": 0
	  },
	  "errors": [
	    "string"
	  ]
	}
	
### Path 
`/api/user/{id}`
### Method 
`GET`
### Response
	{
	  "data": {
	    "id": "string",
	    "email": "string",
	    "password": "string",
	    "profile": "ROLE_ADMIN"
	  },
	  "errors": [
	    "string"
	  ]
	}
	
### Path 
`/api/user/{id}`
### Method 
`DELETE`
### Response
	{
	  "data": "string",
	  "errors": [
	    "string"
	  ]
	}

## Ticket Request

### Path
`/api/ticket`
### Method
`POST`
### Request Body
	{
	  "id": "string",
	  "user": {
	    "id": "string",
	    "email": "string",
	    "password": "string",
	    "profile": "ROLE_ADMIN"
	  },
	  "date": "2021-12-05T01:22:30.528Z",
	  "title": "string",
	  "number": 0,
	  "status": "New",
	  "priority": "High",
	  "assignedUser": {
	    "id": "string",
	    "email": "string",
	    "password": "string",
	    "profile": "ROLE_ADMIN"
	  },
	  "description": "string",
	  "image": "string",
	  "changes": [
	    {
	      "id": "string",
	      "userChange": {
		"id": "string",
		"email": "string",
		"password": "string",
		"profile": "ROLE_ADMIN"
	      },
	      "dataChangeStatus": "2021-12-05T01:22:30.528Z",
	      "status": "New"
	    }
	  ]
	}
### Response
	{
	  "data": {
	    "id": "string",
	    "user": {
	      "id": "string",
	      "email": "string",
	      "password": "string",
	      "profile": "ROLE_ADMIN"
	    },
	    "date": "2021-12-05T01:22:30.561Z",
	    "title": "string",
	    "number": 0,
	    "status": "New",
	    "priority": "High",
	    "assignedUser": {
	      "id": "string",
	      "email": "string",
	      "password": "string",
	      "profile": "ROLE_ADMIN"
	    },
	    "description": "string",
	    "image": "string",
	    "changes": [
	      {
		"id": "string",
		"userChange": {
		  "id": "string",
		  "email": "string",
		  "password": "string",
		  "profile": "ROLE_ADMIN"
		},
		"dataChangeStatus": "2021-12-05T01:22:30.561Z",
		"status": "New"
	      }
	    ]
	  },
	  "errors": [
	    "string"
	  ]
	}
	
### Path
`/api/ticket`
### Method
`PUT`
### Request Body
	{
	  "id": "string",
	  "user": {
	    "id": "string",
	    "email": "string",
	    "password": "string",
	    "profile": "ROLE_ADMIN"
	  },
	  "date": "2021-12-05T01:22:30.528Z",
	  "title": "string",
	  "number": 0,
	  "status": "New",
	  "priority": "High",
	  "assignedUser": {
	    "id": "string",
	    "email": "string",
	    "password": "string",
	    "profile": "ROLE_ADMIN"
	  },
	  "description": "string",
	  "image": "string",
	  "changes": [
	    {
	      "id": "string",
	      "userChange": {
		"id": "string",
		"email": "string",
		"password": "string",
		"profile": "ROLE_ADMIN"
	      },
	      "dataChangeStatus": "2021-12-05T01:22:30.528Z",
	      "status": "New"
	    }
	  ]
	}
### Response
	{
	  "data": {
	    "id": "string",
	    "user": {
	      "id": "string",
	      "email": "string",
	      "password": "string",
	      "profile": "ROLE_ADMIN"
	    },
	    "date": "2021-12-05T01:22:30.561Z",
	    "title": "string",
	    "number": 0,
	    "status": "New",
	    "priority": "High",
	    "assignedUser": {
	      "id": "string",
	      "email": "string",
	      "password": "string",
	      "profile": "ROLE_ADMIN"
	    },
	    "description": "string",
	    "image": "string",
	    "changes": [
	      {
		"id": "string",
		"userChange": {
		  "id": "string",
		  "email": "string",
		  "password": "string",
		  "profile": "ROLE_ADMIN"
		},
		"dataChangeStatus": "2021-12-05T01:22:30.561Z",
		"status": "New"
	      }
	    ]
	  },
	  "errors": [
	    "string"
	  ]
	}

### Path
`/api/ticket/{page}/{count}`
### Method
`GET`
### Response
	{
	  "data": {
	    "totalPages": 0,
	    "totalElements": 0,
	    "sort": {
	      "sorted": true,
	      "unsorted": true
	    },
	    "pageable": {
	      "sort": {
		"sorted": true,
		"unsorted": true
	      },
	      "pageNumber": 0,
	      "pageSize": 0,
	      "paged": true,
	      "unpaged": true,
	      "offset": 0
	    },
	    "first": true,
	    "numberOfElements": 0,
	    "last": true,
	    "size": 0,
	    "content": [
	      {
		"id": "string",
		"user": {
		  "id": "string",
		  "email": "string",
		  "password": "string",
		  "profile": "ROLE_ADMIN"
		},
		"date": "2021-12-05T01:33:23.759Z",
		"title": "string",
		"number": 0,
		"status": "New",
		"priority": "High",
		"assignedUser": {
		  "id": "string",
		  "email": "string",
		  "password": "string",
		  "profile": "ROLE_ADMIN"
		},
		"description": "string",
		"image": "string",
		"changes": [
		  {
		    "id": "string",
		    "userChange": {
		      "id": "string",
		      "email": "string",
		      "password": "string",
		      "profile": "ROLE_ADMIN"
		    },
		    "dataChangeStatus": "2021-12-05T01:33:23.759Z",
		    "status": "New"
		  }
		]
	      }
	    ],
	    "number": 0
	  },
	  "errors": [
	    "string"
	  ]
	}
### Path
`/api/ticket/{page}/{count}/{number}/{title}/{status}/{priority}/{assigned}`
### Method
`GET`
### Response
	{
	  "data": {
	    "totalPages": 0,
	    "totalElements": 0,
	    "sort": {
	      "sorted": true,
	      "unsorted": true
	    },
	    "pageable": {
	      "sort": {
		"sorted": true,
		"unsorted": true
	      },
	      "pageNumber": 0,
	      "pageSize": 0,
	      "paged": true,
	      "unpaged": true,
	      "offset": 0
	    },
	    "first": true,
	    "numberOfElements": 0,
	    "last": true,
	    "size": 0,
	    "content": [
	      {
		"id": "string",
		"user": {
		  "id": "string",
		  "email": "string",
		  "password": "string",
		  "profile": "ROLE_ADMIN"
		},
		"date": "2021-12-05T01:33:23.759Z",
		"title": "string",
		"number": 0,
		"status": "New",
		"priority": "High",
		"assignedUser": {
		  "id": "string",
		  "email": "string",
		  "password": "string",
		  "profile": "ROLE_ADMIN"
		},
		"description": "string",
		"image": "string",
		"changes": [
		  {
		    "id": "string",
		    "userChange": {
		      "id": "string",
		      "email": "string",
		      "password": "string",
		      "profile": "ROLE_ADMIN"
		    },
		    "dataChangeStatus": "2021-12-05T01:33:23.759Z",
		    "status": "New"
		  }
		]
	      }
	    ],
	    "number": 0
	  },
	  "errors": [
	    "string"
	  ]
	}
### Path
`/api/ticket/{id}`
### Method
`GET`
### Response
	{
	  "data": {
	    "id": "string",
	    "user": {
	      "id": "string",
	      "email": "string",
	      "password": "string",
	      "profile": "ROLE_ADMIN"
	    },
	    "date": "2021-12-05T01:42:24.876Z",
	    "title": "string",
	    "number": 0,
	    "status": "New",
	    "priority": "High",
	    "assignedUser": {
	      "id": "string",
	      "email": "string",
	      "password": "string",
	      "profile": "ROLE_ADMIN"
	    },
	    "description": "string",
	    "image": "string",
	    "changes": [
	      {
		"id": "string",
		"userChange": {
		  "id": "string",
		  "email": "string",
		  "password": "string",
		  "profile": "ROLE_ADMIN"
		},
		"dataChangeStatus": "2021-12-05T01:42:24.876Z",
		"status": "New"
	      }
	    ]
	  },
	  "errors": [
	    "string"
	  ]
	}
### Path
`/api/ticket/{id}`
### Method
`DELETE`
### Response
	{
	  "data": "string",
	  "errors": [
	    "string"
	  ]
	}
### Path
`/api/ticket/{id}/{status}`
### Method
`PUT`
### Request
	{
	  "id": "string",
	  "user": {
	    "id": "string",
	    "email": "string",
	    "password": "string",
	    "profile": "ROLE_ADMIN"
	  },
	  "date": "2021-12-05T01:46:04.351Z",
	  "title": "string",
	  "number": 0,
	  "status": "New",
	  "priority": "High",
	  "assignedUser": {
	    "id": "string",
	    "email": "string",
	    "password": "string",
	    "profile": "ROLE_ADMIN"
	  },
	  "description": "string",
	  "image": "string",
	  "changes": [
	    {
	      "id": "string",
	      "userChange": {
		"id": "string",
		"email": "string",
		"password": "string",
		"profile": "ROLE_ADMIN"
	      },
	      "dataChangeStatus": "2021-12-05T01:46:04.351Z",
	      "status": "New"
	    }
	  ]
	}
### Response
	{
	  "data": {
	    "id": "string",
	    "user": {
	      "id": "string",
	      "email": "string",
	      "password": "string",
	      "profile": "ROLE_ADMIN"
	    },
	    "date": "2021-12-05T01:46:04.380Z",
	    "title": "string",
	    "number": 0,
	    "status": "New",
	    "priority": "High",
	    "assignedUser": {
	      "id": "string",
	      "email": "string",
	      "password": "string",
	      "profile": "ROLE_ADMIN"
	    },
	    "description": "string",
	    "image": "string",
	    "changes": [
	      {
		"id": "string",
		"userChange": {
		  "id": "string",
		  "email": "string",
		  "password": "string",
		  "profile": "ROLE_ADMIN"
		},
		"dataChangeStatus": "2021-12-05T01:46:04.380Z",
		"status": "New"
	      }
	    ]
	  },
	  "errors": [
	    "string"
	  ]
	}
### Path
`/api/ticket/sumary`
### Method
`DELETE`
### Response
	{
	  "data": {
	    "amountNew": 0,
	    "amountResolved": 0,
	    "amountAproved": 0,
	    "amountDisaproved": 0,
	    "amountAssigned": 0,
	    "amountClosed": 0
	  },
	  "errors": [
	    "string"
	  ]
	}
