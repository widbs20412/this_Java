package p03.object.tostring;

public class GoodsStock {
	String goodsCode;
	int stockNum;

	public GoodsStock(String goodsCode, int stockNum) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}

	@Override
	public String toString() {
		return goodsCode+" : "+stockNum;
	}

	public static void main(String[] args) {
		GoodsStock g = new GoodsStock("1111", 100);
		System.out.println(g);
		System.out.println(g.toString());

	}

}
