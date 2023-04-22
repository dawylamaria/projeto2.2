package br.edu.fescfafic.biblioteca.Main;
import br.edu.fescfafic.biblioteca.Model.*;

import java.time.LocalDate;
import br.edu.fescfafic.biblioteca.Model.Atendente;
import br.edu.fescfafic.biblioteca.Model.Endereco;
import br.edu.fescfafic.biblioteca.Model.Contato;
import br.edu.fescfafic.biblioteca.Model.DadosPessoais;
class Main {

    public static void main(String[] args) {

        Impresso impresso1 = new Impresso(
                "Livro",
                "001",
                "Diego Gadelha",
                "2018",
                true,
                "3º",
                "Romance",
                "Aventuras de Diego",
                "357"
        );

        Impresso impresso2 = new Impresso(
                "Livro",
                "002",
                "Dawyla Maria",
                "2019",
                false,
                "1º",
                "Romance",
                "Aventuras de Dawyla",
                "360"
        );

        Impresso impresso3 = new Impresso(
                "Revista",
                "003",
                "Aryelle",
                "2022",
                true,
                "17º",
                "Moda",
                "Aryelle em Paris",
                "30"
        );

        Impresso impresso4 = new Impresso(
                "Livro",
                "004",
                "Luís",
                "2021",
                false,
                "7º",
                "Suspense",
                "Aventuras de Luís",
                "177"
        );

        ObraVisual quadroPintado = new ObraVisual(
                "Quadro",
                "005",
                "Aryelle",
                "2017",
                false,
                true
        );

        ObraVisual escultura = new ObraVisual(
                "Escultura",
                "006",
                "Diego Aleijadinho",
                "2019",
                false,
                true
        );
        Contato contato = new Contato("8383237243", "hsus@jxdjdn.com");
        Endereco endereco = new Endereco("qualquer", "qualquer", "qualquer", "qualquer", "633000");
        DadosPessoais dadosPessoais = new DadosPessoais("Aryelly",LocalDate.of(2022, 02, 10),
                "feminino",
                "Ary",
                "1234",
                "56789");
        
        Atendente atendente1 = new Atendente(LocalDate.of(2022, 10,10), contato, endereco, dadosPessoais);
        System.out.println(atendente1);



    }

}
