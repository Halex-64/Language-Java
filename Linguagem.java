public class Linguagem {
    protected String nome;
    protected int numFalantes;
    protected String regioesFaladas;
    protected String ordemDasPalavras;

    public Linguagem (String nome, int numFalantes, String regioesFaladas, String ordemDasPalavras) {
        this.nome = nome;
        this.numFalantes = numFalantes;
        this.regioesFaladas = regioesFaladas;
        this.ordemDasPalavras = ordemDasPalavras;
    }

    public void getInfo (){
        System.out.println(""+nome+" é falado por "+numFalantes+" pessoas principalmente em "+regioesFaladas+".");
    }

    public static void main(String[] args) {
        Linguagem Francês = new Linguagem("Francês", 26100000, "Europa ", null);
        Francês.getInfo();
        Mayan Yakutan = new Mayan("Yakutan", 300000);
        Yakutan.getInfo();
        SinoTibetan Chinês = new SinoTibetan("Chinês", 918000000);
        Chinês.getInfo();
        SinoTibetan Birmanês = new SinoTibetan("Birmanês", 381000);
        Birmanês.getInfo();
    }
}
