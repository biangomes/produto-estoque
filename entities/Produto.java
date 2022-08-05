public class Produto {
    private Integer codigo;
    private String descricao;
    private Double precoDeCompra;
    private Double precoDeVenda;
    private Double lucroPercentual;
    private Integer quantidade;
    private Integer estoqueMinimo;
    private Fornecedor fornecedor;


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

    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPrecoDeCompra() {
        return this.precoDeCompra;
    }

    public void setPrecoDeCompra() {
        // TODO: implementar a logica do preço de compra
    }

    public Double getPrecoDeVenda() {
        return this.precoDeVenda;
    }

    public void setPrecoDeVenda() {
        // TODO: implementar a logica do preço de venda
    }


    public void compra(int quantidade, double precoDeCompra) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        }

        // TODO: Atualizacao do preco de compra
        /*
         *  A atualização do preço de compra deve ser uma ponderação entre a quantidade existente 
         * e o preço de compra atual e a quantidade comprada e o novo preço. 
         * Exemplo: se havia 10 produtos com preço de compra R$2,5 e compramos mais 10 unidades do produto a R$7,50,
         *  então o novo preço deve ser (10 * 2.5 + 10 *. 7.5) / 20 = R$5.0.
        */
        if (!(this.precoDeCompra == precoDeCompra)) {
            this.precoDeCompra = (this.quantidade * this.precoDeCompra + quantidade * precoDeCompra) / this.quantidade * this.quantidade;
        }
    }
}