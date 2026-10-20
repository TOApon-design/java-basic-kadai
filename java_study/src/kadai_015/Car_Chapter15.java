package kadai_015;


public class Car_Chapter15 {

		private int gear = 1;
		private int spead = 10;
		
		//コンストラクタの生成初期設定の代入
		public Car_Chapter15(int gear, int spead){
			this.gear = gear;
			this.spead = spead;
			
		}
		
		public void changeGear(final int afterGear) {
			if(this.gear < afterGear) {
				this.gear = afterGear * 1;
				System.out.println("ギア1から" + this.gear + "に切り替えました");
				return;
			}
			this.gear = afterGear * 1;
			System.out.println("ギア1から" + this.gear + "に切り替えました");
		}
		
		public void run() {
			int spead = this.gear * 10;
			if((spead >= 10) && (spead <= 50)) {
				System.out.println("速度は時速" + spead + "kmです");
			}else {
				
			System.out.println("速度は時速10kmです");
			}
		}

	}
