# CSVTool

Ferramenta de linha de comando em Java para inspecionar, transformar e converter arquivos CSV de qualquer estrutura — sem depender de planilhas ou scripts avulsos.

Projeto pessoal criado com o objetivo de aprender sobre I/O (streams, buffers, NIO) e a standard library do Java na prática, construindo um parser de CSV do zero e um conjunto de operações em cima dele.

## Motivação

Receber um CSV de origem desconhecida e precisar entender, filtrar ou converter esses dados é uma tarefa comum. Este projeto implementa essa solução manualmente — incluindo o próprio parser — como exercício para explorar:

- Leitura de arquivos com `java.io` e `java.nio`
- Processamento eficiente de arquivos grandes (streaming, sem carregar tudo em memória)
- Design de uma aplicação desacoplada do domínio dos dados que ela processa

## Status

🚧 Em desenvolvimento. Este README descreve o comportamento planejado; nem todas as funcionalidades abaixo estão necessariamente implementadas ainda.

## Funcionalidades planejadas

- **Inspeção**: resumo do arquivo (linhas, colunas, tipos inferidos, inconsistências)
- **Filtragem**: seleção de linhas por condição em uma coluna
- **Seleção de colunas**: escolha de um subconjunto de colunas na saída
- **Ordenação**: por coluna, ascendente ou descendente
- **Agregação**: soma, média, contagem, min/max, com agrupamento opcional
- **Validação**: detecção de campos vazios, duplicatas e valores fora de formato esperado
- **Conversão**: exportação para JSON e geração de dump SQL (`CREATE TABLE` + `INSERT`)
- Suporte a arquivos grandes via processamento em streaming
- Suporte a CSV com aspas, campos multi-linha e delimitadores configuráveis (RFC 4180)

## Requisitos

- JDK 26

## Uso (exemplo previsto)

```bash
# Ver um resumo do arquivo
csvtool inspect vendas.csv

# Filtrar linhas
csvtool filter vendas.csv --where "categoria=Perifericos"

# Agregar dados agrupados
csvtool aggregate vendas.csv --group-by categoria --sum valor

# Converter para JSON
csvtool to-json vendas.csv --output vendas.json

# Gerar dump SQL
csvtool to-sql vendas.csv --table vendas --output vendas.sql
```

*(Os comandos e flags exatos podem mudar conforme o projeto evolui.)*

## Estrutura do projeto

```
csvtool/
├── src/
│   └── main/java/...
├── docs/
│   └── requisitos.md      # histórias de usuário e critérios de aceite
└── README.md
```

## Documentação

O documento de requisitos completo, com épicos, histórias de usuário e critérios de aceite, está em [`docs/requisitos.md`](docs/requisitos.md).

## Licença

Defina aqui a licença do projeto (ex: MIT), se for disponibilizá-lo publicamente.