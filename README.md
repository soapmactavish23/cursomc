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
- [x] Refresh Token
- [x] Recuperar Senha

## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" heigth="20" width="20"/> [Spring Boot](https://spring.io/projects/spring-boot)
- <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" heigth="20" width="20"/> [Java](https://www.java.com/pt-BR)
- <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" heigth="20" width="20"/> [MySQL](https://www.mysql.com)

## 🖥️ Plataforma adotada

- WEB

## Auth Resource

### Path

`/auth/forgot`

### Method

`POST`

### Request body

    {
      "email": "string"
    }

### Response

    200 OK

### Path

`/auth/refresh_token`

### Method

`POST`

### Response:

    200 OK

## Cliente Resource

### Path

`/clientes`

### Method

`GET`

### Response

    [
      {
    	"email": "string",
    	"id": 0,
    	"nome": "string"
      }
    ]

### Path

`/clientes`

### Method

`POST`

### Request

    {
      "bairro": "string",
      "cep": "string",
      "cidadeId": 0,
      "complemento": "string",
      "cpfOuCnpj": "string",
      "email": "string",
      "logradouro": "string",
      "nome": "string",
      "numero": "string",
      "senha": "string",
      "telefone1": "string",
      "telefone2": "string",
      "telefone3": "string",
      "tipo": 0
    }

### Path

`/clientes/page`

### Method

`GET`

### Response

    {
    	"content": [
    		{
    		"email": "string",
    		"id": 0,
    		"nome": "string"
    		}
    	],
    	"empty": true,
    	"first": true,
    	"last": true,
    	"number": 0,
    	"numberOfElements": 0,
    	"pageable": {
    		"offset": 0,
    		"pageNumber": 0,
    		"pageSize": 0,
    		"paged": true,
    		"sort": {
    		"empty": true,
    		"sorted": true,
    		"unsorted": true
    		},
    		"unpaged": true
    	},
    	"size": 0,
    	"sort": {
    		"empty": true,
    		"sorted": true,
    		"unsorted": true
    	},
    	"totalElements": 0,
    	"totalPages": 0
    }

### Path

`/clientes/picture`

### Method

`POST`

### Request

    Choose File

### Path

`/clientes/{id}`

### Method

`DELETE`

### Response

    204

### Path

`/clientes/{id}`

### Method

`GET`

### Response

    {
    	"cpfOuCnpj": "string",
    	"email": "string",
    	"enderecos": [
    		{
    		"bairro": "string",
    		"cep": "string",
    		"cidade": {
    			"estado": {
    			"id": 0,
    			"nome": "string"
    			},
    			"id": 0,
    			"nome": "string"
    		},
    		"complemento": "string",
    		"id": 0,
    		"logradouro": "string",
    		"numero": "string"
    		}
    	],
    	"id": 0,
    	"imageUrl": "string",
    	"nome": "string",
    	"perfis": [
    		"ADMIN"
    	],
    	"telefones": [
    		"string"
    	],
    	"tipoCliente": "PESSOAFISICA"
    }

### Path

`/clientes/{id}`

### Method

`PUT`

### Response

    {
    	"email": "string",
    	"id": 0,
    	"nome": "string"
    }

## Categoria Resource

### Path

`/categorias`

### Method

`GET`

### Response

    [
    	{
    		"id": 0,
    		"nome": "string"
    	}
    ]

### Path

`/categorias`

### Method

`POST`

### Response

    {
    	"id": 0,
    	"nome": "string"
    }
### Path

`/categorias/page`

### Method

`GET`

### Response

    {
		"content": [
			{
			"id": 0,
			"nome": "string"
			}
		],
		"empty": true,
		"first": true,
		"last": true,
		"number": 0,
		"numberOfElements": 0,
		"pageable": {
			"offset": 0,
			"pageNumber": 0,
			"pageSize": 0,
			"paged": true,
			"sort": {
			"empty": true,
			"sorted": true,
			"unsorted": true
			},
			"unpaged": true
		},
		"size": 0,
		"sort": {
			"empty": true,
			"sorted": true,
			"unsorted": true
		},
		"totalElements": 0,
		"totalPages": 0
	}

### Path

`/categorias/{id}`

### Method

`DELETE`

### Response

    204

### Path

`/categorias/{id}`

### Method

`GET`

### Response

    {
		"id": 0,
		"nome": "string"
	}

### Path

`/categorias/{id}`

### Method

`PUT`

### Request

    {
		"id": 0,
		"nome": "string"
	}
## Pedido Resource
### Path

`/pedidos`

### Method

`GET`

