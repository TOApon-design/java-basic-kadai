package kadai_015;


public class Car_Chapter15 {

		private int gear = 1;
		private int spead = 10;
		private int gearspead = 10;
		
		//コンストラクタの生成初期設定の代入
		public Car_Chapter15(){
			this.gear = 1;
			this.spead = 10;
			this.gearspead = gear * spead;
			
		}
		
		public void changeGear(final int afterGear) {
			int beforeGear = this.gear; // 変更前のギアを保存
		    this.gear = afterGear;

		    if (this.gear >= 1 && this.gear <= 5) {
		    	this.gearspead = this.gear * 10;
		    } else {
		        this.gearspead = 10;
		    }

		    System.out.println("ギア" + beforeGear + "から" + this.gear + "に切り替えました");
		}
		
		public void run() {
			if((this.gearspead >= 10) && (this.gearspead <= 50)) {
				System.out.println("速度は時速" + this.gearspead + "kmです");
			}else {
				
			System.out.println("速度は時速" + this.gearspead + "kmです");
			}
		}

	}
