    package modelclass;

    public class DentistaAssalariado extends Dentista {
        public DentistaAssalariado (String nome, String email, String cro, double salario) {
            super(nome, email, cro);
            this.salario = salario;
        }

        public DentistaAssalariado(Dentista dentista) {
            super(dentista.nome, dentista.email, dentista.cro);
            this.salario = dentista.calculaSalario(0.1);
        }

        public double calculaSalario(double valor) {
            return this.salario;
        }

        public double getSalario() {
            return this.salario;
        }

        public String getDentista() {
            return "Sou um dentista assalariado";
        }
    }