package br.com.dio.model;

public class gato {
        private String nome;
        private String cor;
        private String idade;

        public gato(String nome) {
        }

        public gato(String nome, String cor, String idade) {
                this.nome = nome;
                this.cor = cor;
                this.idade = idade;


        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getCor() {
                return cor;
        }

        public void setCor(String cor) {
                this.cor = cor;
        }

        public String getIdade() {
                return idade;
        }

        public void setIdade(String idade) {
                this.idade = idade;
        }


}

