# Correção do Projeto Prático 02

## Entregas e requisitos para o desenvolvimento da solução

1. Modelagem UML
   - [x] Diagrama de classes salvo em um arquivo chamado `modelagem.png` na raiz do repositório (ou no Readme.md caso faça com o Mermaid)
   - [x] Notação correta de associação entre classes, representação de atributos e métodos
   - [x] Herança, devendo representar corretamente classes e métodos abstratos e interfaces
2. Implementação
   - [x] Encapsulamento, responsabilidade única e divisão de responsabilidades
   - [ ] Uso correto dos conceitos de Herança e Polimorfismo com sobrescrita de métodos
   - [x] Uso de enumerações e coleções
   - [ ] Comportamento correto das classes modeladas  
   - [ ] Comportamento correto da classe que possui método `main`
3. Projeto Java com Gradle
   - [x] Arquivo `.gitignore` adequado ao projeto 
   - [x] Possível compilar e executar o projeto via `./gradlew -q run`. Conceito 0 caso não seja possível.
4. Arquivo Readme.md na raiz do repositório
   - [ ] Instruções para criar uma nova regra de filtragem, um novo pacote IP e simular o processamento do pacote
   - [ ] Indicar quais funcionalidades foram implementadas e quais não foram

## Comentários

- Projeto não tem implementação funcional. Não foi possível executar o projeto.
- Nota: 0
- Data para entrega da recuperação: 24/08/2024

## Correção da recuperação

- Classe Endpoint não apresentou atributos e métodos no digrama UML
- Métodos default na interface não estão corretos
- Herança não foi feita corretamente para que pudesse ser feito uso do polimorfismo
- listaDeRegras do Firewall tinha que informar o tipo armazenado na coleção. O mesmo aparece em outras classes
- Na classe App não teve uso correto do polimorfismo
- Roteador está em três redes, mas isso não foi representado corretamente. Algo semelhante com o Firewall
- Classe CamadaDeRede está equivocada, com um ArrayList para cada rede, etc
- Firewall não processa corretamente os pacotes, o mesmo acontece com outros dispositivos
- Nota: 5,5
