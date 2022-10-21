package com.script.fairy;
import com.script.framework.AtFairyImpl;
import com.script.framework.TaskContent;
import com.script.opencvapi.AtFairyConfig;
import com.script.opencvapi.FindResult;
import com.script.opencvapi.LtLog;

/**
 * Created by Administrator on 2019/3/22 0022.
 */

public class Abnormal extends TaskContent {
    GameUtil gameUtil;
    AtFairyImpl mFairy;
    FindResult result;
    FindResult result1;

    int x=0;

    public Abnormal(AtFairyImpl atFairy) throws Exception {
        mFairy = atFairy;

    }

    int count_1 = 0;
    int i = 6;
    String task_id = AtFairyConfig.getOption("task_id");

    //全局处理
    public void erro() throws Exception {

        result = mFairy.findPic(442,196,849,524, "cj1.png");
        mFairy.onTap(0.8f, result, 634,431,650,445,"创建", Sleep);

        result = mFairy.findPic(272,537,1158,675,"sffq.png");
        mFairy.onTap( 0.8f, result,1063,630,1078,644,"err放弃重连 返回登录", 500);

        result = mFairy.findPic(433,545,676,650,"quxiao.png");
        mFairy.onTap( 0.8f, result,"err取消按钮", 500);

        result1 = mFairy.findPic(213,544,652,653,new String[]{"dengru.png","dengru.png"});
        if (result1.sim > 0.8f) {
            result = mFairy.findPic(433,545,676,650,"quxiao.png");
            mFairy.onTap( 0.8f, result,"err取消按钮", 500);
            i--;
            LtLog.e("i == "+i);
            if (i <= 0 || i==5) {
                i=4;
                mFairy.onTap(0.8f, result1, "err登入", 1000);
            }

        }


        result = mFairy.findPic(294,153,987,575,"qd.png");//迁马
        mFairy.onTap( 0.8f, result,"err奖励确定", 500);

        result = mFairy.findPic(339,129,950,598,"slts.png");
        if (result.sim > 0.8f) {
            result = mFairy.findPic(339,129,950,598,"fh.png");
            mFairy.onTap( 0.8f, result,"err返回", 100);
        }

        result = mFairy.findPic(269,519,1172,687,"guoqiao.png");//
        mFairy.onTap( 0.8f, result,"直接过桥！", Sleep);

        result = mFairy.findPic(294,66,996,707,"qd1.png");
        mFairy.onTap( 0.8f, result,"err协议确定", 10000);

        result = mFairy.findPic(279,121,1019,591,"bcxz.png");
        if (result.sim > 0.8f) {
            result = mFairy.findPic(378,451,909,663,"qd.png");
            mFairy.onTap( 0.8f, result,"下载确认",10000);
        }

        result = mFairy.findPic(304,69,1018,698,"checkvx.png");
        if (result.sim > 0.8f) {

            switch (AtFairyConfig.getOption("qdl")) {
                case "1":
                    mFairy.onTap(0.8f, result, 636,569,649,585, "errvx登录界面_QQ登录", Sleep);
                    break;
                case "2":
                    mFairy.onTap(0.8f, result, 452,559,472,578,"errvx登录界面_微信登录", Sleep);
                    break;
                case "3":
                    mFairy.onTap(0.8f, result, 615,314,648,339,"errvx手机号登录", Sleep);
                    break;
            }
        }

        result = mFairy.findPic(294,70,987,691,"fsyzm.png");
        mFairy.onTap( 0.8f, result,785,240,803,253,"err手机号密码登录", 2000);

        result = mFairy.findPic(294,70,987,691,"dr2.png");
        mFairy.onTap( 0.8f, result,785,240,803,253,"err登录", 1000);

        result = mFairy.findPic(147,973,582,1217,new String[]{"login.png"});
        mFairy.onTap(0.8f, result, "errqq登陆授权", Sleep);

        result = mFairy.findPic(new String[]{"login.png", "login2.png", "login3.png"});
        mFairy.onTap(0.8f, result, "err新版qq登陆", Sleep);

        result = mFairy.findPic(new String[]{"checkvx5.png", "checkvx5_1.png", "shouquan.png"});
        mFairy.onTap(0.8f, result, "err完成qq授权", Sleep);

        result = mFairy.findPic(304,160,1010,567,new String[]{"xzyh.png"});
        if (result.sim > 0.8f) {
            result = mFairy.findPic(829,40,1216,314,"qd.png");
            mFairy.onTap( 0.8f, result,908,220,916,233,"登入后关叉",500);

        }

/*        result = mFairy.findPic(97,35,458,313,"fl.png");
        mFairy.onTap( 0.8f, result,1088,118,1095,132,"登入后福利关叉",500);*/

        result = mFairy.findPic(829,40,1216,314,"drgg.png");
        mFairy.onTap( 0.8f, result,1029,85,1035,100,"登入广告关叉",500);




    }

}
