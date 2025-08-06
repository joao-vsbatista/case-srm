#!/bin/bash

echo "Gerando código a partir da especificação OpenAPI do Reino SRM..."

# Limpar diretórios anteriores
echo "Limpando arquivos gerados anteriormente..."
rm -rf target/generated-sources/openapi
rm -rf target/generated-sources/openapi-client
rm -rf target/generated-sources/openapi-models

# Gerar código
echo "Executando geração de código..."
mvn clean generate-sources

# Verificar se a geração foi bem-sucedida
if [ $? -eq 0 ]; then
    echo "Código gerado com sucesso!"
    echo ""
    echo "Arquivos gerados em:"
    echo "   - target/generated-sources/openapi/src/main/java/"
    echo "   - target/generated-sources/openapi-client/src/main/java/"
    echo ""
    echo "Para ver os arquivos gerados:"
    echo "   find target/generated-sources -name '*.java' | head -10"
    echo ""
    echo "Para compilar o projeto:"
    echo "   mvn compile"
else
    echo "Erro na geração de código!"
    exit 1
fi
