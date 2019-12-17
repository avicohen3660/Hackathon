public class Soldier {
    enum type{
        NormalSoldier,
        Archer,
        Defender
    }
    type t;
    boolean isRight;
    int life;
    boolean isDead;
    boolean isAttack;
    int position;

    public Soldier(int type,boolean isRight){
        switch (type){
            case 1:
                this.t= Soldier.type.NormalSoldier;
                break;
            case 2:
                this.t= Soldier.type.Archer;
                break;
            case 3:
                this.t= Soldier.type.Defender;
                break;

        }
        this.isRight=isRight;

    }



}
