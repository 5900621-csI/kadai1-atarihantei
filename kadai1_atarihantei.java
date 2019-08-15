import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kadai1_atarihantei {

	public static void main(String[] args) {
		int i;
		int j;
		int k;
		int r = 0;
        String enomber = null;
		int enemynomber;
		int[] allydata = new int[4];
		String dataa = null;
		String[] zxc = {};
		String[] vbn = {};

		//自機のデータを入力
		InputStreamReader asd = new InputStreamReader(System.in);
        BufferedReader stra = new BufferedReader(asd);
        System.out.println("自機のデータを入力");
        try {
			dataa = stra.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		zxc = dataa.split(" ", 0);
		for(i = 0;i < zxc.length; i++){
			allydata[i] = Integer.parseInt(zxc[i]);
		}

		//ループで敵機のデータ入力して配列に格納
		InputStreamReader fgh = new InputStreamReader(System.in);
        BufferedReader stren = new BufferedReader(fgh);
        System.out.println("敵機の数を入力");
        try {
			enomber = stren.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		enemynomber = Integer.parseInt(enomber);
		boolean flg[] = new boolean[enemynomber];
		for(int l = 0; l < enemynomber; l++){
			flg[l] = true;
		}
		int[][] enemydata = new int[enemynomber][4];
		String[] datae = new String[enemynomber];
		//System.out.println("敵機のデータ入力");
		for(j = 0; j < enemynomber; j++){
			InputStreamReader jkl = new InputStreamReader(System.in);
	        BufferedReader stre = new BufferedReader(jkl);
	        r++;
	        System.out.println("敵機のデータを入力(" + r  + "機目)");
	        try {
				datae[j] = stre.readLine();
				vbn = null;
				vbn = datae[j].split(" ", 0);
				for(k = 0; k < vbn.length; k++){
					enemydata[j][k] = Integer.parseInt(vbn[k]);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }

        //ループで「当たり判定」をして判定結果を表示
		for(int l = 0; l < enemynomber; l++){
			if(allydata[0] <= enemydata[l][0] + enemydata[l][2]){
				if(allydata[0] + allydata[2] >= enemydata[l][0]){
					if(allydata[1] <= enemydata[l][1] + enemydata[l][3] || allydata[1] + allydata[3] >= enemydata[l][1]){
					}else{
						flg[l] = false;
					}
				}
			}else{
				flg[l] = false;
			}
			if(flg[l]){
				if(allydata[1] <= enemydata[l][1] + enemydata[l][3]){
					if(allydata[1] + allydata[3] >= enemydata[l][1]){
					}else{
						flg[l] = false;
					}
				}else{
					flg[l] = false;
				}
			}
		}
		System.out.println("結果");
		for(int l = 0; l < enemynomber; l++){
			if(flg[l]){
				int x = l + 1;
				System.out.println("敵機" + x + "が当たり");
			}
		}
	}

}
