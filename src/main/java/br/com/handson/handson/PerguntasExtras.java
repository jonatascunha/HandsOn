package br.com.handson.handson;

public class PerguntasExtras {
   /* Relacionamentos OneToMany e ManyToOne podemos definir uma propriedade “fetch” = FetchType.LAZY

    isso significa que toda vez que fizermos um select * from Class com atributos que tiverem essa notação irão vir como nulos para não sobrecarregar a aplicação  com dados que não serão utilizados, para buscas mais especificas será necessário um get através do repositório que irá fazer essa busca no banco.
    o Eager Loading carrega os dados mesmo que você não vá utilizá-los mas só será utilizado em casos especificos onde os dados são carregados constantemente
    os tipos de mapeamento OneToOne, OneToMany e ManyToMany são utilizado para fazer tipos de relacionamentos entre entidades
    o tipo oneToOne ou um para um, é utilizado quando temos um relacionamento 1x1 por exemplo pessoaxendereço, cada pessoa tem um endereço e cada em endereço mora uma pessoa. (exemplo)
    O tipo OneToMany é utilizado quando temos um relacionamento um para muitos, exemplo, uma faculdade para muitos alunos
    O tipo Many to many é utilizado quando temos um relacionamento de muitos para muitos como por exemplo: Um curso tem várias disciplinas e uma disciplina pode fazer parte de vários cursos

*/


}
