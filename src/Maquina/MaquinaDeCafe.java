package Maquina;

public class MaquinaDeCafe {

    private int Agua;
    private int Cafe;
    private int Crema;

    private int Vasos;


    public MaquinaDeCafe(int agua, int cafe, int crema, int vasos) {
        Agua = agua;
        Cafe = cafe;
        Crema = crema;
        Vasos = vasos;
    }

    class Americano extends MaquinaDeCafe {
        public Americano() {
            super(180, 15, 0, 1);
        }
    }

    class Expresso extends MaquinaDeCafe {
        public Expresso() {
            super(120, 20, 0, 1);
        }
    }

    class Capuchino extends MaquinaDeCafe {
        public Capuchino() {
            super(100, 14, 70, 1);
        }
    }

    public void Cafetera(int Agua, int Cafe, int Crema, int Vasos) {
        this.Agua += Agua;
        this.Cafe += Cafe;
        this.Crema += Crema;
        this.Vasos += Vasos;
    }

    public void Preparacion(MaquinaDeCafe cafe01) {
        if (cafe01.Ingredientes()){
            this.Agua -= cafe01.Agua;
            this.Cafe -= cafe01.Cafe;
            this.Crema -= cafe01.Crema;
            this.Vasos -= 1;
            System.out.println("Estamos preparando tu café...");
        }
    }

    public boolean Ingredientes(MaquinaDeCafe Cafe01) {
        if (this.Agua - Cafe01.Agua < 0) {
            System.out.println("No hay suficiente agua para preparar el Café, disculpa :((");
            return false;
        } else if (this.Crema - Cafe01.Crema < 0) {
            System.out.println("No hay suficiente crema para preparar el Café, disculpa :((");
            return false;
        } else if (this.Cafe - Cafe01.Cafe < 0) {
            System.out.println("No hay suficiente Café para preparar el Café, disculpa :((");
            return false;
        } else if (this.Vasos - Cafe01.Vasos == 0) {
            System.out.println("No hay suficientes vasos para preparar el Café, disculpa :((");
            return false;
        }
        return true;
    }


}
