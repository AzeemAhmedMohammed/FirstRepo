package me.training.july.basic;

public class BeerSong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int beerNum = 99;
		String Word = "bottles";

		while (beerNum > 0) {

			if (beerNum == 1) {
				Word = "bottle";

			}
			System.out.println(beerNum + " " + Word + " " + "of beer on the wall");
			System.out.println(beerNum + " " + Word + " " + "of beer");
			System.out.println("Take one down");
			System.out.println("Pass it around");
			beerNum = beerNum - 1;

			if (beerNum > 0) {
				//System.out.println(beerNum + " " + Word + " " + "of beer on the wall");
			} else {
				System.out.println("No more bottles of beer on the wall");
			}

		}

	}

}
