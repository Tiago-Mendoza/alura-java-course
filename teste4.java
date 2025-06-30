public class teste4 {
    public static void main (String[] args){
        String titulo = "O pequeno principe";
        String autor = "Antoine de Saint-Exupéry";
        int numeroDePaginas = 96;
        double preco = 40.00;
        //categoria disponivel é F (ficção) ou N (não ficção) T (tecnologia) H (história)

        char categoria = 'F';

        String categoriaDescricao;

        if (categoria == 'F' ){
            categoriaDescricao = "ficçâo";
        }else if (categoria == 'N'){
            categoriaDescricao = "não ficção";
        }else if (categoria == 'T'){
            categoriaDescricao = "tecnoLogia";
        }else if (categoria == 'H'){
            categoriaDescricao = "história";
        } else {
            categoriaDescricao = "categoria inválida";
        }

        System.out.println("o livro cadastrado é " + titulo + ", escrito por " + autor + "ele possui " + numeroDePaginas + " paginas " + "e custa R$"+preco + " pertence a categoria " + categoriaDescricao +".");


    }
}