### Response

    {
		"content": [
			{
			"cliente": {
				"cpfOuCnpj": "string",
				"email": "string",
				"enderecos": [
				{
					"bairro": "string",
					"cep": "string",
					"cidade": {
					"estado": {
						"id": 0,
						"nome": "string"
					},
					"id": 0,
					"nome": "string"
					},
					"complemento": "string",
					"id": 0,
					"logradouro": "string",
					"numero": "string"
				}
				],
				"id": 0,
				"imageUrl": "string",
				"nome": "string",
				"perfis": [
				"ADMIN"
				],
				"telefones": [
				"string"
				],
				"tipoCliente": "PESSOAFISICA"
			},
			"date": "2023-01-13T18:59:46.311Z",
			"enderecoDeEntrega": {
				"bairro": "string",
				"cep": "string",
				"cidade": {
				"estado": {
					"id": 0,
					"nome": "string"
				},
				"id": 0,
				"nome": "string"
				},
				"complemento": "string",
				"id": 0,
				"logradouro": "string",
				"numero": "string"
			},
			"id": 0,
			"items": [
				{
				"desconto": 0,
				"preco": 0,
				"produto": {
					"id": 0,
					"nome": "string",
					"preco": 0
				},
				"quantidade": 0,
				"subTotal": 0
				}
			],
			"pagamento": {
				"estado": "PENDENTE",
				"id": 0
			},
			"valorTotal": 0
			}
		],
		"empty": true,
		"first": true,
		"last": true,
		"number": 0,
		"numberOfElements": 0,
		"pageable": {
			"offset": 0,
			"pageNumber": 0,
			"pageSize": 0,
			"paged": true,
			"sort": {
			"empty": true,
			"sorted": true,
			"unsorted": true
			},
			"unpaged": true
		},
		"size": 0,
		"sort": {
			"empty": true,
			"sorted": true,
			"unsorted": true
		},
		"totalElements": 0,
		"totalPages": 0
	}

### Path

`/pedidos`

### Method

`POST`

### Response

    {
		"cliente": {
			"cpfOuCnpj": "string",
			"email": "string",
			"enderecos": [
			{
				"bairro": "string",
				"cep": "string",
				"cidade": {
				"estado": {
					"id": 0,
					"nome": "string"
				},
				"id": 0,
				"nome": "string"
				},
				"complemento": "string",
				"id": 0,
				"logradouro": "string",
				"numero": "string"
			}
			],
			"id": 0,
			"imageUrl": "string",
			"nome": "string",
			"perfis": [
			"ADMIN"
			],
			"telefones": [
			"string"
			],
			"tipoCliente": "PESSOAFISICA"
		},
		"date": "2023-01-13T18:59:46.316Z",
		"enderecoDeEntrega": {
			"bairro": "string",
			"cep": "string",
			"cidade": {
			"estado": {
				"id": 0,
				"nome": "string"
			},
			"id": 0,
			"nome": "string"
			},
			"complemento": "string",
			"id": 0,
			"logradouro": "string",
			"numero": "string"
		},
		"id": 0,
		"items": [
			{
			"desconto": 0,
			"preco": 0,
			"produto": {
				"id": 0,
				"nome": "string",
				"preco": 0
			},
			"quantidade": 0,
			"subTotal": 0
			}
		],
		"pagamento": {
			"estado": "PENDENTE",
			"id": 0
		},
		"valorTotal": 0
	}

### Path

`/pedidos/{id}`

### Method

`POST`

### Response
	{
		"cliente": {
			"cpfOuCnpj": "string",
			"email": "string",
			"enderecos": [
			{
				"bairro": "string",
				"cep": "string",
				"cidade": {
				"estado": {
					"id": 0,
					"nome": "string"
				},
				"id": 0,
				"nome": "string"
				},
				"complemento": "string",
				"id": 0,
				"logradouro": "string",
				"numero": "string"
			}
			],
			"id": 0,
			"imageUrl": "string",
			"nome": "string",
			"perfis": [
			"ADMIN"
			],
			"telefones": [
			"string"
			],
			"tipoCliente": "PESSOAFISICA"
		},
		"date": "2023-01-13T18:59:46.320Z",
		"enderecoDeEntrega": {
			"bairro": "string",
			"cep": "string",
			"cidade": {
			"estado": {
				"id": 0,
				"nome": "string"
			},
			"id": 0,
			"nome": "string"
			},
			"complemento": "string",
			"id": 0,
			"logradouro": "string",
			"numero": "string"
		},
		"id": 0,
		"items": [
			{
			"desconto": 0,
			"preco": 0,
			"produto": {
				"id": 0,
				"nome": "string",
				"preco": 0
			},
			"quantidade": 0,
			"subTotal": 0
			}
		],
		"pagamento": {
			"estado": "PENDENTE",
			"id": 0
		},
		"valorTotal": 0
	}

### Path

`/produtos/{id}`

### Method

`GET`

### Response
	{
		"id": 0,
		"nome": "string",
		"preco": 0
	}
### Path

`/produtos`

### Method

`GET`

### Response
	{
		"content": [
			{
			"id": 0,
			"nome": "string",
			"preco": 0
			}
		],
		"empty": true,
		"first": true,
		"last": true,
		"number": 0,
		"numberOfElements": 0,
		"pageable": {
			"offset": 0,
			"pageNumber": 0,
			"pageSize": 0,
			"paged": true,
			"sort": {
			"empty": true,
			"sorted": true,
			"unsorted": true
			},
			"unpaged": true
		},
		"size": 0,
		"sort": {
			"empty": true,
			"sorted": true,
			"unsorted": true
		},
		"totalElements": 0,
		"totalPages": 0
		}
	}