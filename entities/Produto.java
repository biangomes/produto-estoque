public class Produto() {
    private Integer codigo;
    private String descricao;
    private Double precoDeCompra;
    private Double precoDeVenda;
    private Double lucroPercentual;
    private Integer quantidade;
    private Integer estoqueMinimo;
    protected Fornecedor fornecedor;


    public Produto() {}

    public Produto(int codigo, String descricao, int estoqueMinimo, double lucroPercentual) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.estoqueMinimo = estoqueMinimo;
        this.lucroPercentual = lucroPercentual;
    }

    public Produto(int codigo, String descricao, int estoqueMinimo, double lucroPercentual, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.estoqueMinimo = estoqueMinimo;
        this.lucroPercentual = lucroPercentual;
        this.fornecedor = fornecedor;
    }

    public void compra(int quantidade, double precoDeCompra) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        }
    }
}