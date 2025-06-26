import java.util.Scanner;

public class EVCPLUSE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("EVCpluse");
        String EVC = input.next();
        String EVC_CODE = "*770#";
        int pass = 1122;
        double ac_balance = 100;
        double balance = 85;
        //wajiga hore ee EVCz
        if (EVC_CODE.equals(EVC)) {
            System.out.println("- EVCPLUS -");
            System.out.println("faldan geli pin-kaaga(Enter pin)");
            //password
            int user_pass = input.nextInt();
            if (pass == user_pass) {
                System.out.println("EVCPLUS");
                System.out.println("1. Itus Haraaga");
                System.out.println("2. kaarka hadalka");
                System.out.println("3. Bixi Biil");
                System.out.println("4.U wareeji EVCPLUS");
                System.out.println("5. Warbixin Kooban");
                System.out.println("6. Salaam Bank");
                System.out.println("7. Maareynta");
                System.out.println("8. TAAJ");
                System.out.println("9. Bill Payment");
                //dooro number sax ah
                int dooro = input.nextInt();
                switch (dooro) {
                    //1. qeybta hagaaga
                    case 1:
                        System.out.println("[-EVCPLUS-] Haraagaagu waa $" + balance);
                        break;

                    //2.qeybta kaarka hadalka
                    case 2:
                        System.out.println("Kaarka hadalka");
                        System.out.println("1. Ku shubo Airtime");
                        System.out.println("2. Ugu shubo Airtime");
                        System.out.println("3. MIFI Packages");
                        System.out.println("4. Ku shubo Internet");
                        System.out.println("5. Ugu shub qof kale (MMT)");
                        //qeybta ku shubo airtime
                        int kaarka_hadalka = input.nextInt();
                        switch (kaarka_hadalka) {
                            case 1:
                                System.out.println("Fadlan Gali lacagta");
                                double kaarka_lacgta = input.nextDouble();
                                System.out.println("Fadlan Geli numberka");
                                int mob_kaarka = input.nextInt();
                                System.out.println("Ma hubtaa inaad $" + kaarka_lacgta + " ku shubtid undefined?");
                                System.out.println("1. haa");
                                System.out.println("2. maya");
                                int hubin = input.nextInt();
                                switch (hubin) {
                                    case 1:
                                        if (balance >= kaarka_lacgta) {
                                            System.out.println("waad guuleysady inaa lacagta u shubto" + mob_kaarka + " \n haraagaga hada waa $" + (balance - kaarka_lacgta));


                                        } else System.out.println("haraagagu kuma filano");
                                        break;
                                    case 2:
                                        System.out.println("OK");
                                        break;


                                }
                                break;
                            //2. ugu shubo airtime
                            case 2:
                                System.out.println("Fadlan Geli mobile-ka");
                                int num_qofka = input.nextInt();
                                System.out.println("Fadlan Geli lacagta");
                                double qofka_lcgta = input.nextDouble();

                                System.out.println("Ma hubtaa inaad $" + qofka_lcgta + " ku shubtid " + num_qofka + "?");
                                System.out.println("1. haa");
                                System.out.println("2. maya");
                                int ugushubo_hubin = input.nextInt();
                                switch (ugushubo_hubin) {
                                    case 1:
                                        if (balance >= qofka_lcgta) {
                                            System.out.println("waad guuleysady inaa lacagta u shubtid " + num_qofka + " \n haraagaga hada waa $" + (balance - qofka_lcgta));

                                        } else System.out.println("haraagagu kuma filano");

                                        break;
                                    case 2:
                                        System.out.println("OK");
                                        break;

                                }


                                //3.qeybta MIFI Packages
                            case 3:
                                System.out.println("EVCPlus");
                                System.out.println("1. Ku shubo Data-da MIFI");
                                int data = input.nextInt();
                                if (data == 1) {
                                    System.out.println("-Internet Bundle Recharge-");
                                    System.out.println("1. Isbuucle (Weekly)");
                                    System.out.println("2. Maalinle (Daily)");
                                    System.out.println("3. Bille (Monthly)");
                                    int mifiType = input.nextInt();
                                    if (mifiType == 1) {
                                        System.out.println("Fadlan dooro bundle-ka:");
                                        System.out.println("1. $5 = 10 GB");
                                        System.out.println("2. $10 = 25 GB");
                                        int weeklyChoice = input.nextInt();
                                        if (weeklyChoice == 1) {
                                            System.out.println("Fadlan gali MIFI user:");
                                            int mifiUser = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $" + 5 + " ugu shubtid " + mifiUser + " ?");
                                            System.out.println("1. Haa");
                                            System.out.println("2. Maya");
                                            int confirm = input.nextInt();
                                            if (confirm == 1) {
                                                balance -= 5;
                                                System.out.println("Waad ku guuleysatay inaad ku shubtid $5 isbuucle ah.");
                                                System.out.println("Haraagaaga hadda waa $" + balance);
                                            } else {
                                                System.out.println("OK");
                                            }
                                        } else if (weeklyChoice == 2) {
                                            System.out.println("Fadlan gali MIFI user:");
                                            int mifiUser = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $" + 10 + " ugu shubtid " + mifiUser + " ?");
                                            System.out.println("1. Haa");
                                            System.out.println("2. Maya");
                                            int confirm = input.nextInt();
                                            if (confirm == 1) {
                                                balance -= 10;
                                                System.out.println("Waad ku guuleysatay inaad ku shubtid $10 isbuucle ah.");
                                                System.out.println("Haraagaaga hadda waa $" + balance);
                                            } else {
                                                System.out.println("OK");
                                            }
                                        } else {
                                            System.out.println("Doorasho khaldan.");
                                        }
                                    } else if (mifiType == 2) {
                                        System.out.println("Fadlan dooro bundle-ka:");
                                        System.out.println("1. $1 = 2 GB");
                                        System.out.println("2. $2 = 5 GB");
                                        int dailyChoice = input.nextInt();
                                        if (dailyChoice == 1) {
                                            System.out.println("Fadlan gali MIFI user:");
                                            int mifiUser = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $" + 1 + " ugu shubtid " + mifiUser + " ?");
                                            System.out.println("1. Haa");
                                            System.out.println("2. Maya");
                                            int confirm = input.nextInt();
                                            if (confirm == 1) {
                                                balance -= 1;
                                                System.out.println("Waad ku guuleysatay inaad ku shubtid $1 maalinle ah.");
                                                System.out.println("Haraagaaga hadda waa $" + balance);
                                            } else {
                                                System.out.println("OK");
                                            }
                                        } else if (dailyChoice == 2) {
                                            System.out.println("Fadlan gali MIFI user:");
                                            int mifiUser = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $" + 2 + " ugu shubtid " + mifiUser + " ?");
                                            System.out.println("1. Haa");
                                            System.out.println("2. Maya");
                                            int confirm = input.nextInt();
                                            if (confirm == 1) {
                                                balance -= 2;
                                                System.out.println("Waad ku guuleysatay inaad ku shubtid $2 maalinle ah.");
                                                System.out.println("Haraagaaga hadda waa $" + balance);
                                            } else {
                                                System.out.println("OK");
                                            }
                                        } else {
                                            System.out.println("Doorasho khaldan.");
                                        }
                                    } else if (mifiType == 3) {
                                        System.out.println("Fadlan dooro bundle-ka:");
                                        System.out.println("1. $20 = 50 GB");
                                        int monthlyChoice = input.nextInt();
                                        if (monthlyChoice == 1) {
                                            System.out.println("Fadlan gali MIFI user:");
                                            int mifiUser = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $" + 20 + " ugu shubtid " + mifiUser + " ?");
                                            System.out.println("1. Haa");
                                            System.out.println("2. Maya");
                                            int confirm = input.nextInt();
                                            if (confirm == 1) {
                                                balance -= 20;
                                                System.out.println("Waad ku guuleysatay inaad ku shubtid $20 bille ah.");
                                                System.out.println("Haraagaaga hadda waa $" + balance);
                                            } else {
                                                System.out.println("OK");
                                            }
                                        } else {
                                            System.out.println("Doorasho khaldan.");
                                        }
                                    } else {
                                        System.out.println("Doorasho khaldan.");
                                    }
                                }
                                break;

                            case 4:
                                System.out.println("Fadlan dooro number-ka ku shubeyso:");
                                System.out.println("1. Isbuucle (Weekly)");
                                System.out.println("2. TIMES BASED PACKAGES");
                                System.out.println("3. DATA");
                                System.out.println("4. Maalinle (Daily)");
                                System.out.println("5. Bille (Monthly)");
                                int ku_shubo_intenet = input.nextInt();

                                switch (ku_shubo_intenet) {
                                    case 1:
                                        System.out.println("Fadlan geli lacagta:");
                                        double Lcgta_shubo = input.nextDouble();
                                        System.out.println("Fadlan geli mobile-ka:");
                                        int Mob_user = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $" + Lcgta_shubo + " ugu shubtid " + Mob_user + " ?");
                                        System.out.println("1. haa");
                                        System.out.println("2. maya");
                                        int _datahubin = input.nextInt();
                                        switch (_datahubin) {
                                            case 1:
                                                if (balance >= Lcgta_shubo) {
                                                    balance -= Lcgta_shubo;
                                                    System.out.println("Waad ku guuleysatay inaad ku shubtid $" + Lcgta_shubo + " data internet ah.\nHaraagaaga hadda waa: $" + balance);
                                                } else {
                                                    System.out.println("Haraagaagu kuma filna.");
                                                }
                                                break;
                                            case 2:
                                                System.out.println("OK");
                                                break;
                                            default:
                                                System.out.println("Number sax ah soo geli.");
                                        }
                                        break;

                                    case 2:
                                        System.out.println("Fadlan geli lacagta:");
                                        double times_based = input.nextDouble();
                                        System.out.println("Fadlan geli mobile-ka:");
                                        int Mobile_user = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $" + times_based + " ugu shubtid " + Mobile_user + " ?");
                                        System.out.println("1. haa");
                                        System.out.println("2. maya");
                                        int HUBIN = input.nextInt();
                                        switch (HUBIN) {
                                            case 1:
                                                if (balance >= times_based) {
                                                    balance -= times_based;
                                                    System.out.println("Waad ku guuleysatay inaad ku shubtid $" + times_based + " data internet ah.\nHaraagaaga hadda waa: $" + balance);
                                                } else {
                                                    System.out.println("Haraagaagu kuma filna.");
                                                }
                                                break;
                                            case 2:
                                                System.out.println("OK");
                                                break;
                                            default:
                                                System.out.println("Number sax ah soo geli.");
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Fadlan geli lacagta:");
                                        double Time_data = input.nextDouble();
                                        System.out.println("Fadlan geli mobile-ka:");
                                        int Mobile_users = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $" + Time_data + " ugu shubtid " + Mobile_users + " ?");
                                        System.out.println("1. haa");
                                        System.out.println("2. maya");
                                        int HUBIN_dooro = input.nextInt();
                                        switch (HUBIN_dooro) {
                                            case 1:
                                                if (balance >= Time_data) {
                                                    balance -= Time_data;
                                                    System.out.println("Waad ku guuleysatay inaad ku shubtid $" + Time_data + " data internet ah.\nHaraagaaga hadda waa: $" + balance);
                                                } else {
                                                    System.out.println("Haraagaagu kuma filna.");
                                                }
                                                break;
                                            case 2:
                                                System.out.println("OK");
                                                break;
                                            default:
                                                System.out.println("Number sax ah soo geli.");
                                        }
                                        break;

                                    case 4:
                                        System.out.println("Fadlan soo geli lacagta:");
                                        double daily = input.nextDouble();
                                        System.out.println("Fadlan soo geli mobile-ka:");
                                        int mob_input = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $" + daily + " ugu shubtid " + mob_input + " ?");
                                        System.out.println("1. haa");
                                        System.out.println("2. maya");
                                        int HBN = input.nextInt();
                                        switch (HBN) {
                                            case 1:
                                                if (balance >= daily) {
                                                    balance -= daily;
                                                    System.out.println("Waad ku guuleysatay inaad ku shubtid $" + daily + " data internet ah.\nHaraagaaga hadda waa: $" + balance);
                                                } else {
                                                    System.out.println("Haraagaagu kuma filna.");
                                                }
                                                break;
                                            case 2:
                                                System.out.println("OK");
                                                break;
                                            default:
                                                System.out.println("Number sax ah soo geli.");
                                        }
                                        break;

                                    case 5:
                                        System.out.println("Fadlan soo geli lacagta:");
                                        double monthly = input.nextDouble();
                                        System.out.println("Fadlan soo geli mobile-ka:");
                                        int Mob_input_monthly = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $" + monthly + " ugu shubtid " + Mob_input_monthly + " ?");
                                        System.out.println("1. haa");
                                        System.out.println("2. maya");
                                        int _HUBIN = input.nextInt();
                                        switch (_HUBIN) {
                                            case 1:
                                                if (balance >= monthly) {
                                                    balance -= monthly;
                                                    System.out.println("Waad ku guuleysatay inaad ku shubtid $" + monthly + " data internet ah oo bille ah.\nHaraagaaga hadda waa: $" + balance);
                                                } else {
                                                    System.out.println("Haraagaagu kuma filna.");
                                                }
                                                break;
                                            case 2:
                                                System.out.println("OK");
                                                break;
                                            default:
                                                System.out.println("Number sax ah soo geli.");
                                        }
                                        break;

                                    default:
                                        System.out.println("Number sax ah dooro.");
                                }
                                break;
                            //5. Ugu shub qof kale (MMT)
                            case 5:
                                System.out.println("fadlan soo geli mobile-ka");
                                int qofka_kale = input.nextInt();
                                System.out.println("fadlan soo geli lacagta");
                                double lcgta_qofka = input.nextInt();

                                System.out.println("Ma hubtaa inaad $" + lcgta_qofka + " ugu shubtid " + qofka_kale + " ?");
                                System.out.println("1. haa");
                                System.out.println("2. maya");
                                int hubin_dooro = input.nextInt();
                                switch (hubin_dooro) {
                                    case 1:
                                        if (balance >= lcgta_qofka) {
                                            System.out.println("waad ku guuleysaday inaad ugu shubtid " + qofka_kale + " \n haraagaga hada waa $" + (balance - qofka_kale));


                                        } else System.out.println("haraagagu kuma filno");
                                    case 2:
                                        System.out.println("ok");
                                        break;
                                    default:
                                        System.out.println("number sax ah soo geli");
                                }

                                break;
                            default:
                                System.out.println(" fadlan number sax soo dooro");


                        }

                        // bixi biil
                    case 3:
                        System.out.println("Bixi Biil");
                        System.out.println("1. Post Paid  ");
                        System.out.println("2.ku Iibso");
                        int bixi_biil = input.nextInt();
                        switch (bixi_biil) {
                            case 1:
                                System.out.println("Post Paid");
                                System.out.println("1. Ogow biil");
                                System.out.println("2. Bixi biil");
                                System.out.println("3.Ka Bixi Biil");

                                int post_paid = input.nextInt();
                                switch (post_paid) {
                                    case 1:
                                        System.out.println("haraagagu waa $" + balance);
                                        break;
                                    case 2:
                                        System.out.println("Fadlan geli lacagta biil-ka");
                                        int biilka_lcgta = input.nextInt();
                                        System.out.println("Ma hubtaa inaa bixisid biil lacagtiisu tahay: $" + biilka_lcgta);
                                        System.out.println("1.haa ");
                                        System.out.println("2. maya");
                                        int ogoow_biil = input.nextInt();
                                        switch (ogoow_biil) {
                                            case 1:
                                                if (balance >= biilka_lcgta) {
                                                    System.out.println("waad ku guuleysay inaa bixiso biilka \n haraagagu hada waa $" + (balance - biilka_lcgta));

                                                } else System.out.println("haragaagu kuma filno");
                                                break;
                                            case 2:
                                                System.out.println("ok");
                                                break;
                                            default:
                                                System.out.println("fadlan soo geli number sax ah");

                                        }
                                        break;
                                    case 3:
                                        System.out.println("fadlan soo geli mobile-ka");
                                        int mob_bixi = input.nextInt();
                                        System.out.println("fadlan geli lacgta");
                                        int lcgta_bixi = input.nextInt();
                                        System.out.println("Ma hubtaa inaad bixisid bill lacagtiisu tahay: $" + lcgta_bixi + " oo laga rabo tell NO " + mob_bixi);
                                        System.out.println("1.haa");
                                        System.out.println("2. maya");
                                        int ka_bixi_biil = input.nextInt();
                                        switch (ka_bixi_biil) {
                                            case 1:
                                                if (balance >= lcgta_bixi) {
                                                    System.out.println("waad ku guuleysay inaad bixiso lacagta \n haragaagu hada waa $" + (balance - lcgta_bixi));

                                                } else System.out.println("haragaagu kuma filno ");
                                                break;
                                            case 2:
                                                System.out.println("ok");
                                                break;
                                            default:
                                                System.out.println("fadlan soo geli number sax ah");

                                        }
                                        break;
                                    default:
                                        System.out.println("fadlan soo geli number sax ah");
                                }

                                break;
                            case 2:
                                System.out.println("Fadlan geli agoonsiga ganacsiga");
                                double aqoonsi = input.nextDouble();
                                if (aqoonsi == 1) {
                                    System.out.println("Fadlan Gali Number ka");
                                    int number = input.nextInt();
                                    System.out.println("Fadlan Gali lacagta");
                                    double money = input.nextDouble();
                                    System.out.println("Ma hubtaa inaad " + money + " udirto " + number + "\n" + "1.haa\n" + "2.maya");
                                    int ku_iibso = input.nextInt();
                                    switch (ku_iibso) {
                                        case 1:
                                            if (balance >= money) {
                                                System.out.println("waad ku guuleystay howshaan\n" + "Haraagaagu waa " + balance);

                                            }
                                            break;
                                        case 2:
                                            System.out.println("Mahadsanid!");
                                            break;
                                        default:
                                            System.out.println("fadlan soo dooro number sax ah ");
                                    }

                                } else System.out.println("aqoonsigaaga waa qalad");

                                break;
                            default:
                                System.out.println("fadlan soo geli number sax ah");
                        }


                        // U wareeji Evcplus
                    case 4:
                        System.out.println("fadlan geli mobile-ka");
                        int tell = input.nextInt();
                        System.out.println("fadaln geli lacagta");
                        double lcgta_uwareejinka = input.nextDouble();

                        System.out.println("Ma hubtaa inaad $" + lcgta_uwareejinka + " ugu shubtid " + tell + " ?");
                        System.out.println("1. haa");
                        System.out.println("2. maya");
                        int hubin_uwareejida = input.nextInt();
                        switch (hubin_uwareejida) {
                            case 1:
                                if (balance >= lcgta_uwareejinka) {
                                    System.out.println(lcgta_uwareejinka + " $ ayaad uwareejisay " + tell + "\n haraagaga hada waa $" + (balance - lcgta_uwareejinka));
                                } else System.out.println("haraagagu kuma filno ");
                                break;

                            case 2:
                                System.out.println("ok");
                                break;
                            default:
                                System.out.println("number sax ah soo geli");

                        }


                        break;
                    // 5.warbixin kooban
                    case 5:
                        System.out.println("Warbixin Kooban");
                        System.out.println("1. Last Action ");
                        System.out.println("2. Wareejintii u dambeysay");
                        System.out.println("3.Iibsashadii u dambeysay");
                        System.out.println("4.Last 3 Action");
                        System.out.println("5. Email Me My ACtivity");
                        int warbixin_kooban = input.nextInt();
                        switch (warbixin_kooban) {
                            case 1:
                                System.out.println("$100 Ayaad u wareejisay +252615991582, Taariikh: 18/03/24 13:03:15");
                                break;
                            case 2:
                                System.out.println("Statementiga");
                                System.out.println("1. U dirtay");
                                System.out.println("2.kaheshay");
                                int statement = input.nextInt();
                                switch (statement) {
                                    case 1:
                                        System.out.println("fadlan geli mobile-ka");
                                        int dirtay = input.nextInt();
                                        System.out.println("$10 Ayaad ka dirtay +252" + dirtay + ", Taariikh: 18/01/24 14:03:16");
                                        break;
                                    case 2:
                                        System.out.println("fadlan geli mobile-ka");
                                        int kaheshay = input.nextInt();
                                        System.out.println("$10 Ayaad ka heshay +252" + kaheshay + ", Taariikh: 18/01/24 14:03:16");
                                        break;
                                    default:
                                        System.out.println("fadlan soo geli number ah");

                                }
                            case 3:
                                break;
                            case 4:
                                System.out.println("$100 Ayaad u wareejisay +252615991582, Taariikh: 18/03/24 13:03:15");
                                System.out.println("$90 Ayaad u wareejisay +252615001582, Taariikh: 18/03/24 13:27:15");
                                System.out.println("$101 Ayaad u wareejisay +252615008992, Taariikh: 18/03/24 13:28:15");

                                break;
                            case 5:
                                System.out.println("your request is being processed and the activity will be emailed to mabdillahi276@gmail.com");
                                break;
                            default:
                                System.out.println("fadlan soo geli number sax ah");


                        }
                        break;
                    //salaam bank
                    case 6:
                        System.out.println("Salaam Bank");
                        System.out.println("1. Itus haraaga");
                        System.out.println("2. Lacag dhigasho");
                        System.out.println("3. Lacag qaadasho");
                        System.out.println("4. Ka wareeji EVCPlus");
                        System.out.println("5. Ka wareeji Account-kaga");
                        System.out.println("6. hubi wareeji account");
                        System.out.println("7. Maareynta Bankiga");
                        int ac_pass = 573804;


                        int salam_bank = input.nextInt();
                        switch (salam_bank) {
                            case 1:
                                System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                                int num_sirta = input.nextInt();
                                if (num_sirta == ac_pass) {
                                    System.out.println("haragaaga bangiga waa:" + ac_balance + "USD");
                                } else System.out.println("numberkaaga sirta ee bangiga waa qalad");
                                break;
                            case 2:
                                System.out.println("fadlan geli lacagta");
                                int lcg_dhigasho = input.nextInt();
                                System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                                int num_sirt1 = input.nextInt();
                                if (num_sirt1 == ac_pass) {
                                    System.out.println("Ma hubtaa inaad $" + lcg_dhigasho + " dhigatid account_kaaga bangiga ? \n 1.haa \n 2.mya");
                                    int dhigasho_hubin = input.nextInt();
                                    switch (dhigasho_hubin) {
                                        case 1:
                                            if (ac_balance >= lcg_dhigasho) {
                                                System.out.println("USD " + lcg_dhigasho + " ayaa dhigatay koontadaada bangiga" + "\n haragaagu hada waa: $" + (ac_balance + lcg_dhigasho));
                                            } else System.out.println("haragaagu kuma filno");
                                            break;
                                        case 2:
                                            System.out.println("ok");
                                            break;
                                        default:
                                            System.out.println("number sax ah soo geli");
                                    }

                                } else System.out.println("numberkaaga sirta ee bangiga waa qalad");
                                break;
                            case 3:
                                System.out.println("fadlan geli lacagta");
                                int lcg_qaadasho = input.nextInt();
                                System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                                int num_sirt2 = input.nextInt();
                                if (num_sirt2 == ac_pass) {
                                    System.out.println("Ma hubtaa inaad $" + lcg_qaadasho + " qaadatid account_kaaga bangiga ? \n 1.haa \n 2.mya");
                                    int qaadasho_hubin = input.nextInt();
                                    switch (qaadasho_hubin) {
                                        case 1:
                                            if (ac_balance >= lcg_qaadasho) {
                                                System.out.println("USD " + lcg_qaadasho + " ayaa kala baxday koontadaada bangiga" + "\n haragaagu hda waa: $" + (ac_balance - lcg_qaadasho));
                                            } else System.out.println("haragaagu kuma filno");
                                            break;
                                        case 2:
                                            System.out.println("ok");
                                        default:

                                            System.out.println("number sax ah soo geli");
                                            break;


                                        // maareynt
                                        case 7:
                                            class Maareynta {
                                                int[] pinHistory = new int[5];
                                                int pinIndex = 0;

                                                public void bedelPin(java.util.Scanner input) {
                                                    System.out.println("Fadlan Geli PIN-kaaga Cusub:");
                                                    int pinCusub = input.nextInt();

                                                    System.out.println("Hubi PIN-kaaga Cusub:");
                                                    int hubiPin = input.nextInt();

                                                    if (pinCusub == hubiPin) {
                                                        if (pinIndex < pinHistory.length) {
                                                            pinHistory[pinIndex] = pinCusub;
                                                            pinIndex++;
                                                        } else {
                                                            System.out.println("Taariikhda PIN-ka waa buuxday. Lagama kaydin doono midkan cusub.");
                                                        }
                                                        System.out.println("<-EVCPlus-> Waad ku guuleysatay inaad beddesho PIN-kaaga.");
                                                    } else {
                                                        System.out.println("Kuma aadan guuleysan inaad beddesho PIN-ka. Labada PIN ma is-le’eg yihiin.");
                                                    }
                                                }

                                                public void bedelLuqad(java.util.Scanner input) {
                                                    System.out.println("Fadlan Dooro luqadda:");
                                                    System.out.println("1. English");
                                                    System.out.println("2. Soomaali");
                                                    int luqad = input.nextInt();

                                                    if (luqad == 1) {
                                                        System.out.println("<-EVCPlus-> You have successfully changed your language.");
                                                    } else if (luqad == 2) {
                                                        System.out.println("<-EVCPlus-> Waad ku guuleysatay inaad beddesho luqadda.");
                                                    } else {
                                                        System.out.println("Fadlan geli number sax ah.");
                                                    }
                                                }
                                            }

                                    }
                                }

                            case 8:
                                System.out.println("TAAJ\n" +
                                        "1. Gudaha\n" +
                                        "2. Dibadda\n" +
                                        "3. Ogoow Khidmada\n" +
                                        "4. Macluumadka xawaaladda\n" +
                                        "5. Jooji Xawaaladda\n" +
                                        "6. Fur Xawaaladda\n");
                                int Taaj = input.nextInt();
                                switch (Taaj) {
                                    case 1:
                                    case 2:
                                        System.out.println("Fadlan Geli Taleefanka qaataha");
                                        int talefanka = input.nextInt();
                                        input.nextLine();

                                        System.out.println("Fadlan Geli Magaca qaataha oo seddexan");
                                        String FullName = input.nextLine();

                                        System.out.println("Fadlan Geli Magaalada qaataha uu joogo");
                                        String magaalada = input.nextLine();

                                        System.out.println("Fadlan Geli lacagta");
                                        int lacagta = input.nextInt();

                                        System.out.println("Khidmada ma xisaabtada ayaa laga jarayaa?\n1. Haa\n2. Maya");
                                        int confirm = input.nextInt();

                                        if (confirm == 1) {
                                            if (ac_balance < lacagta) {
                                                System.out.println("Haraagaagu kuguma filna");
                                            } else {
                                                ac_balance -= lacagta;
                                                System.out.println("Waxaad lacag $" + lacagta + " u dirtay " + FullName +
                                                        " oo jooga magaalada " + magaalada + ". Haraagaaga hadda waa $" + ac_balance);
                                            }
                                        } else {
                                            System.out.println("Lacag lama dirin. Waad ka laabatay.");
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Fadlan dooro shirkada\n1. PAY TO EVCPLUS TMT\n2. TAAJ\n3. TaajPay\n4. New Etaaj\n5. TAAJ IPS");
                                        int Ips = input.nextInt();
                                        System.out.println("Fadlan Geli Taleefanka qaataha");
                                        int taleefanka = input.nextInt();
                                        System.out.println("Fadlan Geli lacagta");
                                        int lacagta3 = input.nextInt();
                                        System.out.println("mahubtaa inaad $" + lacagta3 + " u dirto tel No " + taleefanka + "?\n1.Haa\n2.Maya");
                                        int confirm3 = input.nextInt();
                                        if (confirm3 == 1) {
                                            if (ac_balance < lacagta3) {
                                                System.out.println("Haraaga koontadan kuma filna");
                                            } else {
                                                ac_balance -= lacagta3;
                                                System.out.println("Waxaad $" + lacagta3 + " u dirtay tell No " + taleefanka +
                                                        ". Haraagaagu waa $" + ac_balance);
                                            }
                                        } else {
                                            System.out.println("Mahadsanid");
                                        }
                                        break;

                                    case 4:
                                    case 5:
                                    case 6:
                                        System.out.println("Fadlan Geli aqoonsiga lacag diridda");
                                        int aqoonsiga = input.nextInt();
                                        System.out.println("Fadlan Geli Macluumaad");
                                        int macluumad = input.nextInt();
                                        if (macluumad != aqoonsiga) {
                                            System.out.println("Invalid Input match (length)");
                                        } else {
                                            String action = (Taaj == 4) ? "xirto" : (Taaj == 5) ? "joojiso" : "furto";
                                            System.out.println("Mahubtaa in aad " + action + " aqoonsiga xawilaada " + aqoonsiga + "?\n1.Haa\n2.Maya");
                                            int confirmFinal = input.nextInt();
                                            if (confirmFinal == 1) {
                                                System.out.println("Waxaad " + action + " lacagta aqoonsiga " + aqoonsiga);
                                            } else {
                                                System.out.println("Mahadsanid");
                                            }
                                        }
                                        break;

                                    default:
                                        System.out.println("Fadlan dooro number sax ah");
                                        break;
                                }
                                break;


                            case 9:
                                int reference = 613013806;
                                System.out.println("EVCPlus");
                                System.out.println("1. itus haraaaga bill ka\n2. Wada Bixi bill ka\n3. Qayb ka bixi Bill");
                                int BixiBill = input.nextInt();
                                if (BixiBill < 1 || BixiBill > 3) {
                                    System.out.println("Fadlan dooro number sax ah");
                                    return;
                                } else {
                                    if (BixiBill == 1) {
                                        System.out.println("Fadlan Geli bill reference number");
                                        int user_reference = input.nextInt();
                                        if (reference != user_reference) {
                                            System.out.println("some parameters are missing. please check your request");
                                        } else {
                                            System.out.println("Haraagaaga bill ku waa $" + balance);
                                        }

                                    } else if (BixiBill == 2) {
                                        System.out.println("Fadlan Geli bill reference number");
                                        int user_reference = input.nextInt();
                                        if (reference != user_reference) {
                                            System.out.println("some parameters are missing. please check your request");
                                        } else {
                                            System.out.println("Fadlan Geli lagacta bill ka");
                                            int lacagtaBillka = input.nextInt();
                                            System.out.println("Ma hubtaa in aad wada bixisay lacagta bill ka una udirtay " + user_reference + " \n1.Haa \n2.Maya");
                                            int confirm = input.nextInt();
                                            if (confirm == 1) {
                                                balance -= lacagtaBillka;
                                                if (lacagtaBillka < 1 || lacagtaBillka > balance) {
                                                    System.out.println("Haraagaagu kuguma filna");
                                                    break;
                                                }
                                                System.out.println("waxaad wada bixisay lacagta bill ka waxaad na udirtay " + user_reference + " haraagaagu waa $" + balance);
                                            } else
                                                System.out.println("Mahadsanid!");
                                        }
                                    } else if (BixiBill == 3) {
                                        System.out.println("Fadlan Geli bill reference number");
                                        int user_reference = input.nextInt();
                                        if (reference != user_reference) {
                                            System.out.println("some parameters are missing. please check your request");
                                        } else {
                                            System.out.println("Fadlan Geli lagacta bill ka");
                                            int lacagtaBillka = input.nextInt();
                                            System.out.println("Ma hubtaa in aad Qayb ka bixisay lacagta bill ka una udirtay " + user_reference + " \n1.Haa \n2.Maya");
                                            int confirm = input.nextInt();
                                            if (confirm == 1) {
                                                balance -= lacagtaBillka;
                                                if (lacagtaBillka < 1 || lacagtaBillka > balance) {
                                                    System.out.println("Haraagaagu kuguma filna");
                                                    break;
                                                }
                                                System.out.println("waxaad Qayb ka bixisay lacagta bill ka waxaad na udirtay " + user_reference + " haraagaagu waa $" + balance);
                                            } else
                                                System.out.println("Mahadsanid!");
                                        }
                                    }
                                }
                                break;


                        }


                }

            }
        }
    }
}










