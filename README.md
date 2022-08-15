# Clínica Odontológica - Parte 4
1.	Você notou a existência de duplicidade de código nas classes ```Paciente``` e ```Dentista```. Implemente uma solução para esse problema.

2.	Até o presente momento a ```Clínica``` trabalha apenas com um tipo de dentista. A partir de agora outras formas de trabalho devem ser incorporadas ao sistema.

    1. Agora a ```Clínica``` manterá relações trabalhistas diferentes com seus dentistas e podem ser incorporadas novas relações no futuro. Por enquanto considere apenas 2 tipos de dentista: o assalariado e o comissionado. 
    2. O ```Dentista Assalariado``` possui um salário fixo por mês. 
    3. Já o ```Dentista Comissionado``` recebe uma comissão sobre o valor total dos procedimentos realizados por ele. 
    4. Elabore um mecanismo para obrigar o ***cálculo do salário*** para todos os novos tipos de funcionários que possam surgir no futuro. 

>Para não perdermos tempo, não codifique nada agora. Apresente ao professor a sua solução para esse novo requisito do sistema através de um  [diagrama de classes](https://github.com/pimentabsi/clinic_project_college/blob/part_IV/ClassDiagram.puml). Para cada classe proposta informe seus atributos e as assinaturas dos métodos.

3.	Crie uma classe de nome ```IdentificadorDeDentista``` que seja capaz de identificar os diferentes tipos de dentista. Por exemplo: para um determinado ```Dentista``` a funcionalidade proposta deve identificá-lo como ```Dentista assalariado``` ou ```Dentista comissionado```, dentre outros tipos de dentista que podem ser incorporados ao sistema no futuro. Essa classe deve disponibilizar suas funcionalidades sem a necessidade de ***instanciar objetos***.
