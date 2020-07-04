package com.suanev.restaurant;

import com.suanev.restaurant.Repositories.*;
import com.suanev.restaurant.domain.*;
import com.suanev.restaurant.domain.enums.EstadoPagamento;
import com.suanev.restaurant.domain.enums.TipoCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Arrays;

@SpringBootApplication
public class RestaurantApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private PedidoRepository pedidoRepository;

	@Autowired
	private PagamentoRepository pagamentoRepository;

	@Autowired
	private ItemPedidoRepository itemPedidoRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//instanciando categorias
		Categoria categoria1 = new Categoria(null, "Especiais de Inverno");
		Categoria categoria2 = new Categoria(null, "Lanches");
		Categoria categoria3 = new Categoria(null, "Vegetariana");
		Categoria categoria4 = new Categoria(null, "Massas");
		Categoria categoria5 = new Categoria(null, "Doces e bolos");
		Categoria categoria6 = new Categoria(null, "Bebidas");


		//instanciando produtos
		Produto p1 = new Produto(
				null,
				"Creme de beterraba",
				"O creme de beterraba faz sucesso independentemente do clima lá fora, e o nosso tem aquele sabor de comida caseira, feita com afeto mesmo, sabe? O sabor da beterraba, apesar de protagonista, deixa espaço pro parmesão e pro toque do louro. Uma comida que mais parece abraço.",
				"https://i.imgur.com/dfNAWeM.png",
				"https://i.imgur.com/VuNnGTV.png",
				"350g",
				13.90
		);

		Produto p2 = new Produto(
				null, "Creme de cenoura",
				"Cremoso e saboroso, esse creme sacia a fome e joga o frio pra longe, além de combinar com queijo (principalmente de cabra), mas é bem rico em proteína, então nem precisa se preocupar em complementar o prato. Uma opção saudável pra quando a queremos matar as saudades de quem fazia aquela comida afetiva pra gente. E se quiser deixar essa refeição ainda mais bonita, finalize com croutons ou folhas de salsinha.",
				"https://i.imgur.com/g1y2WwB.png",
				"https://i.imgur.com/eyat5ra.png",
				"350g",
				13.90
		);

		Produto p3 = new Produto(
				null, "Creme de abóbora",
				"Este creme de abóbora é muito cremoso e saboroso, para aquecer até os dias mais frios. A abóbora cozida tem muito betacaroteno, traz mais vida porque é um composto protetor.Pra esquentar ainda mais, o gengibre entra e traz um sabor super especial e picante, mas bem de leve. Esta sopa deliciosa é ótima para um jantar levinho, ou como entrada, substituindo a salada no inverno.",
				"https://i.imgur.com/jbVDjx0.png",
				"https://i.imgur.com/JYrKf8O.png",
				"350g",
				12.90
		);

		Produto p4 = new Produto(
				null, "Creme de tomate",
				"Um delicioso creme de tomate caseiro e natural, como manda a tradição italiana - mas o nome e a técnica culinária vêm do francês, sabia? Aqui usamos o tomate cozido bem devagar. Esse processo ajuda na absorção do licopeno, o pigmento responsável pela cor vermelha do tomate e por benefícios importantíssimos pra nossa saúde.",
				"https://i.imgur.com/X5uL5nW.png",
				"https://i.imgur.com/IGmthUT.png",
				"350g",
				13.90
		);

		Produto p5 = new Produto(
				null, "Triplo cheesburguer",
				"Um clássico da culinária mundial que tem apenas o que um hamburguer precisa: pão fofinho, um queijo cheddar(que não pode faltar né?), sal e três camadas de carne de qualidade. Nosso hamburguer é feito com fraldinha de primeira temperada com sal rosa. Esse corte da carne fica ótimo no hambúrguer, porque tem uma certa quantidade de gordura, ideal para deixar bem macio e saboroso. É rico em proteína, zero carboidratos.",
				"https://i.imgur.com/HF8GByH.png",
				"https://i.imgur.com/ODnMHOW.png",
				"280g",
				23.90
		);

		Produto p6 = new Produto(
				null, "Hamburguer tradicional",
				"Um clássico da culinária mundial que tem apenas o que um hamburguer precisa: pão fofinho, um queijo cheddar(que não pode faltar né?), sal e três camadas de carne de qualidade. Nosso hamburguer é feito com fraldinha de primeira temperada com sal rosa. Esse corte da carne fica ótimo no hambúrguer, porque tem uma certa quantidade de gordura, ideal para deixar bem macio e saboroso. É rico em proteína, zero carboidratos.",
				"https://i.imgur.com/wjWSWkj.png",
				"https://i.imgur.com/XACFMZc.png",
				"280g",
				19.90
		);

		Produto p7 = new Produto(
				null, "Hamburguer vegetariano",
				"Nosso hamburguer vegetariano é feito com um pão integral especial, a proteina, é o falafel, que é um bolinho de grão de bico típico do Oriente Médio que faz sucesso em todo lugar. Nossa versão não é frita, como a receita original, e leva farinha de arroz, ao invés da farinha de trigo, pra dar liga com mais leveza. Além disso, só usamos temperos naturais, que deixam sua refeição mais saudável e saborosa. Que tal experimentar?",
				"https://i.imgur.com/qX2EIny.png",
				"https://i.imgur.com/ZItpn3t.png",
				"300g",
				22.90
		);

		Produto p8 = new Produto(
				null, "Cachorro quente",
				"A massa amarela do pão por causa da abóbora já convida a gente a dar uma bela mordida, e ainda tem o recheio saboroso, composto por uma salsicha defumada incrivelmente saborosa, molho de tomate da casa, milho e ervilhas orgânicas, com um toque final de batata palha extremamente crocante que é sempre sucesso. Cebolinha e queijo ralado dão seu toque de sabor delicado.",
				"https://i.imgur.com/O8iuUOF.png",
				"https://i.imgur.com/TmzVYx6.png",
				"180g",
				16.90
		);

		Produto p9 = new Produto(
				null, "Croissant",
				"Tão perfeito que você vai incluir no dia a dia. Macio na medida, e uma delícia com diferentes recheios, como manteiga, creme de avelã ou nossas pastas, por exemplo. E não tem erro: ainda combina com café, chá, suco... Um pão leve, crocante e bem fiel ao que você tem na memória. Se quiser sentir bem o folhado, é só assar no forno, pois no micro-ondas fica mais molhadinho.",
				"https://i.imgur.com/nnwZRNx.png",
				"https://i.imgur.com/eTSb46A.png",
				"70g",
				7.90
		);

		Produto p10 = new Produto(
				null, "Donut bolo de aniver",
				"Nossa receita é a tradicional massa com baunilha e cobertura do misterioso sabor de bolo de aniversário. Para adoçar, preferimos usar o açúcar de coco que, além de ser bem mais saudável, tem um leve sabor de caramelo. Experimente, vai bem em qualquer momento do dia, do café da manhã à sobremesa.",
				"https://i.imgur.com/bsdI6zC.png",
				"https://i.imgur.com/1VSuRNu.png",
				"90g",
				6.90
		);

		Produto p11 = new Produto(
				null, "Donut de chocolate",
				"Nossa receita é a tradicional massa com baunilha e cobertura de chocolate. Utilizamos chocolate 70% cacau para gotas com sabor intenso de chocolate.Para adoçar, preferimos usar o açúcar de coco que, além de ser bem mais saudável, tem um leve sabor de caramelo. Experimente, vai bem em qualquer momento do dia, do café da manhã à sobremesa.",
				"https://i.imgur.com/Ag8qA8m.png",
				"https://i.imgur.com/ekyzcNa.png",
				"90g",
				6.90
		);

		Produto p12 = new Produto(
				null, "Milkshake de chocolate",
				"O nosso milkshake de chocolate 40% é feito com leite e batido na hora. Deliciosamente cremeso, nosso leite vegetal, torna o milkshake mais leve, fazendo você aproveitar ele muito mais! Que tal experimentar?",
				"https://i.imgur.com/XIvYXFV.png",
				"https://i.imgur.com/W5sl9xa.png",
				"400ml",
				18.90
		);

		Produto p13 = new Produto(
				null, "Milkshake de morango",
				"O nosso milkshake de morango é feito com leite e batido na hora. Deliciosamente cremeso, nosso leite vegetal, torna o milkshake mais leve, fazendo você aproveitar ele muito mais! Que tal experimentar?",
				"https://i.imgur.com/y81aEiz.png",
				"https://i.imgur.com/yD0gSj6.png",
				"400ml",
				18.90
		);

		Produto p14 = new Produto(
				null, "Mousse de chocolate",
				"Bateu a vontade de comer um doce gostoso? Que tal nosso mousse? Ele é feito com um super chocolate que tem 70% de cacau, que dá um sabor intenso e uma cremosidade sem igual. Além disso, a receita não leva farinha, então ele fica mais leve - e continua delicioso. E ainda tem pedaços de chocolate por cima, que surpreendem você numa mordida aqui, outra ali, com um crec! Não dá pra não provar. E depois de provar, não dá pra não amar.",
				"https://i.imgur.com/a9uk4Ea.png",
				"https://i.imgur.com/cejlf7l.png",
				"150g",
				12.90
		);

		Produto p16 = new Produto(
				null, "Suco de laranja",
				"O suco verde é para aquela pessoa que procura uma bebida natural ao seu alcance. Refresca, traz o docinho da maçã, as fibras da couve e algumas notas de cenoura.Ele é a combinação perfeita para um café da manhã equilibrado. Nada melhor do que começar o dia com um desses.",
				"https://i.imgur.com/fSUTWSp.png",
				"https://i.imgur.com/80wuIMl.png",
				"250ml",
				8.00
		);

		Produto p17 = new Produto(
				null, "Suco de morango",
				"O suco de morango é para aquela pessoa que ama berrys. Refresca, traz o docinho da maçã, as vitaminas do morango e algumas notas de laranja. Ele é a combinação perfeita para um café da manhã equilibrado. Nada melhor do que começar o dia com um desses.",
				"https://i.imgur.com/c3cwjIp.png",
				"https://i.imgur.com/gLJ8Vz8.png",
				"250ml",
				9.00
		);

		Produto p18 = new Produto(
				null, "Suco Verde",
				"O suco verde é para aquela pessoa que procura uma bebida natural ao seu alcance. Refresca, traz o docinho da maçã, as fibras da couve e algumas notas de cenoura.Ele é a combinação perfeita para um café da manhã equilibrado. Nada melhor do que começar o dia com um desses.",
				"https://i.imgur.com/fSUTWSp.png",
				"https://i.imgur.com/80wuIMl.png",
				"250ml",
				6.00
		);

		Produto p19 = new Produto(
				null, "Pizza de calabresa",
				"Muçarela, calabresa, cebola e azeitonas.",
				"https://i.imgur.com/QLPiUH5.png",
				"https://i.imgur.com/otZcQVS.png",
				"65cm",
				67.70
		);

		Produto p20 = new Produto(
				null, "Pizza de peperonni",
				"Muçarela e fatias de pepperoni (salame especial condimentado com páprica).",
				"https://i.imgur.com/5IjzywG.png",
				"https://i.imgur.com/GvUYBMr.png",
				"65cm",
				67.70
		);

		Produto p21 = new Produto(
				null, "Pizza de milho",
				"Muçarela, tomate, champignon, pimentão, cebola e milho.",
				"https://i.imgur.com/uwZ8f2H.png",
				"https://i.imgur.com/ifAytYU.png",
				"65cm",
				67.70
		);

		Produto p22 = new Produto(
				null, "Pizza de tomates secos",
				"Muçarela, requeijão cremoso, manjericão e tomates secos.",
				"https://i.imgur.com/yO2HVNH.png",
				"https://i.imgur.com/XV3akY1.png",
				"65cm",
				67.70
		);

		categoria1.getProdutos().addAll(Arrays.asList(p1, p2, p3, p4));
		categoria2.getProdutos().addAll(Arrays.asList(p5, p6, p7, p8, p9));
		categoria3.getProdutos().addAll(Arrays.asList(p1, p2, p3, p4, p7));
		categoria4.getProdutos().addAll(Arrays.asList(p19, p20, p21, p22));
		categoria5.getProdutos().addAll(Arrays.asList(p10, p11, p12, p13, p14));
		categoria6.getProdutos().addAll(Arrays.asList(p13, p16, p17, p18));

		p1.getCategorias().addAll(Arrays.asList(categoria1, categoria3));
		p2.getCategorias().addAll(Arrays.asList(categoria1, categoria3));
		p3.getCategorias().addAll(Arrays.asList(categoria1, categoria3));
		p4.getCategorias().addAll(Arrays.asList(categoria1, categoria3));
		p5.getCategorias().addAll(Arrays.asList(categoria2));
		p6.getCategorias().addAll(Arrays.asList(categoria2));
		p7.getCategorias().addAll(Arrays.asList(categoria2, categoria3));
		p8.getCategorias().addAll(Arrays.asList(categoria2));
		p9.getCategorias().addAll(Arrays.asList(categoria5));
		p10.getCategorias().addAll(Arrays.asList(categoria5));
		p11.getCategorias().addAll(Arrays.asList(categoria5));
		p12.getCategorias().addAll(Arrays.asList(categoria5, categoria6));
		p13.getCategorias().addAll(Arrays.asList(categoria5, categoria6));
		p14.getCategorias().addAll(Arrays.asList(categoria5));
		p16.getCategorias().addAll(Arrays.asList(categoria6));
		p17.getCategorias().addAll(Arrays.asList(categoria6));
		p19.getCategorias().addAll(Arrays.asList(categoria4));
		p20.getCategorias().addAll(Arrays.asList(categoria4));
		p21.getCategorias().addAll(Arrays.asList(categoria4));
		p22.getCategorias().addAll(Arrays.asList(categoria4));

		categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2, categoria3, categoria4, categoria5, categoria6));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p16, p17, p18, p19, p20, p21, p22));

		//instancia estados
		Estado estado1 = new Estado(null, "Rio Grande do Sul");
		Estado estado2 = new Estado(null, "São Paulo");
		Estado estado3 = new Estado(null, "Rio de Janeiro");

		//instancia cidades
		Cidade cidade1 = new Cidade(null, "Porto Alegre", estado1);
		Cidade cidade2 = new Cidade(null, "São Paulo - Capital", estado2);
		Cidade cidade3 = new Cidade(null, "Rio de Janeiro - Capital", estado3);

		estado1.getCidades().addAll(Arrays.asList(cidade1));
		estado2.getCidades().addAll(Arrays.asList(cidade2));
		estado3.getCidades().addAll(Arrays.asList(cidade3));

		estadoRepository.saveAll(Arrays.asList(estado1, estado2, estado3));
		cidadeRepository.saveAll(Arrays.asList(cidade1, cidade2, cidade3));

		Cliente cliente1 = new Cliente(null, "Bruno Fraga", "brunof@gmail.com", "42377354351", TipoCliente.PESSOAFISICA);
		cliente1.getTelefones().addAll(Arrays.asList("835269193", "622869313"));
		Cliente cliente2 = new Cliente(null, "Camila Fernandes", "camilafernandes@gmail.com", "38625415768", TipoCliente.PESSOAFISICA);
		cliente2.getTelefones().addAll(Arrays.asList("729926093"));
		Cliente cliente3 = new Cliente(null, "Elena G", "elenag@gmail.com", "11272246035", TipoCliente.PESSOAFISICA);
		cliente3.getTelefones().addAll(Arrays.asList("143743495"));

		Endereco endereco1 = new Endereco(null, "Rua Dr.luis da Silva Santos", "780", "ap. 201", "Auxiliadora", "90450236", cliente1, cidade1);
		Endereco endereco2 = new Endereco(null, "Rua Alameda Lorena", "35", "ap. 1020", "Jardins", "90450236", cliente2, cidade2);
		Endereco endereco3 = new Endereco(null, "Rua da Alfândega", "678", "ap. 01", "Centro", "90450236", cliente3, cidade3);
		Endereco endereco4 = new Endereco(null, "Rua Riachuelo", "860", "ap. 120", "Centro", "90860796", cliente1, cidade1);

		cliente1.getEnderecos().addAll(Arrays.asList(endereco1, endereco4));
		cliente2.getEnderecos().addAll(Arrays.asList(endereco2));
		cliente3.getEnderecos().addAll(Arrays.asList(endereco3));

		clienteRepository.saveAll(Arrays.asList(cliente1, cliente2, cliente3));
		enderecoRepository.saveAll(Arrays.asList(endereco1, endereco2, endereco3, endereco4));

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Pedido pedido1 = new Pedido(null, sdf.parse("30/06/2020 10:32"), cliente1, endereco1);
		Pedido pedido2 = new Pedido(null, sdf.parse("30/06/2020 10:49"), cliente1, endereco4);
		Pedido pedido3 = new Pedido(null, sdf.parse("01/07/2020 17:40"), cliente2, endereco2);
		Pedido pedido4 = new Pedido(null, sdf.parse("01/07/2020 20:36"), cliente3, endereco3);

		Pagamento pagamento1 = new PagamentoComCartao(null, EstadoPagamento.CANCELADO, pedido1, 1);
		pedido1.setPagamento(pagamento1);
		Pagamento pagamento2 = new PagamentoComCartao(null, EstadoPagamento.PAGO, pedido2, 1);
		pedido2.setPagamento(pagamento2);
		Pagamento pagamento3 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, pedido3, sdf.parse("04/07/2020 23:59"),null);
		pedido3.setPagamento(pagamento3);
		Pagamento pagamento4 = new PagamentoComCartao(null, EstadoPagamento.PAGO, pedido4, 2);
		pedido4.setPagamento(pagamento4);

		cliente1.getPedidos().addAll(Arrays.asList(pedido1, pedido2));
		cliente2.getPedidos().addAll(Arrays.asList(pedido3));
		cliente3.getPedidos().addAll(Arrays.asList(pedido4));

		pedidoRepository.saveAll(Arrays.asList(pedido1, pedido2, pedido3, pedido4));
		pagamentoRepository.saveAll(Arrays.asList(pagamento1, pagamento2, pagamento3, pagamento4));

		ItemPedido itemPedido1 = new ItemPedido(pedido1, p1, 0.00, 2, p1.getPreco());
		ItemPedido itemPedido2 = new ItemPedido(pedido2, p2, 0.00, 2, p2.getPreco());
		ItemPedido itemPedido3 = new ItemPedido(pedido2, p8, 0.00, 8, p8.getPreco());
		ItemPedido itemPedido4 = new ItemPedido(pedido2, p5, 0.00, 6, p5.getPreco());
		ItemPedido itemPedido5 = new ItemPedido(pedido2, p13, 0.00, 1, p13.getPreco());
		ItemPedido itemPedido6 = new ItemPedido(pedido2, p14, 0.00, 1, p14.getPreco());
		ItemPedido itemPedido7 = new ItemPedido(pedido2, p20, 0.00, 4, p20.getPreco());
		ItemPedido itemPedido8 = new ItemPedido(pedido2, p9, 0.00, 2, p9.getPreco());
		ItemPedido itemPedido9 = new ItemPedido(pedido2, p19, 0.00, 5, p19.getPreco());
		ItemPedido itemPedido10 = new ItemPedido(pedido2, p19, 0.00, 2, p21.getPreco());
		ItemPedido itemPedido11 = new ItemPedido(pedido2, p18, 0.00, 15, p18.getPreco());

		pedido1.getItens().addAll(Arrays.asList(itemPedido1));
		pedido2.getItens().addAll(Arrays.asList(itemPedido2, itemPedido3, itemPedido4, itemPedido5, itemPedido6, itemPedido7, itemPedido8, itemPedido9));
		pedido3.getItens().addAll(Arrays.asList(itemPedido10));
		pedido4.getItens().addAll(Arrays.asList(itemPedido11));

		p1.getItens().addAll(Arrays.asList(itemPedido1));
		p2.getItens().addAll(Arrays.asList(itemPedido2));
		p8.getItens().addAll(Arrays.asList(itemPedido3));
		p5.getItens().addAll(Arrays.asList(itemPedido4));
		p13.getItens().addAll(Arrays.asList(itemPedido5));
		p14.getItens().addAll(Arrays.asList(itemPedido6));
		p20.getItens().addAll(Arrays.asList(itemPedido7));
		p9.getItens().addAll(Arrays.asList(itemPedido7));
		p19.getItens().addAll(Arrays.asList(itemPedido9));
		p21.getItens().addAll(Arrays.asList(itemPedido10));
		p18.getItens().addAll(Arrays.asList(itemPedido11));

		itemPedidoRepository.saveAll(Arrays.asList(itemPedido1, itemPedido2, itemPedido3, itemPedido4, itemPedido5, itemPedido6, itemPedido7, itemPedido8, itemPedido9, itemPedido10, itemPedido11));
	}
}
