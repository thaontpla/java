package day07.oop;

import java.lang.reflect.Array;

public class QuanLyCanBo {
    public CanBo[] canBos;

    private int tongSoCanBo;

    public void themMoiCanBo(CanBo canBo) {
        canBos = new CanBo[100];
        for (int i = 0; i < canBos.length ; i++) {
            if (canBos[i] == null) {
                canBos[i]=canBo;
                tongSoCanBo++;
            }
            break;
        }
    }
}
