# Clínica Odontológica - Parte 2 
1.	Crie uma classe de nome ```Consulta```. Essa classe deve ser responsável por registrar alguns dados da consulta como o dentista responsável, paciente e procedimento realizado.
2.	No momento da instanciação de objetos da classe ```Consulta``` todos os seus atributos devem ser inicializados obrigatoriamente.
3.	Disponibilize um método na classe ```Consulta``` responsável por calcular o valor de uma consulta. Por enquanto considere o preço da consulta igual ao valor do procedimento realizado. 
4.	Crie uma classe de nome ```Agenda``` com apenas um atributo: uma lista de consultas. 
5.	Disponibilize um método na classe ```Agenda``` para calcular o faturamento total da clínica. 
6.	Acrescente uma funcionalidade ao sistema que seja capaz de disponibilizar a quantidade de consultas agendadas. 
7.	Adicione um atributo nas classes ```Dentista```, ```Paciente``` e ```Procedimento``` capaz de armazenar um código identificador. O conteúdo desse atributo deve único, sequencial iniciando em 1 e gerado automaticamente pelo sistema, da seguinte forma:
```java
1º Dentista cadastrado – código = DE1, 2º Dentista cadastrado – código = DE2, 3º Dentista cadastrado – código = DE3, ...

1º Paciente cadastrado – código = PA1, 2º Paciente cadastrado – código = PA2, 3º Paciente cadastrado – código = PA3, ...

1º Procedimento cadastrado – código = PO1, 2º Procedimento cadastrado – código = PO2, 3º Procedimento cadastrado – código = PO3, ...
```
