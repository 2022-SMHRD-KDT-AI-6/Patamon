import java.util.Random;
import java.util.Scanner;

public class devil extends pataDTO{
	 	
	public devil(String name, int lv, int hp, String con) {
		super(name, lv, hp, con);
	}
	public static void main(String[] args) throws InterruptedException {
	
		
			
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		pataDTO pata = new pataDTO();

		int patask1 = 9; // 倖搭酵帖奄, (葵聖 嬢胸惟竺舛背醤馬走?)
		int airshot = 1; //因奄椴精 郊稽郊稽 公掌.
		int damage = 1 ;
		int picohp = 30;	// 杷坪汽柵佼税 端径.. 護生稽??
		int picost ;	//杷坪汽柵佼 因維径 痕呪. 薄仙澗 10税 沓棋呪稽 宜軒澗掻
		int array[] = new int[10];
		
		int devilhp = 50; //汽柵佼 杷 竺舛
		
		
			System.out.println("[井壱!!!!!] 汽柵佼引 穿燈杯艦陥. 穿燈拭辞 鳶壕馬檎 惟績戚 魁崖艦陥. 域紗馬獣畏柔艦猿?");
			System.out.println("          <     督韓佼税 傾婚戚 5 戚雌析凶 亀穿亜管    >");
			int boss = sc.nextInt();
			if(boss==1) {
				while(true) {
					if(pata.getLv()>5) {
						
								//穿燈 坪球 益企稽. 杷坪汽柵佼 郊蚊辞.

			     		System.out.println("                汽柵佼戚 去舌梅陥!!");
						System.out.println();
						System.out.println("===============================================");
						System.out.println();


							System.out.println("             汽柵佼引 穿燈 獣拙!!!!");
							System.out.println();
							System.out.println("============== 紫遂拝 奄綬聖 識澱馬室推 ==============");

							while (true) {

								System.out.println(" [1]倖搭酵帖奄 [2]因奄椴 [3]枢滴軒奄");
								int sel3 = sc.nextInt();

								if (sel3 == 1) {
									// 倖搭酵帖奄
									System.out.println("============== 紫遂拝 奄綬聖 識澱馬室推 ==============");
									System.out.println();
									System.out.println("              倖搭酵帖奄!!       ");
									System.out.println();

									airshot += 1; // 因奄椴 亜管
									damage = patask1 + pata.getStr();

									//汽柵佼 hp魚稽 竺舛.
									devilhp -= damage;
									System.out.println("-     汽柵佼 拭惟 " + damage + " 税 杷背研 脊縛陥." + "(汽柵佼税 害精HP :" + devilhp + ")");

									int dam = rd.nextInt(15) + 1;
									pata.setHp(-dam);
									System.out.println("-     汽柵佼 税 因維!! " + dam + " 税 杷背研 閤紹陥ばば"+ "(督韓佼税 害精HP :" + pata.getHp() + ")");
									System.out.println("===============================================");
									if (devilhp <= 0) {
										System.out.println("    人~~~~     汽柵佼拭惟 戚医陥!!!ぞぞぞ ");
										System.out.println();
										System.out.println("            -  穿燈 魁 -");
										break;
									}
									System.out.println("                   び");
									System.out.println("                   び");
									System.out.println("                   び");
									pata.setHp(-dam);
									// hp -= dam;

									System.out.println("============== 紫遂拝 奄綬聖 識澱馬室推 ==============");

								} else if (sel3 == 2) {

									if (airshot <= 0) {
										System.out.println("-- 因奄亜 採膳背辞 因奄椴精 尻紗生稽 紫遂拝呪 蒸柔艦陥. --");
										System.out.println("-- 因奄研 乞生澗 疑照 陥献奄綬聖 紫遂背爽室推. --");
										System.out.println();
									} else {
										// 因奄椴
										String art3 = """
												#%####(###(                                     (%##########,
												       .#%####(#(##(                                  (##########
												         #%%######((#%/                                (#(####(%@
												         ##########((/%#(                              (%#(##((#.
												            ((#(###(#####(                          /#%##((#(/#(
												               *%####(#%%(                       /%##(#((((####
												                #%%#####%%(                      (%%###((#(##(
												               *%########%#(                     /#%#####(
												                ,//(#%%#(####/                   (%###(
												                        ((%##((                ####(
												                    *(#/   .((##(########((/(/(##(
												                 //((###(/#################((###(
												              ((######(#(#####(*###(*(/########(##(
												           ,(########################(/((####(#/(#//
												          /((######%#########(#####((##%#####%%%%&%#/
												    (/   /################(#%%&%%%%##(///////////(#%%&#
												    *,&@%@%#(####(####%@@@@@&%%##(//////////////////#%%#
												     (&&(@@&#####(#&@@@@@@&%%%#(/////////////////(((((%%*
												     /%%/@@@@&##&@@@@@@@@&%%%/////////////////((//////#%#
												      #&%&@@@@@@@@@@@@@@&%%#//////((((((((//******,,,,/(/
												       #&&@@@@@@@@@@@@@@&%%(((((((####((/*,,..........*/.
												        #&&@@@@@@@@@@@@@&&%#%%%%%%###((/*,.     ......**
												         #%&&@@@@@@@@@@@@&&%&&&&&&&%#(/*,,.          ,*.
												          /%&&@@@@@@@&&@@@@&&&&&&&%##/*,,,,.        ,,*
												            #&&&@&&&@@@@@@@@&&&&&&%##(/***,,.......,,
												              %&%&&@@@@@@@@@@&&&&&%%##((////*,,,,*/.
												               /%#%&&&@@@@@@@@@&&%%%###((((///(#(
												                *%&&#%&&&&&@@@@@@@@&%##((#%####
												                 ,&@@@&#&((%&&&&&&&&%%####
												                   %@@@&&(%&#*
												                     (/..*(&
												                      (/
												           .,,,,,,,    .,,,,,,,.  #@@:                 .,,,,,,,.  *@@*        @@@,
												          -@@@@@@@@#  -#@@@@@@@=. @@@:                .@@@@@@@@@. *@@=        @@@,
												          -@@@@@@@@#  :@@@@@@@@$. @@@:                .@@@@@@@@@, *@@=        @@@,
												          .;;;;;*@@#  ,;;;;;$@@$. @@@:                 *@@@*@@@;. *@@=        @@@,
												                ~@@#        *@@$. @@@:                 -#@@~@@@   *@@=        @@@,
												                ~@@#        *@@$. @@@:                 -#@@~@@@   *@@@##;     @@@,
												                ~@@#        *@@$. @@@:                 -#@@~@@@   *@@@@@@     @@@,
												                ~@@#        *@@$. @@@:                 -#@@~@@@   *@@@@@$     @@@,
												                ~@@#        *@@$. @@@:                 *@@@=@@@!  *@@$::,     @@@,
												                :@@#        *@@$. @@@:                .@@@@@@@@@, *@@=        @@@,
												             ;@@@@@#        *@@$. @@@:                .@@@@@@@@@, *@@=        @@@,
												             ;@@@*$~        .=$!  @@@:                 ;$$$$$$$!  *@@=        @@@,
												             ;@@#                 @@@:                            *@@=        #@@,
												          ;!!$@@@!!!.             @@@:                            *@@=        -:~
												          #@@@@@@@@@=             @@@:                            *@@=
												          #@@@@@@@@@$             @@@:                            *@@=        @@@-
												          ,::::::::~              @@@:                            *@@=        @@@-
												             ,::~.                @@@:                            *@@=        *$=,
												            *$@@@=~               *@@:                          ,*#@@#*,      .,.
												           $@@@@@@@-               ..                           #@@@@@@#.
												          ~@@@##@@@#                                           =@@@##@@@*
												          #@@!  ,#@@:                                         .@@@~  ~@@@.
												         .#@@~   ;@@$                                         ;@@=.  ,$@@~
												         .#@@:   ;@@$                                         ~@@=.  ,#@@~
												          #@@=. ,#@@-                                          @@@;  ;@@@
												          -@@@#$@@@$                                           *@@@$$@@@;
												           ;#@@@@@$,                                            *@@@@@@*.
												            ~!#@=;,                                             .;*@@*:.
												              ,,.                                                 .,,.

															""";
										for (int i = 0; i < art3.length(); i++) {
											System.out.print(art3.charAt(i));
											Thread.sleep(1);
										}
										damage = pata.getStr() + 2;
//										damage = str + 2;
										System.out.println("          因奄~~~~~~~~椴!!!!!!!");
										System.out.println();
										System.out.println();
										airshot -= 1;

										devilhp -= damage;
										System.out.println("-     汽柵佼 拭惟 " + damage + " 税 杷背研 脊縛陥." + "(汽柵佼税 害精HP :" + devilhp + ")");
										System.out.println();
										int dam = rd.nextInt(15) + 1;
										pata.setHp(-dam);
										System.out.println("-     汽柵佼 税 因維!! " + dam + " 税 杷背研 閤紹陥ばば"+ "(督韓佼税 害精HP :" + pata.getHp() + ")");
										System.out.println("===============================================");
										if (devilhp <= 0) {
											System.out.println("    人~~~~     汽柵佼拭惟 戚医陥!!!ぞぞぞ ");
											System.out.println();
											System.out.println("            -  穿燈 魁 -");
											break;
										}
										System.out.println("                   び");
										System.out.println("                   び");
										System.out.println("                   び");
										pata.setHp(-dam);
										// hp -= dam;
										System.out.println("============== 紫遂拝 奄綬聖 識澱馬室推 ==============");
									}

								} else {
									System.out.println();
									System.out.println("     督韓佼戚 倖聖 枢滴形辞 端径聖 噺差梅陥.");
									// 枢滴軒奄
									pata.setHp(+3);
									airshot += 1;
									System.out.println("     督韓佼税 端径 3 噺差!!! "+"(督韓佼税 HP :"+pata.getHp()+")");
									System.out.println();
									int dam = rd.nextInt(15) + 1;
									pata.setHp(-dam);
									System.out.println("-     汽柵佼 税 因維!! " + dam + " 税 杷背研 閤紹陥ばば"+ "(督韓佼税 害精HP :" + pata.getHp() + ")");
									System.out.println("===============================================");
									if (devilhp <= 0) {
										System.out.println("        人~~~~     汽柵佼拭惟 戚医陥!!!ぞぞぞ ");
										System.out.println();
										System.out.println("                -  穿燈 魁 -");
										break;
					}
					else {
						System.out.println();
						System.out.println("督韓佼税 傾婚戚 碍焼辞 亀穿拝呪 蒸柔艦陥.");
						break;
					}
				
				}
				break;
				// 穿燈拭辞 鳶壕敗 ... 惟績 魁
			}
				
			}
					else {
						System.out.println("            五昔生稽 宜焼逢艦陥.");
						System.out.println();
						System.out.println();	
						System.out.println("===============================================");
				    	System.out.println("           戚賎 校拝猿...?");	
				    	System.out.println();	
					break;
						
					}
			
				}
			}
		
		}
		
	
	
}


