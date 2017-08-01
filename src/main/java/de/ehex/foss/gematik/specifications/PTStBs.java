package de.ehex.foss.gematik.specifications;

import static de.ehex.foss.gematik.specifications.SPdPersval.AFOs.Persval_1;
import static de.ehex.foss.gematik.specifications.SPdPersval.AFOs.Persval_2;
import static de.ehex.foss.gematik.specifications.SPdPersval.AFOs.Persval_3;
import static de.ehex.foss.gematik.specifications.SPdPersval.AFOs.Persval_4;
import static de.ehex.foss.gematik.specifications.SPdPersval.AFOs.Persval_5;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_2805;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_4929;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6083;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6086;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6087;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6516;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6517;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6518;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6519;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6523;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6524;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6525;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6526;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6527;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6529;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6531;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6532;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6533;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6535;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6536;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6537;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6538;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6539;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.TIP1_A_6772;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.VSDM_A_2812;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.VSDM_A_2814;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.VSDM_A_2815;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.VSDM_A_2825;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.VSDM_A_2826;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.VSDM_A_2830;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.VSDM_A_2831;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.VSDM_A_2832;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.VSDM_A_3029;
import static de.ehex.foss.gematik.specifications.gemKPT_Test.AFOs.VSDM_A_3030;
import static de.ehex.foss.gematik.specifications.gemKPT_Test_ORS1.AFOs.TIP1_A_2769;
import static de.ehex.foss.gematik.specifications.gemKPT_Test_ORS1.AFOs.TIP1_A_2781;
import static de.ehex.foss.gematik.specifications.gemKPT_Test_ORS1.AFOs.TIP1_A_5052;
import static de.ehex.foss.gematik.specifications.gemRL_TSL_SP_CP.AFOs.*;
import static de.ehex.foss.gematik.specifications.gemSpec_CAN_TI.AFOs.GS_A_5115;
import static de.ehex.foss.gematik.specifications.gemSpec_CAN_TI.AFOs.GS_A_5116;
import static de.ehex.foss.gematik.specifications.gemSpec_CAN_TI.AFOs.GS_A_5117;
import static de.ehex.foss.gematik.specifications.gemSpec_CAN_TI.AFOs.GS_A_5118;
import static de.ehex.foss.gematik.specifications.gemSpec_CAN_TI.AFOs.GS_A_5119;
import static de.ehex.foss.gematik.specifications.gemSpec_CAN_TI.AFOs.GS_A_5120;
import static de.ehex.foss.gematik.specifications.gemSpec_CAN_TI.AFOs.GS_A_5121;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5173;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5174;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5175;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5176;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5182;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5183;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5184;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5185;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5186;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5187;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5188;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5189;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5190;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5191;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5192;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5193;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5194;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5195;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5196;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5197;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5198;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5199;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5200;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5201;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5202;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5203;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5204;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5205;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5206;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5207;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5208;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5212;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5213;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5214;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5215;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5216;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5219;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5220;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5221;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5223;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5224;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5225;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5226;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5227;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5228;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5229;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5230;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5231;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5232;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5233;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5234;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5235;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5236;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5237;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5238;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5239;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5240;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5241;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5243;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5245;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5246;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5247;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5248;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5249;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5250;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5251;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5252;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5253;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5254;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5255;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5256;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5257;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5258;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5259;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5260;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5261;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5262;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5263;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5264;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5265;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5266;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5267;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5268;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5270;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5272;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5273;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5274;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5275;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5276;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5367;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5372;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_Root.AFOs.TIP1_A_5380;
import static de.ehex.foss.gematik.specifications.gemSpec_CVC_TSP.AFOs.*;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4435;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4436;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4437;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4448;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4449;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4450;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4451;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4453;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4455;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4456;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4457;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4458;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4459;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4460;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4461;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4462;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4463;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4464;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4465;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4466;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4467;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4468;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4470;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4471;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4473;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4474;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4475;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4476;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4477;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4478;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4479;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4480;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4481;
import static de.ehex.foss.gematik.specifications.gemSpec_DSM.AFOs.GS_A_4482;
import static de.ehex.foss.gematik.specifications.gemSpec_FM_VSDM.AFOs.*;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2033;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2040;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2044;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2055;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2077;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2078;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2080;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2081;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2085;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2088;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2090;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2091;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2094;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2095;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2096;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2098;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2110;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2119;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2120;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2121;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2122;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2123;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2125;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2130;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2131;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2675;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2680;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_2681;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_3293;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_3295;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_3317;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_3318;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_3320;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_3321;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_3322;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_3323;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_3324;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_3327;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys.AFOs.Card_G2_A_3591;
import static de.ehex.foss.gematik.specifications.gemSpec_HBA_ObjSys_G2_1.AFOs.*;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4503;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4504;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4505;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4506;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4507;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4508;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4509;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4511;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4512;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4513;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4514;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4515;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4516;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4517;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4518;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4519;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4520;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4521;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4522;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4523;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4524;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4525;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4526;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4527;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4528;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4529;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4530;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4531;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4532;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4533;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4534;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4535;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4537;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4538;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4539;
import static de.ehex.foss.gematik.specifications.gemSpec_ISM.AFOs.GS_A_4540;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2348;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2349;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2350;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2351;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2353;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2356;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2357;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2358;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2359;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2547;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2548;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2549;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2550;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2669;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2673;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2704;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2706;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2707;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2712;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2747;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2748;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2761;
import static de.ehex.foss.gematik.specifications.gemSpec_Intermediär_VSDM.AFOs.VSDM_A_2940;
import static de.ehex.foss.gematik.specifications.gemSpec_KSR.AFOs.*;
import static de.ehex.foss.gematik.specifications.gemSpec_KT.AFOs.*;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3479;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3480;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3481;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3482;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3483;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3484;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3485;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3486;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3487;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3488;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3489;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3490;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3491;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3492;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3493;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3494;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3495;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3496;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3497;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3498;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3499;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3501;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3502;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3503;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3504;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3505;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3507;
import static de.ehex.foss.gematik.specifications.gemSpec_Karten_Fach_TIP.AFOs.Card_G2_A_3509;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon.AFOs.*;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_4631;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_4634;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_4650;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_4656;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_4657;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_4658;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_4659;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_4660;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_4661;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_4662;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_4663;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_4664;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_4665;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_4666;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_4668;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_4673;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5150;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5404;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5405;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5531;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5532;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5668;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5669;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5670;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5671;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5672;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5673;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5674;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5675;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5676;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5677;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5678;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5679;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5680;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5681;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5683;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5684;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5685;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5686;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5687;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5688;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5689;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5690;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5691;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5692;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5693;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5695;
import static de.ehex.foss.gematik.specifications.gemSpec_Kon_SigProxy.AFOs.TIP1_A_5699;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4357;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4358;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4359;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4360;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4361;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4362;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4363;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4364;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4365;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4366;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4367;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4368;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4370;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4371;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4372;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4373;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4374;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4375;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4376;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4377;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4378;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4379;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4380;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4381;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4382;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4383;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4384;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4385;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4386;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4387;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4388;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4389;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4390;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4391;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4392;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_4393;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5016;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5021;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5035;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5071;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5079;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5080;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5081;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5091;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5131;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5207;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5208;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5322;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5338;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5339;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5340;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5345;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5386;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5482;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5518;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5524;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5525;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5526;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5527;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5530;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5541;
import static de.ehex.foss.gematik.specifications.gemSpec_Krypt.AFOs.GS_A_5542;
import static de.ehex.foss.gematik.specifications.gemSpec_MobKT.AFOs.*;
import static de.ehex.foss.gematik.specifications.gemSpec_Net.AFOs.*;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.AFOs.GS_A_4442;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.AFOs.GS_A_4443;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.AFOs.GS_A_4444;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.AFOs.GS_A_4445;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.AFOs.GS_A_4446;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.AFOs.GS_A_4447;
import static de.ehex.foss.gematik.specifications.gemSpec_OID.AFOs.GS_A_5082;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_3695;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_3696;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_3697;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_3700;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_3702;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_3796;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_3801;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_3804;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_3805;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_3806;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_3807;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_3813;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_3816;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_3856;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4541;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4542;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4543;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4545;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4546;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4547;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4559;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4560;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4858;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4864;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4865;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4866;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4867;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4868;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4869;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4870;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4871;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4872;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4873;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4874;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4875;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4876;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_4941;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_5018;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_5025;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_5026;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_5033;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_5034;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_5038;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_5039;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_5040;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_5054;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_5140;
import static de.ehex.foss.gematik.specifications.gemSpec_OM.AFOs.GS_A_5252;
import static de.ehex.foss.gematik.specifications.gemSpec_OSCP_Proxy.AFOs.TIP1_A_5831;
import static de.ehex.foss.gematik.specifications.gemSpec_OSCP_Proxy.AFOs.TIP1_A_5835;
import static de.ehex.foss.gematik.specifications.gemSpec_OSCP_Proxy.AFOs.TIP1_A_5836;
import static de.ehex.foss.gematik.specifications.gemSpec_OSCP_Proxy.AFOs.TIP1_A_5837;
import static de.ehex.foss.gematik.specifications.gemSpec_OSCP_Proxy.AFOs.TIP1_A_5838;
import static de.ehex.foss.gematik.specifications.gemSpec_OSCP_Proxy.AFOs.TIP1_A_5848;
import static de.ehex.foss.gematik.specifications.gemSpec_OSCP_Proxy.AFOs.TIP1_A_5849;
import static de.ehex.foss.gematik.specifications.gemSpec_OSCP_Proxy.AFOs.TIP1_A_5851;
import static de.ehex.foss.gematik.specifications.gemSpec_OSCP_Proxy.AFOs.TIP1_A_5852;
import static de.ehex.foss.gematik.specifications.gemSpec_OSCP_Proxy.AFOs.TIP1_A_5853;
import static de.ehex.foss.gematik.specifications.gemSpec_OSCP_Proxy.AFOs.TIP1_A_5855;
import static de.ehex.foss.gematik.specifications.gemSpec_OSCP_Proxy.AFOs.TIP1_A_5856;
import static de.ehex.foss.gematik.specifications.gemSpec_OSCP_Proxy.AFOs.TIP1_A_5857;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2227;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2228;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2229;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2230;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2232;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2234;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2235;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2236;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2237;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2238;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2239;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2240;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2242;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2244;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2246;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2247;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2248;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2249;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2250;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2252;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2253;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2254;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2255;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2256;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2260;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2261;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2264;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2266;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2270;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2271;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2274;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2276;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2277;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2284;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2285;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2287;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2291;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2292;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_2295;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_5085;
import static de.ehex.foss.gematik.specifications.gemSpec_PINPUK_TI.AFOs.GS_A_5209;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.AFOs.*;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_3055;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_3058;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4145;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4146;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4147;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4148;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4149;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4150;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4151;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4153;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4154;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4155;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4156;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4157;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4158;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4159;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4160;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4161;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4162;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4163;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4165;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4166;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4167;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4168;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4170;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4346;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4347;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4353;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4853;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_4854;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5013;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5014;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5015;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5028;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5029;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5031;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5032;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5036;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5059;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5092;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5093;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5094;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5095;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5096;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5097;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5098;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5099;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5100;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5101;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5102;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5103;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5104;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5105;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5106;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5107;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5108;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5109;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5130;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5135;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5247;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5325;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5326;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5327;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5328;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5329;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5330;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5331;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5332;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5333;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5334;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5490;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5519;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5520;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5521;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5522;
import static de.ehex.foss.gematik.specifications.gemSpec_Perf.AFOs.GS_A_5523;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2134;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2135;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2136;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2137;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2138;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2139;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2140;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2141;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2142;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2143;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2146;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2147;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2154;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2156;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2157;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2158;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2159;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2160;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2162;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2163;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2169;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2171;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2172;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2173;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2176;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2177;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2180;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2189;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2191;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2192;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2194;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2195;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2196;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2197;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2198;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2199;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2200;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2201;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2203;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2204;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2207;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2210;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2217;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2220;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2223;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2668;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_2669;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3035;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3036;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3037;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3039;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3187;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3188;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3189;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3190;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3267;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3340;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3341;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3342;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3343;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3344;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3346;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3347;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3348;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3349;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3350;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3351;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3352;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3353;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3354;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3355;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3356;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3358;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3359;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3360;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3361;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3362;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3363;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3365;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3366;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3367;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3368;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3369;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3371;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3373;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3374;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3375;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3388;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3389;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3390;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3472;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3524;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3588;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys.AFOs.Card_G2_A_3589;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_2136_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_2140_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_2154_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_2160_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_2176_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_2180_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_2191_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_2192_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_2194_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_2195_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_2210_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_2217_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_2220_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3039_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3341_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3357_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3360_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3362_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3374_01;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3649;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3650;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3651;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3652;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3653;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3654;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3655;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3656;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3657;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3658;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3659;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3660;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3661;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3662;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3663;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_B_ObjSys_G2_1.AFOs.Card_G2_A_3664;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2008;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2009;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2010;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2011;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2012;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2013;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2014;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2015;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2016;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2017;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2018;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2019;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2020;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2021;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2022;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2023;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2024;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2025;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2026;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_2027;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_3209;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_3239;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_3478;
import static de.ehex.foss.gematik.specifications.gemSpec_SMC_OPT.AFOs.Card_G2_A_3513;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2189;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2190;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2194;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2199;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2200;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2202;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2203;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2204;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2205;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2206;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2207;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2208;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2209;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2211;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2212;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2213;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2214;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2215;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2216;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2217;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2218;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2219;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2235;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2282;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2285;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2298;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2303;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2308;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2310;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2311;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2312;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2318;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2321;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2335;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2552;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2553;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2596;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2608;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2631;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2633;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2634;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2647;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2658;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2675;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2676;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2677;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2678;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2682;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2689;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2690;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2691;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2692;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2693;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2695;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2696;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2703;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2710;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2711;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2936;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2937;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2951;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2956;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2982;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2983;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_2999;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_3003;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_3008;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_FD_VSDM.AFOs.VSDM_A_3066;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2222;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2223;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2225;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2226;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2227;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2228;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2231;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2233;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2234;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2236;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2238;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2240;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2241;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2242;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2253;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2254;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2255;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2256;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2257;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2258;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2259;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2260;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2261;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2262;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2263;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2264;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2266;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2267;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2268;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2269;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2270;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2271;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2272;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2273;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2274;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2279;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2280;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2281;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2283;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2286;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2287;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2288;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2290;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2291;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2292;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2293;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2294;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2295;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2297;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2299;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2301;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2302;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2305;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2313;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2314;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2315;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2316;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2317;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2322;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2323;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2324;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2325;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2326;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2327;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2328;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2329;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2330;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2331;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2332;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2333;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2334;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2339;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2341;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2342;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2546;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2674;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2751;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2902;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2952;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2955;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2958;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_2961;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_3001;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_3002;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_3009;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_3022;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_3023;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_3026;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_3027;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_3028;
import static de.ehex.foss.gematik.specifications.gemSpec_SST_VSDM.AFOs.VSDM_A_3068;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_3737;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_3747;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_3753;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_3756;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_3760;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_3772;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_3784;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_4980;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_4981;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_4982;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_4983;
import static de.ehex.foss.gematik.specifications.gemSpec_SiBetrUmg.AFOs.GS_A_4984;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2012;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2021;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2046;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2047;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2065;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2076;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2087;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2148;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2156;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2174;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2177;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2213;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2214;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2309;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2326;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2328;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2329;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2330;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2331;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2332;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2333;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2339;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2343;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2345;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2347;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2350;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2354;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2355;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2356;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2357;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2359;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2360;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2361;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2362;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2363;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2366;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2524;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_2525;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_3078;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_3125;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_3130;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_3139;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_3141;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_3149;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_4944;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_4945;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_4946;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_4947;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_5017;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_5324;
import static de.ehex.foss.gematik.specifications.gemSpec_Sich_DS.AFOs.GS_A_5387;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3272;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3274;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3275;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3276;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3277;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3278;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3279;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3281;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3283;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3284;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3285;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3291;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3296;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3297;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3298;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3299;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3301;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3302;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3304;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3305;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3368;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3370;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3521;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3524;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3527;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3529;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3531;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3532;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3533;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3538;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3540;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3541;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3543;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_3687;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5795;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5796;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5797;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5798;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5917;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5935;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5936;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5937;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5941;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5991;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5992;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5993;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5994;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5995;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5996;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5997;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5998;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_5999;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_6000;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_6001;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_6002;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_6003;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_6004;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_6005;
import static de.ehex.foss.gematik.specifications.gemSpec_St_Ampel.AFOs.TIP1_A_6714;
import static de.ehex.foss.gematik.specifications.gemSpec_TSL.AFOs.*;
import static de.ehex.foss.gematik.specifications.gemSpec_TSL.AFOs.TIP1_A_5120;
import static de.ehex.foss.gematik.specifications.gemSpec_VPN_ZugD.AFOs.*;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5546;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5547;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5548;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5549;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5550;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5551;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5552;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5553;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5554;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5555;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5556;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5557;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5558;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5560;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5561;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5562;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5563;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5564;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5565;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5566;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5567;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5568;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5569;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5570;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5571;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5572;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5574;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5575;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5577;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5579;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5581;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5583;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5584;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5585;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5586;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5587;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5590;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5591;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5593;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5594;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5595;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5596;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5597;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5598;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5599;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5600;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5602;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5603;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5604;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5605;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5606;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5607;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5608;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5610;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5611;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5612;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5613;
import static de.ehex.foss.gematik.specifications.gemSpec_VZD.AFOs.TIP1_A_5620;
import static de.ehex.foss.gematik.specifications.gemSpec_X_509_TSP.AFOs.*;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_Fach_VSDM.AFOs.VSDM_A_2965;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_Fach_VSDM.AFOs.VSDM_A_2966;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_Fach_VSDM.AFOs.VSDM_A_2967;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_Fach_VSDM.AFOs.VSDM_A_2968;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_Fach_VSDM.AFOs.VSDM_A_2970;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_Fach_VSDM.AFOs.VSDM_A_2971;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_Fach_VSDM.AFOs.VSDM_A_2972;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_Fach_VSDM.AFOs.VSDM_A_2973;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_Fach_VSDM.AFOs.VSDM_A_2974;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_Fach_VSDM.AFOs.VSDM_A_2975;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_Fach_VSDM.AFOs.VSDM_A_2976;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_Fach_VSDM.AFOs.VSDM_A_2994;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2230;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2231;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2232;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2237;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2238;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2241;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2242;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2249;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2277;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2278;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2279;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2285;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2296;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2309;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2310;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2311;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2312;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2313;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2314;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2315;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2316;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2317;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2318;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2319;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2320;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2321;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2322;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2323;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2324;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2325;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_OPT.AFOs.Card_G2_A_2883;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2333;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2335;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2336;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2342;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2346;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2364;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2367;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2369;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2371;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2372;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2375;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2377;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2380;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2389;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2390;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2391;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2395;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2396;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2397;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2398;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2399;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2400;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2401;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2402;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2403;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2404;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2405;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2406;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2407;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2408;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2410;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2411;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2412;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2413;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2415;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2416;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2417;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2418;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2421;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2424;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2427;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2434;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2437;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2440;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2443;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2449;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2452;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2453;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2460;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2463;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2464;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2858;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2864;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_2986;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3180;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3217;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3230;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3232;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3233;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3234;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3235;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3236;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3238;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3240;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3241;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3242;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3244;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3245;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3246;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3247;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3248;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3263;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3272;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3279;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys.AFOs.Card_G2_A_3335;
import static de.ehex.foss.gematik.specifications.gemSpec_eGK_ObjSys_G2_1.AFOs.*;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2469;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2470;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2472;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2473;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2474;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2475;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2476;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2477;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2478;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2479;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2481;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2482;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2483;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2487;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2488;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2496;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2497;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2500;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2501;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2502;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2503;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2504;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2506;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2507;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2509;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2511;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2512;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2514;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2518;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2519;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2522;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2523;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2524;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2526;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2527;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2529;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2530;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2531;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2849;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2876;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_2877;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3019;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3026;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3027;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3028;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3194;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3195;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3196;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3197;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3269;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3273;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3274;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3275;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3276;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3453;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3455;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3456;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3457;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3458;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3459;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3460;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3461;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3462;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3463;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3464;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3465;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3466;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3467;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3468;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3469;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3471;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3473;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys.AFOs.Card_G2_A_3515;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_2472_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_2497_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_2503_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_2504_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_2511_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_2512_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_2514_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_2518_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_2519_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_2526_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_2527_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_2529_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_2530_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_2531_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_3019_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_3028_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_3275_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_3453_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_3458_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_3461_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_3463_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_3466_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_3469_01;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_3765;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_3766;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_3767;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_3768;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_3769;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_3771;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_KT_ObjSys_G2_1.AFOs.Card_G2_A_3772;
import static de.ehex.foss.gematik.specifications.gemSpec_gSMC_K_ObjSys.AFOs.*;
import static java.util.Arrays.asList;
import static java.util.Collections.emptySet;
import static java.util.Collections.unmodifiableSet;
import static java.util.Objects.nonNull;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Stream.concat;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; gematik {@link PTStB}s.
 *
 * @author Stefan Gasterstädt, Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum PTStBs implements PTStB {

    // Karten
    //
    gemProdT_HBA_ObjSys_PTV4_3_1_2("gemProdT_HBA_ObjSys_PTV4.3.1-2") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(Card_G2_A_2232, Card_G2_A_3006, Card_G2_A_3007, Card_G2_A_3010, Card_G2_A_3011, Card_G2_A_3277, Card_G2_A_3014, Card_G2_A_3014, Card_G2_A_2033, Card_G2_A_2033, Card_G2_A_2033, Card_G2_A_2033,
                    Card_G2_A_2042, Card_G2_A_3266, Card_G2_A_3015, Card_G2_A_2045, Card_G2_A_2055, Card_G2_A_2048, Card_G2_A_2048, Card_G2_A_2057, Card_G2_A_2060, Card_G2_A_2061, Card_G2_A_2063, Card_G2_A_2064, Card_G2_A_2067,
                    Card_G2_A_2069, Card_G2_A_3293, Card_G2_A_3016, Card_G2_A_3295, Card_G2_A_2085, Card_G2_A_2868, Card_G2_A_2868, Card_G2_A_2083, Card_G2_A_2090, Card_G2_A_2091, Card_G2_A_2094, Card_G2_A_2095, Card_G2_A_2089,
                    Card_G2_A_2096, Card_G2_A_2098, Card_G2_A_2110, Card_G2_A_2119, Card_G2_A_2120, Card_G2_A_2121, Card_G2_A_2122, Card_G2_A_2123, Card_G2_A_3320, Card_G2_A_2097, Card_G2_A_3322, Card_G2_A_3323, Card_G2_A_2101,
                    Card_G2_A_3324, Card_G2_A_2107, Card_G2_A_2125, Card_G2_A_2130, Card_G2_A_2131, Card_G2_A_2117, Card_G2_A_2124, Card_G2_A_2124, Card_G2_A_2124, Card_G2_A_2124, Card_G2_A_2124, Card_G2_A_2124, Card_G2_A_2124,
                    Card_G2_A_2124, Card_G2_A_2124, Card_G2_A_2124, Card_G2_A_2124, Card_G2_A_2124, Card_G2_A_2124, Card_G2_A_3491, Card_G2_A_3493, GS_A_4377, GS_A_3700, GS_A_5026, GS_A_5026, GS_A_4559, GS_A_4559, GS_A_4559, GS_A_4559,
                    GS_A_4559, Card_G2_A_3491, Card_G2_A_3493, GS_A_4377, GS_A_3700, GS_A_5026, GS_A_5026, GS_A_4559, GS_A_4559, GS_A_4559, GS_A_4559, GS_A_4559);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_6538, TIP1_A_6539, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533,
                    TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, Card_G2_A_3325, Card_G2_A_2675, Card_G2_A_3270, Card_G2_A_3271, GS_A_3697, GS_A_4542, GS_A_5038, GS_A_5039, Card_G2_A_2036, Card_G2_A_3009, Card_G2_A_3277, Card_G2_A_2032,
                    Card_G2_A_3182, Card_G2_A_3183, Card_G2_A_3184, Card_G2_A_2033, Card_G2_A_3185, Card_G2_A_3186, Card_G2_A_2034, Card_G2_A_2673, Card_G2_A_2035, Card_G2_A_3325, Card_G2_A_2040, Card_G2_A_2039, Card_G2_A_2042,
                    Card_G2_A_2044, Card_G2_A_3181, Card_G2_A_3266, Card_G2_A_2043, Card_G2_A_3015, Card_G2_A_2045, Card_G2_A_2055, Card_G2_A_2047, Card_G2_A_2048, Card_G2_A_3278, Card_G2_A_3199, Card_G2_A_2057, Card_G2_A_2059,
                    Card_G2_A_2060, Card_G2_A_2061, Card_G2_A_2063, Card_G2_A_2064, Card_G2_A_2067, Card_G2_A_2069, Card_G2_A_2077, Card_G2_A_2071, Card_G2_A_2078, Card_G2_A_2072, Card_G2_A_2075, Card_G2_A_2080, Card_G2_A_2081,
                    Card_G2_A_3293, Card_G2_A_3016, Card_G2_A_3295, Card_G2_A_2085, Card_G2_A_2868, Card_G2_A_2088, Card_G2_A_2082, Card_G2_A_2083, Card_G2_A_2084, Card_G2_A_2091, Card_G2_A_2094, Card_G2_A_2095, Card_G2_A_2089,
                    Card_G2_A_2096, Card_G2_A_2098, Card_G2_A_2110, Card_G2_A_2119, Card_G2_A_2120, Card_G2_A_2121, Card_G2_A_2122, Card_G2_A_2123, Card_G2_A_3320, Card_G2_A_2097, Card_G2_A_3321, Card_G2_A_3322, Card_G2_A_3323,
                    Card_G2_A_2101, Card_G2_A_3324, Card_G2_A_2107, Card_G2_A_2125, Card_G2_A_2130, Card_G2_A_2131, Card_G2_A_2117, Card_G2_A_2675, Card_G2_A_2118, Card_G2_A_2124, Card_G2_A_2128, Card_G2_A_3270, Card_G2_A_2129,
                    Card_G2_A_3271, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3483, Card_G2_A_3484, Card_G2_A_3485, Card_G2_A_3486, Card_G2_A_3487, Card_G2_A_3488, Card_G2_A_3489, Card_G2_A_3490, Card_G2_A_3491,
                    Card_G2_A_3493, GS_A_3695, GS_A_3696, GS_A_3700, GS_A_5026, GS_A_5140, GS_A_4559, GS_A_4362, GS_A_4363, GS_A_4364, GS_A_4365, GS_A_4366, GS_A_4367, GS_A_4368, GS_A_5021, GS_A_4380, GS_A_4381, GS_A_2524, GS_A_2525,
                    GS_A_2354, GS_A_2350, Card_G2_A_2230, Card_G2_A_2231, Card_G2_A_2309, Card_G2_A_2310, Card_G2_A_2311, Card_G2_A_2312, Card_G2_A_2313, Card_G2_A_2314, Card_G2_A_2315, Card_G2_A_2316, Card_G2_A_2317, Card_G2_A_2318);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_SMC_B_PTV4_4_0_2("gemProdT_SMC-B_PTV4.4.0-2") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_5020, TIP1_A_2578, TIP1_A_2589, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3487, Card_G2_A_3492, Card_G2_A_3494, Card_G2_A_3495, Card_G2_A_3496, Card_G2_A_3498, GS_A_4377,
                    GS_A_3695, GS_A_5026, GS_A_5140, GS_A_4559, GS_A_4560, GS_A_4585, GS_A_4587, GS_A_4710, GS_A_4711, GS_A_4974, GS_A_4621, GS_A_4624, Card_G2_A_2668, Card_G2_A_2140, Card_G2_A_3035, Card_G2_A_2141, Card_G2_A_3341,
                    Card_G2_A_3472, Card_G2_A_3340, Card_G2_A_3342, Card_G2_A_3343, Card_G2_A_2143, Card_G2_A_2157, Card_G2_A_3346, Card_G2_A_3347, Card_G2_A_3388, Card_G2_A_3348, Card_G2_A_3389, Card_G2_A_3349, Card_G2_A_3390,
                    Card_G2_A_3350, Card_G2_A_3374, Card_G2_A_3373, Card_G2_A_3371, Card_G2_A_3365, Card_G2_A_3366, Card_G2_A_2009, Card_G2_A_2011, Card_G2_A_2012, Card_G2_A_2014);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_6538, TIP1_A_6539, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533,
                    TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, Card_G2_A_3325, Card_G2_A_2675, Card_G2_A_3270, Card_G2_A_3271, GS_A_3697, GS_A_4542, GS_A_5038, GS_A_5039, Card_G2_A_2036, Card_G2_A_3009, Card_G2_A_3277, Card_G2_A_2032,
                    Card_G2_A_3182, Card_G2_A_3183, Card_G2_A_3184, Card_G2_A_2033, Card_G2_A_3185, Card_G2_A_3186, Card_G2_A_2034, Card_G2_A_2673, Card_G2_A_2035, Card_G2_A_3325, Card_G2_A_2040, Card_G2_A_2039, Card_G2_A_2042,
                    Card_G2_A_2044, Card_G2_A_3181, Card_G2_A_3266, Card_G2_A_2043, Card_G2_A_3015, Card_G2_A_2045, Card_G2_A_2055, Card_G2_A_2047, Card_G2_A_2048, Card_G2_A_3278, Card_G2_A_3199, Card_G2_A_2057, Card_G2_A_2059,
                    Card_G2_A_2060, Card_G2_A_2061, Card_G2_A_2063, Card_G2_A_2064, Card_G2_A_2067, Card_G2_A_2069, Card_G2_A_2077, Card_G2_A_2071, Card_G2_A_2078, Card_G2_A_2072, Card_G2_A_2075, Card_G2_A_2080, Card_G2_A_2081,
                    Card_G2_A_3293, Card_G2_A_3016, Card_G2_A_3295, Card_G2_A_2085, Card_G2_A_2868, Card_G2_A_2088, Card_G2_A_2082, Card_G2_A_2083, Card_G2_A_2084, Card_G2_A_2091, Card_G2_A_2094, Card_G2_A_2095, Card_G2_A_2089,
                    Card_G2_A_2096, Card_G2_A_2098, Card_G2_A_2110, Card_G2_A_2119, Card_G2_A_2120, Card_G2_A_2121, Card_G2_A_2122, Card_G2_A_2123, Card_G2_A_3320, Card_G2_A_2097, Card_G2_A_3321, Card_G2_A_3322, Card_G2_A_3323,
                    Card_G2_A_2101, Card_G2_A_3324, Card_G2_A_2107, Card_G2_A_2125, Card_G2_A_2130, Card_G2_A_2131, Card_G2_A_2117, Card_G2_A_2675, Card_G2_A_2118, Card_G2_A_2124, Card_G2_A_2128, Card_G2_A_3270, Card_G2_A_2129,
                    Card_G2_A_3271, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3483, Card_G2_A_3484, Card_G2_A_3485, Card_G2_A_3486, Card_G2_A_3487, Card_G2_A_3488, Card_G2_A_3489, Card_G2_A_3490, Card_G2_A_3491,
                    Card_G2_A_3493, GS_A_3695, GS_A_3696, GS_A_3700, GS_A_5026, GS_A_5140, GS_A_4559, GS_A_4362, GS_A_4363, GS_A_4364, GS_A_4365, GS_A_4366, GS_A_4367, GS_A_4368, GS_A_5021, GS_A_4380, GS_A_4381, GS_A_2524, GS_A_2525,
                    GS_A_2354, GS_A_2350, Card_G2_A_2230, Card_G2_A_2231, Card_G2_A_2309, Card_G2_A_2310, Card_G2_A_2311, Card_G2_A_2312, Card_G2_A_2313, Card_G2_A_2314, Card_G2_A_2315, Card_G2_A_2316, Card_G2_A_2317, Card_G2_A_2318);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_SMC_B_ObjSys_PTV_4_3_0_2("gemProdT_SMC-B_ObjSys_PTV4.3.0-2") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3483, Card_G2_A_3484, Card_G2_A_3485, Card_G2_A_3486, Card_G2_A_3487, Card_G2_A_3488, Card_G2_A_3489, Card_G2_A_3490, Card_G2_A_3491,
                    Card_G2_A_3493, GS_A_4377, GS_A_3695, GS_A_3700, GS_A_5026, GS_A_5054, GS_A_5140, GS_A_4559, GS_A_4668, Card_G2_A_2196, Card_G2_A_3036, Card_G2_A_3037, Card_G2_A_3188, Card_G2_A_2135, Card_G2_A_2136, Card_G2_A_3189,
                    Card_G2_A_2668, Card_G2_A_2669, Card_G2_A_2140, Card_G2_A_2139, Card_G2_A_2142, Card_G2_A_3341, Card_G2_A_3267, Card_G2_A_3340, Card_G2_A_2154, Card_G2_A_3342, Card_G2_A_3343, Card_G2_A_2143, Card_G2_A_2146,
                    Card_G2_A_2147, Card_G2_A_3344, Card_G2_A_2160, Card_G2_A_2156, Card_G2_A_2158, Card_G2_A_2159, Card_G2_A_2162, Card_G2_A_2163, Card_G2_A_2173, Card_G2_A_2169, Card_G2_A_3352, Card_G2_A_2176, Card_G2_A_2171,
                    Card_G2_A_2177, Card_G2_A_3354, Card_G2_A_2180, Card_G2_A_2191, Card_G2_A_2189, Card_G2_A_2192, Card_G2_A_3039, Card_G2_A_2194, Card_G2_A_2195, Card_G2_A_3360, Card_G2_A_3362, Card_G2_A_2197, Card_G2_A_2198,
                    Card_G2_A_2199, Card_G2_A_2200, Card_G2_A_2203, Card_G2_A_2201, Card_G2_A_2204, Card_G2_A_2207, Card_G2_A_2210, Card_G2_A_2217, Card_G2_A_2223, Card_G2_A_2220);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_6538, TIP1_A_6539, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533,
                    TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_3696, GS_A_3697, GS_A_4542, GS_A_5038, GS_A_5039, Card_G2_A_3375, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3483, Card_G2_A_3484, Card_G2_A_3485,
                    Card_G2_A_3486, Card_G2_A_3487, Card_G2_A_3488, Card_G2_A_3489, Card_G2_A_3490, Card_G2_A_3491, Card_G2_A_3493, GS_A_3695, GS_A_3696, GS_A_3700, GS_A_5026, GS_A_5140, GS_A_4559, Card_G2_A_2196, Card_G2_A_2138,
                    Card_G2_A_2134, Card_G2_A_2135, Card_G2_A_2136, Card_G2_A_3189, Card_G2_A_3190, Card_G2_A_2137, Card_G2_A_2668, Card_G2_A_2669, Card_G2_A_3375, Card_G2_A_2140, Card_G2_A_2139, Card_G2_A_2142, Card_G2_A_3341,
                    Card_G2_A_3187, Card_G2_A_3267, Card_G2_A_3340, Card_G2_A_2154, Card_G2_A_3342, Card_G2_A_3343, Card_G2_A_2143, Card_G2_A_2146, Card_G2_A_2147, Card_G2_A_3344, Card_G2_A_2160, Card_G2_A_2156, Card_G2_A_2158,
                    Card_G2_A_2159, Card_G2_A_2162, Card_G2_A_2163, Card_G2_A_2173, Card_G2_A_2169, Card_G2_A_3352, Card_G2_A_2176, Card_G2_A_2171, Card_G2_A_2177, Card_G2_A_3354, Card_G2_A_2180, Card_G2_A_2191, Card_G2_A_2189,
                    Card_G2_A_2192, Card_G2_A_3039, Card_G2_A_2194, Card_G2_A_2195, Card_G2_A_3360, Card_G2_A_3362, Card_G2_A_2197, Card_G2_A_2198, Card_G2_A_2199, Card_G2_A_2200, Card_G2_A_2203, Card_G2_A_2201, Card_G2_A_2204,
                    Card_G2_A_2207, Card_G2_A_2210, Card_G2_A_2217, Card_G2_A_2223, Card_G2_A_2220, GS_A_4362, GS_A_4363, GS_A_4364, GS_A_4365, GS_A_4366, GS_A_4367, GS_A_4368, GS_A_5021, GS_A_4380, GS_A_4381, GS_A_2524, GS_A_2525,
                    GS_A_2354, GS_A_2350, Card_G2_A_3478, Card_G2_A_3513);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_SMC_B_ObjSys_G2_1_PTV4_4_0_0("gemProdT_SMC-B_ObjSys_G2.1_PTV4.4.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3483, Card_G2_A_3484, Card_G2_A_3485, Card_G2_A_3486, Card_G2_A_3487, Card_G2_A_3488, Card_G2_A_3489, Card_G2_A_3490, Card_G2_A_3491,
                    Card_G2_A_3493, GS_A_4377, GS_A_3695, GS_A_3700, GS_A_5026, GS_A_5054, GS_A_5140, GS_A_4559, GS_A_4668, Card_G2_A_2196, Card_G2_A_3036, Card_G2_A_3037, Card_G2_A_3188, Card_G2_A_2135, Card_G2_A_3189, Card_G2_A_2136_01,
                    Card_G2_A_3649, Card_G2_A_2668, Card_G2_A_2669, Card_G2_A_2139, Card_G2_A_2140_01, Card_G2_A_2142, Card_G2_A_3267, Card_G2_A_3340, Card_G2_A_3341_01, Card_G2_A_3650, Card_G2_A_3342, Card_G2_A_3343, Card_G2_A_2143,
                    Card_G2_A_2146, Card_G2_A_2147, Card_G2_A_3344, Card_G2_A_3651, Card_G2_A_2154_01, Card_G2_A_2156, Card_G2_A_2158, Card_G2_A_2159, Card_G2_A_2160_01, Card_G2_A_2162, Card_G2_A_2163, Card_G2_A_2169, Card_G2_A_2171,
                    Card_G2_A_2176_01, Card_G2_A_2180_01, Card_G2_A_2189, Card_G2_A_2191_01, Card_G2_A_2192_01, Card_G2_A_3039_01, Card_G2_A_2194_01, Card_G2_A_2195_01, Card_G2_A_3360_01, Card_G2_A_3362_01, Card_G2_A_2203, Card_G2_A_2204,
                    Card_G2_A_2207, Card_G2_A_2210_01, Card_G2_A_2217_01, Card_G2_A_2220_01, Card_G2_A_2223, Card_G2_A_3652, Card_G2_A_3654, Card_G2_A_3656, Card_G2_A_3658, Card_G2_A_3660, Card_G2_A_3662);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3483, Card_G2_A_3484, Card_G2_A_3485, Card_G2_A_3486, Card_G2_A_3487, Card_G2_A_3488, Card_G2_A_3489, Card_G2_A_3490, Card_G2_A_3491,
                    Card_G2_A_3493, GS_A_4377, GS_A_3695, GS_A_3700, GS_A_5026, GS_A_5054, GS_A_5140, GS_A_4559, GS_A_4668, Card_G2_A_2196, Card_G2_A_3036, Card_G2_A_3037, Card_G2_A_3188, Card_G2_A_2135, Card_G2_A_3189, Card_G2_A_2136_01,
                    Card_G2_A_3649, Card_G2_A_2668, Card_G2_A_2669, Card_G2_A_2139, Card_G2_A_2140_01, Card_G2_A_2142, Card_G2_A_3267, Card_G2_A_3340, Card_G2_A_3341_01, Card_G2_A_3650, Card_G2_A_3342, Card_G2_A_3343, Card_G2_A_2143,
                    Card_G2_A_2146, Card_G2_A_2147, Card_G2_A_3344, Card_G2_A_3651, Card_G2_A_2154_01, Card_G2_A_2156, Card_G2_A_2158, Card_G2_A_2159, Card_G2_A_2160_01, Card_G2_A_2162, Card_G2_A_2163, Card_G2_A_2169, Card_G2_A_2171,
                    Card_G2_A_2176_01, Card_G2_A_2180_01, Card_G2_A_2189, Card_G2_A_2191_01, Card_G2_A_2192_01, Card_G2_A_3039_01, Card_G2_A_2194_01, Card_G2_A_2195_01, Card_G2_A_3360_01, Card_G2_A_3362_01, Card_G2_A_2203, Card_G2_A_2204,
                    Card_G2_A_2207, Card_G2_A_2210_01, Card_G2_A_2217_01, Card_G2_A_2220_01, Card_G2_A_2223, Card_G2_A_3652, Card_G2_A_3654, Card_G2_A_3656, Card_G2_A_3658, Card_G2_A_3660, Card_G2_A_3662);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_HBA_PTV4_2_1_2("gemProdT_HBA_PTV4.2.1-2") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_5020, TIP1_A_2578, TIP1_A_2589, Card_G2_A_3009, Card_G2_A_2038, Card_G2_A_2673, Card_G2_A_2040, Card_G2_A_3005, Card_G2_A_2041, Card_G2_A_2044, Card_G2_A_3395, Card_G2_A_2043, Card_G2_A_3015,
                    Card_G2_A_2045, Card_G2_A_2046, Card_G2_A_2058, Card_G2_A_3281, Card_G2_A_3282, Card_G2_A_3385, Card_G2_A_3283, Card_G2_A_3386, Card_G2_A_3284, Card_G2_A_3387, Card_G2_A_3285, Card_G2_A_3327, Card_G2_A_3326,
                    Card_G2_A_3297, Card_G2_A_2869, Card_G2_A_3301, Card_G2_A_3302, Card_G2_A_3303, Card_G2_A_3304, Card_G2_A_3307, Card_G2_A_3308, Card_G2_A_3317, Card_G2_A_3318, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481,
                    Card_G2_A_3487, Card_G2_A_3492, Card_G2_A_3494, Card_G2_A_3495, Card_G2_A_3496, Card_G2_A_3497, Card_G2_A_3498, GS_A_4377, GS_A_3695, GS_A_5026, GS_A_5140, GS_A_4559, GS_A_4560, GS_A_4583, GS_A_4587, GS_A_4710,
                    GS_A_4711, GS_A_4974, GS_A_4621, GS_A_4623);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_6538, TIP1_A_6539, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533,
                    TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, TIP1_A_2575, Card_G2_A_3010, Card_G2_A_3277, Card_G2_A_3325, Card_G2_A_3523, Card_G2_A_3590, Card_G2_A_3286, Card_G2_A_2070, Card_G2_A_3287, Card_G2_A_3288, Card_G2_A_3289,
                    Card_G2_A_3290, Card_G2_A_3291, Card_G2_A_3292, Card_G2_A_3294, Card_G2_A_3296, Card_G2_A_3298, Card_G2_A_3299, Card_G2_A_3305, Card_G2_A_3306, Card_G2_A_2680, Card_G2_A_2681, Card_G2_A_3314, Card_G2_A_3315,
                    Card_G2_A_3316, Card_G2_A_2676, Card_G2_A_2677, Card_G2_A_2678, Card_G2_A_2679, Card_G2_A_2682, Card_G2_A_2856, GS_A_3696, GS_A_3697, GS_A_4542, GS_A_3700, GS_A_5054, GS_A_5038, GS_A_5039, GS_A_3813, GS_A_5115,
                    GS_A_5116, GS_A_5117, GS_A_5118, GS_A_5119, GS_A_5120, GS_A_5121, TIP1_A_2579, TIP1_A_2580, TIP1_A_2582, TIP1_A_2583, TIP1_A_2584, TIP1_A_2585, TIP1_A_4222, TIP1_A_2590, TIP1_A_2591, GS_A_4473, GS_A_4475, Card_G2_A_3591,
                    GS_A_4529, GS_A_5338, GS_A_5386, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_2229, GS_A_2227, GS_A_2228, GS_A_2232, GS_A_2239, GS_A_2234, GS_A_2235, GS_A_2236, GS_A_2237, GS_A_2230, GS_A_2238, GS_A_5209,
                    GS_A_2240, GS_A_2242, GS_A_2244, GS_A_2246, GS_A_2247, GS_A_2248, GS_A_2249, GS_A_2250, GS_A_2253, GS_A_2254, GS_A_2255, GS_A_2256, GS_A_2260, GS_A_2261, GS_A_2264, GS_A_2266, GS_A_2270, GS_A_2271, GS_A_2274, GS_A_2276,
                    GS_A_2277, GS_A_2284, GS_A_2285, GS_A_5085, GS_A_2287, GS_A_2252, GS_A_2291, GS_A_2292, GS_A_2295, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756,
                    GS_A_2087, GS_A_2213, GS_A_2076, GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332,
                    GS_A_2345, GS_A_2347, GS_A_2361, GS_A_2363, GS_A_2366, GS_A_5387, GS_A_4233, TIP1_A_2581, GS_A_4479, Card_G2_A_3591, GS_A_4523, GS_A_4524, GS_A_4528, GS_A_4362, GS_A_4363, GS_A_4364, GS_A_4365, GS_A_4366, GS_A_4367,
                    GS_A_4368, GS_A_5021, GS_A_4380, GS_A_4381, GS_A_4958, GS_A_4712, GS_A_4961, GS_A_4962, GS_A_4963, GS_A_4972, GS_A_4973, GS_A_3784, GS_A_2356, GS_A_2524, GS_A_2525, GS_A_2354, GS_A_2350, Card_G2_A_2319, Card_G2_A_2320,
                    Card_G2_A_2321, Card_G2_A_2322, Card_G2_A_2323, Card_G2_A_2324, Card_G2_A_2325);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_SMC_B_G2_1_PTV4_5_0_0("gemProdT_SMC-B_G2.1_PTV4.5.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_5020, TIP1_A_2578, TIP1_A_2589, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3487, Card_G2_A_3492, Card_G2_A_3494, Card_G2_A_3495, Card_G2_A_3496, Card_G2_A_3497, Card_G2_A_3498,
                    GS_A_4377, GS_A_3695, GS_A_5026, GS_A_5140, GS_A_4559, GS_A_4560, GS_A_4585, GS_A_4587, GS_A_4710, GS_A_4711, GS_A_4974, GS_A_4621, GS_A_4624, Card_G2_A_3664, Card_G2_A_2668, Card_G2_A_3035, Card_G2_A_2140_01,
                    Card_G2_A_2141, Card_G2_A_3472, Card_G2_A_3340, Card_G2_A_3341_01, Card_G2_A_3650, Card_G2_A_3342, Card_G2_A_3343, Card_G2_A_2143, Card_G2_A_2157, Card_G2_A_3346, Card_G2_A_3347, Card_G2_A_3388, Card_G2_A_3348,
                    Card_G2_A_3389, Card_G2_A_3349, Card_G2_A_3390, Card_G2_A_3350, Card_G2_A_3373, Card_G2_A_3374_01, Card_G2_A_3371, Card_G2_A_3365, Card_G2_A_3366, Card_G2_A_3653, Card_G2_A_3655, Card_G2_A_3657, Card_G2_A_3659,
                    Card_G2_A_3661, Card_G2_A_3663, Card_G2_A_2009, Card_G2_A_2011, Card_G2_A_2012, Card_G2_A_2014);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_6538, TIP1_A_6539, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533,
                    TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, TIP1_A_2575, GS_A_3696, GS_A_3697, GS_A_4542, GS_A_3700, GS_A_5054, GS_A_5038, GS_A_5039, GS_A_3813, Card_G2_A_3375, Card_G2_A_3524, Card_G2_A_3588, Card_G2_A_3351, Card_G2_A_2172,
                    Card_G2_A_3353, Card_G2_A_3355, Card_G2_A_3356, Card_G2_A_3357_01, Card_G2_A_3358, Card_G2_A_3359, Card_G2_A_3361, Card_G2_A_3363, Card_G2_A_3367, Card_G2_A_3368, Card_G2_A_3369, Card_G2_A_2008, Card_G2_A_2010,
                    Card_G2_A_2013, Card_G2_A_2015, TIP1_A_2579, TIP1_A_2580, TIP1_A_2582, TIP1_A_2583, TIP1_A_2584, TIP1_A_2586, TIP1_A_4222, TIP1_A_2590, TIP1_A_2591, GS_A_4473, GS_A_4474, GS_A_4475, GS_A_4529, GS_A_5338, GS_A_5386,
                    GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_2229, GS_A_2227, GS_A_2228, GS_A_2232, GS_A_2239, GS_A_2234, GS_A_2235, GS_A_2236, GS_A_2237, GS_A_2230, GS_A_2238, GS_A_5209, GS_A_2240, GS_A_2242, GS_A_2244,
                    GS_A_2246, GS_A_2247, GS_A_2248, GS_A_2249, GS_A_2250, GS_A_2253, GS_A_2254, GS_A_2255, GS_A_2256, GS_A_2260, GS_A_2261, GS_A_2264, GS_A_2266, GS_A_2270, GS_A_2271, GS_A_2274, GS_A_2276, GS_A_2277, GS_A_2284, GS_A_2285,
                    GS_A_5085, GS_A_2287, GS_A_2252, GS_A_2291, GS_A_2292, GS_A_2295, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2087, GS_A_2213, GS_A_2076,
                    GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2345, GS_A_2347, GS_A_2361,
                    GS_A_2363, GS_A_2366, GS_A_5387, Card_G2_A_3589, GS_A_4233, TIP1_A_2581, GS_A_4479, GS_A_4523, GS_A_4524, GS_A_4528, GS_A_4362, GS_A_4363, GS_A_4364, GS_A_4365, GS_A_4366, GS_A_4367, GS_A_4368, GS_A_5021, GS_A_4380,
                    GS_A_4381, GS_A_4958, GS_A_4712, GS_A_4961, GS_A_4962, GS_A_4963, GS_A_4971, GS_A_4972, GS_A_4973, GS_A_3784, GS_A_2356, GS_A_2524, GS_A_2525, GS_A_2354, GS_A_2350, Card_G2_A_3589);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_HBA_ObjSys_G2_1_PTV4_4_0_0("gemProdT_HBA_ObjSys_G2.1_PTV4.4.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(Card_G2_A_2232, Card_G2_A_2036, Card_G2_A_3006, Card_G2_A_2867, Card_G2_A_3007, Card_G2_A_3009, Card_G2_A_3010, Card_G2_A_3011, Card_G2_A_3277, Card_G2_A_3014, Card_G2_A_3182, Card_G2_A_3184,
                    Card_G2_A_3185, Card_G2_A_2033_01, Card_G2_A_3626, Card_G2_A_2673, Card_G2_A_2035, Card_G2_A_2039, Card_G2_A_2040_01, Card_G2_A_2042, Card_G2_A_3266, Card_G2_A_2043, Card_G2_A_2044_01, Card_G2_A_3627, Card_G2_A_3015,
                    Card_G2_A_2045, Card_G2_A_2047, Card_G2_A_2048, Card_G2_A_3278, Card_G2_A_3199, Card_G2_A_3628, Card_G2_A_2055_01, Card_G2_A_2057, Card_G2_A_2059, Card_G2_A_2060, Card_G2_A_2061, Card_G2_A_2063, Card_G2_A_2064,
                    Card_G2_A_2067, Card_G2_A_2069, Card_G2_A_2071, Card_G2_A_2072, Card_G2_A_2075, Card_G2_A_2077_01, Card_G2_A_2078_01, Card_G2_A_3016, Card_G2_A_2080_01, Card_G2_A_2081_01, Card_G2_A_3293_01, Card_G2_A_3295_01,
                    Card_G2_A_2868, Card_G2_A_2082, Card_G2_A_2083, Card_G2_A_2084, Card_G2_A_2085_01, Card_G2_A_2088_01, Card_G2_A_2089, Card_G2_A_2090_01, Card_G2_A_2091_01, Card_G2_A_2094_01, Card_G2_A_2095_01, Card_G2_A_2096_01,
                    Card_G2_A_3629, Card_G2_A_3631, Card_G2_A_3633, Card_G2_A_3635, Card_G2_A_3637, Card_G2_A_2097, Card_G2_A_2098_01, Card_G2_A_2101, Card_G2_A_2107, Card_G2_A_2110_01, Card_G2_A_3639, Card_G2_A_3641, Card_G2_A_3643,
                    Card_G2_A_3645, Card_G2_A_2117, Card_G2_A_2119_01, Card_G2_A_2120_01, Card_G2_A_2121_01, Card_G2_A_2122_01, Card_G2_A_2123_01, Card_G2_A_2118, Card_G2_A_3320_01, Card_G2_A_3321_01, Card_G2_A_3322_01, Card_G2_A_3323_01,
                    Card_G2_A_3324_01, Card_G2_A_2124, Card_G2_A_2125_01, Card_G2_A_2128, Card_G2_A_2129, Card_G2_A_2130_01, Card_G2_A_2131_01, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3483, Card_G2_A_3484, Card_G2_A_3485,
                    Card_G2_A_3486, Card_G2_A_3487, Card_G2_A_3488, Card_G2_A_3489, Card_G2_A_3490, Card_G2_A_3491, Card_G2_A_3493, GS_A_4377, GS_A_3695, GS_A_3700, GS_A_5026, GS_A_5054, GS_A_5140, GS_A_4559, GS_A_4668);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_6538, TIP1_A_6539, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533,
                    TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, Card_G2_A_3625, Card_G2_A_3325, Card_G2_A_3270, Card_G2_A_3271, Card_G2_A_2675_01, GS_A_3697, GS_A_4542, GS_A_5038, GS_A_5039, Card_G2_A_2036, Card_G2_A_3009, Card_G2_A_3277,
                    Card_G2_A_2032, Card_G2_A_3182, Card_G2_A_3183, Card_G2_A_3184, Card_G2_A_3185, Card_G2_A_3186, Card_G2_A_2033_01, Card_G2_A_2034, Card_G2_A_2673, Card_G2_A_2035, Card_G2_A_3325, Card_G2_A_2039, Card_G2_A_2040_01,
                    Card_G2_A_2042, Card_G2_A_3181, Card_G2_A_3266, Card_G2_A_2043, Card_G2_A_2044_01, Card_G2_A_3015, Card_G2_A_2045, Card_G2_A_2047, Card_G2_A_2048, Card_G2_A_3278, Card_G2_A_3199, Card_G2_A_2055_01, Card_G2_A_2057,
                    Card_G2_A_2059, Card_G2_A_2060, Card_G2_A_2061, Card_G2_A_2063, Card_G2_A_2064, Card_G2_A_2067, Card_G2_A_2069, Card_G2_A_2071, Card_G2_A_2072, Card_G2_A_2075, Card_G2_A_2077_01, Card_G2_A_2078_01, Card_G2_A_3016,
                    Card_G2_A_2080_01, Card_G2_A_2081_01, Card_G2_A_3293_01, Card_G2_A_3295_01, Card_G2_A_2868, Card_G2_A_2082, Card_G2_A_2083, Card_G2_A_2084, Card_G2_A_2085_01, Card_G2_A_2088_01, Card_G2_A_2089, Card_G2_A_2091_01,
                    Card_G2_A_2094_01, Card_G2_A_2095_01, Card_G2_A_2096_01, Card_G2_A_3629, Card_G2_A_3631, Card_G2_A_3633, Card_G2_A_3635, Card_G2_A_3637, Card_G2_A_2097, Card_G2_A_2098_01, Card_G2_A_2101, Card_G2_A_2107,
                    Card_G2_A_2110_01, Card_G2_A_3639, Card_G2_A_3641, Card_G2_A_3643, Card_G2_A_3645, Card_G2_A_2117, Card_G2_A_2119_01, Card_G2_A_2120_01, Card_G2_A_2121_01, Card_G2_A_2122_01, Card_G2_A_2123_01, Card_G2_A_2118,
                    Card_G2_A_3320_01, Card_G2_A_3321_01, Card_G2_A_3322_01, Card_G2_A_3323_01, Card_G2_A_3324_01, Card_G2_A_2124, Card_G2_A_2125_01, Card_G2_A_2128, Card_G2_A_3270, Card_G2_A_2129, Card_G2_A_3271, Card_G2_A_2130_01,
                    Card_G2_A_2131_01, Card_G2_A_2675_01, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3483, Card_G2_A_3484, Card_G2_A_3485, Card_G2_A_3486, Card_G2_A_3487, Card_G2_A_3488, Card_G2_A_3489, Card_G2_A_3490,
                    Card_G2_A_3491, Card_G2_A_3493, GS_A_3695, GS_A_3696, GS_A_3700, GS_A_5026, GS_A_5140, GS_A_4559, GS_A_4362, GS_A_4363, GS_A_4364, GS_A_4365, GS_A_4366, GS_A_4367, GS_A_4368, GS_A_5021, GS_A_4380, GS_A_4381, GS_A_2524,
                    GS_A_2525, GS_A_2354, GS_A_2350, Card_G2_A_2230, Card_G2_A_2231, Card_G2_A_2309, Card_G2_A_2310, Card_G2_A_2311, Card_G2_A_2312, Card_G2_A_2313, Card_G2_A_2314, Card_G2_A_2315, Card_G2_A_2316, Card_G2_A_2317,
                    Card_G2_A_2318);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_HBA_G2_1_PTV4_3_0_0("gemProdT_HBA_G2.1_PTV4.3.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_5020, TIP1_A_2578, TIP1_A_2589, Card_G2_A_3673, Card_G2_A_3009, Card_G2_A_2038, Card_G2_A_2673, Card_G2_A_3005, Card_G2_A_2040_01, Card_G2_A_2041, Card_G2_A_3395, Card_G2_A_2043,
                    Card_G2_A_2044_01, Card_G2_A_3627, Card_G2_A_3015, Card_G2_A_2045, Card_G2_A_2046, Card_G2_A_2058, Card_G2_A_3281, Card_G2_A_3282, Card_G2_A_3385, Card_G2_A_3283, Card_G2_A_3386, Card_G2_A_3284, Card_G2_A_3387,
                    Card_G2_A_3285, Card_G2_A_3326, Card_G2_A_3327_01, Card_G2_A_3297, Card_G2_A_2869, Card_G2_A_3301, Card_G2_A_3302, Card_G2_A_3303, Card_G2_A_3304, Card_G2_A_3630, Card_G2_A_3632, Card_G2_A_3634, Card_G2_A_3636,
                    Card_G2_A_3638, Card_G2_A_3307, Card_G2_A_3308, Card_G2_A_3640, Card_G2_A_3642, Card_G2_A_3644, Card_G2_A_3646, Card_G2_A_3317_01, Card_G2_A_3318_01, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3487,
                    Card_G2_A_3492, Card_G2_A_3494, Card_G2_A_3495, Card_G2_A_3496, Card_G2_A_3497, Card_G2_A_3498, GS_A_4377, GS_A_3695, GS_A_5026, GS_A_5140, GS_A_4559, GS_A_4560, GS_A_4583, GS_A_4587, GS_A_4710, GS_A_4711, GS_A_4974,
                    GS_A_4621, GS_A_4623);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_6538, TIP1_A_6539, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533,
                    TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, TIP1_A_2575, Card_G2_A_3010, Card_G2_A_3277, Card_G2_A_3325, Card_G2_A_3523, Card_G2_A_3590, Card_G2_A_3286, Card_G2_A_2070, Card_G2_A_3287, Card_G2_A_3288, Card_G2_A_3289,
                    Card_G2_A_3290, Card_G2_A_3291, Card_G2_A_3292, Card_G2_A_3294, Card_G2_A_3296, Card_G2_A_3298, Card_G2_A_3299, Card_G2_A_3305, Card_G2_A_3306, Card_G2_A_3314, Card_G2_A_3315, Card_G2_A_3316, Card_G2_A_2676,
                    Card_G2_A_2677, Card_G2_A_2678, Card_G2_A_2679, Card_G2_A_2680_01, Card_G2_A_2681_01, Card_G2_A_2682, Card_G2_A_2856, GS_A_3696, GS_A_3697, GS_A_4542, GS_A_3700, GS_A_5054, GS_A_5038, GS_A_5039, GS_A_3813, GS_A_5115,
                    GS_A_5116, GS_A_5117, GS_A_5118, GS_A_5119, GS_A_5120, GS_A_5121, TIP1_A_2579, TIP1_A_2580, TIP1_A_2582, TIP1_A_2583, TIP1_A_2584, TIP1_A_2585, TIP1_A_4222, TIP1_A_2590, TIP1_A_2591, GS_A_4473, GS_A_4474, GS_A_4475,
                    Card_G2_A_3591, GS_A_4529, GS_A_5338, GS_A_5386, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_2229, GS_A_2227, GS_A_2228, GS_A_2232, GS_A_2239, GS_A_2234, GS_A_2235, GS_A_2236, GS_A_2237, GS_A_2230,
                    GS_A_2238, GS_A_5209, GS_A_2240, GS_A_2242, GS_A_2244, GS_A_2246, GS_A_2247, GS_A_2248, GS_A_2249, GS_A_2250, GS_A_2253, GS_A_2254, GS_A_2255, GS_A_2256, GS_A_2260, GS_A_2261, GS_A_2264, GS_A_2266, GS_A_2270, GS_A_2271,
                    GS_A_2274, GS_A_2276, GS_A_2277, GS_A_2284, GS_A_2285, GS_A_5085, GS_A_2287, GS_A_2252, GS_A_2291, GS_A_2292, GS_A_2295, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753,
                    GS_A_3772, GS_A_3756, GS_A_2087, GS_A_2213, GS_A_2076, GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330,
                    GS_A_2331, GS_A_2332, GS_A_2345, GS_A_2347, GS_A_2361, GS_A_2363, GS_A_2366, GS_A_5387, GS_A_4233, TIP1_A_2581, Card_G2_A_3591, GS_A_4523, GS_A_4524, GS_A_4528, GS_A_4362, GS_A_4363, GS_A_4364, GS_A_4365, GS_A_4366,
                    GS_A_4367, GS_A_4368, GS_A_5021, GS_A_4380, GS_A_4381, GS_A_4958, GS_A_4712, GS_A_4961, GS_A_4962, GS_A_4963, GS_A_4972, GS_A_4973, GS_A_3784, GS_A_2356, GS_A_2524, GS_A_2525, GS_A_2354, GS_A_2350, Card_G2_A_2319,
                    Card_G2_A_2320, Card_G2_A_2321, Card_G2_A_2322, Card_G2_A_2323, Card_G2_A_2324, Card_G2_A_2325);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_gSMC_KT_PTV4_2_0_1("gemProdT_gSMC-KT_PTV4.2.0-1") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_5020, TIP1_A_2578, TIP1_A_2589, Card_G2_A_3019, Card_G2_A_2849, Card_G2_A_2477, Card_G2_A_2478, Card_G2_A_3274, Card_G2_A_2479, Card_G2_A_3515, Card_G2_A_2481, Card_G2_A_2482, Card_G2_A_3027,
                    Card_G2_A_2483, Card_G2_A_2507, Card_G2_A_3455, Card_G2_A_2500, Card_G2_A_3456, Card_G2_A_2502, Card_G2_A_3457, Card_G2_A_3275, Card_G2_A_3458, Card_G2_A_3459, Card_G2_A_3460, Card_G2_A_3462, Card_G2_A_3464,
                    Card_G2_A_3465, Card_G2_A_3466, Card_G2_A_3467, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3487, Card_G2_A_3492, Card_G2_A_3494, Card_G2_A_3495, Card_G2_A_3496, Card_G2_A_3497, Card_G2_A_3498, GS_A_3695,
                    GS_A_5026, GS_A_5140, GS_A_4559, GS_A_4560, GS_A_4707, GS_A_4974, GS_A_5126, Card_G2_A_2022, Card_G2_A_2023, Card_G2_A_2024, Card_G2_A_2025, Card_G2_A_3209, Card_G2_A_3239, Card_G2_A_2026, Card_G2_A_2027);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_6538, TIP1_A_6539, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535,
                    TIP1_A_6536, TIP1_A_6537, TIP1_A_2575, Card_G2_A_3276, GS_A_3696, GS_A_3697, GS_A_4542, GS_A_3700, GS_A_5054, GS_A_5038, GS_A_5039, GS_A_3813, TIP1_A_2579, TIP1_A_2580, TIP1_A_2582, TIP1_A_2583, TIP1_A_2584, TIP1_A_4222,
                    TIP1_A_2590, TIP1_A_2591, GS_A_4473, GS_A_4474, GS_A_4475, GS_A_4529, GS_A_5386, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737,
                    GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2087, GS_A_2213, GS_A_2076, GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328,
                    GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2345, GS_A_2347, GS_A_2361, GS_A_2363, GS_A_2366, GS_A_5387, GS_A_4233, GS_A_4479, GS_A_4523, GS_A_4524, GS_A_4528, GS_A_4365, GS_A_4366, GS_A_4367, GS_A_4368, GS_A_5021,
                    GS_A_4380, GS_A_4381, GS_A_4963, GS_A_4965, GS_A_4972, GS_A_4973, GS_A_3784, GS_A_2356, GS_A_2524, GS_A_2525, GS_A_2354, GS_A_2350);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_gSMC_KT_ObjSys_PTV4_3_0_2("gemProdT_gSMC-KT_ObjSys_PTV4.3.0-2") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(Card_G2_A_3019, Card_G2_A_2475, Card_G2_A_2876, Card_G2_A_3026, Card_G2_A_2877, Card_G2_A_3473, Card_G2_A_2470, Card_G2_A_2472, Card_G2_A_3194, Card_G2_A_2849, Card_G2_A_2474, Card_G2_A_3273,
                    Card_G2_A_3274, Card_G2_A_3196, Card_G2_A_3269, Card_G2_A_2481, Card_G2_A_2482, Card_G2_A_2504, Card_G2_A_3027, Card_G2_A_2483, Card_G2_A_2487, Card_G2_A_3453, Card_G2_A_2488, Card_G2_A_3471, Card_G2_A_2497,
                    Card_G2_A_2506, Card_G2_A_2503, Card_G2_A_2509, Card_G2_A_2496, Card_G2_A_2511, Card_G2_A_2501, Card_G2_A_2512, Card_G2_A_2514, Card_G2_A_3028, Card_G2_A_2518, Card_G2_A_2519, Card_G2_A_3461, Card_G2_A_3463,
                    Card_G2_A_2523, Card_G2_A_2526, Card_G2_A_2529, Card_G2_A_2522, Card_G2_A_2524, Card_G2_A_2527, Card_G2_A_3468, Card_G2_A_2530, Card_G2_A_3469, Card_G2_A_2531, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481,
                    Card_G2_A_3483, Card_G2_A_3484, Card_G2_A_3485, Card_G2_A_3486, Card_G2_A_3487, Card_G2_A_3488, Card_G2_A_3489, Card_G2_A_3490, Card_G2_A_3491, Card_G2_A_3493, Card_G2_A_3499, Card_G2_A_3501, Card_G2_A_3504,
                    Card_G2_A_3505, GS_A_3695, GS_A_3700, GS_A_5026, GS_A_5054, GS_A_5140, GS_A_4559);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_6538, TIP1_A_6539, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533,
                    TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, Card_G2_A_3276, GS_A_3697, GS_A_4542, GS_A_5038, GS_A_5039, Card_G2_A_3019, Card_G2_A_2475, Card_G2_A_2476, Card_G2_A_3473, Card_G2_A_2469, Card_G2_A_2470, Card_G2_A_2472,
                    Card_G2_A_3194, Card_G2_A_3195, Card_G2_A_2473, Card_G2_A_2849, Card_G2_A_2474, Card_G2_A_3276, Card_G2_A_3273, Card_G2_A_3274, Card_G2_A_3196, Card_G2_A_3197, Card_G2_A_3269, Card_G2_A_2481, Card_G2_A_2482,
                    Card_G2_A_2504, Card_G2_A_3027, Card_G2_A_2483, Card_G2_A_2487, Card_G2_A_3453, Card_G2_A_2488, Card_G2_A_3471, Card_G2_A_2497, Card_G2_A_2506, Card_G2_A_2503, Card_G2_A_2509, Card_G2_A_2496, Card_G2_A_2511,
                    Card_G2_A_2501, Card_G2_A_2512, Card_G2_A_2514, Card_G2_A_3028, Card_G2_A_2518, Card_G2_A_2519, Card_G2_A_3461, Card_G2_A_3463, Card_G2_A_2523, Card_G2_A_2526, Card_G2_A_2529, Card_G2_A_2522, Card_G2_A_2524,
                    Card_G2_A_2527, Card_G2_A_3468, Card_G2_A_2530, Card_G2_A_3469, Card_G2_A_2531, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3483, Card_G2_A_3484, Card_G2_A_3485, Card_G2_A_3486, Card_G2_A_3487,
                    Card_G2_A_3488, Card_G2_A_3489, Card_G2_A_3490, Card_G2_A_3491, Card_G2_A_3493, Card_G2_A_3499, Card_G2_A_3501, Card_G2_A_3504, Card_G2_A_3505, GS_A_3695, GS_A_3696, GS_A_3700, GS_A_5026, GS_A_5140, GS_A_4559, GS_A_4365,
                    GS_A_4366, GS_A_4367, GS_A_4368, GS_A_5021, GS_A_4380, GS_A_4381, GS_A_2524, GS_A_2525, GS_A_2354, GS_A_2350, Card_G2_A_3478, Card_G2_A_3513);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_gSMC_KT_ObjSys_G2_1_PTV4_4_0_0("gemProdT_gSMC-KT_ObjSys_G2.1_PTV4.4.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(Card_G2_A_3019_01, Card_G2_A_3766, Card_G2_A_2475, Card_G2_A_2876, Card_G2_A_3026, Card_G2_A_2877, Card_G2_A_3473, Card_G2_A_2470, Card_G2_A_3194, Card_G2_A_2472_01, Card_G2_A_3772, Card_G2_A_2849,
                    Card_G2_A_2474, Card_G2_A_3273, Card_G2_A_3274, Card_G2_A_3196, Card_G2_A_3269, Card_G2_A_2481, Card_G2_A_2482, Card_G2_A_3027, Card_G2_A_2483, Card_G2_A_2487, Card_G2_A_2488, Card_G2_A_3471, Card_G2_A_3767,
                    Card_G2_A_2504_01, Card_G2_A_2506, Card_G2_A_3453_01, Card_G2_A_2509, Card_G2_A_2496, Card_G2_A_2497_01, Card_G2_A_2501, Card_G2_A_2503_01, Card_G2_A_2511_01, Card_G2_A_2512_01, Card_G2_A_2514_01, Card_G2_A_3028_01,
                    Card_G2_A_2518_01, Card_G2_A_2519_01, Card_G2_A_3461_01, Card_G2_A_3463_01, Card_G2_A_2522, Card_G2_A_2526_01, Card_G2_A_2529_01, Card_G2_A_2527_01, Card_G2_A_2530_01, Card_G2_A_3469_01, Card_G2_A_3769,
                    Card_G2_A_2531_01, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3483, Card_G2_A_3484, Card_G2_A_3485, Card_G2_A_3486, Card_G2_A_3487, Card_G2_A_3488, Card_G2_A_3489, Card_G2_A_3490, Card_G2_A_3491,
                    Card_G2_A_3493, Card_G2_A_3499, Card_G2_A_3501, Card_G2_A_3504, Card_G2_A_3505, GS_A_3695, GS_A_3700, GS_A_5026, GS_A_5054, GS_A_5140, GS_A_4559);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_6538, TIP1_A_6539, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533,
                    TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, Card_G2_A_3771, Card_G2_A_3276, GS_A_3697, GS_A_4542, GS_A_5038, GS_A_5039, Card_G2_A_3019_01, Card_G2_A_2475, Card_G2_A_2476, Card_G2_A_3473, Card_G2_A_2469, Card_G2_A_2470,
                    Card_G2_A_3194, Card_G2_A_3195, Card_G2_A_2472_01, Card_G2_A_2473, Card_G2_A_2849, Card_G2_A_2474, Card_G2_A_3276, Card_G2_A_3273, Card_G2_A_3274, Card_G2_A_3196, Card_G2_A_3197, Card_G2_A_3269, Card_G2_A_2481,
                    Card_G2_A_2482, Card_G2_A_3027, Card_G2_A_2483, Card_G2_A_2487, Card_G2_A_2488, Card_G2_A_3471, Card_G2_A_2504_01, Card_G2_A_2506, Card_G2_A_3453_01, Card_G2_A_2509, Card_G2_A_2496, Card_G2_A_2497_01, Card_G2_A_2501,
                    Card_G2_A_2503_01, Card_G2_A_2511_01, Card_G2_A_2512_01, Card_G2_A_2514_01, Card_G2_A_3028_01, Card_G2_A_2518_01, Card_G2_A_2519_01, Card_G2_A_3461_01, Card_G2_A_3463_01, Card_G2_A_2522, Card_G2_A_2526_01,
                    Card_G2_A_2529_01, Card_G2_A_2527_01, Card_G2_A_2530_01, Card_G2_A_3469_01, Card_G2_A_3769, Card_G2_A_2531_01, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3483, Card_G2_A_3484, Card_G2_A_3485,
                    Card_G2_A_3486, Card_G2_A_3487, Card_G2_A_3488, Card_G2_A_3489, Card_G2_A_3490, Card_G2_A_3491, Card_G2_A_3493, Card_G2_A_3499, Card_G2_A_3501, Card_G2_A_3504, Card_G2_A_3505, GS_A_3695, GS_A_3696, GS_A_3700, GS_A_5026,
                    GS_A_5140, GS_A_4559, GS_A_4365, GS_A_4366, GS_A_4367, GS_A_4368, GS_A_5021, GS_A_4380, GS_A_4381, GS_A_2524, GS_A_2525, GS_A_2354, GS_A_2350, Card_G2_A_3478, Card_G2_A_3513);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_gSMC_KT_G2_1_PTV4_3_0_0("gemProdT_gSMC-KT_G2.1_PTV4.3.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_5020, TIP1_A_2578, TIP1_A_2589, Card_G2_A_3019_01, Card_G2_A_2849, Card_G2_A_2477, Card_G2_A_2478, Card_G2_A_3274, Card_G2_A_2479, Card_G2_A_3515, Card_G2_A_2481, Card_G2_A_2482, Card_G2_A_3027,
                    Card_G2_A_2483, Card_G2_A_2507, Card_G2_A_3455, Card_G2_A_2500, Card_G2_A_3456, Card_G2_A_2502, Card_G2_A_3457, Card_G2_A_3275_01, Card_G2_A_3458_01, Card_G2_A_3459, Card_G2_A_3460, Card_G2_A_3462, Card_G2_A_3464,
                    Card_G2_A_3466_01, Card_G2_A_3467, Card_G2_A_3765, Card_G2_A_3768, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3487, Card_G2_A_3492, Card_G2_A_3494, Card_G2_A_3495, Card_G2_A_3496, Card_G2_A_3497,
                    Card_G2_A_3498, GS_A_3695, GS_A_5026, GS_A_5140, GS_A_4559, GS_A_4560, GS_A_4707, GS_A_4974, GS_A_5126, Card_G2_A_2022, Card_G2_A_2023, Card_G2_A_2024, Card_G2_A_2025, Card_G2_A_3209, Card_G2_A_3239, Card_G2_A_2026,
                    Card_G2_A_2027);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_6538, TIP1_A_6539, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533,
                    TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, TIP1_A_2575, Card_G2_A_3276, GS_A_3696, GS_A_3697, GS_A_4542, GS_A_3700, GS_A_5054, GS_A_5038, GS_A_5039, GS_A_3813, TIP1_A_2579, TIP1_A_2580, TIP1_A_2582, TIP1_A_2583, TIP1_A_2584,
                    TIP1_A_4222, TIP1_A_2590, TIP1_A_2591, GS_A_4473, GS_A_4474, GS_A_4475, GS_A_4529, GS_A_5386, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984,
                    GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2087, GS_A_2213, GS_A_2076, GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326,
                    GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2345, GS_A_2347, GS_A_2361, GS_A_2363, GS_A_2366, GS_A_5387, GS_A_4233, TIP1_A_2581, GS_A_4479, GS_A_4523, GS_A_4524, GS_A_4528, GS_A_4365, GS_A_4366,
                    GS_A_4367, GS_A_4368, GS_A_5021, GS_A_4380, GS_A_4381, GS_A_4963, GS_A_4972, GS_A_4973, GS_A_3784, GS_A_2356, GS_A_2524, GS_A_2525, GS_A_2354, GS_A_2350);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_gSMC_K_PTV4_2_0_1("gemProdT_gSMC-K_PTV4.2.0-1") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_5020, TIP1_A_2578, TIP1_A_2589, Card_G2_A_3336, Card_G2_A_2538, Card_G2_A_2665, Card_G2_A_3201, Card_G2_A_2994, Card_G2_A_2541, Card_G2_A_2542, Card_G2_A_2544, Card_G2_A_2545, Card_G2_A_3514,
                    Card_G2_A_2547, Card_G2_A_2548, Card_G2_A_2997, Card_G2_A_3041, Card_G2_A_3394, Card_G2_A_2567, Card_G2_A_3393, Card_G2_A_3580, Card_G2_A_3581, Card_G2_A_3328, Card_G2_A_3329, Card_G2_A_3331, Card_G2_A_2570,
                    Card_G2_A_3333, Card_G2_A_3400, Card_G2_A_3338, Card_G2_A_3376, Card_G2_A_3380, Card_G2_A_3382, Card_G2_A_3401, Card_G2_A_3402, Card_G2_A_3262, Card_G2_A_3404, Card_G2_A_3405, Card_G2_A_3447, Card_G2_A_3449,
                    Card_G2_A_3450, Card_G2_A_3406, Card_G2_A_3407, Card_G2_A_3410, Card_G2_A_3411, Card_G2_A_3416, Card_G2_A_3417, Card_G2_A_3423, Card_G2_A_3424, Card_G2_A_2638, Card_G2_A_3429, Card_G2_A_3430, Card_G2_A_2640,
                    Card_G2_A_3431, Card_G2_A_3434, Card_G2_A_3582, Card_G2_A_3583, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3487, Card_G2_A_3492, Card_G2_A_3494, Card_G2_A_3495, Card_G2_A_3496, Card_G2_A_3497,
                    Card_G2_A_3498, Card_G2_A_3507, Card_G2_A_3509, GS_A_3695, GS_A_5026, GS_A_5140, GS_A_4559, GS_A_4560, GS_A_4707, GS_A_4606, GS_A_4974, GS_A_4622, GS_A_5335, Card_G2_A_2016, Card_G2_A_2017, Card_G2_A_2018,
                    Card_G2_A_2019, Card_G2_A_2020, Card_G2_A_2021);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_6538, TIP1_A_6539, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535,
                    TIP1_A_6536, TIP1_A_6537, TIP1_A_2575, Card_G2_A_3261, Card_G2_A_3396, Card_G2_A_3397, Card_G2_A_3398, Card_G2_A_3399, Card_G2_A_3403, Card_G2_A_3438, Card_G2_A_3439, GS_A_3696, GS_A_3697, GS_A_4542, GS_A_3700,
                    GS_A_5054, GS_A_5038, GS_A_5039, GS_A_3813, GS_A_4605, TIP1_A_2579, TIP1_A_2580, TIP1_A_2582, TIP1_A_2583, TIP1_A_2584, TIP1_A_4222, TIP1_A_2590, TIP1_A_2591, GS_A_4473, GS_A_4474, GS_A_4475, Card_G2_A_3593, GS_A_4529,
                    GS_A_5386, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_2229, GS_A_2227, GS_A_2228, GS_A_2232, GS_A_2239, GS_A_2234, GS_A_2235, GS_A_2236, GS_A_2237, GS_A_2230, GS_A_2238, GS_A_5209, GS_A_2240, GS_A_2242,
                    GS_A_2244, GS_A_2246, GS_A_2247, GS_A_2248, GS_A_2249, GS_A_2250, GS_A_2253, GS_A_2254, GS_A_2255, GS_A_2256, GS_A_2260, GS_A_2261, GS_A_2264, GS_A_2266, GS_A_2270, GS_A_2271, GS_A_2274, GS_A_2276, GS_A_2277, GS_A_2284,
                    GS_A_2285, GS_A_5085, GS_A_2287, GS_A_2252, GS_A_2291, GS_A_2292, GS_A_2295, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2087, GS_A_2213,
                    GS_A_2076, GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2345, GS_A_2347,
                    GS_A_2361, GS_A_2363, GS_A_2366, GS_A_5387, GS_A_4233, GS_A_4479, Card_G2_A_3593, GS_A_4523, GS_A_4524, GS_A_4528, GS_A_4362, GS_A_4365, GS_A_4366, GS_A_4367, GS_A_4368, GS_A_5021, GS_A_4380, GS_A_4381, GS_A_4963,
                    GS_A_4965, GS_A_4972, GS_A_4973, GS_A_3784, GS_A_2356, GS_A_2524, GS_A_2525, GS_A_2354, GS_A_2350);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_gSMC_K_ObjSys_PTV4_3_1_2("gemProdT_gSMC-K_ObjSys_PTV4.3.1-2") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(Card_G2_A_3336, Card_G2_A_2538, Card_G2_A_2873, Card_G2_A_2995, Card_G2_A_2996, Card_G2_A_2533, Card_G2_A_3192, Card_G2_A_2535, Card_G2_A_2665, Card_G2_A_2537, Card_G2_A_3201, Card_G2_A_2540,
                    Card_G2_A_2543, Card_G2_A_2544, Card_G2_A_2546, Card_G2_A_3268, Card_G2_A_2547, Card_G2_A_2548, Card_G2_A_2997, Card_G2_A_3041, Card_G2_A_2553, Card_G2_A_2554, Card_G2_A_3251, Card_G2_A_2563, Card_G2_A_2565,
                    Card_G2_A_2566, Card_G2_A_3392, Card_G2_A_2568, Card_G2_A_2561, Card_G2_A_2562, Card_G2_A_3252, Card_G2_A_2666, Card_G2_A_3280, Card_G2_A_3330, Card_G2_A_2569, Card_G2_A_2571, Card_G2_A_2573, Card_G2_A_2575,
                    Card_G2_A_3332, Card_G2_A_3334, Card_G2_A_2577, Card_G2_A_3442, Card_G2_A_2578, Card_G2_A_3443, Card_G2_A_2579, Card_G2_A_3337, Card_G2_A_3339, Card_G2_A_3345, Card_G2_A_3372, Card_G2_A_3377, Card_G2_A_3378,
                    Card_G2_A_3379, Card_G2_A_3381, Card_G2_A_3383, Card_G2_A_3384, Card_G2_A_2580, Card_G2_A_2585, Card_G2_A_3444, Card_G2_A_2581, Card_G2_A_3446, Card_G2_A_2582, Card_G2_A_2583, Card_G2_A_2998, Card_G2_A_2588,
                    Card_G2_A_2589, Card_G2_A_3206, Card_G2_A_3448, Card_G2_A_2592, Card_G2_A_2595, Card_G2_A_2599, Card_G2_A_3451, Card_G2_A_3452, Card_G2_A_3254, Card_G2_A_3256, Card_G2_A_3258, Card_G2_A_2600, Card_G2_A_3408,
                    Card_G2_A_2601, Card_G2_A_3409, Card_G2_A_2602, Card_G2_A_2605, Card_G2_A_2606, Card_G2_A_2607, Card_G2_A_2608, Card_G2_A_2609, Card_G2_A_2612, Card_G2_A_3259, Card_G2_A_3260, Card_G2_A_3412, Card_G2_A_3413,
                    Card_G2_A_3414, Card_G2_A_3415, Card_G2_A_2617, Card_G2_A_2623, Card_G2_A_3418, Card_G2_A_3419, Card_G2_A_3420, Card_G2_A_3421, Card_G2_A_2626, Card_G2_A_2627, Card_G2_A_2628, Card_G2_A_3422, Card_G2_A_2635,
                    Card_G2_A_2631, Card_G2_A_3425, Card_G2_A_3426, Card_G2_A_3427, Card_G2_A_3428, Card_G2_A_2639, Card_G2_A_2643, Card_G2_A_2641, Card_G2_A_2644, Card_G2_A_2645, Card_G2_A_3432, Card_G2_A_2646, Card_G2_A_3433,
                    Card_G2_A_2647, Card_G2_A_2648, Card_G2_A_3435, Card_G2_A_2649, Card_G2_A_3436, Card_G2_A_2650, Card_G2_A_2653, Card_G2_A_2654, Card_G2_A_2655, Card_G2_A_2656, Card_G2_A_2658, Card_G2_A_2660, Card_G2_A_2663,
                    Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3483, Card_G2_A_3484, Card_G2_A_3485, Card_G2_A_3486, Card_G2_A_3487, Card_G2_A_3488, Card_G2_A_3489, Card_G2_A_3490, Card_G2_A_3491, Card_G2_A_3493,
                    Card_G2_A_3499, Card_G2_A_3501, Card_G2_A_3502, Card_G2_A_3503, GS_A_3695, GS_A_3700, GS_A_5026, GS_A_5054, GS_A_5140, GS_A_4559);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_6538, TIP1_A_6539, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533,
                    TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, Card_G2_A_3261, Card_G2_A_2572, Card_G2_A_2574, Card_G2_A_2576, Card_G2_A_2659, Card_G2_A_2661, Card_G2_A_2662, GS_A_3697, GS_A_4542, GS_A_5038, GS_A_5039, Card_G2_A_3336,
                    Card_G2_A_2538, Card_G2_A_3040, Card_G2_A_2532, Card_G2_A_2533, Card_G2_A_3192, Card_G2_A_3193, Card_G2_A_2535, Card_G2_A_2536, Card_G2_A_2665, Card_G2_A_2537, Card_G2_A_3201, Card_G2_A_3261, Card_G2_A_2540,
                    Card_G2_A_2543, Card_G2_A_2544, Card_G2_A_2546, Card_G2_A_3191, Card_G2_A_3268, Card_G2_A_2547, Card_G2_A_2548, Card_G2_A_2997, Card_G2_A_3041, Card_G2_A_2553, Card_G2_A_2554, Card_G2_A_3251, Card_G2_A_2563,
                    Card_G2_A_2565, Card_G2_A_2566, Card_G2_A_3392, Card_G2_A_2568, Card_G2_A_2561, Card_G2_A_2562, Card_G2_A_3252, Card_G2_A_2666, Card_G2_A_3280, Card_G2_A_3330, Card_G2_A_2569, Card_G2_A_2571, Card_G2_A_2572,
                    Card_G2_A_2573, Card_G2_A_2574, Card_G2_A_2575, Card_G2_A_2576, Card_G2_A_3332, Card_G2_A_3334, Card_G2_A_2577, Card_G2_A_3442, Card_G2_A_2578, Card_G2_A_3443, Card_G2_A_2579, Card_G2_A_3337, Card_G2_A_3339,
                    Card_G2_A_3345, Card_G2_A_3372, Card_G2_A_3377, Card_G2_A_3378, Card_G2_A_3379, Card_G2_A_3381, Card_G2_A_3383, Card_G2_A_3384, Card_G2_A_2580, Card_G2_A_2585, Card_G2_A_3444, Card_G2_A_2581, Card_G2_A_3446,
                    Card_G2_A_2582, Card_G2_A_2583, Card_G2_A_2998, Card_G2_A_2588, Card_G2_A_2589, Card_G2_A_3206, Card_G2_A_3448, Card_G2_A_2592, Card_G2_A_2595, Card_G2_A_2599, Card_G2_A_3451, Card_G2_A_3452, Card_G2_A_3254,
                    Card_G2_A_3256, Card_G2_A_3258, Card_G2_A_2600, Card_G2_A_3408, Card_G2_A_2601, Card_G2_A_3409, Card_G2_A_2602, Card_G2_A_2605, Card_G2_A_2606, Card_G2_A_2607, Card_G2_A_2608, Card_G2_A_2609, Card_G2_A_2612,
                    Card_G2_A_3259, Card_G2_A_3260, Card_G2_A_3412, Card_G2_A_3413, Card_G2_A_3414, Card_G2_A_3415, Card_G2_A_2617, Card_G2_A_2623, Card_G2_A_3418, Card_G2_A_3419, Card_G2_A_3420, Card_G2_A_3421, Card_G2_A_2626,
                    Card_G2_A_2627, Card_G2_A_2628, Card_G2_A_3422, Card_G2_A_2635, Card_G2_A_2631, Card_G2_A_3425, Card_G2_A_3426, Card_G2_A_3427, Card_G2_A_3428, Card_G2_A_2639, Card_G2_A_2643, Card_G2_A_2641, Card_G2_A_2644,
                    Card_G2_A_2645, Card_G2_A_3432, Card_G2_A_2646, Card_G2_A_3433, Card_G2_A_2647, Card_G2_A_2648, Card_G2_A_3435, Card_G2_A_2649, Card_G2_A_3436, Card_G2_A_2650, Card_G2_A_2653, Card_G2_A_2654, Card_G2_A_2655,
                    Card_G2_A_2656, Card_G2_A_2658, Card_G2_A_2659, Card_G2_A_2660, Card_G2_A_2661, Card_G2_A_2662, Card_G2_A_2663, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3483, Card_G2_A_3484, Card_G2_A_3485,
                    Card_G2_A_3486, Card_G2_A_3487, Card_G2_A_3488, Card_G2_A_3489, Card_G2_A_3490, Card_G2_A_3491, Card_G2_A_3493, Card_G2_A_3499, Card_G2_A_3501, Card_G2_A_3502, Card_G2_A_3503, GS_A_3695, GS_A_3696, GS_A_3700, GS_A_5026,
                    GS_A_5140, GS_A_4559, GS_A_4362, GS_A_4365, GS_A_4366, GS_A_4367, GS_A_4368, GS_A_5021, GS_A_4380, GS_A_4381, GS_A_2524, GS_A_2525, GS_A_2354, GS_A_2350, Card_G2_A_3478, Card_G2_A_3513);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_eGK_ObjSys_PTV4_3_2_2("gemProdT_eGK_ObjSys_PTV4.3.2-2") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(VSDM_A_2965, VSDM_A_2966, VSDM_A_2967, VSDM_A_2968, VSDM_A_2970, VSDM_A_2971, VSDM_A_2972, Card_G2_A_2861, Card_G2_A_2974, Card_G2_A_2975, Card_G2_A_2977, Card_G2_A_2978, Card_G2_A_3204,
                    Card_G2_A_2981, Card_G2_A_2982, Card_G2_A_2984, Card_G2_A_3272, Card_G2_A_3230, Card_G2_A_3237, Card_G2_A_3279, Card_G2_A_3238, Card_G2_A_2334, Card_G2_A_2857, Card_G2_A_2335, Card_G2_A_2667, Card_G2_A_2337,
                    Card_G2_A_2342, Card_G2_A_2341, Card_G2_A_2344, Card_G2_A_3265, Card_G2_A_2346, Card_G2_A_2345, Card_G2_A_2985, Card_G2_A_2347, Card_G2_A_2351, Card_G2_A_2352, Card_G2_A_3205, Card_G2_A_3200, Card_G2_A_2359,
                    Card_G2_A_2364, Card_G2_A_2367, Card_G2_A_2369, Card_G2_A_2371, Card_G2_A_2372, Card_G2_A_2375, Card_G2_A_3231, Card_G2_A_2377, Card_G2_A_2380, Card_G2_A_2986, Card_G2_A_2389, Card_G2_A_2390, Card_G2_A_2391,
                    Card_G2_A_2395, Card_G2_A_2388, Card_G2_A_2396, Card_G2_A_2397, Card_G2_A_2398, Card_G2_A_2399, Card_G2_A_2400, Card_G2_A_2401, Card_G2_A_2402, Card_G2_A_2403, Card_G2_A_2404, Card_G2_A_2862, Card_G2_A_2405,
                    Card_G2_A_2406, Card_G2_A_2394, Card_G2_A_2407, Card_G2_A_2408, Card_G2_A_2864, Card_G2_A_2410, Card_G2_A_2411, Card_G2_A_2412, Card_G2_A_2413, Card_G2_A_3232, Card_G2_A_2415, Card_G2_A_2416, Card_G2_A_2418,
                    Card_G2_A_2417, Card_G2_A_3233, Card_G2_A_3234, Card_G2_A_3235, Card_G2_A_3236, Card_G2_A_3240, Card_G2_A_3241, Card_G2_A_3244, Card_G2_A_3245, Card_G2_A_3246, Card_G2_A_3247, Card_G2_A_3248, Card_G2_A_3263,
                    Card_G2_A_2420, Card_G2_A_2421, Card_G2_A_2424, Card_G2_A_2427, Card_G2_A_2434, Card_G2_A_2437, Card_G2_A_2440, Card_G2_A_2443, Card_G2_A_2449, Card_G2_A_2452, Card_G2_A_2453, Card_G2_A_2460, Card_G2_A_2463,
                    Card_G2_A_2464, Card_G2_A_2459, Card_G2_A_2232, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3482, Card_G2_A_3483, Card_G2_A_3484, Card_G2_A_3485, Card_G2_A_3486, Card_G2_A_3487, Card_G2_A_3488,
                    Card_G2_A_3489, Card_G2_A_3490, Card_G2_A_3491, Card_G2_A_3493, GS_A_3695, GS_A_3700, GS_A_5026, GS_A_5054, GS_A_5140, GS_A_4559);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_6538, TIP1_A_6539, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533,
                    TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, Card_G2_A_3242, GS_A_3697, GS_A_4542, GS_A_5038, GS_A_5039, Card_G2_A_2974, Card_G2_A_2977, Card_G2_A_2978, Card_G2_A_3204, Card_G2_A_2982, Card_G2_A_3272, Card_G2_A_2333,
                    Card_G2_A_2334, Card_G2_A_2857, Card_G2_A_2858, Card_G2_A_2335, Card_G2_A_2336, Card_G2_A_2667, Card_G2_A_2337, Card_G2_A_2342, Card_G2_A_3242, Card_G2_A_2341, Card_G2_A_2344, Card_G2_A_3180, Card_G2_A_3265,
                    Card_G2_A_2346, Card_G2_A_2345, Card_G2_A_2985, Card_G2_A_2347, Card_G2_A_2351, Card_G2_A_2352, Card_G2_A_3205, Card_G2_A_3200, Card_G2_A_2359, Card_G2_A_2364, Card_G2_A_2367, Card_G2_A_2369, Card_G2_A_2371,
                    Card_G2_A_2372, Card_G2_A_2375, Card_G2_A_3231, Card_G2_A_2377, Card_G2_A_2380, Card_G2_A_2986, Card_G2_A_2389, Card_G2_A_2390, Card_G2_A_2391, Card_G2_A_2395, Card_G2_A_2388, Card_G2_A_2396, Card_G2_A_2397,
                    Card_G2_A_2398, Card_G2_A_2399, Card_G2_A_2400, Card_G2_A_2401, Card_G2_A_2402, Card_G2_A_2403, Card_G2_A_2404, Card_G2_A_2862, Card_G2_A_2405, Card_G2_A_2406, Card_G2_A_2394, Card_G2_A_2407, Card_G2_A_2408,
                    Card_G2_A_2864, Card_G2_A_2410, Card_G2_A_2411, Card_G2_A_2412, Card_G2_A_2413, Card_G2_A_3232, Card_G2_A_2415, Card_G2_A_2416, Card_G2_A_2418, Card_G2_A_2417, Card_G2_A_3233, Card_G2_A_3234, Card_G2_A_3235,
                    Card_G2_A_3236, Card_G2_A_3240, Card_G2_A_3241, Card_G2_A_3244, Card_G2_A_3245, Card_G2_A_3246, Card_G2_A_3247, Card_G2_A_3248, Card_G2_A_3263, Card_G2_A_2420, Card_G2_A_2421, Card_G2_A_2424, Card_G2_A_2427,
                    Card_G2_A_2434, Card_G2_A_2437, Card_G2_A_2440, Card_G2_A_2443, Card_G2_A_2449, Card_G2_A_2452, Card_G2_A_2453, Card_G2_A_2460, Card_G2_A_2463, Card_G2_A_2464, Card_G2_A_3202, Card_G2_A_2459, Card_G2_A_3479,
                    Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3482, Card_G2_A_3483, Card_G2_A_3484, Card_G2_A_3485, Card_G2_A_3486, Card_G2_A_3487, Card_G2_A_3488, Card_G2_A_3489, Card_G2_A_3490, Card_G2_A_3491, Card_G2_A_3493, GS_A_3695,
                    GS_A_3696, GS_A_3700, GS_A_5026, GS_A_5140, GS_A_4559, GS_A_4362, GS_A_4365, GS_A_4366, GS_A_4367, GS_A_4368, GS_A_5021, GS_A_4380, GS_A_4381, GS_A_2524, GS_A_2525, GS_A_2354, GS_A_2350, Card_G2_A_2230, Card_G2_A_2231,
                    Card_G2_A_2309, Card_G2_A_2310, Card_G2_A_2311, Card_G2_A_2312, Card_G2_A_2313, Card_G2_A_2314, Card_G2_A_2315, Card_G2_A_2316, Card_G2_A_2317, Card_G2_A_2318);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_COS_PTV4_3_1_0("gemProdT_COS_PTV4.3.1-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4362, GS_A_4363, GS_A_4364, GS_A_4365, GS_A_4366, GS_A_4377, GS_A_4378, GS_A_4379, GS_A_4381, GS_A_3695, GS_A_3700, GS_A_5026, GS_A_5038, GS_A_5140, GS_A_4668, GS_A_5009, GS_A_5010, GS_A_5011,
                    GS_A_5012);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(GS_A_3697, GS_A_4542, GS_A_5039, GS_A_4367, GS_A_4368, GS_A_2148, GS_A_2524, GS_A_2525, GS_A_2354, GS_A_2350, GS_A_5140);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_eGK_Sich_PTV4_2_0_0("gemProdT_eGK_Sich_PTV4.2.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_5115, GS_A_5116, GS_A_5117, GS_A_5118, GS_A_5119, GS_A_5120, GS_A_5121, TIP1_A_2579, TIP1_A_2580, TIP1_A_2582, TIP1_A_2583, TIP1_A_4222, TIP1_A_2590, TIP1_A_2591, GS_A_4473, GS_A_4474,
                    GS_A_4475, GS_A_4479, Card_G2_A_3335, GS_A_4523, GS_A_4524, GS_A_4528, GS_A_4529, GS_A_4362, GS_A_4365, GS_A_4366, GS_A_4367, GS_A_4368, GS_A_5021, GS_A_5386, GS_A_4380, GS_A_4381, GS_A_4385, GS_A_4386, GS_A_4387,
                    GS_A_5035, GS_A_4384, GS_A_4391, GS_A_4392, GS_A_2229, GS_A_2227, GS_A_2228, GS_A_2232, GS_A_2239, GS_A_2234, GS_A_2235, GS_A_2236, GS_A_2237, GS_A_2230, GS_A_2238, GS_A_5209, GS_A_2240, GS_A_2242, GS_A_2244, GS_A_2246,
                    GS_A_2247, GS_A_2248, GS_A_2249, GS_A_2250, GS_A_2253, GS_A_2254, GS_A_2255, GS_A_2256, GS_A_2260, GS_A_2261, GS_A_2264, GS_A_2266, GS_A_2270, GS_A_2271, GS_A_2274, GS_A_2276, GS_A_2277, GS_A_2284, GS_A_2285, GS_A_5085,
                    GS_A_2287, GS_A_2252, GS_A_2291, GS_A_2292, GS_A_2295, GS_A_4578, GS_A_4579, GS_A_4580, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3784, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756,
                    GS_A_2087, GS_A_2213, GS_A_2076, GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332,
                    GS_A_2345, GS_A_2347, GS_A_2356, GS_A_2357, GS_A_2359, GS_A_2361, GS_A_2363, GS_A_2366, GS_A_2524, GS_A_2525, GS_A_2354, GS_A_2350, GS_A_5387);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList();
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_eGK_PersVal_PTV4_2_0_2("gemProdT_eGK_PersVal_PTV4.2.0-2") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_5020, TIP1_A_2578, TIP1_A_2589, VSDM_A_2973, VSDM_A_2974, VSDM_A_2975, VSDM_A_2976, Card_G2_A_2977, Card_G2_A_2339, Card_G2_A_2342, Card_G2_A_2343, Card_G2_A_2985, Card_G2_A_3207,
                    Card_G2_A_2363, Card_G2_A_3208, Card_G2_A_2370, Card_G2_A_3229, Card_G2_A_2863, Card_G2_A_3217, Card_G2_A_3219, Card_G2_A_2372, Card_G2_A_3391, Card_G2_A_2237, Card_G2_A_2238, Card_G2_A_2883, Card_G2_A_2241,
                    Card_G2_A_2242, Card_G2_A_2249, Card_G2_A_2296, Card_G2_A_3243, Card_G2_A_2277, Card_G2_A_2278, Card_G2_A_2279, Card_G2_A_2285, Card_G2_A_3479, Card_G2_A_3481, Card_G2_A_3494, Card_G2_A_3495, Card_G2_A_3497,
                    Card_G2_A_3498, Card_G2_A_3496, Card_G2_A_3487, Card_G2_A_3492, GS_A_4379, GS_A_3695, GS_A_5026, GS_A_4559, GS_A_4560, GS_A_4974, GS_A_4620, GS_A_4714, GS_A_4715, Persval_1, Persval_2, Persval_3, Persval_4, Persval_5);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList();
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_eGK_PersVal_G2_1_PTV4_3_0_0("gemProdT_eGK_PersVal_G2.1_PTV4.3.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_5020, TIP1_A_2578, TIP1_A_2589, VSDM_A_2973, VSDM_A_2974, VSDM_A_2975, VSDM_A_2976, Card_G2_A_2977, Card_G2_A_2339, Card_G2_A_2342_01, Card_G2_A_2343, Card_G2_A_2985, Card_G2_A_3207,
                    Card_G2_A_2363, Card_G2_A_3208, Card_G2_A_2370, Card_G2_A_3229, Card_G2_A_2863, Card_G2_A_3217_01, Card_G2_A_3604, Card_G2_A_3219, Card_G2_A_3608, Card_G2_A_2372_01, Card_G2_A_3391, Card_G2_A_3243, Card_G2_A_2237,
                    Card_G2_A_2238, Card_G2_A_2883, Card_G2_A_2241, Card_G2_A_2242, Card_G2_A_2249, Card_G2_A_2296, Card_G2_A_2277, Card_G2_A_2278, Card_G2_A_2279, Card_G2_A_2285, Card_G2_A_3479, Card_G2_A_3481, Card_G2_A_3494,
                    Card_G2_A_3495, Card_G2_A_3497, Card_G2_A_3498, Card_G2_A_3496, Card_G2_A_3487, Card_G2_A_3492, GS_A_4379, GS_A_3695, GS_A_5026, GS_A_4559, GS_A_4560, GS_A_4974, GS_A_4620, GS_A_4714, GS_A_4715, Persval_1, Persval_2,
                    Persval_3, Persval_4, Persval_5);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList();
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_eGK_ObjSys_G2_1_PTV4_4_0_0("gemProdT_eGK_ObjSys_G2.1_PTV4.4.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(VSDM_A_2965, VSDM_A_2966, VSDM_A_2967, VSDM_A_2968, VSDM_A_2970, VSDM_A_2971, VSDM_A_2972, Card_G2_A_2861, Card_G2_A_2974, Card_G2_A_2975, Card_G2_A_2977, Card_G2_A_2978, Card_G2_A_3204,
                    Card_G2_A_2981, Card_G2_A_2982, Card_G2_A_2984, Card_G2_A_3237, Card_G2_A_2334, Card_G2_A_2857, Card_G2_A_2335_01, Card_G2_A_3596, Card_G2_A_2667, Card_G2_A_2337, Card_G2_A_2341, Card_G2_A_2342_01, Card_G2_A_2344,
                    Card_G2_A_3265, Card_G2_A_2345, Card_G2_A_3597, Card_G2_A_2346_01, Card_G2_A_2985, Card_G2_A_2347, Card_G2_A_2351, Card_G2_A_2352, Card_G2_A_3205, Card_G2_A_3200, Card_G2_A_2359, Card_G2_A_2364_01, Card_G2_A_3598,
                    Card_G2_A_2367_01, Card_G2_A_2369_01, Card_G2_A_2371_01, Card_G2_A_3231, Card_G2_A_2372_01, Card_G2_A_2375_01, Card_G2_A_2408_01, Card_G2_A_2413_01, Card_G2_A_2417_01, Card_G2_A_2864_01, Card_G2_A_3236_01,
                    Card_G2_A_3247_01, Card_G2_A_3248_01, Card_G2_A_2377_01, Card_G2_A_2380_01, Card_G2_A_2986_01, Card_G2_A_2388, Card_G2_A_2389_01, Card_G2_A_2390_01, Card_G2_A_2391_01, Card_G2_A_2862, Card_G2_A_2394, Card_G2_A_2395_01,
                    Card_G2_A_2396_01, Card_G2_A_2397_01, Card_G2_A_2398_01, Card_G2_A_2399_01, Card_G2_A_2400_01, Card_G2_A_2401_01, Card_G2_A_2403_01, Card_G2_A_2404_01, Card_G2_A_2405_01, Card_G2_A_2406_01, Card_G2_A_2407_01,
                    Card_G2_A_2410_01, Card_G2_A_2411_01, Card_G2_A_2412_01, Card_G2_A_2415_01, Card_G2_A_2416_01, Card_G2_A_2418_01, Card_G2_A_3233_01, Card_G2_A_3234_01, Card_G2_A_3235_01, Card_G2_A_3240_01, Card_G2_A_3244_01,
                    Card_G2_A_3245_01, Card_G2_A_3246_01, Card_G2_A_3263_01, Card_G2_A_2420, Card_G2_A_2421_01, Card_G2_A_2424_01, Card_G2_A_2427_01, Card_G2_A_2434_01, Card_G2_A_2437_01, Card_G2_A_2440_01, Card_G2_A_2443_01,
                    Card_G2_A_2449_01, Card_G2_A_3603, Card_G2_A_3605, Card_G2_A_3607, Card_G2_A_3609, Card_G2_A_3611, Card_G2_A_3613, Card_G2_A_3615, Card_G2_A_3617, Card_G2_A_3202, Card_G2_A_2459, Card_G2_A_2460_01, Card_G2_A_2463_01,
                    Card_G2_A_2464_01, Card_G2_A_3619, Card_G2_A_3621, Card_G2_A_2232, Card_G2_A_3479, Card_G2_A_3480, Card_G2_A_3481, Card_G2_A_3482, Card_G2_A_3483, Card_G2_A_3484, Card_G2_A_3485, Card_G2_A_3486, Card_G2_A_3487,
                    Card_G2_A_3488, Card_G2_A_3489, Card_G2_A_3490, Card_G2_A_3491, Card_G2_A_3493, GS_A_3695, GS_A_3700, GS_A_5026, GS_A_5054, GS_A_5140, GS_A_4559);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6518, TIP1_A_6523, TIP1_A_6539, TIP1_A_6525, TIP1_A_6772, TIP1_A_6531, TIP1_A_6533, TIP1_A_6536, TIP1_A_6517, TIP1_A_6538, TIP1_A_6526, TIP1_A_6532, TIP1_A_6537, TIP1_A_6519,
                    TIP1_A_6529, TIP1_A_6524, TIP1_A_6535, Card_G2_A_3701, Card_G2_A_3242, Card_G2_A_2974, Card_G2_A_2978, Card_G2_A_2982, Card_G2_A_2334, Card_G2_A_2858, Card_G2_A_2336, Card_G2_A_2337, Card_G2_A_2341, Card_G2_A_2344,
                    Card_G2_A_3265, Card_G2_A_2346_01, Card_G2_A_2347, Card_G2_A_2352, Card_G2_A_3200, Card_G2_A_2364_01, Card_G2_A_2369_01, Card_G2_A_3231, Card_G2_A_2375_01, Card_G2_A_2413_01, Card_G2_A_2864_01, Card_G2_A_3247_01,
                    Card_G2_A_2377_01, Card_G2_A_2986_01, Card_G2_A_2390_01, Card_G2_A_2862, Card_G2_A_2395_01, Card_G2_A_2397_01, Card_G2_A_2399_01, Card_G2_A_2401_01, Card_G2_A_2404_01, Card_G2_A_2406_01, Card_G2_A_2410_01,
                    Card_G2_A_2412_01, Card_G2_A_2416_01, Card_G2_A_3233_01, Card_G2_A_3235_01, Card_G2_A_3244_01, Card_G2_A_3246_01, Card_G2_A_2420, Card_G2_A_2424_01, Card_G2_A_2434_01, Card_G2_A_2440_01, Card_G2_A_2449_01,
                    Card_G2_A_3605, Card_G2_A_3609, Card_G2_A_3613, Card_G2_A_3617, Card_G2_A_2459, Card_G2_A_2463_01, Card_G2_A_3619, Card_G2_A_3595, Card_G2_A_2977, Card_G2_A_2333, Card_G2_A_2335_01, Card_G2_A_3242, Card_G2_A_3180,
                    Card_G2_A_2985, Card_G2_A_3205, Card_G2_A_2367_01, Card_G2_A_2372_01, Card_G2_A_2417_01, Card_G2_A_3248_01, Card_G2_A_2388, Card_G2_A_2394, Card_G2_A_2398_01, Card_G2_A_2403_01, Card_G2_A_2407_01, Card_G2_A_2415_01,
                    Card_G2_A_3234_01, Card_G2_A_3245_01, Card_G2_A_2421_01, Card_G2_A_2437_01, Card_G2_A_3603, Card_G2_A_3611, Card_G2_A_3202, Card_G2_A_2464_01, GS_A_3697, GS_A_5038, GS_A_3695, GS_A_3700, GS_A_5140, GS_A_4542, GS_A_3696,
                    GS_A_4559, GS_A_5039, GS_A_5026, Card_G2_A_3204, Card_G2_A_2667, Card_G2_A_2345, Card_G2_A_2359, Card_G2_A_2408_01, Card_G2_A_2380_01, Card_G2_A_2396_01, Card_G2_A_2405_01, Card_G2_A_2418_01, Card_G2_A_3263_01,
                    Card_G2_A_2443_01, Card_G2_A_3615, Card_G2_A_3621, Card_G2_A_2857, Card_G2_A_2351, Card_G2_A_3236_01, Card_G2_A_2391_01, Card_G2_A_2411_01, Card_G2_A_2427_01, Card_G2_A_2460_01, Card_G2_A_2342_01, Card_G2_A_2400_01,
                    Card_G2_A_3607, Card_G2_A_2371_01, Card_G2_A_3240_01, Card_G2_A_2315, Card_G2_A_2317, Card_G2_A_2230, Card_G2_A_2309, Card_G2_A_2311, Card_G2_A_2313, Card_G2_A_2315, Card_G2_A_2317, Card_G2_A_2316, Card_G2_A_2231,
                    Card_G2_A_2312, Card_G2_A_2316, Card_G2_A_2318, Card_G2_A_2310, Card_G2_A_2318, Card_G2_A_3479, Card_G2_A_3481, Card_G2_A_3483, Card_G2_A_3485, Card_G2_A_3487, Card_G2_A_3489, Card_G2_A_3491, Card_G2_A_3480,
                    Card_G2_A_3484, Card_G2_A_3488, Card_G2_A_3493, Card_G2_A_3482, Card_G2_A_3490, Card_G2_A_3486, GS_A_4362, GS_A_4366, GS_A_4368, GS_A_4380, GS_A_4365, GS_A_5021, GS_A_4367, GS_A_4381, GS_A_2524, GS_A_2354, GS_A_2525,
                    GS_A_2350, Card_G2_A_2314);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_eGK_Sich_G2_1_PTV4_3_0_0("gemProdT_eGK_Sich_G2.1_PTV4.3.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList();
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(GS_A_5115, GS_A_5117, GS_A_5119, GS_A_5121, GS_A_5116, GS_A_5120, GS_A_5118, TIP1_A_2579, TIP1_A_2582, TIP1_A_4222, TIP1_A_2591, TIP1_A_2580, TIP1_A_2590, TIP1_A_2583, GS_A_4473, GS_A_4475,
                    GS_A_4474, GS_A_4479, Card_G2_A_3335_01, GS_A_4523, GS_A_4528, GS_A_4524, GS_A_4529, GS_A_4362, GS_A_4366, GS_A_4368, GS_A_5386, GS_A_4381, GS_A_4386, GS_A_5035, GS_A_4391, GS_A_4365, GS_A_5021, GS_A_4385, GS_A_4384,
                    GS_A_4367, GS_A_4387, GS_A_4380, GS_A_4392, GS_A_2229, GS_A_2228, GS_A_2239, GS_A_2235, GS_A_2237, GS_A_2238, GS_A_2240, GS_A_2244, GS_A_2247, GS_A_2249, GS_A_2253, GS_A_2255, GS_A_2260, GS_A_2264, GS_A_2270, GS_A_2274,
                    GS_A_2277, GS_A_2285, GS_A_2287, GS_A_2291, GS_A_2295, GS_A_2227, GS_A_2234, GS_A_2230, GS_A_2242, GS_A_2248, GS_A_2254, GS_A_2261, GS_A_2271, GS_A_2284, GS_A_2252, GS_A_2232, GS_A_5209, GS_A_2250, GS_A_2266, GS_A_5085,
                    GS_A_2236, GS_A_2256, GS_A_2292, GS_A_2246, GS_A_2276, GS_A_4578, GS_A_4580, GS_A_4579, GS_A_3760, GS_A_4981, GS_A_4983, GS_A_3784, GS_A_3747, GS_A_3772, GS_A_4980, GS_A_4984, GS_A_3753, GS_A_4982, GS_A_3756, GS_A_3737,
                    GS_A_2087, GS_A_2076, GS_A_2177, GS_A_2021, GS_A_4944, GS_A_4946, GS_A_2047, GS_A_2326, GS_A_2329, GS_A_2331, GS_A_2345, GS_A_2356, GS_A_2359, GS_A_2363, GS_A_2524, GS_A_2354, GS_A_5387, GS_A_2213, GS_A_2012, GS_A_4945,
                    GS_A_2309, GS_A_2330, GS_A_2347, GS_A_2361, GS_A_2525, GS_A_2174, GS_A_4947, GS_A_2332, GS_A_2366, GS_A_2046, GS_A_2357, GS_A_2328, GS_A_2350);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }
    },

    // Zentrale Dienste
    //
    gemProdT_ZentrNetz_PTV1_5_3_0("gemProdT_ZentrNetz_PTV1.5.3-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4832, GS_A_4013, GS_A_4024, GS_A_4033, GS_A_4765, GS_A_4044, GS_A_4045, GS_A_4767, GS_A_4043, GS_A_4048, GS_A_4050, GS_A_4051, GS_A_4770, GS_A_4771, GS_A_4889, GS_A_4890, GS_A_4052, GS_A_4053,
                    GS_A_4054, GS_A_4779, GS_A_4058, GS_A_4884, GS_A_5076, GS_A_4783, GS_A_4785, GS_A_4881, GS_A_4882, GS_A_4883, GS_A_4790, GS_A_4795, GS_A_4796, GS_A_4798, GS_A_4801, GS_A_4809, GS_A_3932, GS_A_3834, GS_A_3842, GS_A_3835,
                    GS_A_3931, GS_A_3839, GS_A_3832, GS_A_3833, GS_A_3840, GS_A_4817, GS_A_3934, GS_A_4821, GS_A_3939, GS_A_3946, GS_A_3695, GS_A_3696, GS_A_5025, GS_A_5054, GS_A_5038, GS_A_3702, GS_A_4543, GS_A_4545, GS_A_3804, GS_A_3807,
                    GS_A_3805, GS_A_3806, GS_A_4146, GS_A_4147, GS_A_4148, GS_A_4149, GS_A_4145, GS_A_4166, GS_A_4167, GS_A_4347, GS_A_4637, GS_A_4829, GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648, GS_A_4649, GS_A_4650,
                    GS_A_4651, GS_A_4898, GS_A_4899, GS_A_4652, GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4660, GS_A_4749, GS_A_4661, GS_A_4662, GS_A_4663, GS_A_5077, GS_A_4751, GS_A_4957, TIP1_A_5993, TIP1_A_5996,
                    TIP1_A_5998, TIP1_A_5997, TIP1_A_6002);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_2805, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529,
                    TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_4009, GS_A_4831, GS_A_4010, GS_A_4011, GS_A_4012, GS_A_4833, GS_A_4016, GS_A_4017, GS_A_4834, GS_A_4022, GS_A_4023, GS_A_4754, GS_A_4026,
                    GS_A_4756, GS_A_4758, GS_A_4029, GS_A_4850, GS_A_4851, GS_A_4037, GS_A_4048, GS_A_4050, GS_A_4051, GS_A_4770, GS_A_4771, GS_A_4890, GS_A_4053, GS_A_4054, GS_A_4057, GS_A_4778, GS_A_4846, GS_A_4064, GS_A_4065, GS_A_4780,
                    GS_A_4068, GS_A_4781, GS_A_4782, GS_A_4784, GS_A_4785, GS_A_4786, GS_A_4787, GS_A_4788, GS_A_4789, GS_A_4880, GS_A_4882, GS_A_4883, GS_A_4790, GS_A_4791, GS_A_4792, GS_A_4797, GS_A_4799, GS_A_4800, GS_A_4804, GS_A_4895,
                    GS_A_4806, GS_A_4807, GS_A_3824, GS_A_4810, GS_A_3931, GS_A_3839, GS_A_4820, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5039, GS_A_3813, GS_A_5018, GS_A_5033, GS_A_4149, GS_A_4156, GS_A_4353, GS_A_5028, GS_A_3055,
                    GS_A_3058, GS_A_5014, GS_A_4640, TIP1_A_5994, TIP1_A_5995, TIP1_A_6003, TIP1_A_5999, GS_A_4435, GS_A_4437, GS_A_4451, GS_A_4453, GS_A_4473, GS_A_4474, GS_A_4475, GS_A_4480, GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537,
                    GS_A_4539, GS_A_4359, GS_A_4367, GS_A_4368, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322, GS_A_4388, GS_A_4052, GS_A_4053, GS_A_4054, GS_A_4057, GS_A_4777, GS_A_4778, GS_A_4779, GS_A_4846, GS_A_4883,
                    GS_A_3839, GS_A_4817, GS_A_4641, GS_A_4748, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2214, GS_A_2065, GS_A_2087, GS_A_2213, GS_A_2076,
                    GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343,
                    GS_A_2345, GS_A_2347, GS_A_2360, GS_A_2361, GS_A_2362, GS_A_2363, GS_A_2366, GS_A_4436, GS_A_4448, GS_A_4449, GS_A_4450, GS_A_4455, GS_A_4456, GS_A_4457, GS_A_4458, GS_A_4459, GS_A_4460, GS_A_4461, GS_A_4462, GS_A_4463,
                    GS_A_4464, GS_A_4465, GS_A_4466, GS_A_4467, GS_A_4468, GS_A_4470, GS_A_4471, GS_A_4476, GS_A_4477, GS_A_4478, GS_A_4479, GS_A_4481, GS_A_4482, GS_A_4504, GS_A_4506, GS_A_4507, GS_A_4508, GS_A_4509, GS_A_4511, GS_A_4512,
                    GS_A_4513, GS_A_4514, GS_A_4515, GS_A_4516, GS_A_4517, GS_A_4518, GS_A_4519, GS_A_4520, GS_A_4521, GS_A_4522, GS_A_4523, GS_A_4524, GS_A_4525, GS_A_4526, GS_A_4527, GS_A_4528, GS_A_4530, GS_A_4531, GS_A_4532, GS_A_4533,
                    GS_A_4534, GS_A_4535, GS_A_4538, GS_A_4540, GS_A_3784, GS_A_5324, GS_A_2355, GS_A_2356, GS_A_2357, GS_A_2359);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_ZeitD_PTV1_5_1_0("gemProdT_ZeitD_PTV1.5.1-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4832, GS_A_4013, GS_A_4024, GS_A_4033, GS_A_4036, GS_A_4763, GS_A_4809, GS_A_3932, GS_A_3834, GS_A_3842, GS_A_3835, GS_A_3931, GS_A_3839, GS_A_3832, GS_A_3833, GS_A_3840, GS_A_4817, GS_A_3940,
                    GS_A_3933, GS_A_3935, GS_A_3936, GS_A_3938, GS_A_3945, GS_A_4074, GS_A_3934, GS_A_4823, GS_A_4824, GS_A_4825, GS_A_4826, GS_A_4827, GS_A_3695, GS_A_3696, GS_A_5025, GS_A_5054, GS_A_5038, GS_A_3702, GS_A_4543, GS_A_4545,
                    GS_A_3804, GS_A_3807, GS_A_3805, GS_A_3806, GS_A_4146, GS_A_4147, GS_A_4148, GS_A_4149, GS_A_4145, GS_A_4163, GS_A_4637, GS_A_4829, GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648, GS_A_4649, GS_A_4650,
                    GS_A_4651, GS_A_4898, GS_A_4899, GS_A_4652, GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4660, GS_A_4749, GS_A_4661, GS_A_4662, GS_A_4663, GS_A_5077, GS_A_4751, GS_A_4957, TIP1_A_5993, TIP1_A_5996,
                    TIP1_A_5998, TIP1_A_5997, TIP1_A_6002);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_2805, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529,
                    TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_5542, GS_A_5526, GS_A_4009, GS_A_4831, GS_A_4010, GS_A_4011, GS_A_4012, GS_A_4018, GS_A_4027, GS_A_4759, GS_A_4805, GS_A_3824, GS_A_4810,
                    GS_A_3931, GS_A_3839, GS_A_4822, GS_A_4824, GS_A_4826, GS_A_4827, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5039, GS_A_3813, GS_A_5018, GS_A_5033, GS_A_4149, GS_A_3055, GS_A_3058, GS_A_4165, GS_A_4640,
                    TIP1_A_5994, TIP1_A_5995, TIP1_A_6003, TIP1_A_5999, GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537, GS_A_4539, GS_A_4359, GS_A_4367, GS_A_4368, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322, GS_A_4062,
                    GS_A_3839, GS_A_4817, GS_A_4641, GS_A_4748, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945,
                    GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343, GS_A_2345, GS_A_2347, GS_A_2360, GS_A_2361, GS_A_2362, GS_A_2363, GS_A_2366,
                    GS_A_4504, GS_A_4506, GS_A_4507, GS_A_4508, GS_A_4509, GS_A_4511, GS_A_4512, GS_A_4513, GS_A_4514, GS_A_4515, GS_A_4516, GS_A_4517, GS_A_4518, GS_A_4519, GS_A_4520, GS_A_4521, GS_A_4522, GS_A_4523, GS_A_4524, GS_A_4525,
                    GS_A_4526, GS_A_4527, GS_A_4528, GS_A_4530, GS_A_4531, GS_A_4532, GS_A_4533, GS_A_4534, GS_A_4535, GS_A_4538, GS_A_4540, GS_A_5541, GS_A_5526, GS_A_3784, GS_A_5324, GS_A_2355, GS_A_2356, GS_A_2357, GS_A_2359);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_VZD_PTV1_2_2_0("gemProdT_VZD_PTV1.2.2-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5339, GS_A_5482, GS_A_4832, GS_A_4013, GS_A_4024, GS_A_4033, GS_A_4036, GS_A_4763, GS_A_4809, GS_A_3932, GS_A_3834, GS_A_3842, GS_A_3930,
                    GS_A_3835, GS_A_3931, GS_A_3839, GS_A_3832, GS_A_3833, GS_A_3840, GS_A_4817, GS_A_3938, GS_A_3934, GS_A_3937, GS_A_3939, GS_A_3946, GS_A_3695, GS_A_3696, GS_A_5025, GS_A_5054, GS_A_5038, GS_A_3702, GS_A_4543, GS_A_4545,
                    GS_A_3856, GS_A_4547, GS_A_3801, GS_A_3796, GS_A_3813, GS_A_3816, GS_A_3804, GS_A_3807, GS_A_3805, GS_A_3806, GS_A_4146, GS_A_4147, GS_A_4148, GS_A_4149, GS_A_4145, GS_A_5331, GS_A_5135, GS_A_4637, GS_A_4829, GS_A_4642,
                    GS_A_4643, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4651, GS_A_4898, GS_A_4899, GS_A_4652, GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4660, GS_A_4749, GS_A_4661, GS_A_4662,
                    GS_A_4663, GS_A_5077, GS_A_4751, GS_A_4957, GS_A_5215, TIP1_A_5993, TIP1_A_5996, TIP1_A_5998, TIP1_A_5997, TIP1_A_6002, TIP1_A_5120, TIP1_A_5547, TIP1_A_5548, TIP1_A_5550, TIP1_A_5552, TIP1_A_5555, TIP1_A_5561,
                    TIP1_A_5562, TIP1_A_5620, TIP1_A_5567, TIP1_A_5569, TIP1_A_5570, TIP1_A_5572, TIP1_A_5574, TIP1_A_5575, TIP1_A_5577, TIP1_A_5579, TIP1_A_5581, TIP1_A_5584, TIP1_A_5585, TIP1_A_5586, TIP1_A_5590, TIP1_A_5591, TIP1_A_5593,
                    TIP1_A_5594, TIP1_A_5595, TIP1_A_5596, TIP1_A_5597, TIP1_A_5598, TIP1_A_5599, TIP1_A_5600, TIP1_A_5602, TIP1_A_5603);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_4929, TIP1_A_5052, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_2805, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526,
                    TIP1_A_6772, TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_5542, GS_A_5526, GS_A_4009, GS_A_4831, GS_A_4010, GS_A_4011, GS_A_4012, GS_A_4018, GS_A_4027, GS_A_4759,
                    GS_A_4805, GS_A_3824, GS_A_3930, GS_A_3931, GS_A_3839, GS_A_5089, GS_A_4820, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5039, GS_A_3813, GS_A_5018, GS_A_5033, GS_A_4149, GS_A_4155, GS_A_5028, GS_A_3055, GS_A_3058,
                    GS_A_4640, TIP1_A_5994, TIP1_A_5995, TIP1_A_6003, TIP1_A_5999, TIP1_A_5546, TIP1_A_5549, TIP1_A_5551, TIP1_A_5556, TIP1_A_5557, TIP1_A_5610, TIP1_A_5611, TIP1_A_5560, TIP1_A_5563, TIP1_A_5564, TIP1_A_5565, TIP1_A_5568,
                    TIP1_A_5571, TIP1_A_5583, TIP1_A_5587, TIP1_A_5604, TIP1_A_5605, TIP1_A_5606, TIP1_A_5612, TIP1_A_5613, TIP1_A_5607, TIP1_A_5608, GS_A_4330, GS_A_4435, GS_A_4437, GS_A_4451, GS_A_4453, GS_A_4473, GS_A_4474, GS_A_4475,
                    GS_A_4480, GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537, GS_A_4539, GS_A_4359, GS_A_4367, GS_A_4368, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322, GS_A_5339, GS_A_5482, GS_A_4388, GS_A_3839, GS_A_5089,
                    GS_A_4817, GS_A_4641, GS_A_4748, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2214, GS_A_2065, GS_A_2087, GS_A_2213, GS_A_2076, GS_A_2174,
                    GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343, GS_A_2345,
                    GS_A_2347, GS_A_2360, GS_A_2361, GS_A_2362, GS_A_2363, GS_A_2366, TIP1_A_5553, TIP1_A_5554, TIP1_A_5558, GS_A_4436, GS_A_4448, GS_A_4449, GS_A_4450, GS_A_4455, GS_A_4456, GS_A_4457, GS_A_4458, GS_A_4459, GS_A_4460,
                    GS_A_4461, GS_A_4462, GS_A_4463, GS_A_4464, GS_A_4465, GS_A_4466, GS_A_4467, GS_A_4468, GS_A_4470, GS_A_4471, GS_A_4476, GS_A_4477, GS_A_4478, GS_A_4479, GS_A_4481, GS_A_4482, GS_A_4504, GS_A_4506, GS_A_4507, GS_A_4508,
                    GS_A_4509, GS_A_4511, GS_A_4512, GS_A_4513, GS_A_4514, GS_A_4515, GS_A_4516, GS_A_4517, GS_A_4518, GS_A_4519, GS_A_4520, GS_A_4521, GS_A_4522, GS_A_4523, GS_A_4524, GS_A_4525, GS_A_4526, GS_A_4527, GS_A_4528, GS_A_4530,
                    GS_A_4531, GS_A_4532, GS_A_4533, GS_A_4534, GS_A_4535, GS_A_4538, GS_A_4540, GS_A_5541, GS_A_5526, GS_A_4720, GS_A_3784, GS_A_5324, GS_A_2355, GS_A_2356, GS_A_2357, GS_A_2359);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_VPN_ZugD_PTV1_7_1_0("gemProdT_VPN_ZugD_PTV1.7.1-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4384, GS_A_5339, GS_A_4832, GS_A_4013, GS_A_4024, GS_A_4033, GS_A_4036, GS_A_4763, GS_A_4765, GS_A_4048, GS_A_4840, GS_A_4054, GS_A_4779, GS_A_4070, GS_A_4884, GS_A_4809, GS_A_3932, GS_A_3834,
                    GS_A_3842, GS_A_3930, GS_A_3835, GS_A_3931, GS_A_3839, GS_A_4879, GS_A_3832, GS_A_3833, GS_A_3840, GS_A_4817, GS_A_4847, GS_A_3933, GS_A_3935, GS_A_3936, GS_A_3938, GS_A_3945, GS_A_4074, GS_A_3934, GS_A_3937, GS_A_3939,
                    GS_A_3946, GS_A_3695, GS_A_3696, GS_A_5025, GS_A_5054, GS_A_5038, GS_A_3702, GS_A_4543, GS_A_4545, GS_A_3856, GS_A_4547, GS_A_3801, GS_A_3796, GS_A_3816, GS_A_3804, GS_A_3807, GS_A_3805, GS_A_3806, GS_A_4146, GS_A_4147,
                    GS_A_4148, GS_A_4149, GS_A_5523, GS_A_4145, GS_A_5331, GS_A_4162, GS_A_4163, GS_A_4168, GS_A_4170, GS_A_4728, GS_A_4729, GS_A_4637, GS_A_4829, GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648, GS_A_4649,
                    GS_A_4650, GS_A_4651, GS_A_4898, GS_A_4899, GS_A_4652, GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4660, GS_A_4749, GS_A_4661, GS_A_4662, GS_A_4663, GS_A_5077, GS_A_4751, GS_A_4957, GS_A_5215,
                    TIP1_A_5993, TIP1_A_5996, TIP1_A_5998, TIP1_A_5997, TIP1_A_6002, TIP1_A_5120, TIP1_A_4282, TIP1_A_4285, TIP1_A_4288, TIP1_A_4289, TIP1_A_4290, TIP1_A_4291, TIP1_A_5451, TIP1_A_4292, TIP1_A_4473, TIP1_A_4286, TIP1_A_4287,
                    TIP1_A_4293, TIP1_A_4300, TIP1_A_4475, TIP1_A_4301, TIP1_A_4476, TIP1_A_4302, TIP1_A_4303, TIP1_A_4305, TIP1_A_4306, TIP1_A_4309, TIP1_A_5713, TIP1_A_4315, TIP1_A_4321, TIP1_A_5709, TIP1_A_5711, TIP1_A_4322, TIP1_A_4325,
                    TIP1_A_5117, TIP1_A_4328, TIP1_A_4479, TIP1_A_4330, TIP1_A_4334, TIP1_A_4481, TIP1_A_4340, TIP1_A_4345, TIP1_A_4347, TIP1_A_4348, TIP1_A_5155, TIP1_A_4482, TIP1_A_5389, TIP1_A_5390, TIP1_A_5391, TIP1_A_4350, TIP1_A_4351,
                    TIP1_A_4352, TIP1_A_4353, TIP1_A_4354, TIP1_A_4355, TIP1_A_4356, TIP1_A_4357, TIP1_A_4484, TIP1_A_4485, TIP1_A_6748, TIP1_A_4486, TIP1_A_4487, TIP1_A_4364, TIP1_A_4367, TIP1_A_4490, TIP1_A_4368, TIP1_A_4371, TIP1_A_4372,
                    TIP1_A_4492, TIP1_A_4389, TIP1_A_4395, TIP1_A_4396, TIP1_A_4398, TIP1_A_4390, TIP1_A_4391, TIP1_A_4392, TIP1_A_4491);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_4929, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_2805, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772,
                    TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_5542, GS_A_5526, GS_A_4009, GS_A_4831, GS_A_4010, GS_A_4011, GS_A_4012, GS_A_4018, GS_A_4027, GS_A_4759, GS_A_4037,
                    GS_A_4841, GS_A_4053, GS_A_4054, GS_A_4057, GS_A_4778, GS_A_4061, GS_A_4066, GS_A_4067, GS_A_4069, GS_A_4805, GS_A_3824, GS_A_3928, GS_A_3930, GS_A_4810, GS_A_3931, GS_A_3839, GS_A_4879, GS_A_5089, GS_A_4847, GS_A_5037,
                    GS_A_3941, GS_A_4820, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5039, GS_A_3813, GS_A_5018, GS_A_5033, GS_A_4149, GS_A_4155, GS_A_5028, GS_A_3055, GS_A_3058, GS_A_4165, GS_A_5015, GS_A_4640, TIP1_A_5994,
                    TIP1_A_5995, TIP1_A_6003, TIP1_A_5999, TIP1_A_4277, TIP1_A_4278, TIP1_A_4279, TIP1_A_5418, TIP1_A_4281, TIP1_A_4282, TIP1_A_4284, TIP1_A_4285, TIP1_A_4288, TIP1_A_4289, TIP1_A_4472, TIP1_A_4290, TIP1_A_4291, TIP1_A_4286,
                    TIP1_A_4287, TIP1_A_4293, TIP1_A_4474, TIP1_A_4294, TIP1_A_4295, TIP1_A_4296, TIP1_A_4297, TIP1_A_4302, TIP1_A_4303, TIP1_A_5103, TIP1_A_4305, TIP1_A_4306, TIP1_A_4307, TIP1_A_5104, TIP1_A_4308, TIP1_A_4309, TIP1_A_4310,
                    TIP1_A_4311, TIP1_A_4312, TIP1_A_4314, TIP1_A_4315, TIP1_A_4316, TIP1_A_4317, TIP1_A_4318, TIP1_A_4319, TIP1_A_5710, TIP1_A_5712, TIP1_A_4323, TIP1_A_4326, TIP1_A_4327, TIP1_A_4477, TIP1_A_4478, TIP1_A_4328, TIP1_A_4331,
                    TIP1_A_4332, TIP1_A_4480, TIP1_A_4334, TIP1_A_4335, TIP1_A_4481, TIP1_A_5046, TIP1_A_5047, TIP1_A_5048, TIP1_A_4337, TIP1_A_4338, TIP1_A_4339, TIP1_A_4341, TIP1_A_4344, TIP1_A_4346, TIP1_A_5156, TIP1_A_4482, TIP1_A_4349,
                    TIP1_A_4488, TIP1_A_4489, TIP1_A_4369, TIP1_A_4370, TIP1_A_4387, TIP1_A_4394, TIP1_A_5118, TIP1_A_4495, TIP1_A_4399, TIP1_A_4498, TIP1_A_5105, GS_A_4330, GS_A_4435, GS_A_4437, GS_A_4451, GS_A_4453, GS_A_4473, GS_A_4474,
                    GS_A_4475, GS_A_4480, GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537, GS_A_4539, GS_A_4359, GS_A_4360, GS_A_4367, GS_A_4368, GS_A_4382, GS_A_4383, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322, GS_A_5339,
                    GS_A_4388, GS_A_4057, GS_A_4777, GS_A_4778, GS_A_4062, GS_A_3839, GS_A_4879, GS_A_3841, GS_A_5089, GS_A_4817, GS_A_4847, GS_A_5037, GS_A_4808, GS_A_4641, GS_A_4748, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983,
                    GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2214, GS_A_2065, GS_A_2087, GS_A_2213, GS_A_2076, GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947,
                    GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343, GS_A_2345, GS_A_2347, GS_A_2360, GS_A_2361, GS_A_2362, GS_A_2363, GS_A_2366, TIP1_A_4277,
                    TIP1_A_4292, TIP1_A_4481, TIP1_A_5046, TIP1_A_5047, TIP1_A_5048, TIP1_A_4337, TIP1_A_4338, TIP1_A_4339, TIP1_A_4340, TIP1_A_4341, TIP1_A_4344, TIP1_A_4345, TIP1_A_4346, TIP1_A_4347, TIP1_A_4348, TIP1_A_5155, TIP1_A_5156,
                    TIP1_A_4482, TIP1_A_4371, TIP1_A_4495, TIP1_A_5074, TIP1_A_4497, GS_A_4436, GS_A_4448, GS_A_4449, GS_A_4450, GS_A_4455, GS_A_4456, GS_A_4457, GS_A_4458, GS_A_4459, GS_A_4460, GS_A_4461, GS_A_4462, GS_A_4463, GS_A_4464,
                    GS_A_4465, GS_A_4466, GS_A_4467, GS_A_4468, GS_A_4470, GS_A_4471, GS_A_4476, GS_A_4477, GS_A_4478, GS_A_4479, GS_A_4481, GS_A_4482, GS_A_4504, GS_A_4506, GS_A_4507, GS_A_4508, GS_A_4509, GS_A_4511, GS_A_4512, GS_A_4513,
                    GS_A_4514, GS_A_4515, GS_A_4516, GS_A_4517, GS_A_4518, GS_A_4519, GS_A_4520, GS_A_4521, GS_A_4522, GS_A_4523, GS_A_4524, GS_A_4525, GS_A_4526, GS_A_4527, GS_A_4528, GS_A_4530, GS_A_4531, GS_A_4532, GS_A_4533, GS_A_4534,
                    GS_A_4535, GS_A_4538, GS_A_4540, GS_A_5541, GS_A_5526, GS_A_4720, GS_A_3784, GS_A_5324, GS_A_2355, GS_A_2356, GS_A_2357, GS_A_2359);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_TSL_PTV1_7_0_1("gemProdT_TSL_PTV1.7.0-1") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4386, GS_A_4384, GS_A_5339, GS_A_5131, GS_A_5340, GS_A_4832, GS_A_4013, GS_A_4024, GS_A_4033, GS_A_4036, GS_A_4763, GS_A_4054, GS_A_3932, GS_A_3834, GS_A_3842, GS_A_3931, GS_A_4879, GS_A_3832,
                    GS_A_3833, GS_A_3840, GS_A_4817, GS_A_3934, GS_A_3937, GS_A_3939, GS_A_3946, GS_A_4444, GS_A_4447, GS_A_3695, GS_A_3696, GS_A_5025, GS_A_5038, GS_A_3702, GS_A_4543, GS_A_4545, GS_A_3804, GS_A_3807, GS_A_3805, GS_A_3806,
                    GS_A_4146, GS_A_4147, GS_A_4148, GS_A_4149, GS_A_4145, GS_A_5331, GS_A_4854, GS_A_4159, GS_A_4160, GS_A_4714, GS_A_4715, GS_A_4716, GS_A_4589, GS_A_4590, GS_A_4745, GS_A_4746, GS_A_4747, GS_A_4637, GS_A_4829, GS_A_4642,
                    GS_A_4643, GS_A_4644, GS_A_4645, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4651, GS_A_4897, GS_A_4898, GS_A_4899, GS_A_4652, GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4660,
                    GS_A_4749, GS_A_4661, GS_A_4662, GS_A_4663, GS_A_5077, GS_A_4751, GS_A_4669, GS_A_4674, GS_A_4957, GS_A_4676, GS_A_4677, GS_A_4678, GS_A_5517, GS_A_4684, GS_A_4686, GS_A_4687, GS_A_4688, GS_A_4690, GS_A_4691, GS_A_4692,
                    GS_A_5090, GS_A_4693, GS_A_4694, TIP1_A_5993, TIP1_A_5996, TIP1_A_5998, TIP1_A_5997, TIP1_A_6002, TIP1_A_3994, TIP1_A_4016, TIP1_A_4027, TIP1_A_4030, TIP1_A_4031, TIP1_A_4032, TIP1_A_4034, TIP1_A_4035, TIP1_A_4038,
                    TIP1_A_4438, TIP1_A_4443, TIP1_A_4444, TIP1_A_4445, TIP1_A_4060, TIP1_A_5119, TIP1_A_4056, TIP1_A_4057, TIP1_A_4058, TIP1_A_4059, TIP1_A_4062, TIP1_A_4063, TIP1_A_4064, TIP1_A_4065, TIP1_A_6768, TIP1_A_6750, TIP1_A_6751,
                    TIP1_A_6752, TIP1_A_6753, TIP1_A_6754, TIP1_A_6755, TIP1_A_6756, TIP1_A_4067, TIP1_A_4068, TIP1_A_4069, TIP1_A_4070, TIP1_A_4072, TIP1_A_4073, TIP1_A_4074, TIP1_A_4447, TIP1_A_6760, TIP1_A_4076, TIP1_A_4449, TIP1_A_4081,
                    TIP1_A_4082, TIP1_A_5121, TIP1_A_4083, TIP1_A_4084, TIP1_A_4085, TIP1_A_4086, TIP1_A_4087, TIP1_A_4088, TIP1_A_4089, TIP1_A_4090, TIP1_A_4091, TIP1_A_4092, TIP1_A_4093, TIP1_A_4094, TIP1_A_4095, TIP1_A_4096, TIP1_A_4097,
                    TIP1_A_4098, TIP1_A_4099, TIP1_A_4100, TIP1_A_4102, TIP1_A_4103, TIP1_A_4104, TIP1_A_4105, TIP1_A_4106, TIP1_A_4107, TIP1_A_4108, TIP1_A_4110, TIP1_A_6761, TIP1_A_6762, TIP1_A_6763, TIP1_A_6764, TIP1_A_6765, TIP1_A_6766,
                    TIP1_A_6767, TIP1_A_5122, TIP1_A_5123, TIP1_A_5124, TIP1_A_5125, TIP1_A_5126, TIP1_A_5128, TIP1_A_5963, TIP1_A_5964, TIP1_A_5965, TIP1_A_5966, TIP1_A_5967, TIP1_A_4111, TIP1_A_4112, TIP1_A_4113, TIP1_A_4114);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_5052, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_2805, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772,
                    TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_5542, GS_A_5526, GS_A_4009, GS_A_4831, GS_A_4010, GS_A_4011, GS_A_4012, GS_A_4018, GS_A_4027, GS_A_4759, GS_A_4805,
                    GS_A_3824, GS_A_3931, GS_A_4817, GS_A_4820, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5039, GS_A_3813, GS_A_5018, GS_A_5033, GS_A_4149, GS_A_3055, GS_A_3058, GS_A_4158, GS_A_4257, GS_A_4703, GS_A_4704, GS_A_4727,
                    GS_A_4588, GS_A_4738, GS_A_4739, GS_A_5514, GS_A_4742, GS_A_4743, GS_A_4744, GS_A_4918, GS_A_4640, GS_A_5214, GS_A_4670, GS_A_4679, GS_A_4685, GS_A_4689, TIP1_A_5994, TIP1_A_5995, TIP1_A_6003, TIP1_A_5999, TIP1_A_3949,
                    TIP1_A_3950, TIP1_A_3951, TIP1_A_3953, TIP1_A_3954, TIP1_A_3955, TIP1_A_3956, TIP1_A_5782, TIP1_A_3958, TIP1_A_3959, TIP1_A_3960, TIP1_A_3961, TIP1_A_3962, TIP1_A_3964, TIP1_A_3970, TIP1_A_3972, TIP1_A_3973, TIP1_A_3974,
                    TIP1_A_3975, TIP1_A_3977, TIP1_A_3982, TIP1_A_3984, TIP1_A_3989, TIP1_A_3991, TIP1_A_3992, TIP1_A_3994, TIP1_A_4011, TIP1_A_4435, TIP1_A_4028, TIP1_A_4036, TIP1_A_4037, TIP1_A_4039, TIP1_A_4042, TIP1_A_4043, TIP1_A_4044,
                    TIP1_A_4851, TIP1_A_4045, TIP1_A_4046, TIP1_A_4439, TIP1_A_4049, TIP1_A_4440, TIP1_A_4050, TIP1_A_4441, TIP1_A_4442, TIP1_A_4051, TIP1_A_4052, TIP1_A_4053, TIP1_A_4054, TIP1_A_4852, TIP1_A_4055, TIP1_A_4066, TIP1_A_4070,
                    TIP1_A_4074, TIP1_A_4075, TIP1_A_4448, TIP1_A_6759, TIP1_A_4077, TIP1_A_4078, TIP1_A_4079, TIP1_A_4109, TIP1_A_5990, GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537, GS_A_4539, GS_A_4357, GS_A_4358, GS_A_4359, GS_A_4361,
                    GS_A_4367, GS_A_4368, GS_A_4370, GS_A_4371, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322, GS_A_5339, GS_A_4388, GS_A_4393, GS_A_5131, GS_A_5079, GS_A_5340, GS_A_4054, GS_A_4062, GS_A_4879, GS_A_4641,
                    GS_A_4748, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047,
                    GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343, GS_A_2345, GS_A_2347, GS_A_2360, GS_A_2361, GS_A_2362, GS_A_2363, GS_A_2366, GS_A_3078, GS_A_3125, GS_A_3130,
                    GS_A_3139, GS_A_3141, GS_A_3149, TIP1_A_3954, TIP1_A_3955, TIP1_A_3957, TIP1_A_3958, TIP1_A_3959, TIP1_A_3960, TIP1_A_3962, TIP1_A_3963, TIP1_A_3967, TIP1_A_3968, TIP1_A_3969, TIP1_A_5382, TIP1_A_3971, TIP1_A_3972,
                    TIP1_A_3974, TIP1_A_3975, TIP1_A_3976, TIP1_A_3977, TIP1_A_3978, TIP1_A_3979, TIP1_A_3980, TIP1_A_3981, TIP1_A_3982, TIP1_A_3983, TIP1_A_3984, TIP1_A_3985, TIP1_A_3986, TIP1_A_3987, TIP1_A_3988, TIP1_A_3990, TIP1_A_3993,
                    TIP1_A_3995, TIP1_A_3996, TIP1_A_3997, TIP1_A_3998, TIP1_A_3999, TIP1_A_4000, TIP1_A_4001, TIP1_A_4002, TIP1_A_4003, TIP1_A_4005, TIP1_A_4006, TIP1_A_4007, TIP1_A_4008, TIP1_A_4010, TIP1_A_4012, TIP1_A_4016, TIP1_A_4017,
                    TIP1_A_4018, TIP1_A_4019, TIP1_A_4026, TIP1_A_4439, TIP1_A_4440, TIP1_A_4441, TIP1_A_4442, TIP1_A_4051, TIP1_A_4852, TIP1_A_4443, TIP1_A_4446, TIP1_A_6756, TIP1_A_6757, TIP1_A_6769, TIP1_A_6758, TIP1_A_4077, TIP1_A_4078,
                    TIP1_A_4079, GS_A_4504, GS_A_4506, GS_A_4507, GS_A_4508, GS_A_4509, GS_A_4511, GS_A_4512, GS_A_4513, GS_A_4514, GS_A_4515, GS_A_4516, GS_A_4517, GS_A_4518, GS_A_4519, GS_A_4520, GS_A_4521, GS_A_4522, GS_A_4523,
                    GS_A_4524, GS_A_4525, GS_A_4526, GS_A_4527, GS_A_4528, GS_A_4530, GS_A_4531, GS_A_4532, GS_A_4533, GS_A_4534, GS_A_4535, GS_A_4538, GS_A_4540, GS_A_5541, GS_A_5526, GS_A_3784, GS_A_5324, GS_A_2355, GS_A_2356, GS_A_2357,
                    GS_A_2359);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_TSL_PTV1_6_0("gemProdT_TSL_PTV1.6.0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4386, GS_A_4384, GS_A_5339, GS_A_5131, GS_A_5340, GS_A_4832, GS_A_4013, GS_A_4024, GS_A_4033, GS_A_4036, GS_A_4763, GS_A_4054, GS_A_3932, GS_A_3834, GS_A_3842, GS_A_3931, GS_A_4879, GS_A_3832,
                    GS_A_3833, GS_A_3840, GS_A_4817, GS_A_3934, GS_A_3937, GS_A_3939, GS_A_3946, GS_A_4444, GS_A_4447, GS_A_3695, GS_A_3696, GS_A_5025, GS_A_5038, GS_A_3702, GS_A_4543, GS_A_4545, GS_A_3804, GS_A_3807, GS_A_3805, GS_A_3806,
                    GS_A_4146, GS_A_4147, GS_A_4148, GS_A_4149, GS_A_4145, GS_A_4854, GS_A_4159, GS_A_4160, GS_A_4714, GS_A_4715, GS_A_4716, GS_A_4589, GS_A_4590, GS_A_4921, GS_A_4745, GS_A_4746, GS_A_4747, GS_A_4637, GS_A_4829, GS_A_4642,
                    GS_A_4643, GS_A_4644, GS_A_4645, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4651, GS_A_4897, GS_A_4898, GS_A_4899, GS_A_4652, GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4660,
                    GS_A_4749, GS_A_4661, GS_A_4662, GS_A_4663, GS_A_5077, GS_A_4751, GS_A_4669, GS_A_4674, GS_A_4957, GS_A_4676, GS_A_4677, GS_A_4678, GS_A_4684, GS_A_4686, GS_A_4687, GS_A_4688, GS_A_4690, GS_A_4691, GS_A_4692, GS_A_5090,
                    GS_A_4693, GS_A_4694, TIP1_A_5993, TIP1_A_5996, TIP1_A_5998, TIP1_A_5997, TIP1_A_6002, TIP1_A_3994, TIP1_A_4016, TIP1_A_4027, TIP1_A_4030, TIP1_A_4031, TIP1_A_4032, TIP1_A_4034, TIP1_A_4035, TIP1_A_4038, TIP1_A_4438,
                    TIP1_A_4443, TIP1_A_4444, TIP1_A_4445, TIP1_A_4056, TIP1_A_4057, TIP1_A_4058, TIP1_A_4059, TIP1_A_4060, TIP1_A_4062, TIP1_A_4063, TIP1_A_4064, TIP1_A_5119, TIP1_A_4065, TIP1_A_4067, TIP1_A_4068, TIP1_A_4069, TIP1_A_4070,
                    TIP1_A_4072, TIP1_A_4073, TIP1_A_4074, TIP1_A_4447, TIP1_A_4076, TIP1_A_4449, TIP1_A_4081, TIP1_A_4082, TIP1_A_5121, TIP1_A_4083, TIP1_A_4084, TIP1_A_4085, TIP1_A_4086, TIP1_A_4087, TIP1_A_4088, TIP1_A_4089, TIP1_A_4090,
                    TIP1_A_4091, TIP1_A_4092, TIP1_A_4093, TIP1_A_4094, TIP1_A_4095, TIP1_A_4096, TIP1_A_4097, TIP1_A_4098, TIP1_A_4099, TIP1_A_4100, TIP1_A_4102, TIP1_A_4103, TIP1_A_4104, TIP1_A_4105, TIP1_A_4106, TIP1_A_4107, TIP1_A_4108,
                    TIP1_A_4110, TIP1_A_5122, TIP1_A_5123, TIP1_A_5124, TIP1_A_5125, TIP1_A_5126, TIP1_A_5128, TIP1_A_5963, TIP1_A_5964, TIP1_A_5965, TIP1_A_5966, TIP1_A_5967, TIP1_A_4111, TIP1_A_4112, TIP1_A_4113, TIP1_A_4114);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_5052, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_2805, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6529,
                    TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_4009, GS_A_4831, GS_A_4010, GS_A_4011, GS_A_4012, GS_A_4018, GS_A_4027, GS_A_4759, GS_A_4805, GS_A_3824, GS_A_3931, GS_A_5346, GS_A_4817,
                    GS_A_4820, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5039, GS_A_3813, GS_A_5018, GS_A_5033, GS_A_4149, GS_A_3055, GS_A_3058, GS_A_4158, GS_A_4703, GS_A_4704, GS_A_4727, GS_A_4588, GS_A_4738, GS_A_4739, GS_A_4742,
                    GS_A_4743, GS_A_4744, GS_A_4918, GS_A_4640, GS_A_5214, GS_A_4670, GS_A_4679, GS_A_4680, GS_A_4685, GS_A_4689, TIP1_A_5994, TIP1_A_5995, TIP1_A_6003, TIP1_A_5999, TIP1_A_3949, TIP1_A_3950, TIP1_A_3951, TIP1_A_3953,
                    TIP1_A_3954, TIP1_A_3955, TIP1_A_3956, TIP1_A_5782, TIP1_A_3958, TIP1_A_3959, TIP1_A_3960, TIP1_A_3961, TIP1_A_3962, TIP1_A_3964, TIP1_A_3965, TIP1_A_3970, TIP1_A_3972, TIP1_A_3973, TIP1_A_3974, TIP1_A_3975, TIP1_A_3977,
                    TIP1_A_3982, TIP1_A_3984, TIP1_A_3989, TIP1_A_3991, TIP1_A_3992, TIP1_A_3994, TIP1_A_4011, TIP1_A_4435, TIP1_A_4028, TIP1_A_4036, TIP1_A_4037, TIP1_A_4039, TIP1_A_4042, TIP1_A_4043, TIP1_A_4044, TIP1_A_4851, TIP1_A_4045,
                    TIP1_A_4046, TIP1_A_4439, TIP1_A_4049, TIP1_A_4440, TIP1_A_4050, TIP1_A_4441, TIP1_A_4442, TIP1_A_4051, TIP1_A_4052, TIP1_A_4053, TIP1_A_4054, TIP1_A_4852, TIP1_A_4055, TIP1_A_4066, TIP1_A_4070, TIP1_A_4074, TIP1_A_4075,
                    TIP1_A_4448, TIP1_A_4077, TIP1_A_4078, TIP1_A_4079, TIP1_A_4109, TIP1_A_5990, GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537, GS_A_4539, GS_A_4357, GS_A_4358, GS_A_4359, GS_A_4361, GS_A_4367, GS_A_4368, GS_A_4370, GS_A_4371,
                    GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322, GS_A_5339, GS_A_4388, GS_A_4393, GS_A_5131, GS_A_5079, GS_A_5340, GS_A_4054, GS_A_4062, GS_A_4879, GS_A_4641, GS_A_4748, GS_A_3760, GS_A_4980, GS_A_4981,
                    GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329,
                    GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343, GS_A_2345, GS_A_2347, GS_A_2360, GS_A_2361, GS_A_2362, GS_A_2363, GS_A_2366, GS_A_3078, GS_A_3125, GS_A_3130, GS_A_3139, GS_A_3141, GS_A_3149,
                    TIP1_A_3954, TIP1_A_3955, TIP1_A_3957, TIP1_A_3958, TIP1_A_3959, TIP1_A_3960, TIP1_A_3962, TIP1_A_3963, TIP1_A_3967, TIP1_A_3968, TIP1_A_3969, TIP1_A_5382, TIP1_A_3971, TIP1_A_3972, TIP1_A_3974, TIP1_A_3975, TIP1_A_3976,
                    TIP1_A_3977, TIP1_A_3978, TIP1_A_3979, TIP1_A_3980, TIP1_A_3981, TIP1_A_3982, TIP1_A_3983, TIP1_A_3984, TIP1_A_3985, TIP1_A_3986, TIP1_A_3987, TIP1_A_3988, TIP1_A_3990, TIP1_A_3993, TIP1_A_3995, TIP1_A_3996, TIP1_A_3997,
                    TIP1_A_3998, TIP1_A_3999, TIP1_A_4000, TIP1_A_4001, TIP1_A_4002, TIP1_A_4003, TIP1_A_4005, TIP1_A_4006, TIP1_A_4007, TIP1_A_4008, TIP1_A_4010, TIP1_A_4012, TIP1_A_4016, TIP1_A_4017, TIP1_A_4018, TIP1_A_4019, TIP1_A_4026,
                    TIP1_A_4439, TIP1_A_4440, TIP1_A_4441, TIP1_A_4442, TIP1_A_4051, TIP1_A_4852, TIP1_A_4443, TIP1_A_4446, TIP1_A_4077, TIP1_A_4078, TIP1_A_4079, GS_A_4504, GS_A_4506, GS_A_4507, GS_A_4508, GS_A_4509, GS_A_4511, GS_A_4512,
                    GS_A_4513, GS_A_4514, GS_A_4515, GS_A_4516, GS_A_4517, GS_A_4518, GS_A_4519, GS_A_4520, GS_A_4521, GS_A_4522, GS_A_4523, GS_A_4524, GS_A_4525, GS_A_4526, GS_A_4527, GS_A_4528, GS_A_4530, GS_A_4531, GS_A_4532, GS_A_4533,
                    GS_A_4534, GS_A_4535, GS_A_4538, GS_A_4540, GS_A_3784, GS_A_5324, GS_A_2355, GS_A_2356, GS_A_2357, GS_A_2359);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_St_Ampel_PTV1_6_0_1("gemProdT_St_Ampel _PTV1.6.0-1") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4384, GS_A_5339, GS_A_4832, GS_A_4013, GS_A_4024, GS_A_4033, GS_A_4763, GS_A_4054, GS_A_4809, GS_A_3932, GS_A_3834, GS_A_3842, GS_A_3835, GS_A_3931, GS_A_3839, GS_A_3832, GS_A_3833, GS_A_3840,
                    GS_A_4817, GS_A_3934, GS_A_3937, GS_A_3939, GS_A_3946, GS_A_3695, GS_A_3696, GS_A_5025, GS_A_5054, GS_A_5038, GS_A_3702, GS_A_4543, GS_A_4546, GS_A_3856, GS_A_4547, GS_A_3801, GS_A_3796, GS_A_3816, GS_A_3804, GS_A_3807,
                    GS_A_3805, GS_A_3806, GS_A_4146, GS_A_4147, GS_A_4148, GS_A_4149, GS_A_4145, GS_A_4161, GS_A_5336, TIP1_A_5795, TIP1_A_5798, TIP1_A_3521, TIP1_A_3524, TIP1_A_3687, TIP1_A_3301, TIP1_A_3529, TIP1_A_3302, TIP1_A_5917,
                    TIP1_A_3531, TIP1_A_3532, TIP1_A_3533, TIP1_A_3538, TIP1_A_3540, TIP1_A_3541, TIP1_A_3304, TIP1_A_3305, TIP1_A_3298, TIP1_A_3299, TIP1_A_5992, TIP1_A_5993, TIP1_A_5996, TIP1_A_6004, TIP1_A_3272, TIP1_A_6000, TIP1_A_6001,
                    TIP1_A_6005, TIP1_A_5935, TIP1_A_5936, TIP1_A_5937, TIP1_A_5991, TIP1_A_3527, TIP1_A_3274, TIP1_A_3276, TIP1_A_3370, TIP1_A_3296, TIP1_A_3543, TIP1_A_3278, TIP1_A_3284, TIP1_A_3291, TIP1_A_3368, TIP1_A_3275, TIP1_A_3277,
                    TIP1_A_3279, TIP1_A_3281, TIP1_A_3283, TIP1_A_3285, TIP1_A_6714);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_2805, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529,
                    TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_5542, GS_A_5526, GS_A_4009, GS_A_4831, GS_A_4010, GS_A_4011, GS_A_4012, GS_A_4018, GS_A_4027, GS_A_4759, GS_A_4805, GS_A_3824, GS_A_3932,
                    GS_A_4810, GS_A_3839, GS_A_3832, GS_A_4820, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5039, GS_A_3813, GS_A_5018, GS_A_5033, GS_A_4149, GS_A_4155, GS_A_5028, GS_A_3055, GS_A_3058, TIP1_A_5796, TIP1_A_5797,
                    TIP1_A_5994, TIP1_A_5995, TIP1_A_5941, GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537, GS_A_4539, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5339, GS_A_4388, GS_A_4054, GS_A_4062, GS_A_3839, GS_A_4817,
                    GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309,
                    GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343, GS_A_2345, GS_A_2347, GS_A_2360, GS_A_2361, GS_A_2362, GS_A_2363, GS_A_2366, TIP1_A_3297, GS_A_4504, GS_A_4506,
                    GS_A_4507, GS_A_4508, GS_A_4509, GS_A_4511, GS_A_4512, GS_A_4513, GS_A_4514, GS_A_4515, GS_A_4516, GS_A_4517, GS_A_4518, GS_A_4519, GS_A_4520, GS_A_4521, GS_A_4522, GS_A_4523, GS_A_4524, GS_A_4525, GS_A_4526, GS_A_4527,
                    GS_A_4528, GS_A_4530, GS_A_4531, GS_A_4532, GS_A_4533, GS_A_4534, GS_A_4535, GS_A_4538, GS_A_4540, GS_A_5541, GS_A_5526, GS_A_3784, GS_A_5324, GS_A_2355, GS_A_2356, GS_A_2357, GS_A_2359);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_NamD_PTV1_5_1_0("gemProdT_NamD_PTV1.5.1-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4832, GS_A_4013, GS_A_4024, GS_A_4033, GS_A_4036, GS_A_4763, GS_A_3926, GS_A_3927, GS_A_4809, GS_A_3932, GS_A_3834, GS_A_3842, GS_A_3930, GS_A_3835, GS_A_3931, GS_A_5133, GS_A_3839, GS_A_3832,
                    GS_A_3833, GS_A_3840, GS_A_4885, GS_A_4813, GS_A_3934, GS_A_3937, GS_A_3939, GS_A_3946, GS_A_3695, GS_A_3696, GS_A_5025, GS_A_5054, GS_A_5038, GS_A_3702, GS_A_4543, GS_A_4545, GS_A_3804, GS_A_3807, GS_A_3805, GS_A_3806,
                    GS_A_4146, GS_A_4147, GS_A_4148, GS_A_4149, GS_A_4145, GS_A_4162, GS_A_4637, GS_A_4829, GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4651, GS_A_4898, GS_A_4899, GS_A_4652,
                    GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4660, GS_A_4749, GS_A_4661, GS_A_4662, GS_A_4663, GS_A_5077, GS_A_4751, GS_A_4957, TIP1_A_5993, TIP1_A_5996, TIP1_A_5998, TIP1_A_5997, TIP1_A_6002);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_2805, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529,
                    TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_5542, GS_A_5526, GS_A_4009, GS_A_4831, GS_A_4010, GS_A_4011, GS_A_4012, GS_A_4018, GS_A_4027, GS_A_4759, GS_A_4805, GS_A_3824, GS_A_3828,
                    GS_A_4071, GS_A_3830, GS_A_3926, GS_A_3927, GS_A_3928, GS_A_4072, GS_A_3930, GS_A_4810, GS_A_3931, GS_A_5132, GS_A_5133, GS_A_3839, GS_A_5089, GS_A_4812, GS_A_5347, GS_A_4814, GS_A_4815, GS_A_4885, GS_A_4818, GS_A_3838,
                    GS_A_4820, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5039, GS_A_3813, GS_A_5018, GS_A_5033, GS_A_4149, GS_A_4155, GS_A_5028, GS_A_3055, GS_A_3058, GS_A_4640, TIP1_A_5994, TIP1_A_5995, TIP1_A_6003, TIP1_A_5999,
                    GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537, GS_A_4539, GS_A_4359, GS_A_4367, GS_A_4368, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322, GS_A_4388, GS_A_3839, GS_A_3841, GS_A_5089, GS_A_4815, GS_A_3838,
                    GS_A_4808, GS_A_4641, GS_A_4748, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946,
                    GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343, GS_A_2345, GS_A_2347, GS_A_2360, GS_A_2361, GS_A_2362, GS_A_2363, GS_A_2366, GS_A_3078,
                    GS_A_3125, GS_A_3130, GS_A_3139, GS_A_3141, GS_A_3149, GS_A_4504, GS_A_4506, GS_A_4507, GS_A_4508, GS_A_4509, GS_A_4511, GS_A_4512, GS_A_4513, GS_A_4514, GS_A_4515, GS_A_4516, GS_A_4517, GS_A_4518, GS_A_4519, GS_A_4520,
                    GS_A_4521, GS_A_4522, GS_A_4523, GS_A_4524, GS_A_4525, GS_A_4526, GS_A_4527, GS_A_4528, GS_A_4530, GS_A_4531, GS_A_4532, GS_A_4533, GS_A_4534, GS_A_4535, GS_A_4538, GS_A_4540, GS_A_5541, GS_A_5526, GS_A_3784, GS_A_5324,
                    GS_A_2355, GS_A_2356, GS_A_2357, GS_A_2359);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_KSR_PTV1_8_0_0("gemProdT_KSR_PTV1.8.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5339, TIP1_A_3313, TIP1_A_6129, TIP1_A_3347, TIP1_A_6131, TIP1_A_3319, TIP1_A_3320, TIP1_A_3321, TIP1_A_6108, TIP1_A_6132, TIP1_A_6133,
                    TIP1_A_5154, TIP1_A_6134, TIP1_A_3323, TIP1_A_3325, TIP1_A_3326, TIP1_A_6130, TIP1_A_3328, TIP1_A_6135, TIP1_A_6136, TIP1_A_6102, TIP1_A_5038, TIP1_A_5039, TIP1_A_3354, TIP1_A_3909, TIP1_A_6103, TIP1_A_3330, TIP1_A_3331,
                    TIP1_A_3332, TIP1_A_3333, TIP1_A_3334, TIP1_A_5160, TIP1_A_5375, TIP1_A_5161, TIP1_A_3335, TIP1_A_3336, TIP1_A_4120, TIP1_A_5162, TIP1_A_3910, TIP1_A_6104, TIP1_A_6105, TIP1_A_6106, TIP1_A_6125, TIP1_A_6109, TIP1_A_6107,
                    TIP1_A_6110, TIP1_A_6111, TIP1_A_3342, TIP1_A_3343, TIP1_A_6065, TIP1_A_3346, TIP1_A_6112, TIP1_A_6113, TIP1_A_6114, TIP1_A_6115, TIP1_A_6116, TIP1_A_6117, TIP1_A_6118, TIP1_A_6119, TIP1_A_6120, TIP1_A_6121, TIP1_A_6128,
                    TIP1_A_6122, TIP1_A_6123, TIP1_A_6124, TIP1_A_6127, TIP1_A_6066, TIP1_A_6126, TIP1_A_6067, TIP1_A_6074, TIP1_A_6075, TIP1_A_6076, GS_A_4832, GS_A_4013, GS_A_4024, GS_A_4033, GS_A_4036, GS_A_4763, GS_A_4809, GS_A_3932,
                    GS_A_5024, GS_A_3834, GS_A_3842, GS_A_3835, GS_A_3931, GS_A_3839, GS_A_3832, GS_A_3833, GS_A_3840, GS_A_4817, GS_A_3934, GS_A_3937, GS_A_3939, GS_A_3946, GS_A_3695, GS_A_3696, GS_A_5025, GS_A_5054, GS_A_5038, GS_A_3702,
                    GS_A_4543, GS_A_4545, GS_A_3856, GS_A_4547, GS_A_3801, GS_A_3796, GS_A_3816, GS_A_3804, GS_A_3807, GS_A_3805, GS_A_3806, GS_A_4864, GS_A_4146, GS_A_4147, GS_A_4148, GS_A_4149, GS_A_4145, GS_A_5331, GS_A_4157, GS_A_4637,
                    GS_A_4829, GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4651, GS_A_4898, GS_A_4899, GS_A_4652, GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4660, GS_A_4749,
                    GS_A_4661, GS_A_4662, GS_A_4663, GS_A_5077, GS_A_4751, GS_A_4957, TIP1_A_5993, TIP1_A_5996, TIP1_A_5998, TIP1_A_5997, TIP1_A_6002);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_4929, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_2805, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772,
                    TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_5542, TIP1_A_3312, TIP1_A_5157, TIP1_A_3320, TIP1_A_3322, TIP1_A_5154, TIP1_A_3324, TIP1_A_3328, TIP1_A_3353, TIP1_A_3342,
                    TIP1_A_3348, TIP1_A_5042, TIP1_A_3345, TIP1_A_3349, TIP1_A_3350, TIP1_A_5163, TIP1_A_3913, TIP1_A_3355, TIP1_A_3914, TIP1_A_3915, TIP1_A_3916, TIP1_A_3917, TIP1_A_3918, TIP1_A_3919, TIP1_A_3920, TIP1_A_3921, TIP1_A_3351,
                    TIP1_A_3922, TIP1_A_3923, TIP1_A_3352, TIP1_A_3924, TIP1_A_3925, TIP1_A_5043, GS_A_4009, GS_A_4831, GS_A_4010, GS_A_4011, GS_A_4012, GS_A_4018, GS_A_4027, GS_A_4759, GS_A_4805, GS_A_3824, GS_A_4810, GS_A_3931, GS_A_3839,
                    GS_A_4820, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5039, GS_A_3813, GS_A_5018, GS_A_5033, GS_A_4149, GS_A_3055, GS_A_3058, GS_A_4853, GS_A_4640, TIP1_A_5994, TIP1_A_5995, TIP1_A_6003, TIP1_A_5999, GS_A_4330,
                    GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537, GS_A_4539, GS_A_4359, GS_A_4367, GS_A_4368, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322, GS_A_5339, GS_A_4388, TIP1_A_3347, TIP1_A_3322, TIP1_A_5040,
                    TIP1_A_3910, TIP1_A_3343, TIP1_A_3346, TIP1_A_3355, GS_A_4062, GS_A_3839, GS_A_4817, GS_A_4641, GS_A_4748, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772,
                    GS_A_3756, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343, GS_A_2345,
                    GS_A_2347, GS_A_2360, GS_A_2361, GS_A_2362, GS_A_2363, GS_A_2366, GS_A_4504, GS_A_4506, GS_A_4507, GS_A_4508, GS_A_4509, GS_A_4511, GS_A_4512, GS_A_4513, GS_A_4514, GS_A_4515, GS_A_4516, GS_A_4517, GS_A_4518, GS_A_4519,
                    GS_A_4520, GS_A_4521, GS_A_4522, GS_A_4523, GS_A_4524, GS_A_4525, GS_A_4526, GS_A_4527, GS_A_4528, GS_A_4530, GS_A_4531, GS_A_4532, GS_A_4533, GS_A_4534, GS_A_4535, GS_A_4538, GS_A_4540, GS_A_5541, GS_A_5526, GS_A_3784,
                    GS_A_5324, GS_A_2355, GS_A_2356, GS_A_2357, GS_A_2359, TIP1_A_3311, TIP1_A_3342, TIP1_A_3343, TIP1_A_3345, TIP1_A_3346, TIP1_A_3348, TIP1_A_3349, TIP1_A_3350, TIP1_A_3351, TIP1_A_3352, TIP1_A_3355, TIP1_A_3913,
                    TIP1_A_3914, TIP1_A_3915, TIP1_A_3916, TIP1_A_3917, TIP1_A_3918, TIP1_A_3919, TIP1_A_3920, TIP1_A_3921, TIP1_A_3922, TIP1_A_3923, TIP1_A_3924, TIP1_A_3925, TIP1_A_5042, TIP1_A_5043, TIP1_A_5163);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    // Fachanwendungen
    //
    gemProdT_Intermediaer_VSDM_PTV1_5_2_0("gemProdT_Intermediär_VSDM_PTV1.5.2-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(VSDM_A_2348, VSDM_A_2349, VSDM_A_2350, VSDM_A_2351, VSDM_A_2353, VSDM_A_2356, VSDM_A_2357, VSDM_A_2358, VSDM_A_2359, VSDM_A_2547, VSDM_A_2548, VSDM_A_2549, VSDM_A_2550, VSDM_A_2673, VSDM_A_2704,
                    VSDM_A_2706, VSDM_A_2707, VSDM_A_2712, VSDM_A_2747, VSDM_A_2761, VSDM_A_2940, GS_A_4386, GS_A_4384, GS_A_5131, GS_A_4832, GS_A_4013, GS_A_4024, GS_A_4033, GS_A_4036, GS_A_4763, GS_A_4809, GS_A_3932, GS_A_3834, GS_A_3842,
                    GS_A_3930, GS_A_3931, GS_A_3839, GS_A_3832, GS_A_3833, GS_A_3840, GS_A_4817, GS_A_3933, GS_A_3934, GS_A_4819, GS_A_3937, GS_A_3695, GS_A_3696, GS_A_5025, GS_A_5038, GS_A_3702, GS_A_4543, GS_A_4545, GS_A_3856, GS_A_5252,
                    GS_A_3801, GS_A_3796, GS_A_3816, GS_A_3804, GS_A_3807, GS_A_3806, GS_A_4146, GS_A_4147, GS_A_4148, GS_A_4149, GS_A_5523, GS_A_5029, GS_A_4637, GS_A_4829, GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648,
                    GS_A_4649, GS_A_4650, GS_A_4651, GS_A_4898, GS_A_4899, GS_A_4652, GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4660, GS_A_4749, GS_A_4661, GS_A_4662, GS_A_4663, GS_A_5077, GS_A_4751, GS_A_4957, GS_A_5215,
                    VSDM_A_2222, VSDM_A_2223, VSDM_A_2225, VSDM_A_2226, VSDM_A_2227, VSDM_A_2228, VSDM_A_2231, VSDM_A_2233, VSDM_A_2234, VSDM_A_2236, VSDM_A_2240, VSDM_A_2271, VSDM_A_2674, VSDM_A_3002, VSDM_A_3022, VSDM_A_3023, VSDM_A_3026,
                    VSDM_A_3027, VSDM_A_3028, VSDM_A_3068, TIP1_A_5993, TIP1_A_5996, TIP1_A_5998, TIP1_A_5997, TIP1_A_6003, TIP1_A_5120);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(GS_A_4330, GS_A_4435, GS_A_4437, GS_A_4451, GS_A_4453, GS_A_4473, GS_A_4474, GS_A_4480, VSDM_A_2669, VSDM_A_2748, GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537, GS_A_4539, GS_A_4359, GS_A_4367,
                    GS_A_4368, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322, GS_A_4388, GS_A_5131, GS_A_3839, GS_A_3841, GS_A_4808, GS_A_4641, GS_A_4748, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984,
                    GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2214, GS_A_2065, GS_A_2087, GS_A_2213, GS_A_2076, GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047,
                    GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343, GS_A_2345, GS_A_2347, GS_A_2360, GS_A_2361, GS_A_2362, GS_A_2363, GS_A_2366, GS_A_3078, GS_A_3125, GS_A_3130,
                    GS_A_3139, GS_A_3141, GS_A_3149, VSDM_A_2238, GS_A_4436, GS_A_4448, GS_A_4449, GS_A_4450, GS_A_4455, GS_A_4456, GS_A_4457, GS_A_4458, GS_A_4459, GS_A_4460, GS_A_4461, GS_A_4462, GS_A_4463, GS_A_4464, GS_A_4465,
                    GS_A_4466, GS_A_4467, GS_A_4468, GS_A_4470, GS_A_4471, GS_A_4476, GS_A_4477, GS_A_4478, GS_A_4479, GS_A_4481, GS_A_4482, GS_A_4504, GS_A_4506, GS_A_4507, GS_A_4508, GS_A_4509, GS_A_4511, GS_A_4512, GS_A_4513, GS_A_4514,
                    GS_A_4515, GS_A_4516, GS_A_4517, GS_A_4518, GS_A_4519, GS_A_4520, GS_A_4521, GS_A_4522, GS_A_4523, GS_A_4524, GS_A_4525, GS_A_4526, GS_A_4527, GS_A_4528, GS_A_4530, GS_A_4531, GS_A_4532, GS_A_4533, GS_A_4534, GS_A_4535,
                    GS_A_4538, GS_A_4540, GS_A_5541, GS_A_5527, GS_A_4720, GS_A_3784, GS_A_5324, GS_A_2355, GS_A_2356, GS_A_2357, GS_A_2359);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_FD_VSDM_PTV1_5_0_2("gemProdT_FD_VSDM_PTV1.5.0-2") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(TIP1_A_5120, GS_A_4384, GS_A_4386, GS_A_5131, GS_A_4832, GS_A_4013, GS_A_4024, GS_A_4033, GS_A_4036, GS_A_4763, GS_A_4809, GS_A_3932, GS_A_3834, GS_A_3842, GS_A_3930, GS_A_3931, GS_A_3839, GS_A_3832,
                    GS_A_3833, GS_A_3840, GS_A_4817, GS_A_3933, GS_A_3934, GS_A_4819, GS_A_3937, GS_A_3695, GS_A_3696, GS_A_3702, GS_A_4543, GS_A_4545, GS_A_3856, GS_A_4547, GS_A_3801, GS_A_3796, GS_A_3816, GS_A_3804, GS_A_3807, GS_A_3806,
                    GS_A_3805, GS_A_5025, GS_A_5038, GS_A_5031, GS_A_5092, GS_A_5093, GS_A_5094, GS_A_5095, GS_A_4637, GS_A_4829, GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4651, GS_A_4898, GS_A_4899,
                    GS_A_4652, GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4660, GS_A_4749, GS_A_4661, GS_A_4662, GS_A_4663, GS_A_4751, GS_A_4957, GS_A_5077, GS_A_5215, GS_A_5336, VSDM_A_2226, VSDM_A_2241, VSDM_A_2242,
                    VSDM_A_2253, VSDM_A_2254, VSDM_A_2255, VSDM_A_2256, VSDM_A_2257, VSDM_A_2258, VSDM_A_2259, VSDM_A_2260, VSDM_A_2261, VSDM_A_2262, VSDM_A_2263, VSDM_A_2266, VSDM_A_2267, VSDM_A_2269, VSDM_A_2270, VSDM_A_2272, VSDM_A_2273,
                    VSDM_A_2274, VSDM_A_2279, VSDM_A_2313, VSDM_A_2902, VSDM_A_2952, VSDM_A_2955, VSDM_A_3001, TIP1_A_5993, TIP1_A_5996, TIP1_A_5998, TIP1_A_5997, TIP1_A_6003, VSDM_A_2297, VSDM_A_2299, VSDM_A_2301, VSDM_A_2302, VSDM_A_2305,
                    VSDM_A_2314, VSDM_A_2315, VSDM_A_2316, VSDM_A_2317, VSDM_A_2322, VSDM_A_2323, VSDM_A_2324, VSDM_A_2325, VSDM_A_2326, VSDM_A_2327, VSDM_A_2328, VSDM_A_2330, VSDM_A_2331, VSDM_A_2332, VSDM_A_2333, VSDM_A_2334, VSDM_A_2339,
                    VSDM_A_2264, VSDM_A_3009);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(VSDM_A_2294, VSDM_A_2341, VSDM_A_2546, VSDM_A_2961, VSDM_A_2973, VSDM_A_2974, VSDM_A_2975, VSDM_A_2976, VSDM_A_2994, VSDM_A_2751, VSDM_A_2329, VSDM_A_2280, VSDM_A_2281, VSDM_A_2283, VSDM_A_2286,
                    VSDM_A_2287, VSDM_A_2288, VSDM_A_2290, VSDM_A_2291, VSDM_A_2292, VSDM_A_2293, VSDM_A_2342, VSDM_A_2295, TIP1_A_2769, TIP1_A_2781, TIP1_A_6083, TIP1_A_6519, TIP1_A_6523, TIP1_A_6526, TIP1_A_6527, VSDM_A_2812, VSDM_A_2814,
                    VSDM_A_2815, VSDM_A_2826, VSDM_A_2825, VSDM_A_2830, VSDM_A_2831, VSDM_A_2832, VSDM_A_3029, VSDM_A_3030, TIP1_A_6532, TIP1_A_6533, TIP1_A_6536, TIP1_A_6537, VSDM_A_2958, GS_A_5526, GS_A_5542, GS_A_3824, GS_A_4009,
                    GS_A_4018, GS_A_4027, GS_A_4759, GS_A_3839, GS_A_4805, GS_A_5089, GS_A_5346, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_4831, GS_A_5054, GS_A_5039, GS_A_5040, GS_A_5018, GS_A_5032, GS_A_5095, GS_A_4640, GS_A_5033,
                    GS_A_3805, GS_A_3813, GS_A_3928, TIP1_A_5994, TIP1_A_5995, TIP1_A_5999, TIP1_A_6002, VSDM_A_2268, VSDM_A_3027, VSDM_A_2999, VSDM_A_2812, VSDM_A_2826, GS_A_4330, GS_A_4473, GS_A_4474, GS_A_4475, GS_A_4529, GS_A_4359,
                    GS_A_4367, GS_A_4368, GS_A_4384, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_5131, GS_A_5322, GS_A_3839, GS_A_3841, GS_A_4808, GS_A_4641, GS_A_4748, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737,
                    GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_3760, GS_A_2087, GS_A_2213, GS_A_2076, GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326,
                    GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2345, GS_A_2347, GS_A_2361, GS_A_2363, GS_A_2366, GS_A_4378, GS_A_4380, GS_A_4479, GS_A_4523, GS_A_4524, GS_A_4528, GS_A_5526, GS_A_5541, GS_A_3784, GS_A_2356,
                    GS_A_5324, GS_A_3784, GS_A_3806, GS_A_4036, GS_A_4386, GS_A_5040, GS_A_5054, VSDM_A_2270, VSDM_A_2293, VSDM_A_2333);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    // PKI-Produkttypen
    //
    gemProdT_X_509_TSP_QES_PTV1_7_0_0("gemProdT_X.509_TSP_QES_PTV1.7.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4384, GS_A_5339, GS_A_4832, GS_A_4013, GS_A_4024, GS_A_4033, GS_A_4036, GS_A_4763, GS_A_3932, GS_A_3834, GS_A_3842, GS_A_3931, GS_A_3832, GS_A_3833, GS_A_3840, GS_A_4817, GS_A_3934, GS_A_3937,
                    GS_A_3939, GS_A_3946, GS_A_4442, GS_A_4444, GS_A_4445, GS_A_5038, GS_A_4543, GS_A_4545, GS_A_3804, GS_A_3807, GS_A_3805, GS_A_3806, GS_A_4146, GS_A_4147, GS_A_4148, GS_A_4149, GS_A_4145, GS_A_4159, GS_A_4160, GS_A_5513,
                    GS_A_4698, GS_A_4705, GS_A_4706, GS_A_4714, GS_A_4715, GS_A_4717, GS_A_4718, GS_A_4719, GS_A_4724, GS_A_4588, GS_A_4589, GS_A_4590, GS_A_5042, GS_A_5533, GS_A_4731, GS_A_4948, GS_A_4637, GS_A_4829, GS_A_5043, GS_A_4642,
                    GS_A_4643, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4651, GS_A_4898, GS_A_4899, GS_A_4652, GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4660, GS_A_4749, GS_A_4661, GS_A_4662,
                    GS_A_4663, GS_A_5077, GS_A_4751, GS_A_4669, GS_A_4674, GS_A_4957, GS_A_4676, GS_A_5124, GS_A_4677, GS_A_4678, GS_A_5517, GS_A_4684, GS_A_4686, GS_A_4688, GS_A_4690, GS_A_4691, GS_A_4692, GS_A_5090, GS_A_4693,
                    TIP1_A_5993, TIP1_A_5998, TIP1_A_5997, TIP1_A_6002, TIP1_A_3586, TIP1_A_3886, TIP1_A_3594);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_5052, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_2805, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772,
                    TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_4908, GS_A_4909, GS_A_4910, GS_A_4911, GS_A_4912, GS_A_4913, GS_A_4914, GS_A_4915, GS_A_4916, GS_A_4919, GS_A_4923,
                    GS_A_4925, GS_A_4927, GS_A_4929, GS_A_4930, GS_A_4931, GS_A_4933, GS_A_5542, GS_A_5526, GS_A_4009, GS_A_4831, GS_A_4010, GS_A_4011, GS_A_4012, GS_A_4018, GS_A_4027, GS_A_4759, GS_A_4805, GS_A_3824, GS_A_4810, GS_A_3931,
                    GS_A_4820, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5025, GS_A_5039, GS_A_3702, GS_A_3813, GS_A_5018, GS_A_5033, GS_A_4149, GS_A_4155, GS_A_5028, GS_A_3055, GS_A_3058, GS_A_4257, GS_A_5512, GS_A_5529, GS_A_5483,
                    GS_A_4704, GS_A_4584, GS_A_4901, GS_A_4713, GS_A_4727, GS_A_5337, GS_A_4730, GS_A_4735, GS_A_4640, GS_A_4687, GS_A_4689, GS_A_4694, TIP1_A_5994, TIP1_A_5995, TIP1_A_6003, TIP1_A_5999, TIP1_A_3547, TIP1_A_3877,
                    TIP1_A_5088, TIP1_A_3880, TIP1_A_4427, TIP1_A_4428, TIP1_A_3883, TIP1_A_3555, TIP1_A_3560, TIP1_A_5092, TIP1_A_3585, TIP1_A_3588, TIP1_A_5094, TIP1_A_3885, TIP1_A_3591, TIP1_A_3592, TIP1_A_3887, TIP1_A_3888, TIP1_A_3596,
                    GS_A_4358, GS_A_4359, GS_A_4367, GS_A_4368, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322, GS_A_4817, GS_A_4641, GS_A_4748, TIP1_A_5087, TIP1_A_3660, TIP1_A_3548, TIP1_A_3549, TIP1_A_3550, TIP1_A_3881,
                    TIP1_A_3554, TIP1_A_3555, TIP1_A_3595, GS_A_3932, GS_A_3834, GS_A_3833, GS_A_4672, TIP1_A_3584, TIP1_A_3589, TIP1_A_3590, TIP1_A_3583, TIP1_A_3596, TIP1_A_3641, TIP1_A_4243, GS_A_5541, GS_A_5526, GS_A_5518, GS_A_4965,
                    GS_A_5324, TIP1_A_5093);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_X_509_TSP_nonQES_SMC_B_PTV1_7_0_0("gemProdT_X.509_TSP_nonQES_SMC-B_PTV1.7.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4178, GS_A_4179, GS_A_4181, GS_A_4208, GS_A_4395, GS_A_4213, GS_A_4219, GS_A_4225, GS_A_4303, GS_A_4352, GS_A_4911, GS_A_4914, GS_A_4919, GS_A_4926, GS_A_4929, GS_A_4931, GS_A_4933, GS_A_4384,
                    GS_A_5339, GS_A_5131, GS_A_5518, GS_A_4832, GS_A_4013, GS_A_4024, GS_A_4033, GS_A_4036, GS_A_4763, GS_A_4054, GS_A_3932, GS_A_3834, GS_A_3842, GS_A_3931, GS_A_3832, GS_A_3833, GS_A_3840, GS_A_4817, GS_A_3934, GS_A_3937,
                    GS_A_3939, GS_A_3946, GS_A_4443, GS_A_4444, GS_A_4445, GS_A_3695, GS_A_3696, GS_A_5025, GS_A_5038, GS_A_3702, GS_A_4543, GS_A_4545, GS_A_3804, GS_A_3807, GS_A_3805, GS_A_3806, GS_A_4146, GS_A_4147, GS_A_4148, GS_A_4149,
                    GS_A_4145, GS_A_4159, GS_A_4160, GS_A_5513, GS_A_4705, GS_A_4706, GS_A_4709, GS_A_4714, GS_A_4715, GS_A_4717, GS_A_4718, GS_A_4719, GS_A_4722, GS_A_4724, GS_A_4589, GS_A_4590, GS_A_5042, GS_A_4600, GS_A_4601, GS_A_4602,
                    GS_A_4738, GS_A_4741, GS_A_4936, GS_A_4637, GS_A_4829, GS_A_5043, GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4651, GS_A_4898, GS_A_4899, GS_A_4652, GS_A_4653, GS_A_4654,
                    GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4660, GS_A_4749, GS_A_4661, GS_A_4662, GS_A_4663, GS_A_5077, GS_A_4751, GS_A_4669, GS_A_5053, GS_A_5051, GS_A_4674, GS_A_4957, GS_A_4676, GS_A_4677, GS_A_4678, GS_A_5517, GS_A_4684,
                    GS_A_4686, GS_A_4687, GS_A_4688, GS_A_4690, GS_A_4691, GS_A_4692, GS_A_5090, GS_A_4693, GS_A_4694, TIP1_A_5993, TIP1_A_5996, TIP1_A_5998, TIP1_A_5997, TIP1_A_6002, TIP1_A_3894, TIP1_A_3572, TIP1_A_3573, TIP1_A_3577,
                    TIP1_A_3886, TIP1_A_3594);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_5052, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_2805, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772,
                    TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_4173, GS_A_4174, GS_A_4175, GS_A_4176, GS_A_4177, GS_A_4180, GS_A_4182, GS_A_4183, GS_A_4185, GS_A_4186, GS_A_4188,
                    GS_A_4190, GS_A_4192, GS_A_4195, GS_A_4199, GS_A_4201, GS_A_4202, GS_A_5083, GS_A_4203, GS_A_4207, GS_A_4209, GS_A_4394, GS_A_4906, GS_A_4210, GS_A_4211, GS_A_4212, GS_A_4214, GS_A_4348, GS_A_4215, GS_A_4216, GS_A_4217,
                    GS_A_4218, GS_A_4221, GS_A_4349, GS_A_4226, GS_A_4227, GS_A_4228, GS_A_4229, GS_A_4230, GS_A_4231, GS_A_4238, GS_A_4241, GS_A_4242, GS_A_4245, GS_A_4248, GS_A_4250, GS_A_4251, GS_A_4252, GS_A_4254, GS_A_4256, GS_A_4262,
                    GS_A_5084, GS_A_4263, GS_A_4264, GS_A_4265, GS_A_4266, GS_A_4267, GS_A_4269, GS_A_4276, GS_A_4277, GS_A_4278, GS_A_4281, GS_A_4282, GS_A_4283, GS_A_4296, GS_A_4297, GS_A_4299, GS_A_4300, GS_A_4302, GS_A_4318, GS_A_4319,
                    GS_A_4321, GS_A_4322, GS_A_4323, GS_A_4324, GS_A_4325, GS_A_4326, GS_A_4327, GS_A_4328, GS_A_4332, GS_A_4908, GS_A_4909, GS_A_4910, GS_A_4912, GS_A_4913, GS_A_4915, GS_A_4916, GS_A_4917, GS_A_4925, GS_A_4927, GS_A_4930,
                    GS_A_5542, GS_A_5526, GS_A_4009, GS_A_4831, GS_A_4010, GS_A_4011, GS_A_4012, GS_A_4018, GS_A_4027, GS_A_4759, GS_A_4805, GS_A_3824, GS_A_4810, GS_A_3931, GS_A_4820, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5039,
                    GS_A_3813, GS_A_5018, GS_A_5033, GS_A_4149, GS_A_4155, GS_A_5028, GS_A_3055, GS_A_3058, GS_A_4257, GS_A_5511, GS_A_5528, GS_A_4697, GS_A_4703, GS_A_4704, GS_A_4828, GS_A_4586, GS_A_4901, GS_A_4713, GS_A_4727, GS_A_4588,
                    GS_A_5337, GS_A_4730, GS_A_4731, GS_A_4735, GS_A_4737, GS_A_4739, GS_A_5514, GS_A_4740, GS_A_4935, GS_A_4640, GS_A_4670, GS_A_4679, GS_A_4685, GS_A_4689, TIP1_A_5994, TIP1_A_5995, TIP1_A_6003, TIP1_A_5999, TIP1_A_3547,
                    TIP1_A_3877, TIP1_A_5088, TIP1_A_3880, TIP1_A_4427, TIP1_A_4428, TIP1_A_3630, TIP1_A_5376, TIP1_A_3883, TIP1_A_3555, TIP1_A_3558, TIP1_A_3564, TIP1_A_3565, TIP1_A_3567, TIP1_A_3569, TIP1_A_5086, TIP1_A_3580, TIP1_A_3581,
                    TIP1_A_3884, TIP1_A_3582, TIP1_A_3591, TIP1_A_3592, TIP1_A_3887, TIP1_A_3888, TIP1_A_3596, TIP1_A_3631, TIP1_A_3632, TIP1_A_3633, TIP1_A_3634, TIP1_A_3635, TIP1_A_3638, TIP1_A_3639, TIP1_A_3640, TIP1_A_3642, TIP1_A_4467,
                    GS_A_4173, GS_A_4191, GS_A_4230, GS_A_4396, GS_A_4247, GS_A_4249, GS_A_4255, GS_A_4259, GS_A_4260, GS_A_4261, GS_A_4268, GS_A_4270, GS_A_4271, GS_A_4272, GS_A_4273, GS_A_4274, GS_A_4275, GS_A_4276, GS_A_4279, GS_A_4284,
                    GS_A_4285, GS_A_4287, GS_A_4288, GS_A_4289, GS_A_4290, GS_A_4291, GS_A_4292, GS_A_4294, GS_A_4295, GS_A_4304, GS_A_4305, GS_A_4306, GS_A_4307, GS_A_4308, GS_A_4309, GS_A_4310, GS_A_4311, GS_A_4312, GS_A_4313, GS_A_4314,
                    GS_A_4315, GS_A_4316, GS_A_4317, GS_A_4925, GS_A_4435, GS_A_4437, GS_A_4451, GS_A_4453, GS_A_4473, GS_A_4474, GS_A_4475, GS_A_4480, GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537, GS_A_4539, GS_A_4357, GS_A_4359, GS_A_4361,
                    GS_A_4362, GS_A_4367, GS_A_4368, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322, GS_A_5339, GS_A_4388, GS_A_4393, GS_A_5131, GS_A_5079, GS_A_4054, GS_A_4062, GS_A_4817, GS_A_4641, GS_A_4748, GS_A_3760,
                    GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2214, GS_A_2087, GS_A_2213, GS_A_2076, GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944,
                    GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343, GS_A_2345, GS_A_2347, GS_A_2360, GS_A_2361, GS_A_2362, GS_A_2363,
                    GS_A_2366, GS_A_3078, GS_A_3125, GS_A_3130, GS_A_3139, GS_A_3141, GS_A_3149, TIP1_A_5087, TIP1_A_4230, TIP1_A_4231, TIP1_A_4232, TIP1_A_4234, TIP1_A_4235, TIP1_A_3660, TIP1_A_3548, TIP1_A_3549, TIP1_A_3550, TIP1_A_3881,
                    TIP1_A_3554, TIP1_A_3555, TIP1_A_3557, TIP1_A_3590, TIP1_A_3595, TIP1_A_3596, GS_A_4436, GS_A_4448, GS_A_4449, GS_A_4450, GS_A_4455, GS_A_4456, GS_A_4457, GS_A_4458, GS_A_4459, GS_A_4460, GS_A_4461, GS_A_4462, GS_A_4463,
                    GS_A_4464, GS_A_4465, GS_A_4466, GS_A_4467, GS_A_4468, GS_A_4470, GS_A_4471, GS_A_4476, GS_A_4477, GS_A_4478, GS_A_4479, GS_A_4481, GS_A_4482, GS_A_4504, GS_A_4506, GS_A_4507, GS_A_4508, GS_A_4509, GS_A_4511, GS_A_4512,
                    GS_A_4513, GS_A_4514, GS_A_4515, GS_A_4516, GS_A_4517, GS_A_4518, GS_A_4519, GS_A_4520, GS_A_4521, GS_A_4522, GS_A_4523, GS_A_4524, GS_A_4525, GS_A_4526, GS_A_4527, GS_A_4528, GS_A_4530, GS_A_4531, GS_A_4532, GS_A_4533,
                    GS_A_4534, GS_A_4535, GS_A_4538, GS_A_4540, GS_A_5541, GS_A_5526, GS_A_5518, GS_A_4965, GS_A_3784, GS_A_5324, GS_A_2355, GS_A_2356, GS_A_2357, GS_A_2359);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_X_509_TSP_nonQES_Komp_PTV1_8_0_0("gemProdT_X.509_TSP_nonQES_Komp_PTV1.8.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4178, GS_A_4179, GS_A_4181, GS_A_4208, GS_A_4906, GS_A_4395, GS_A_4213, GS_A_4348, GS_A_4219, GS_A_4225, GS_A_4228, GS_A_4303, GS_A_4352, GS_A_4333, GS_A_4336, GS_A_4345, GS_A_4911, GS_A_4914,
                    GS_A_4919, GS_A_4926, GS_A_4929, GS_A_4931, GS_A_4933, GS_A_4384, GS_A_5339, GS_A_5131, GS_A_5518, GS_A_4832, GS_A_4013, GS_A_4024, GS_A_4033, GS_A_4036, GS_A_4763, GS_A_4054, GS_A_3932, GS_A_3834, GS_A_3842, GS_A_3931,
                    GS_A_4879, GS_A_3832, GS_A_3833, GS_A_3840, GS_A_4817, GS_A_3934, GS_A_3937, GS_A_3939, GS_A_3946, GS_A_4444, GS_A_4445, GS_A_4446, GS_A_3695, GS_A_3696, GS_A_5025, GS_A_5038, GS_A_3702, GS_A_4543, GS_A_4545, GS_A_3804,
                    GS_A_3807, GS_A_3805, GS_A_3806, GS_A_4146, GS_A_4147, GS_A_4148, GS_A_4149, GS_A_4145, GS_A_4159, GS_A_4160, GS_A_5513, GS_A_4705, GS_A_4706, GS_A_4714, GS_A_4715, GS_A_4716, GS_A_4725, GS_A_4726, GS_A_4717, GS_A_4718,
                    GS_A_5516, GS_A_4719, GS_A_4722, GS_A_4724, GS_A_4589, GS_A_4590, GS_A_4604, GS_A_4608, GS_A_4609, GS_A_4610, GS_A_4611, GS_A_4613, GS_A_4830, GS_A_4615, GS_A_4617, GS_A_4618, GS_A_5280, GS_A_4738, GS_A_4741, GS_A_5066,
                    GS_A_4936, GS_A_4937, GS_A_4939, GS_A_4637, GS_A_4829, GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4651, GS_A_4898, GS_A_4899, GS_A_4652, GS_A_4653, GS_A_4654, GS_A_4655,
                    GS_A_4656, GS_A_4657, GS_A_4660, GS_A_4749, GS_A_4661, GS_A_4662, GS_A_4663, GS_A_5077, GS_A_4751, GS_A_4669, GS_A_4674, GS_A_4957, GS_A_4676, GS_A_4677, GS_A_4678, GS_A_5517, GS_A_4684, GS_A_4686, GS_A_4687, GS_A_4688,
                    GS_A_4690, GS_A_4691, GS_A_4692, GS_A_5090, GS_A_4693, GS_A_4694, TIP1_A_5993, TIP1_A_5996, TIP1_A_5998, TIP1_A_5997, TIP1_A_6002, TIP1_A_3559, TIP1_A_3886, TIP1_A_3605, TIP1_A_3607, TIP1_A_3609, TIP1_A_4240,
                    TIP1_A_3612, TIP1_A_3615, TIP1_A_4430, TIP1_A_4466, TIP1_A_4431, TIP1_A_3620, TIP1_A_5097, TIP1_A_5098, TIP1_A_3621, TIP1_A_3623, TIP1_A_4242, TIP1_A_3651, TIP1_A_4244, TIP1_A_4246, TIP1_A_4247, TIP1_A_4248, TIP1_A_3647,
                    TIP1_A_3654, TIP1_A_4432, TIP1_A_4433, TIP1_A_5099, TIP1_A_5100, TIP1_A_4469, TIP1_A_5101, TIP1_A_5102, TIP1_A_4470);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_5052, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_2805, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772,
                    TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_4173, GS_A_4174, GS_A_4175, GS_A_4176, GS_A_4177, GS_A_4180, GS_A_4183, GS_A_4185, GS_A_4186, GS_A_4188, GS_A_4190,
                    GS_A_4192, GS_A_4195, GS_A_4199, GS_A_4201, GS_A_4202, GS_A_5083, GS_A_4203, GS_A_4207, GS_A_4209, GS_A_4394, GS_A_4210, GS_A_4211, GS_A_4212, GS_A_4214, GS_A_4215, GS_A_4216, GS_A_4217, GS_A_4218, GS_A_4221, GS_A_4349,
                    GS_A_4226, GS_A_4227, GS_A_4229, GS_A_4230, GS_A_4231, GS_A_4238, GS_A_4241, GS_A_4242, GS_A_4245, GS_A_4248, GS_A_4250, GS_A_4251, GS_A_4252, GS_A_4254, GS_A_4256, GS_A_4262, GS_A_5084, GS_A_4263, GS_A_4264, GS_A_4265,
                    GS_A_4266, GS_A_4267, GS_A_4269, GS_A_4276, GS_A_4277, GS_A_4278, GS_A_4281, GS_A_4282, GS_A_4283, GS_A_4296, GS_A_4297, GS_A_4299, GS_A_4300, GS_A_4302, GS_A_4318, GS_A_4319, GS_A_4321, GS_A_4322, GS_A_4323, GS_A_4324,
                    GS_A_4325, GS_A_4326, GS_A_4327, GS_A_4328, GS_A_4331, GS_A_4332, GS_A_4335, GS_A_4337, GS_A_4340, GS_A_4341, GS_A_4344, GS_A_4908, GS_A_4909, GS_A_4910, GS_A_4912, GS_A_4913, GS_A_4915, GS_A_4917, GS_A_4923, GS_A_4925,
                    GS_A_4927, GS_A_4930, GS_A_5542, GS_A_5526, GS_A_4009, GS_A_4831, GS_A_4010, GS_A_4011, GS_A_4012, GS_A_4018, GS_A_4027, GS_A_4759, GS_A_4805, GS_A_3824, GS_A_4810, GS_A_3931, GS_A_4820, GS_A_3695, GS_A_3696, GS_A_3697,
                    GS_A_4541, GS_A_5039, GS_A_3813, GS_A_5018, GS_A_5033, GS_A_4149, GS_A_4155, GS_A_5028, GS_A_3055, GS_A_3058, GS_A_4257, GS_A_5511, GS_A_5528, GS_A_4697, GS_A_4702, GS_A_5212, GS_A_4703, GS_A_4704, GS_A_4828, GS_A_4708,
                    GS_A_5074, GS_A_4721, GS_A_4727, GS_A_4588, GS_A_5337, GS_A_4730, GS_A_4731, GS_A_4735, GS_A_4737, GS_A_4739, GS_A_5514, GS_A_4740, GS_A_4935, GS_A_5515, GS_A_4938, GS_A_4742, GS_A_4640, GS_A_4670, GS_A_4679, GS_A_4685,
                    GS_A_4689, TIP1_A_5994, TIP1_A_5995, TIP1_A_6003, TIP1_A_5999, TIP1_A_3547, TIP1_A_3877, TIP1_A_3880, TIP1_A_3894, TIP1_A_4427, TIP1_A_3643, TIP1_A_5376, TIP1_A_3883, TIP1_A_3555, TIP1_A_3884, TIP1_A_3887, TIP1_A_3597,
                    TIP1_A_4464, TIP1_A_3598, TIP1_A_3599, TIP1_A_3889, TIP1_A_3601, TIP1_A_3603, TIP1_A_4465, TIP1_A_3606, TIP1_A_3608, TIP1_A_3611, TIP1_A_3613, TIP1_A_3614, TIP1_A_3616, TIP1_A_3890, TIP1_A_3618, TIP1_A_4429, TIP1_A_3619,
                    TIP1_A_3622, TIP1_A_3624, TIP1_A_3626, TIP1_A_3891, TIP1_A_3627, TIP1_A_3629, TIP1_A_3644, TIP1_A_3645, TIP1_A_3648, TIP1_A_3649, TIP1_A_3650, TIP1_A_3652, TIP1_A_3653, TIP1_A_3646, TIP1_A_4248, TIP1_A_4468, GS_A_4173,
                    GS_A_4191, GS_A_4230, GS_A_4396, GS_A_4247, GS_A_4249, GS_A_4255, GS_A_4259, GS_A_4260, GS_A_4261, GS_A_4268, GS_A_4270, GS_A_4271, GS_A_4272, GS_A_4273, GS_A_4274, GS_A_4275, GS_A_4276, GS_A_4279, GS_A_4284, GS_A_4285,
                    GS_A_4287, GS_A_4288, GS_A_4289, GS_A_4290, GS_A_4291, GS_A_4292, GS_A_4294, GS_A_4295, GS_A_4304, GS_A_4305, GS_A_4306, GS_A_4307, GS_A_4308, GS_A_4309, GS_A_4310, GS_A_4311, GS_A_4312, GS_A_4313, GS_A_4314, GS_A_4315,
                    GS_A_4316, GS_A_4317, GS_A_4339, GS_A_4342, GS_A_4343, GS_A_4925, GS_A_4435, GS_A_4437, GS_A_4451, GS_A_4453, GS_A_4473, GS_A_4474, GS_A_4475, GS_A_4480, GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537, GS_A_4539, GS_A_4357,
                    GS_A_4359, GS_A_4361, GS_A_4362, GS_A_4367, GS_A_4368, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322, GS_A_5339, GS_A_4388, GS_A_4393, GS_A_5131, GS_A_5079, GS_A_4054, GS_A_4879, GS_A_4817, GS_A_4641,
                    GS_A_4748, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2214, GS_A_2087, GS_A_2213, GS_A_2076, GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021,
                    GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343, GS_A_2345, GS_A_2347, GS_A_2360, GS_A_2361,
                    GS_A_2362, GS_A_2363, GS_A_2366, GS_A_3078, GS_A_3125, GS_A_3130, GS_A_3139, GS_A_3141, GS_A_3149, TIP1_A_5087, TIP1_A_4230, TIP1_A_4231, TIP1_A_4232, TIP1_A_4234, TIP1_A_4235, TIP1_A_3660, TIP1_A_3548, TIP1_A_3549,
                    TIP1_A_3550, TIP1_A_3881, TIP1_A_3554, TIP1_A_3555, TIP1_A_3557, GS_A_4436, GS_A_4448, GS_A_4449, GS_A_4450, GS_A_4455, GS_A_4456, GS_A_4457, GS_A_4458, GS_A_4459, GS_A_4460, GS_A_4461, GS_A_4462, GS_A_4463, GS_A_4464,
                    GS_A_4465, GS_A_4466, GS_A_4467, GS_A_4468, GS_A_4470, GS_A_4471, GS_A_4476, GS_A_4477, GS_A_4478, GS_A_4479, GS_A_4481, GS_A_4482, GS_A_4504, GS_A_4506, GS_A_4507, GS_A_4508, GS_A_4509, GS_A_4511, GS_A_4512, GS_A_4513,
                    GS_A_4514, GS_A_4515, GS_A_4516, GS_A_4517, GS_A_4518, GS_A_4519, GS_A_4520, GS_A_4521, GS_A_4522, GS_A_4523, GS_A_4524, GS_A_4525, GS_A_4526, GS_A_4527, GS_A_4528, GS_A_4530, GS_A_4531, GS_A_4532, GS_A_4533, GS_A_4534,
                    GS_A_4535, GS_A_4538, GS_A_4540, GS_A_5541, GS_A_5526, GS_A_5518, GS_A_4965, GS_A_3784, GS_A_5324, GS_A_2355, GS_A_2356, GS_A_2357, GS_A_2359);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_X_509_TSP_nonQES_Komp_PTV1_7_0("gemProdT_X.509_TSP_nonQES_Komp_PTV1.7.0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4178, GS_A_4179, GS_A_4181, GS_A_4208, GS_A_4906, GS_A_4395, GS_A_4213, GS_A_4348, GS_A_4219, GS_A_4225, GS_A_4228, GS_A_4303, GS_A_4352, GS_A_4333, GS_A_4336, GS_A_4345, GS_A_4911, GS_A_4914,
                    GS_A_4919, GS_A_4926, GS_A_4929, GS_A_4931, GS_A_4933, GS_A_4384, GS_A_5339, GS_A_5131, GS_A_4832, GS_A_4013, GS_A_4024, GS_A_4033, GS_A_4036, GS_A_4763, GS_A_4054, GS_A_3932, GS_A_3834, GS_A_3842, GS_A_3931, GS_A_4879,
                    GS_A_3832, GS_A_3833, GS_A_3840, GS_A_4817, GS_A_3934, GS_A_3937, GS_A_3939, GS_A_3946, GS_A_4444, GS_A_4445, GS_A_4446, GS_A_3695, GS_A_3696, GS_A_5025, GS_A_5038, GS_A_3702, GS_A_4543, GS_A_4545, GS_A_3804, GS_A_3807,
                    GS_A_3805, GS_A_3806, GS_A_4146, GS_A_4147, GS_A_4148, GS_A_4149, GS_A_4145, GS_A_4159, GS_A_4160, GS_A_4705, GS_A_4706, GS_A_4714, GS_A_4715, GS_A_4716, GS_A_4725, GS_A_4726, GS_A_4717, GS_A_4718, GS_A_4719, GS_A_5323,
                    GS_A_4722, GS_A_4724, GS_A_4589, GS_A_4590, GS_A_4604, GS_A_4608, GS_A_4609, GS_A_4610, GS_A_4611, GS_A_4613, GS_A_4830, GS_A_4615, GS_A_4617, GS_A_4618, GS_A_5280, GS_A_4738, GS_A_4921, GS_A_4741, GS_A_5066, GS_A_4936,
                    GS_A_4937, GS_A_4939, GS_A_4637, GS_A_4829, GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4651, GS_A_4898, GS_A_4899, GS_A_4652, GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656,
                    GS_A_4657, GS_A_4660, GS_A_4749, GS_A_4661, GS_A_4662, GS_A_4663, GS_A_5077, GS_A_4751, GS_A_4669, GS_A_4674, GS_A_4957, GS_A_4676, GS_A_4677, GS_A_4678, GS_A_4684, GS_A_4686, GS_A_4687, GS_A_4688, GS_A_4690, GS_A_4691,
                    GS_A_4692, GS_A_5090, GS_A_4693, GS_A_4694, TIP1_A_5993, TIP1_A_5996, TIP1_A_5998, TIP1_A_5997, TIP1_A_6002, TIP1_A_3559, TIP1_A_3886, TIP1_A_3605, TIP1_A_3607, TIP1_A_3609, TIP1_A_4240, TIP1_A_3612, TIP1_A_3615,
                    TIP1_A_4430, TIP1_A_4466, TIP1_A_4431, TIP1_A_3620, TIP1_A_5097, TIP1_A_5098, TIP1_A_3621, TIP1_A_3623, TIP1_A_4242, TIP1_A_3651, TIP1_A_4244, TIP1_A_4246, TIP1_A_4247, TIP1_A_4248, TIP1_A_3647, TIP1_A_3654, TIP1_A_4432,
                    TIP1_A_4433, TIP1_A_5099, TIP1_A_5100, TIP1_A_4469, TIP1_A_5101, TIP1_A_5102, TIP1_A_4470);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_5052, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_2805, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6529,
                    TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_4173, GS_A_4174, GS_A_4175, GS_A_4176, GS_A_4177, GS_A_4180, GS_A_4183, GS_A_4185, GS_A_4186, GS_A_4188, GS_A_4190, GS_A_4192, GS_A_4195,
                    GS_A_4199, GS_A_4201, GS_A_4202, GS_A_5083, GS_A_4203, GS_A_4205, GS_A_4207, GS_A_4209, GS_A_4394, GS_A_4210, GS_A_4211, GS_A_4212, GS_A_4214, GS_A_4215, GS_A_4216, GS_A_4217, GS_A_4218, GS_A_4221, GS_A_4349, GS_A_4226,
                    GS_A_4227, GS_A_4229, GS_A_4230, GS_A_4231, GS_A_4238, GS_A_4241, GS_A_4242, GS_A_4245, GS_A_4248, GS_A_4250, GS_A_4251, GS_A_4252, GS_A_4254, GS_A_4256, GS_A_4257, GS_A_4262, GS_A_5084, GS_A_4263, GS_A_4264, GS_A_4265,
                    GS_A_4266, GS_A_4267, GS_A_4269, GS_A_4276, GS_A_4277, GS_A_4278, GS_A_4281, GS_A_4282, GS_A_4283, GS_A_4296, GS_A_4297, GS_A_4299, GS_A_4300, GS_A_4302, GS_A_4318, GS_A_4319, GS_A_4321, GS_A_4322, GS_A_4323, GS_A_4324,
                    GS_A_4325, GS_A_4326, GS_A_4327, GS_A_4328, GS_A_4331, GS_A_4332, GS_A_4335, GS_A_4337, GS_A_4338, GS_A_4340, GS_A_4341, GS_A_4344, GS_A_4908, GS_A_4909, GS_A_4910, GS_A_4912, GS_A_4913, GS_A_4915, GS_A_4917, GS_A_4923,
                    GS_A_4925, GS_A_4927, GS_A_4930, GS_A_4009, GS_A_4831, GS_A_4010, GS_A_4011, GS_A_4012, GS_A_4018, GS_A_4027, GS_A_4759, GS_A_4805, GS_A_3824, GS_A_4810, GS_A_3931, GS_A_5346, GS_A_4820, GS_A_3695, GS_A_3696, GS_A_3697,
                    GS_A_4541, GS_A_5039, GS_A_3813, GS_A_5018, GS_A_5033, GS_A_4149, GS_A_4155, GS_A_5028, GS_A_3055, GS_A_3058, GS_A_4697, GS_A_4702, GS_A_5212, GS_A_4703, GS_A_4704, GS_A_4828, GS_A_4708, GS_A_5074, GS_A_4721, GS_A_4727,
                    GS_A_4588, GS_A_5337, GS_A_4603, GS_A_4730, GS_A_4731, GS_A_4735, GS_A_4737, GS_A_4902, GS_A_4739, GS_A_4740, GS_A_4935, GS_A_4938, GS_A_4742, GS_A_4640, GS_A_4670, GS_A_4679, GS_A_4680, GS_A_4685, GS_A_4689,
                    TIP1_A_5994, TIP1_A_5995, TIP1_A_6003, TIP1_A_5999, TIP1_A_3547, TIP1_A_3877, TIP1_A_3880, TIP1_A_3894, TIP1_A_4427, TIP1_A_3643, TIP1_A_5376, TIP1_A_3883, TIP1_A_3555, TIP1_A_3884, TIP1_A_3887, TIP1_A_3597, TIP1_A_4464,
                    TIP1_A_3598, TIP1_A_3599, TIP1_A_3889, TIP1_A_3601, TIP1_A_3603, TIP1_A_4465, TIP1_A_3606, TIP1_A_3608, TIP1_A_3611, TIP1_A_3613, TIP1_A_3614, TIP1_A_3616, TIP1_A_3890, TIP1_A_3618, TIP1_A_4429, TIP1_A_3619, TIP1_A_3622,
                    TIP1_A_3624, TIP1_A_3626, TIP1_A_3891, TIP1_A_3627, TIP1_A_3629, TIP1_A_3644, TIP1_A_3645, TIP1_A_3648, TIP1_A_3649, TIP1_A_3650, TIP1_A_3652, TIP1_A_3653, TIP1_A_3646, TIP1_A_4248, TIP1_A_4468, GS_A_4173, GS_A_4191,
                    GS_A_4230, GS_A_4396, GS_A_4247, GS_A_4249, GS_A_4255, GS_A_4259, GS_A_4260, GS_A_4261, GS_A_4268, GS_A_4270, GS_A_4271, GS_A_4272, GS_A_4273, GS_A_4274, GS_A_4275, GS_A_4276, GS_A_4279, GS_A_4284, GS_A_4285, GS_A_4287,
                    GS_A_4288, GS_A_4289, GS_A_4290, GS_A_4291, GS_A_4292, GS_A_4294, GS_A_4295, GS_A_4304, GS_A_4305, GS_A_4306, GS_A_4307, GS_A_4308, GS_A_4309, GS_A_4310, GS_A_4311, GS_A_4312, GS_A_4313, GS_A_4314, GS_A_4315, GS_A_4316,
                    GS_A_4317, GS_A_4339, GS_A_4342, GS_A_4343, GS_A_4925, GS_A_4435, GS_A_4437, GS_A_4451, GS_A_4453, GS_A_4473, GS_A_4474, GS_A_4480, GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537, GS_A_4539, GS_A_4357, GS_A_4359, GS_A_4361,
                    GS_A_4362, GS_A_4367, GS_A_4368, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322, GS_A_5339, GS_A_4388, GS_A_4393, GS_A_5131, GS_A_5079, GS_A_4054, GS_A_4879, GS_A_4817, GS_A_4641, GS_A_4748, GS_A_3760,
                    GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2214, GS_A_2087, GS_A_2213, GS_A_2076, GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944,
                    GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343, GS_A_2345, GS_A_2347, GS_A_2360, GS_A_2361, GS_A_2362, GS_A_2363,
                    GS_A_2366, GS_A_3078, GS_A_3125, GS_A_3130, GS_A_3139, GS_A_3141, GS_A_3149, TIP1_A_5087, TIP1_A_4230, TIP1_A_4231, TIP1_A_4232, TIP1_A_4234, TIP1_A_4235, TIP1_A_3660, TIP1_A_3548, TIP1_A_3549, TIP1_A_3550, TIP1_A_3881,
                    TIP1_A_3554, TIP1_A_3555, TIP1_A_3557, GS_A_4436, GS_A_4448, GS_A_4449, GS_A_4450, GS_A_4455, GS_A_4456, GS_A_4457, GS_A_4458, GS_A_4459, GS_A_4460, GS_A_4461, GS_A_4462, GS_A_4463, GS_A_4464, GS_A_4465, GS_A_4466,
                    GS_A_4467, GS_A_4468, GS_A_4470, GS_A_4471, GS_A_4476, GS_A_4477, GS_A_4478, GS_A_4479, GS_A_4481, GS_A_4482, GS_A_4504, GS_A_4506, GS_A_4507, GS_A_4508, GS_A_4509, GS_A_4511, GS_A_4512, GS_A_4513, GS_A_4514, GS_A_4515,
                    GS_A_4516, GS_A_4517, GS_A_4518, GS_A_4519, GS_A_4520, GS_A_4521, GS_A_4522, GS_A_4523, GS_A_4524, GS_A_4525, GS_A_4526, GS_A_4527, GS_A_4528, GS_A_4530, GS_A_4531, GS_A_4532, GS_A_4533, GS_A_4534, GS_A_4535, GS_A_4538,
                    GS_A_4540, GS_A_3784, GS_A_5324, GS_A_2355, GS_A_2356, GS_A_2357, GS_A_2359);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_X_509_TSP_nonQES_HBA_PTV1_7_0_0("gemProdT_X.509_TSP_nonQES_HBA_PTV1.7.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4178, GS_A_4179, GS_A_4181, GS_A_4213, GS_A_4303, GS_A_4352, GS_A_4911, GS_A_4914, GS_A_4919, GS_A_4926, GS_A_4929, GS_A_4931, GS_A_4933, GS_A_4384, GS_A_5339, GS_A_5131, GS_A_5518, GS_A_4832,
                    GS_A_4013, GS_A_4024, GS_A_4033, GS_A_4036, GS_A_4763, GS_A_4054, GS_A_3932, GS_A_3834, GS_A_3842, GS_A_3931, GS_A_3832, GS_A_3833, GS_A_3840, GS_A_4817, GS_A_3934, GS_A_3937, GS_A_3939, GS_A_3946, GS_A_4442, GS_A_4444,
                    GS_A_4445, GS_A_5038, GS_A_4543, GS_A_4545, GS_A_3804, GS_A_3807, GS_A_3805, GS_A_3806, GS_A_4146, GS_A_4147, GS_A_4148, GS_A_4149, GS_A_4145, GS_A_4159, GS_A_4160, GS_A_5513, GS_A_4697, GS_A_4705, GS_A_4706, GS_A_4709,
                    GS_A_4714, GS_A_4715, GS_A_4717, GS_A_4718, GS_A_4719, GS_A_4722, GS_A_4724, GS_A_4589, GS_A_4590, GS_A_5042, GS_A_5531, GS_A_5532, GS_A_4738, GS_A_4741, GS_A_4936, GS_A_4637, GS_A_4829, GS_A_5043, GS_A_4642, GS_A_4643,
                    GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4651, GS_A_4898, GS_A_4899, GS_A_4652, GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4660, GS_A_4749, GS_A_4661, GS_A_4662, GS_A_4663,
                    GS_A_5077, GS_A_4751, GS_A_4669, GS_A_5053, GS_A_5051, GS_A_4674, GS_A_4957, GS_A_4676, GS_A_4677, GS_A_4678, GS_A_5517, GS_A_4684, GS_A_4686, GS_A_4688, GS_A_4690, GS_A_4691, GS_A_4692, GS_A_5090, GS_A_4693, GS_A_4694,
                    TIP1_A_5993, TIP1_A_5996, TIP1_A_5998, TIP1_A_5997, TIP1_A_6002, TIP1_A_3894, TIP1_A_3570, TIP1_A_3571, TIP1_A_3577, TIP1_A_3886, TIP1_A_3594, TIP1_A_3639, TIP1_A_3640);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_5052, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_2805, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772,
                    TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_4173, GS_A_4174, GS_A_4175, GS_A_4176, GS_A_4177, GS_A_4180, GS_A_4182, GS_A_4183, GS_A_4185, GS_A_4186, GS_A_4188,
                    GS_A_4189, GS_A_4190, GS_A_4192, GS_A_4195, GS_A_4199, GS_A_4201, GS_A_4202, GS_A_5083, GS_A_4203, GS_A_4207, GS_A_4208, GS_A_4209, GS_A_4394, GS_A_4906, GS_A_4395, GS_A_4210, GS_A_4211, GS_A_4212, GS_A_4214, GS_A_4348,
                    GS_A_4215, GS_A_4216, GS_A_4217, GS_A_4218, GS_A_4219, GS_A_4221, GS_A_4349, GS_A_4225, GS_A_4226, GS_A_4227, GS_A_4228, GS_A_4229, GS_A_4230, GS_A_4231, GS_A_4238, GS_A_4241, GS_A_4242, GS_A_4245, GS_A_4248, GS_A_4250,
                    GS_A_4251, GS_A_4252, GS_A_4254, GS_A_4256, GS_A_4262, GS_A_5084, GS_A_4263, GS_A_4264, GS_A_4265, GS_A_4266, GS_A_4267, GS_A_4269, GS_A_4276, GS_A_4277, GS_A_4278, GS_A_4281, GS_A_4282, GS_A_4283, GS_A_4296, GS_A_4297,
                    GS_A_4299, GS_A_4300, GS_A_4302, GS_A_4318, GS_A_4319, GS_A_4321, GS_A_4322, GS_A_4323, GS_A_4324, GS_A_4325, GS_A_4326, GS_A_4327, GS_A_4328, GS_A_4332, GS_A_4908, GS_A_4909, GS_A_4910, GS_A_4912, GS_A_4913, GS_A_4915,
                    GS_A_4916, GS_A_4917, GS_A_4923, GS_A_4925, GS_A_4927, GS_A_4930, GS_A_5542, GS_A_5526, GS_A_4009, GS_A_4831, GS_A_4010, GS_A_4011, GS_A_4012, GS_A_4018, GS_A_4027, GS_A_4759, GS_A_4805, GS_A_3824, GS_A_4810, GS_A_3931,
                    GS_A_4820, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5025, GS_A_5039, GS_A_4689, TIP1_A_5994, TIP1_A_5995, TIP1_A_6003, TIP1_A_5999, TIP1_A_3547, TIP1_A_3877, TIP1_A_5088, TIP1_A_3880, TIP1_A_4427, TIP1_A_4428,
                    TIP1_A_3630, TIP1_A_5376, TIP1_A_3883, TIP1_A_3555, TIP1_A_3558, TIP1_A_3564, TIP1_A_3565, TIP1_A_3567, TIP1_A_3569, TIP1_A_5089, TIP1_A_5086, TIP1_A_3580, TIP1_A_3581, TIP1_A_5090, TIP1_A_3884, TIP1_A_3582, TIP1_A_3591,
                    TIP1_A_3592, TIP1_A_3887, TIP1_A_3888, TIP1_A_3596, TIP1_A_3631, TIP1_A_3632, TIP1_A_3633, TIP1_A_3634, TIP1_A_3635, TIP1_A_3638, TIP1_A_3642, TIP1_A_4467, GS_A_4173, GS_A_4191, GS_A_4906, GS_A_4230, GS_A_4396,
                    GS_A_4247, GS_A_4249, GS_A_4255, GS_A_4259, GS_A_4260, GS_A_4261, GS_A_4268, GS_A_4270, GS_A_4271, GS_A_4272, GS_A_4273, GS_A_4274, GS_A_4275, GS_A_4276, GS_A_4279, GS_A_4284, GS_A_4285, GS_A_4287, GS_A_4288, GS_A_4289,
                    GS_A_4290, GS_A_4291, GS_A_4292, GS_A_4294, GS_A_4295, GS_A_4304, GS_A_4305, GS_A_4306, GS_A_4307, GS_A_4308, GS_A_4309, GS_A_4310, GS_A_4311, GS_A_4312, GS_A_4313, GS_A_4314, GS_A_4315, GS_A_4316, GS_A_4317, GS_A_4925,
                    GS_A_4435, GS_A_4437, GS_A_4451, GS_A_4453, GS_A_4473, GS_A_4474, GS_A_4475, GS_A_4480, GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537, GS_A_4539, GS_A_4357, GS_A_4359, GS_A_4361, GS_A_4362, GS_A_4367, GS_A_4368, GS_A_4385,
                    GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322, GS_A_5339, GS_A_4388, GS_A_4393, GS_A_5131, GS_A_5079, GS_A_4062, GS_A_4817, GS_A_4641, GS_A_4748, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984,
                    GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2214, GS_A_2087, GS_A_2213, GS_A_2076, GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309,
                    GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343, GS_A_2345, GS_A_2347, GS_A_2360, GS_A_2361, GS_A_2362, GS_A_2363, GS_A_2366, GS_A_3078, GS_A_3125, GS_A_3130, GS_A_3139,
                    GS_A_3141, GS_A_3149, TIP1_A_5087, TIP1_A_4230, TIP1_A_4231, TIP1_A_4232, TIP1_A_4234, TIP1_A_4235, TIP1_A_3660, TIP1_A_3548, TIP1_A_3549, TIP1_A_3550, TIP1_A_3881, TIP1_A_3554, TIP1_A_3555, TIP1_A_3557, TIP1_A_3590,
                    TIP1_A_3595, TIP1_A_3596, GS_A_4436, GS_A_4448, GS_A_4449, GS_A_4450, GS_A_4455, GS_A_4456, GS_A_4457, GS_A_4458, GS_A_4459, GS_A_4460, GS_A_4461, GS_A_4462, GS_A_4463, GS_A_4464, GS_A_4465, GS_A_4466, GS_A_4467,
                    GS_A_4468, GS_A_4470, GS_A_4471, GS_A_4476, GS_A_4477, GS_A_4478, GS_A_4479, GS_A_4481, GS_A_4482, GS_A_4504, GS_A_4506, GS_A_4507, GS_A_4508, GS_A_4509, GS_A_4511, GS_A_4512, GS_A_4513, GS_A_4514, GS_A_4515, GS_A_4516,
                    GS_A_4517, GS_A_4518, GS_A_4519, GS_A_4520, GS_A_4521, GS_A_4522, GS_A_4523, GS_A_4524, GS_A_4525, GS_A_4526, GS_A_4527, GS_A_4528, GS_A_4530, GS_A_4531, GS_A_4532, GS_A_4533, GS_A_4534, GS_A_4535, GS_A_4538, GS_A_4540,
                    GS_A_5541, GS_A_5526, GS_A_5518, GS_A_4965, GS_A_3784, GS_A_5324, GS_A_2355, GS_A_2356, GS_A_2357, GS_A_2359, GS_A_3702, GS_A_3813, GS_A_5018, GS_A_5033, GS_A_4149, GS_A_4155, GS_A_5028, GS_A_3055, GS_A_3058, GS_A_4257,
                    GS_A_5511, GS_A_5528, GS_A_4703, GS_A_4704, GS_A_4828, GS_A_4584, GS_A_4901, GS_A_4713, GS_A_4727, GS_A_4588, GS_A_5337, GS_A_4730, GS_A_4731, GS_A_4735, GS_A_4737, GS_A_4739, GS_A_5514, GS_A_4740, GS_A_4935, GS_A_4640,
                    GS_A_4670, GS_A_4679, GS_A_4685, GS_A_4687);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_X_509_TSP_nonQES_eGK_PTV1_7_0_0("gemProdT_X.509_TSP_nonQES_eGK_PTV1.7.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4384, GS_A_5131, GS_A_5518, GS_A_4832, GS_A_4013, GS_A_4024, GS_A_4033, GS_A_3834, GS_A_3842, GS_A_3931, GS_A_3832, GS_A_3833, GS_A_3840, GS_A_4817, GS_A_3934, GS_A_3937, GS_A_3939, GS_A_3946,
                    GS_A_5038, GS_A_4146, GS_A_4147, GS_A_4148, GS_A_4149, GS_A_4145, GS_A_4159, GS_A_4160, GS_A_5513, GS_A_4637, GS_A_4829, GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4651,
                    GS_A_4898, GS_A_4899, GS_A_4652, GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4660, GS_A_4749, GS_A_4661, GS_A_4662, GS_A_4663, GS_A_5077, GS_A_4751, GS_A_4669, GS_A_4674, GS_A_4957, GS_A_4675, GS_A_4677,
                    GS_A_4678, GS_A_5517, GS_A_4684, GS_A_4686, GS_A_4687, GS_A_4688, GS_A_4690, GS_A_4691, GS_A_4692, GS_A_5090, GS_A_4694, TIP1_A_5993, TIP1_A_5996, TIP1_A_5998, TIP1_A_5997, TIP1_A_6002);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_5052, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_2805, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772,
                    TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_4173, GS_A_4174, GS_A_4175, GS_A_4176, GS_A_4177, GS_A_4178, GS_A_4179, GS_A_4180, GS_A_4181, GS_A_4182, GS_A_4183,
                    GS_A_4185, GS_A_4186, GS_A_4187, GS_A_4188, GS_A_4189, GS_A_4190, GS_A_4192, GS_A_4195, GS_A_4199, GS_A_4201, GS_A_4202, GS_A_5083, GS_A_4203, GS_A_4207, GS_A_4208, GS_A_4209, GS_A_4394, GS_A_4906, GS_A_4395, GS_A_4210,
                    GS_A_4211, GS_A_4212, GS_A_4213, GS_A_4214, GS_A_4348, GS_A_4215, GS_A_4216, GS_A_4217, GS_A_4218, GS_A_4219, GS_A_4221, GS_A_4349, GS_A_4225, GS_A_4226, GS_A_4227, GS_A_4228, GS_A_4229, GS_A_4230, GS_A_4231, GS_A_4234,
                    GS_A_4235, GS_A_4236, GS_A_4237, GS_A_4238, GS_A_4241, GS_A_4242, GS_A_4245, GS_A_4248, GS_A_4250, GS_A_4251, GS_A_4252, GS_A_4254, GS_A_4256, GS_A_4262, GS_A_5084, GS_A_4263, GS_A_4264, GS_A_4265, GS_A_4266, GS_A_4267,
                    GS_A_4269, GS_A_4276, GS_A_4277, GS_A_4278, GS_A_4281, GS_A_4282, GS_A_4283, GS_A_4296, GS_A_4297, GS_A_4299, GS_A_4300, GS_A_4302, GS_A_4303, GS_A_4355, GS_A_4352, GS_A_4318, GS_A_4319, GS_A_4321, GS_A_4322, GS_A_4323,
                    GS_A_4324, GS_A_4325, GS_A_4326, GS_A_4327, GS_A_4328, GS_A_4332, GS_A_4908, GS_A_4909, GS_A_4910, GS_A_4911, GS_A_4912, GS_A_4913, GS_A_4914, GS_A_4915, GS_A_4916, GS_A_4917, GS_A_4919, GS_A_4923, GS_A_4925, GS_A_4926,
                    GS_A_4927, GS_A_4928, GS_A_4929, GS_A_4930, GS_A_4931, GS_A_4933, GS_A_5542, GS_A_4009, GS_A_4831, GS_A_4010, GS_A_4011, GS_A_4012, GS_A_4018, GS_A_4027, GS_A_4759, GS_A_4036, GS_A_4763, GS_A_4805, GS_A_3824, GS_A_3932,
                    GS_A_4810, GS_A_3931, GS_A_4820, GS_A_4442, GS_A_4444, GS_A_4445, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5025, GS_A_5039, GS_A_3702, GS_A_4543, GS_A_4545, GS_A_3813, GS_A_5018, GS_A_3804, GS_A_3807, GS_A_3805,
                    GS_A_3806, GS_A_5033, GS_A_4149, GS_A_4155, GS_A_5028, GS_A_3055, GS_A_3058, GS_A_4257, GS_A_5511, GS_A_5528, GS_A_4697, GS_A_4704, GS_A_4705, GS_A_4706, GS_A_4572, GS_A_4573, GS_A_4575, GS_A_4576, GS_A_4577, GS_A_4714,
                    GS_A_4715, GS_A_4717, GS_A_4718, GS_A_4719, GS_A_4722, GS_A_4724, GS_A_4727, GS_A_4588, GS_A_4590, GS_A_4595, GS_A_4596, GS_A_4598, GS_A_4599, GS_A_4730, GS_A_4731, GS_A_4732, GS_A_4735, GS_A_4737, GS_A_4738, GS_A_4739,
                    GS_A_5514, GS_A_4740, GS_A_4741, GS_A_4935, GS_A_4936, GS_A_4640, GS_A_4670, GS_A_4679, GS_A_4685, GS_A_4689, TIP1_A_5994, TIP1_A_5995, TIP1_A_6003, TIP1_A_5999, TIP1_A_3547, TIP1_A_3877, TIP1_A_3880, TIP1_A_4427,
                    TIP1_A_4428, TIP1_A_3630, TIP1_A_5376, TIP1_A_3883, TIP1_A_3555, TIP1_A_3558, TIP1_A_3564, TIP1_A_3565, TIP1_A_3567, TIP1_A_3569, TIP1_A_3574, TIP1_A_3575, TIP1_A_3576, TIP1_A_3577, TIP1_A_3580, TIP1_A_3581, TIP1_A_3884,
                    TIP1_A_3591, TIP1_A_3886, TIP1_A_3592, TIP1_A_3887, TIP1_A_3888, TIP1_A_3594, TIP1_A_3596, TIP1_A_3631, TIP1_A_3632, TIP1_A_3633, TIP1_A_3634, TIP1_A_3635, TIP1_A_3637, TIP1_A_3638, TIP1_A_3639, TIP1_A_3640, TIP1_A_3642,
                    GS_A_4173, GS_A_4191, GS_A_4230, GS_A_4396, GS_A_4247, GS_A_4249, GS_A_4255, GS_A_4259, GS_A_4260, GS_A_4261, GS_A_4268, GS_A_4270, GS_A_4271, GS_A_4272, GS_A_4273, GS_A_4274, GS_A_4275, GS_A_4276, GS_A_4279, GS_A_4284,
                    GS_A_4285, GS_A_4287, GS_A_4288, GS_A_4289, GS_A_4290, GS_A_4291, GS_A_4292, GS_A_4294, GS_A_4295, GS_A_4304, GS_A_4305, GS_A_4306, GS_A_4307, GS_A_4308, GS_A_4309, GS_A_4310, GS_A_4311, GS_A_4312, GS_A_4313, GS_A_4314,
                    GS_A_4315, GS_A_4316, GS_A_4317, GS_A_4925, GS_A_4473, GS_A_4474, GS_A_4475, GS_A_4357, GS_A_4359, GS_A_4361, GS_A_4362, GS_A_4367, GS_A_4368, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322, GS_A_4388,
                    GS_A_4393, GS_A_5131, GS_A_5079, GS_A_4817, GS_A_4574, GS_A_4641, GS_A_4748, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2087, GS_A_2213,
                    GS_A_2076, GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2345, GS_A_2347,
                    GS_A_2361, GS_A_2363, GS_A_2366, TIP1_A_5087, TIP1_A_4230, TIP1_A_4231, TIP1_A_4232, TIP1_A_4234, TIP1_A_4235, TIP1_A_3660, TIP1_A_3548, TIP1_A_3549, TIP1_A_3550, TIP1_A_3881, TIP1_A_3554, TIP1_A_3555, TIP1_A_3557,
                    TIP1_A_3590, TIP1_A_3595, TIP1_A_3596, GS_A_4479, GS_A_4523, GS_A_4524, GS_A_5541, GS_A_5526, GS_A_5518, GS_A_3784, GS_A_5324, GS_A_2356);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_OCSP_Proxy_PTV2_0_0_1("gemProdT_OCSP_Proxy_PTV2.0.0-1") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_5131, GS_A_4832, GS_A_4013, GS_A_4024, GS_A_4033, GS_A_4036, GS_A_4763, GS_A_4054, GS_A_3932, GS_A_3834, GS_A_3842, GS_A_3931, GS_A_3832, GS_A_3833, GS_A_3840, GS_A_4817, GS_A_3934, GS_A_3937,
                    GS_A_3939, GS_A_3946, TIP1_A_5848, TIP1_A_5849, TIP1_A_5851, TIP1_A_5853, GS_A_3695, GS_A_3696, GS_A_5025, GS_A_5054, GS_A_5038, GS_A_3702, GS_A_4543, GS_A_4545, GS_A_3804, GS_A_3807, GS_A_3805, GS_A_3806, GS_A_4146,
                    GS_A_4147, GS_A_4148, GS_A_4149, GS_A_4145, GS_A_4159, GS_A_4160, GS_A_4637, GS_A_4829, GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648, GS_A_4649, GS_A_4650, GS_A_4651, GS_A_4898, GS_A_4899, GS_A_4652,
                    GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4660, GS_A_4749, GS_A_4661, GS_A_4662, GS_A_4663, GS_A_5077, GS_A_4751, GS_A_4669, GS_A_4957, TIP1_A_5993, TIP1_A_5996, TIP1_A_5998, TIP1_A_5997, TIP1_A_6002);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_5052, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_2805, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772,
                    TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_5542, GS_A_5526, GS_A_4009, GS_A_4831, GS_A_4010, GS_A_4011, GS_A_4012, GS_A_4018, GS_A_4027, GS_A_4759, GS_A_4805,
                    GS_A_3824, GS_A_3931, GS_A_4820, TIP1_A_5831, TIP1_A_5835, TIP1_A_5838, TIP1_A_5852, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5039, GS_A_3813, GS_A_5018, GS_A_5033, GS_A_4155, GS_A_5028, GS_A_3055, GS_A_3058,
                    GS_A_4640, TIP1_A_5994, TIP1_A_5995, TIP1_A_6003, TIP1_A_5999, GS_A_4435, GS_A_4437, GS_A_4451, GS_A_4453, GS_A_4473, GS_A_4474, GS_A_4480, GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537, GS_A_4539, GS_A_4359, GS_A_4367,
                    GS_A_4368, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322, GS_A_4388, GS_A_5131, GS_A_4054, GS_A_4062, GS_A_4817, TIP1_A_5836, TIP1_A_5837, TIP1_A_5853, TIP1_A_5855, TIP1_A_5856, TIP1_A_5857, GS_A_4641,
                    GS_A_4748, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2214, GS_A_2087, GS_A_2213, GS_A_2076, GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021,
                    GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343, GS_A_2345, GS_A_2347, GS_A_2360, GS_A_2361,
                    GS_A_2362, GS_A_2363, GS_A_2366, GS_A_4436, GS_A_4448, GS_A_4449, GS_A_4450, GS_A_4455, GS_A_4456, GS_A_4457, GS_A_4458, GS_A_4459, GS_A_4460, GS_A_4461, GS_A_4462, GS_A_4463, GS_A_4464, GS_A_4465, GS_A_4466, GS_A_4467,
                    GS_A_4468, GS_A_4470, GS_A_4471, GS_A_4476, GS_A_4477, GS_A_4478, GS_A_4479, GS_A_4481, GS_A_4482, GS_A_4504, GS_A_4506, GS_A_4507, GS_A_4508, GS_A_4509, GS_A_4511, GS_A_4512, GS_A_4513, GS_A_4514, GS_A_4515, GS_A_4516,
                    GS_A_4517, GS_A_4518, GS_A_4519, GS_A_4520, GS_A_4521, GS_A_4522, GS_A_4523, GS_A_4524, GS_A_4525, GS_A_4526, GS_A_4527, GS_A_4528, GS_A_4530, GS_A_4531, GS_A_4532, GS_A_4533, GS_A_4534, GS_A_4535, GS_A_4538, GS_A_4540,
                    GS_A_5526, GS_A_3784, GS_A_5324, GS_A_2355, GS_A_2356, GS_A_2357, GS_A_2359);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_gematik_Root_CA_PTV1_4_0_0("gemProdT_gematik_Root_CA_PTV1.4.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4178, GS_A_4181, GS_A_4208, GS_A_4906, GS_A_4395, GS_A_4348, GS_A_4228, GS_A_4303, GS_A_4350, GS_A_4351, GS_A_4911, GS_A_4914, GS_A_4919, GS_A_4926, GS_A_4931, GS_A_4933, GS_A_5131, GS_A_5518,
                    GS_A_4444, GS_A_5025, GS_A_5038, GS_A_3702, GS_A_4543, GS_A_4545, GS_A_3804, GS_A_3807, GS_A_3805, GS_A_3806, GS_A_4146, GS_A_4147, GS_A_4148, GS_A_4149, GS_A_4145, GS_A_4159, GS_A_4160, GS_A_5513, GS_A_4695, GS_A_4696,
                    GS_A_4705, GS_A_4706, GS_A_4714, GS_A_4715, GS_A_4716, GS_A_4725, GS_A_4718, GS_A_4719, GS_A_4588, GS_A_4590, GS_A_4736, GS_A_4637, GS_A_4829, GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648, GS_A_4649,
                    GS_A_4650, GS_A_4651, GS_A_4898, GS_A_4899, GS_A_4652, GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4660, GS_A_4749, GS_A_4661, GS_A_4662, GS_A_4663, GS_A_5077, GS_A_4751, GS_A_4669, GS_A_5050, GS_A_4674,
                    GS_A_4957, GS_A_4676, GS_A_4677, GS_A_4678, GS_A_5517, GS_A_4684, GS_A_4686, GS_A_4687, GS_A_4688, GS_A_4690, GS_A_4691, GS_A_4692, GS_A_5090, GS_A_4693, GS_A_4694, TIP1_A_5993, TIP1_A_5996, TIP1_A_5998, TIP1_A_5997,
                    TIP1_A_6002, TIP1_A_4015, TIP1_A_4253, TIP1_A_4254, TIP1_A_5164, TIP1_A_5165, TIP1_A_5167);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529, TIP1_A_6531,
                    TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_4173, GS_A_4174, GS_A_4175, GS_A_4176, GS_A_4177, GS_A_4180, GS_A_4183, GS_A_4186, GS_A_4188, GS_A_4189, GS_A_4190, GS_A_4192, GS_A_4194, GS_A_4201,
                    GS_A_4202, GS_A_5083, GS_A_4203, GS_A_4204, GS_A_4206, GS_A_4209, GS_A_4394, GS_A_4210, GS_A_4215, GS_A_4216, GS_A_4217, GS_A_4221, GS_A_4222, GS_A_4223, GS_A_4226, GS_A_4227, GS_A_4229, GS_A_4230, GS_A_4231, GS_A_4232,
                    GS_A_5075, GS_A_4242, GS_A_4245, GS_A_4246, GS_A_4248, GS_A_4250, GS_A_4251, GS_A_5123, GS_A_4252, GS_A_4254, GS_A_4256, GS_A_4262, GS_A_5084, GS_A_4263, GS_A_4264, GS_A_4265, GS_A_4266, GS_A_4267, GS_A_4269, GS_A_4276,
                    GS_A_4277, GS_A_4278, GS_A_4280, GS_A_4282, GS_A_4283, GS_A_4296, GS_A_4297, GS_A_4300, GS_A_4302, GS_A_5468, GS_A_5469, GS_A_4318, GS_A_4319, GS_A_4321, GS_A_4322, GS_A_4323, GS_A_4324, GS_A_4325, GS_A_4326, GS_A_4327,
                    GS_A_4328, GS_A_4908, GS_A_4909, GS_A_4910, GS_A_4913, GS_A_4917, GS_A_4923, GS_A_4925, GS_A_4541, GS_A_5039, GS_A_3813, GS_A_5018, GS_A_5033, GS_A_4149, GS_A_4155, GS_A_3055, GS_A_3058, GS_A_4257, GS_A_5511, GS_A_5528,
                    GS_A_4727, GS_A_4732, GS_A_5514, GS_A_4640, GS_A_4670, GS_A_5050, GS_A_5052, GS_A_4679, GS_A_4685, GS_A_4689, TIP1_A_5994, TIP1_A_5995, TIP1_A_6003, TIP1_A_5999, TIP1_A_3547, TIP1_A_3877, TIP1_A_3879, TIP1_A_3880,
                    TIP1_A_4427, TIP1_A_4428, TIP1_A_5376, TIP1_A_3555, TIP1_A_3562, TIP1_A_3655, TIP1_A_4250, TIP1_A_4434, TIP1_A_4251, TIP1_A_3656, TIP1_A_3657, TIP1_A_3658, TIP1_A_3662, TIP1_A_3663, TIP1_A_4252, TIP1_A_4255, TIP1_A_5166,
                    TIP1_A_5168, GS_A_4173, GS_A_4191, GS_A_4230, GS_A_4396, GS_A_4247, GS_A_4249, GS_A_4255, GS_A_4259, GS_A_4260, GS_A_4261, GS_A_4268, GS_A_4270, GS_A_4271, GS_A_4272, GS_A_4273, GS_A_4274, GS_A_4275, GS_A_4276,
                    GS_A_4279, GS_A_4284, GS_A_4285, GS_A_4287, GS_A_4288, GS_A_4289, GS_A_4290, GS_A_4291, GS_A_4292, GS_A_4294, GS_A_4295, GS_A_4304, GS_A_4305, GS_A_4306, GS_A_4307, GS_A_4308, GS_A_4309, GS_A_4310, GS_A_4311, GS_A_4312,
                    GS_A_4313, GS_A_4314, GS_A_4315, GS_A_4316, GS_A_4317, GS_A_4925, GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537, GS_A_4539, GS_A_4359, GS_A_4367, GS_A_4368, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322,
                    GS_A_4393, GS_A_5131, GS_A_5079, GS_A_4062, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4641, GS_A_4748, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756,
                    GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343, GS_A_2345, GS_A_2347,
                    GS_A_2360, GS_A_2361, GS_A_2362, GS_A_2363, GS_A_2366, GS_A_3078, GS_A_3125, GS_A_3130, GS_A_3139, GS_A_3141, GS_A_3149, TIP1_A_4230, TIP1_A_4231, TIP1_A_4233, TIP1_A_4235, TIP1_A_3660, TIP1_A_3881, TIP1_A_3555,
                    TIP1_A_5371, TIP1_A_4015, TIP1_A_3664, GS_A_4504, GS_A_4506, GS_A_4507, GS_A_4508, GS_A_4509, GS_A_4511, GS_A_4512, GS_A_4513, GS_A_4514, GS_A_4515, GS_A_4516, GS_A_4517, GS_A_4518, GS_A_4519, GS_A_4520, GS_A_4521,
                    GS_A_4522, GS_A_4523, GS_A_4524, GS_A_4525, GS_A_4526, GS_A_4527, GS_A_4528, GS_A_4530, GS_A_4531, GS_A_4532, GS_A_4533, GS_A_4534, GS_A_4535, GS_A_4538, GS_A_4540, GS_A_5541, GS_A_5518, GS_A_4965, GS_A_3784, GS_A_5324,
                    GS_A_2355, GS_A_2356, GS_A_2357, GS_A_2359);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_CVC_TSP_PTV1_4_0_0("gemProdT_CVC_TSP_PTV1.4.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(TIP1_A_2568, TIP1_A_2659, TIP1_A_3029, TIP1_A_2673, TIP1_A_3032, GS_A_3695, GS_A_5025, GS_A_5054, GS_A_3806, GS_A_4626, GS_A_4627, GS_A_4630, GS_A_4631, GS_A_4633, GS_A_4634, GS_A_4636, GS_A_4986,
                    GS_A_4987, GS_A_4988, GS_A_4989, GS_A_4990, GS_A_4992, GS_A_4993, GS_A_4994, GS_A_4995, GS_A_4996, GS_A_4997, GS_A_4998, GS_A_4999, GS_A_5000, GS_A_5001, GS_A_5002, GS_A_5003, GS_A_5004, GS_A_5005, GS_A_5006, GS_A_5007,
                    GS_A_5008);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_2769, TIP1_A_2781, TIP1_A_2557, TIP1_A_2558, TIP1_A_2592, TIP1_A_2564, TIP1_A_2565, TIP1_A_2566, TIP1_A_2568, TIP1_A_2593, TIP1_A_2594, TIP1_A_2595, TIP1_A_2596, TIP1_A_2598, TIP1_A_2599,
                    TIP1_A_2600, TIP1_A_2601, TIP1_A_2602, TIP1_A_2603, TIP1_A_2604, TIP1_A_2606, TIP1_A_2611, TIP1_A_5381, TIP1_A_2619, TIP1_A_2626, TIP1_A_2627, TIP1_A_2633, TIP1_A_2634, TIP1_A_2635, TIP1_A_2636, TIP1_A_2637, TIP1_A_2650,
                    TIP1_A_2695, TIP1_A_2654, TIP1_A_4228, TIP1_A_2655, TIP1_A_2656, TIP1_A_2657, TIP1_A_2658, TIP1_A_2660, TIP1_A_3029, TIP1_A_2696, TIP1_A_3030, TIP1_A_3031, TIP1_A_2665, TIP1_A_2666, TIP1_A_2669, TIP1_A_2671, TIP1_A_2672,
                    TIP1_A_2676, TIP1_A_5378, TIP1_A_5379, TIP1_A_2677, TIP1_A_2680, TIP1_A_4229, GS_A_4820, GS_A_4821, GS_A_5082, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5038, GS_A_5039, GS_A_3702, GS_A_4543, GS_A_5018, GS_A_3804,
                    GS_A_3805, GS_A_5033, GS_A_4257, GS_A_4628, GS_A_4991, TIP1_A_2557, TIP1_A_2558, TIP1_A_2592, TIP1_A_2593, TIP1_A_2594, TIP1_A_2595, TIP1_A_2596, TIP1_A_2598, TIP1_A_2599, TIP1_A_2600, TIP1_A_2601, TIP1_A_2602,
                    TIP1_A_2604, TIP1_A_2605, TIP1_A_2607, TIP1_A_2608, TIP1_A_2609, TIP1_A_4223, TIP1_A_4224, TIP1_A_2610, TIP1_A_2611, TIP1_A_2612, TIP1_A_2613, TIP1_A_2614, TIP1_A_2615, TIP1_A_2616, TIP1_A_2617, TIP1_A_4225, TIP1_A_2618,
                    TIP1_A_2620, TIP1_A_2621, TIP1_A_2622, TIP1_A_2626, TIP1_A_2628, TIP1_A_2691, TIP1_A_2629, TIP1_A_2692, TIP1_A_2630, TIP1_A_2631, TIP1_A_2632, TIP1_A_2634, TIP1_A_2635, TIP1_A_2636, TIP1_A_2637, TIP1_A_2641, TIP1_A_2642,
                    TIP1_A_2644, TIP1_A_2645, TIP1_A_2647, TIP1_A_2648, TIP1_A_2649, TIP1_A_2650, TIP1_A_2671, TIP1_A_2672, GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537, GS_A_4539, GS_A_4363, GS_A_4364, GS_A_4365, GS_A_4366, GS_A_4367,
                    GS_A_4368, GS_A_4393, GS_A_5079, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946,
                    GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343, GS_A_2345, GS_A_2347, GS_A_2360, GS_A_2361, GS_A_2362, GS_A_2363, GS_A_2366, GS_A_3078,
                    GS_A_3125, GS_A_3130, GS_A_3139, GS_A_3141, GS_A_3149, TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_6538, TIP1_A_6539, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529,
                    TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_4504, GS_A_4506, GS_A_4507, GS_A_4508, GS_A_4509, GS_A_4511, GS_A_4512, GS_A_4513, GS_A_4514, GS_A_4515, GS_A_4516, GS_A_4517, GS_A_4518,
                    GS_A_4519, GS_A_4520, GS_A_4521, GS_A_4522, GS_A_4523, GS_A_4524, GS_A_4525, GS_A_4526, GS_A_4527, GS_A_4528, GS_A_4530, GS_A_4531, GS_A_4532, GS_A_4533, GS_A_4534, GS_A_4535, GS_A_4538, GS_A_4540, GS_A_5541, GS_A_3813,
                    GS_A_3784, GS_A_5324, GS_A_2355, GS_A_2356, GS_A_2357, GS_A_2359, TIP1_A_2568, TIP1_A_2629, TIP1_A_2565, TIP1_A_5378, TIP1_A_2692, TIP1_A_2630, TIP1_A_2631, TIP1_A_2692, TIP1_A_2630, TIP1_A_2631, TIP1_A_2565,
                    TIP1_A_2568);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_CVC_Root_ECC_PTV1_3_0_2("gemProdT_CVC_Root_ECC_PTV1.3.0-2") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(TIP1_A_5212, TIP1_A_5213, TIP1_A_5214, TIP1_A_5238, TIP1_A_5241, TIP1_A_5260, TIP1_A_5261, TIP1_A_5263, TIP1_A_5264, TIP1_A_5265, TIP1_A_5266, TIP1_A_5270, TIP1_A_5367, TIP1_A_5272, TIP1_A_5273,
                    TIP1_A_5274, GS_A_3695, GS_A_3696, GS_A_5025, GS_A_5038, GS_A_3702, GS_A_4543, GS_A_3804, GS_A_3807, GS_A_3805, GS_A_3806, GS_A_5213, GS_A_4986, GS_A_4987, GS_A_4988, GS_A_4989, GS_A_4990, GS_A_4992, GS_A_4993,
                    GS_A_4994, GS_A_4995, GS_A_4996, GS_A_4997, GS_A_4998, GS_A_4999, GS_A_5000, GS_A_5001, GS_A_5002, GS_A_5003, GS_A_5004, GS_A_5005, GS_A_5006, GS_A_5007, GS_A_5008);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_2781, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529, TIP1_A_6531,
                    TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, TIP1_A_5173, TIP1_A_5176, TIP1_A_5182, TIP1_A_5183, TIP1_A_5185, TIP1_A_5186, TIP1_A_5187, TIP1_A_5189, TIP1_A_5191, TIP1_A_5380, TIP1_A_5205, TIP1_A_5206,
                    TIP1_A_5207, TIP1_A_5208, TIP1_A_5212, TIP1_A_5213, TIP1_A_5214, TIP1_A_5215, TIP1_A_5216, TIP1_A_5219, TIP1_A_5227, TIP1_A_5230, TIP1_A_5231, TIP1_A_5239, TIP1_A_5240, TIP1_A_5241, TIP1_A_5243, TIP1_A_5245, TIP1_A_5246,
                    TIP1_A_5247, TIP1_A_5248, TIP1_A_5249, TIP1_A_5250, TIP1_A_5251, TIP1_A_5252, TIP1_A_5253, TIP1_A_5254, TIP1_A_5255, TIP1_A_5256, TIP1_A_5257, TIP1_A_5258, TIP1_A_5259, TIP1_A_5262, TIP1_A_5266, TIP1_A_5267, TIP1_A_5268,
                    TIP1_A_5270, TIP1_A_5272, TIP1_A_5273, TIP1_A_5274, TIP1_A_5275, TIP1_A_5276, GS_A_4820, GS_A_4821, GS_A_5082, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5039, GS_A_3813, GS_A_5018, GS_A_5033, GS_A_4257, GS_A_4991,
                    TIP1_A_5173, TIP1_A_5174, TIP1_A_5175, TIP1_A_5183, TIP1_A_5184, TIP1_A_5185, TIP1_A_5186, TIP1_A_5187, TIP1_A_5188, TIP1_A_5189, TIP1_A_5190, TIP1_A_5192, TIP1_A_5193, TIP1_A_5194, TIP1_A_5195, TIP1_A_5196, TIP1_A_5197,
                    TIP1_A_5198, TIP1_A_5199, TIP1_A_5200, TIP1_A_5201, TIP1_A_5202, TIP1_A_5203, TIP1_A_5204, TIP1_A_5220, TIP1_A_5221, TIP1_A_5223, TIP1_A_5224, TIP1_A_5225, TIP1_A_5226, TIP1_A_5228, TIP1_A_5229, TIP1_A_5230, TIP1_A_5231,
                    TIP1_A_5232, TIP1_A_5233, TIP1_A_5234, TIP1_A_5235, TIP1_A_5236, TIP1_A_5237, TIP1_A_5372, TIP1_A_5249, GS_A_4503, GS_A_4505, GS_A_4529, GS_A_4537, GS_A_4539, GS_A_4363, GS_A_4364, GS_A_4365, GS_A_4366, GS_A_4367,
                    GS_A_4368, GS_A_4393, GS_A_5079, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946,
                    GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2333, GS_A_2339, GS_A_2343, GS_A_2345, GS_A_2347, GS_A_2360, GS_A_2361, GS_A_2362, GS_A_2363, GS_A_2366, GS_A_3078,
                    GS_A_3125, GS_A_3130, GS_A_3139, GS_A_3141, GS_A_3149, GS_A_4504, GS_A_4506, GS_A_4507, GS_A_4508, GS_A_4509, GS_A_4511, GS_A_4512, GS_A_4513, GS_A_4514, GS_A_4515, GS_A_4516, GS_A_4517, GS_A_4518, GS_A_4519, GS_A_4520,
                    GS_A_4521, GS_A_4522, GS_A_4523, GS_A_4524, GS_A_4525, GS_A_4526, GS_A_4527, GS_A_4528, GS_A_4530, GS_A_4531, GS_A_4532, GS_A_4533, GS_A_4534, GS_A_4535, GS_A_4538, GS_A_4540, GS_A_3784, GS_A_5324, GS_A_2156, GS_A_5017,
                    GS_A_2355, GS_A_2356, GS_A_2357, GS_A_2359);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    // Dezentrale Komponenten
    //
    gemProdT_MobKT_PTV1_3_0_2("gemProdT_MobKT_PTV1.3.0-2") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(VSDM_A_2973, VSDM_A_2974, VSDM_A_2975, VSDM_A_2976, TIP1_A_3738, TIP1_A_3802, TIP1_A_7033, TIP1_A_7034, TIP1_A_7035, TIP1_A_3689, TIP1_A_3690, TIP1_A_4406, TIP1_A_4408, TIP1_A_4267, TIP1_A_3758,
                    TIP1_A_3757, TIP1_A_4407, TIP1_A_3696, TIP1_A_4260, TIP1_A_4275, TIP1_A_3698, TIP1_A_3711, TIP1_A_3766, TIP1_A_3767, TIP1_A_3870, TIP1_A_4954, TIP1_A_3761, TIP1_A_4955, TIP1_A_5427, TIP1_A_5428, TIP1_A_5429, TIP1_A_5430,
                    TIP1_A_5431, TIP1_A_5432, TIP1_A_3869, TIP1_A_3748, TIP1_A_3743, TIP1_A_3699, TIP1_A_3825, TIP1_A_4273, TIP1_A_4274, TIP1_A_4973, TIP1_A_3717, TIP1_A_3754, TIP1_A_4948, TIP1_A_4949, TIP1_A_3715, TIP1_A_3867, TIP1_A_3716,
                    TIP1_A_3861, TIP1_A_3862, TIP1_A_3863, TIP1_A_3864, TIP1_A_3865, TIP1_A_3866, TIP1_A_3806, TIP1_A_4976, TIP1_A_4958, TIP1_A_3875, TIP1_A_3799, TIP1_A_4423, TIP1_A_4946, TIP1_A_3718, TIP1_A_3719, TIP1_A_3720, TIP1_A_3721,
                    TIP1_A_4413, TIP1_A_4263, TIP1_A_3840, TIP1_A_3868, TIP1_A_4956, TIP1_A_3788, TIP1_A_3815, TIP1_A_4938, TIP1_A_4957, TIP1_A_3816, TIP1_A_4271, TIP1_A_4939, TIP1_A_3787, TIP1_A_4940, TIP1_A_3842, TIP1_A_3755, TIP1_A_4952,
                    TIP1_A_4953, VSDM_A_2782, VSDM_A_2880, VSDM_A_2767, VSDM_A_2980, VSDM_A_2938, VSDM_A_2927, VSDM_A_2928, VSDM_A_2878, VSDM_A_2877, VSDM_A_3049, VSDM_A_3052, VSDM_A_3051, VSDM_A_2903, VSDM_A_2766, VSDM_A_2725, VSDM_A_2963,
                    VSDM_A_3000, VSDM_A_2714, VSDM_A_2763, VSDM_A_2717, VSDM_A_2718, VSDM_A_2764, VSDM_A_2985, VSDM_A_2719, VSDM_A_2783, VSDM_A_2720, VSDM_A_2768, VSDM_A_2765, VSDM_A_2730, VSDM_A_2731, VSDM_A_2732, VSDM_A_2769, TIP1_A_4974,
                    TIP1_A_4975, TIP1_A_4921, TIP1_A_3872, TIP1_A_3873, TIP1_A_3856, TIP1_A_4261, TIP1_A_4426, TIP1_A_3697, TIP1_A_4266, TIP1_A_4404, TIP1_A_3708, TIP1_A_4412, TIP1_A_4951, TIP1_A_3789, TIP1_A_4270, TIP1_A_3722, TIP1_A_3710,
                    TIP1_A_3850, TIP1_A_3851, TIP1_A_3733, TIP1_A_3694, TIP1_A_3691, VSDM_A_2930, TIP1_A_3693, TIP1_A_4272, TIP1_A_5374, TIP1_A_3695, TIP1_A_3871, TIP1_A_3848, TIP1_A_4258, TIP1_A_3714, TIP1_A_4259, TIP1_A_3790, TIP1_A_3791,
                    TIP1_A_3809, TIP1_A_3811, TIP1_A_3740, TIP1_A_3731, TIP1_A_3728, TIP1_A_3737, TIP1_A_3741, TIP1_A_3742, TIP1_A_3859, TIP1_A_3727, TIP1_A_4269, TIP1_A_4941, TIP1_A_5006, TIP1_A_3764, TIP1_A_3749, TIP1_A_3750, TIP1_A_3751,
                    TIP1_A_3752, TIP1_A_3834, TIP1_A_3835, TIP1_A_3836, TIP1_A_3837, TIP1_A_3838, TIP1_A_3760, VSDM_A_2931, TIP1_A_3725, TIP1_A_3730, TIP1_A_3745, TIP1_A_4414, TIP1_A_3810, TIP1_A_3832, TIP1_A_4415, TIP1_A_6059, TIP1_A_5145,
                    TIP1_A_5146, TIP1_A_5147, TIP1_A_3854, TIP1_A_3723, TIP1_A_3843, TIP1_A_3844, TIP1_A_5085, TIP1_A_3853, TIP1_A_3762, TIP1_A_4425, TIP1_A_3709, TIP1_A_3768, TIP1_A_3769, TIP1_A_3770, TIP1_A_3771, TIP1_A_3772, TIP1_A_3773,
                    TIP1_A_3774, TIP1_A_3775, TIP1_A_3776, TIP1_A_3777, TIP1_A_3792, TIP1_A_3793, TIP1_A_3778, TIP1_A_3779, TIP1_A_3780, TIP1_A_3781, TIP1_A_3794, TIP1_A_3782, TIP1_A_3783, TIP1_A_3784, TIP1_A_3795, TIP1_A_3796, TIP1_A_4410,
                    TIP1_A_4942, TIP1_A_4934, TIP1_A_4935, TIP1_A_4943, TIP1_A_4417, TIP1_A_4418, TIP1_A_4944, TIP1_A_4419, TIP1_A_4945, TIP1_A_4420, TIP1_A_5008, TIP1_A_4950, TIP1_A_4421, TIP1_A_4422, VSDM_A_2881, GS_A_3695, GS_A_3696,
                    GS_A_3700, GS_A_5054, GS_A_5038, GS_A_3702, GS_A_4865, GS_A_4867, GS_A_4868, GS_A_4869, GS_A_4870, GS_A_4871, GS_A_4872, GS_A_4941, GS_A_5034, TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_5052,
                    TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_6086, TIP1_A_2781, TIP1_A_6087, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772, TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537,
                    TIP1_A_7033, TIP1_A_7034, TIP1_A_7035, TIP1_A_6485, VSDM_A_2995, VSDM_A_2962, VSDM_A_3050, TIP1_A_6484, TIP1_A_6060, TIP1_A_3732, TIP1_A_6706, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5039, GS_A_4875, GS_A_4876,
                    GS_A_3813);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(GS_A_4367, GS_A_4368, TIP1_A_4954, TIP1_A_3761, TIP1_A_4955, TIP1_A_5427, TIP1_A_5428, TIP1_A_5430, TIP1_A_5431, TIP1_A_5432, TIP1_A_3748, TIP1_A_3743, TIP1_A_3744, TIP1_A_3839, TIP1_A_3747,
                    TIP1_A_3746, TIP1_A_3700, TIP1_A_3701, TIP1_A_4973, TIP1_A_3717, TIP1_A_3754, TIP1_A_3852, TIP1_A_4405, TIP1_A_4922, TIP1_A_3874, TIP1_A_4936, TIP1_A_3860, TIP1_A_4937, TIP1_A_3840, TIP1_A_3787, TIP1_A_4940, TIP1_A_3724,
                    TIP1_A_4424, TIP1_A_3739, VSDM_A_2876, VSDM_A_2762, VSDM_A_2721, VSDM_A_2734, TIP1_A_4403, TIP1_A_3756, TIP1_A_3808, TIP1_A_3789, TIP1_A_3722, TIP1_A_3850, TIP1_A_3851, TIP1_A_3759, TIP1_A_3733, TIP1_A_3798, TIP1_A_3848,
                    TIP1_A_3849, TIP1_A_3855, TIP1_A_3729, TIP1_A_4268, TIP1_A_3764, TIP1_A_3750, TIP1_A_3751, TIP1_A_3752, TIP1_A_3834, TIP1_A_3753, TIP1_A_3835, TIP1_A_3730, TIP1_A_5145, TIP1_A_5146, GS_A_4865, GS_A_4866, GS_A_4867,
                    GS_A_4868, GS_A_4869, GS_A_4870, GS_A_4871, GS_A_4872, GS_A_4873, GS_A_4874, GS_A_4941, GS_A_2524, GS_A_2525, GS_A_2354, GS_A_2350, TIP1_A_5014, TIP1_A_4947, TIP1_A_5373, TIP1_A_3805, TIP1_A_3712, TIP1_A_3847,
                    TIP1_A_3803, TIP1_A_3713, TIP1_A_4406, TIP1_A_3800, TIP1_A_3801, TIP1_A_4401, TIP1_A_4411, TIP1_A_3765, TIP1_A_3702, TIP1_A_3807, TIP1_A_4977, TIP1_A_4978, TIP1_A_4979, TIP1_A_4262, TIP1_A_3763, TIP1_A_3812, TIP1_A_3813,
                    TIP1_A_3804, TIP1_A_4402, TIP1_A_3703, TIP1_A_3704, TIP1_A_3705, TIP1_A_4256, TIP1_A_4257, VSDM_A_2928, VSDM_A_2878, VSDM_A_2877, TIP1_A_3809, TIP1_A_3811, TIP1_A_3810, TIP1_A_3832, TIP1_A_4415, TIP1_A_3848, TIP1_A_3849,
                    TIP1_A_3855, TIP1_A_3690, TIP1_A_5430, TIP1_A_5431, TIP1_A_5432);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_Kon_PTV2_11_0_0("gemProdT_Kon_PTV2.11.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(VSDM_A_2973, VSDM_A_2974, VSDM_A_2975, VSDM_A_2976, VSDM_A_2563, VSDM_A_2565, VSDM_A_2566, VSDM_A_2567, VSDM_A_2568, VSDM_A_2569, VSDM_A_2570, VSDM_A_2571, VSDM_A_2572, VSDM_A_2573, VSDM_A_2574,
                    VSDM_A_2575, VSDM_A_2576, VSDM_A_2577, VSDM_A_2578, VSDM_A_2579, VSDM_A_2580, VSDM_A_2581, VSDM_A_2582, VSDM_A_2583, VSDM_A_2584, VSDM_A_2585, VSDM_A_2586, VSDM_A_2587, VSDM_A_2588, VSDM_A_2589, VSDM_A_2590, VSDM_A_2591,
                    VSDM_A_2592, VSDM_A_2594, VSDM_A_2595, VSDM_A_2597, VSDM_A_2601, VSDM_A_2602, VSDM_A_2603, VSDM_A_2604, VSDM_A_2605, VSDM_A_2606, VSDM_A_2607, VSDM_A_2609, VSDM_A_2611, VSDM_A_2612, VSDM_A_2613, VSDM_A_2614, VSDM_A_2615,
                    VSDM_A_2616, VSDM_A_2619, VSDM_A_2620, VSDM_A_2621, VSDM_A_2622, VSDM_A_2623, VSDM_A_2624, VSDM_A_2625, VSDM_A_2626, VSDM_A_2636, VSDM_A_2638, VSDM_A_2639, VSDM_A_2642, VSDM_A_2649, VSDM_A_2650, VSDM_A_2651, VSDM_A_2652,
                    VSDM_A_2653, VSDM_A_2654, VSDM_A_2655, VSDM_A_2660, VSDM_A_2662, VSDM_A_2664, VSDM_A_2665, VSDM_A_2667, VSDM_A_2668, VSDM_A_2687, VSDM_A_2708, VSDM_A_2745, VSDM_A_2749, VSDM_A_2750, VSDM_A_2752, VSDM_A_2770, VSDM_A_2772,
                    VSDM_A_2775, VSDM_A_2776, VSDM_A_2777, VSDM_A_2778, VSDM_A_2779, VSDM_A_2784, VSDM_A_2789, VSDM_A_2791, VSDM_A_2792, VSDM_A_2793, VSDM_A_2944, VSDM_A_2979, VSDM_A_2981, VSDM_A_2989, VSDM_A_2998, VSDM_A_3007, VSDM_A_3020,
                    VSDM_A_3033, VSDM_A_3067, VSDM_A_3070, TIP1_A_4500, TIP1_A_4502, TIP1_A_5541, TIP1_A_4503, TIP1_A_4504, TIP1_A_5543, TIP1_A_4505, TIP1_A_4506, TIP1_A_4508, TIP1_A_4509, TIP1_A_4597, TIP1_A_4510, TIP1_A_4512, TIP1_A_4513,
                    TIP1_A_4514, TIP1_A_4515, TIP1_A_4516, TIP1_A_5009, TIP1_A_4517, TIP1_A_4518, TIP1_A_5401, TIP1_A_4519, TIP1_A_5058, TIP1_A_4520, TIP1_A_4521, TIP1_A_6727, TIP1_A_5694, TIP1_A_5433, TIP1_A_5660, TIP1_A_4981, TIP1_A_4707,
                    TIP1_A_4982, TIP1_A_4522, TIP1_A_4523, TIP1_A_4524, TIP1_A_4525, TIP1_A_4526, TIP1_A_4527, TIP1_A_4528, TIP1_A_4529, TIP1_A_4532, TIP1_A_4533, TIP1_A_4534, TIP1_A_4535, TIP1_A_4536, TIP1_A_6725, TIP1_A_4537, TIP1_A_4538,
                    TIP1_A_6478, TIP1_A_4539, TIP1_A_5408, TIP1_A_4540, TIP1_A_4541, TIP1_A_4542, TIP1_A_4543, TIP1_A_4544, TIP1_A_4545, TIP1_A_4546, TIP1_A_4548, TIP1_A_4985, TIP1_A_4547, TIP1_A_5409, TIP1_A_5410, TIP1_A_5411, TIP1_A_5412,
                    TIP1_A_5413, TIP1_A_4549, TIP1_A_4550, TIP1_A_4986, TIP1_A_4551, TIP1_A_4552, TIP1_A_4553, TIP1_A_4554, TIP1_A_6477, TIP1_A_4555, TIP1_A_4556, TIP1_A_4557, TIP1_A_5698, TIP1_A_5011, TIP1_A_4988, TIP1_A_6031, TIP1_A_4560,
                    TIP1_A_4561, TIP1_A_5012, TIP1_A_4562, TIP1_A_4563, TIP1_A_4565, TIP1_A_4566, TIP1_A_4567, TIP1_A_4568, TIP1_A_4569, TIP1_A_4570, TIP1_A_4572, TIP1_A_4573, TIP1_A_4574, TIP1_A_4575, TIP1_A_4577, TIP1_A_4579, TIP1_A_4580,
                    TIP1_A_4581, TIP1_A_4582, TIP1_A_4583, TIP1_A_4584, TIP1_A_4585, TIP1_A_4586, TIP1_A_4587, TIP1_A_4588, TIP1_A_4589, TIP1_A_4590, TIP1_A_4592, TIP1_A_4593, TIP1_A_5110, TIP1_A_5111, TIP1_A_4594, TIP1_A_5536, TIP1_A_4595,
                    TIP1_A_4596, TIP1_A_4598, TIP1_A_4599, TIP1_A_4600, TIP1_A_4602, TIP1_A_4603, TIP1_A_4604, TIP1_A_4605, TIP1_A_4607, TIP1_A_4608, TIP1_A_4609, TIP1_A_5112, TIP1_A_4610, TIP1_A_4611, TIP1_A_4612, TIP1_A_4613, TIP1_A_4614,
                    TIP1_A_4615, TIP1_A_5434, TIP1_A_4616, TIP1_A_4617, TIP1_A_4620, TIP1_A_4621, TIP1_A_4622, TIP1_A_4623, TIP1_A_4627, TIP1_A_5446, TIP1_A_5447, TIP1_A_5402, TIP1_A_5403, TIP1_A_4624, TIP1_A_4628, TIP1_A_5033, TIP1_A_4626,
                    TIP1_A_4629, TIP1_A_5436, TIP1_A_5682, TIP1_A_4639, TIP1_A_4640, TIP1_A_4992, TIP1_A_4643, TIP1_A_4645, TIP1_A_5437, TIP1_A_5149, TIP1_A_4646, TIP1_A_4647, TIP1_A_4648, TIP1_A_4649, TIP1_A_4651, TIP1_A_4652, TIP1_A_4653,
                    TIP1_A_4654, TIP1_A_5545, TIP1_A_4655, TIP1_A_4669, TIP1_A_5664, TIP1_A_4671, TIP1_A_4672, TIP1_A_5540, TIP1_A_4676, TIP1_A_5665, TIP1_A_5010, TIP1_A_5034, TIP1_A_5666, TIP1_A_5667, TIP1_A_5439, TIP1_A_4680, TIP1_A_4682,
                    TIP1_A_4684, TIP1_A_4685, TIP1_A_6730, TIP1_A_6731, TIP1_A_6732, TIP1_A_5662, TIP1_A_5663, TIP1_A_4686, TIP1_A_4687, TIP1_A_4994, TIP1_A_4688, TIP1_A_4689, TIP1_A_4690, TIP1_A_4691, TIP1_A_4692, TIP1_A_4693, TIP1_A_6729,
                    TIP1_A_4694, TIP1_A_4695, TIP1_A_4696, TIP1_A_4697, TIP1_A_4698, TIP1_A_4699, TIP1_A_4700, TIP1_A_5449, TIP1_A_4701, TIP1_A_4702, TIP1_A_4703, TIP1_A_6733, TIP1_A_4704, TIP1_A_4705, TIP1_A_6728, TIP1_A_4706, TIP1_A_5700,
                    TIP1_A_4708, TIP1_A_4710, TIP1_A_6479, TIP1_A_4712, TIP1_A_4713, TIP1_A_4714, TIP1_A_4715, TIP1_A_4716, TIP1_A_4996, TIP1_A_4717, TIP1_A_4718, TIP1_A_4719, TIP1_A_4720, TIP1_A_4721, TIP1_A_4722, TIP1_A_5516, TIP1_A_5517,
                    TIP1_A_5518, TIP1_A_5519, TIP1_A_5520, TIP1_A_5521, TIP1_A_4723, TIP1_A_5406, TIP1_A_5407, TIP1_A_4725, TIP1_A_4729, TIP1_A_5152, TIP1_A_4730, TIP1_A_5530, TIP1_A_4731, TIP1_A_4732, TIP1_A_4733, TIP1_A_4734, TIP1_A_4735,
                    TIP1_A_4736, TIP1_A_4737, TIP1_A_4738, TIP1_A_4740, TIP1_A_4741, TIP1_A_4742, TIP1_A_4744, TIP1_A_4746, TIP1_A_4745, TIP1_A_4747, TIP1_A_4748, TIP1_A_4750, TIP1_A_4751, TIP1_A_4752, TIP1_A_4753, TIP1_A_4754, TIP1_A_4755,
                    TIP1_A_4758, TIP1_A_5414, TIP1_A_4759, TIP1_A_4760, TIP1_A_4761, TIP1_A_5537, TIP1_A_4762, TIP1_A_4763, TIP1_A_4765, TIP1_A_4766, TIP1_A_4767, TIP1_A_4768, TIP1_A_4769, TIP1_A_4771, TIP1_A_4772, TIP1_A_4773, TIP1_A_4774,
                    TIP1_A_4775, TIP1_A_4776, TIP1_A_4778, TIP1_A_4779, TIP1_A_4780, TIP1_A_4781, TIP1_A_5417, TIP1_A_4782, TIP1_A_4783, TIP1_A_4784, TIP1_A_5415, TIP1_A_4785, TIP1_A_4787, TIP1_A_4788, TIP1_A_4789, TIP1_A_4790, TIP1_A_4791,
                    TIP1_A_4792, TIP1_A_4793, TIP1_A_4794, TIP1_A_4795, TIP1_A_4796, TIP1_A_6480, TIP1_A_4797, TIP1_A_4799, TIP1_A_4801, TIP1_A_4803, TIP1_A_4804, TIP1_A_5035, TIP1_A_5416, TIP1_A_4805, TIP1_A_4806, TIP1_A_4807, TIP1_A_5658,
                    TIP1_A_5005, TIP1_A_4808, TIP1_A_4810, TIP1_A_4811, TIP1_A_4812, TIP1_A_4813, TIP1_A_4814, TIP1_A_4818, TIP1_A_4819, TIP1_A_4820, TIP1_A_4821, TIP1_A_4822, TIP1_A_4823, TIP1_A_4824, TIP1_A_4825, TIP1_A_4826, TIP1_A_4827,
                    TIP1_A_5655, TIP1_A_5650, TIP1_A_5651, TIP1_A_5652, TIP1_A_5653, TIP1_A_5657, TIP1_A_5659, TIP1_A_4831, TIP1_A_4832, TIP1_A_4833, TIP1_A_4834, TIP1_A_5153, TIP1_A_5938, TIP1_A_4835, TIP1_A_4836, TIP1_A_4837, TIP1_A_4838,
                    TIP1_A_4839, TIP1_A_4840, TIP1_A_5542, TIP1_A_4842, TIP1_A_4843, TIP1_A_4844, TIP1_A_5150, TIP1_A_5531, TIP1_A_5687, TIP1_A_5688, TIP1_A_5404, TIP1_A_5532, TIP1_A_5689, TIP1_A_5668, TIP1_A_5669, TIP1_A_5686, TIP1_A_4634,
                    TIP1_A_5692, TIP1_A_5693, TIP1_A_5670, TIP1_A_4650, TIP1_A_4656, TIP1_A_5683, TIP1_A_4657, TIP1_A_4658, TIP1_A_4659, TIP1_A_4660, TIP1_A_4661, TIP1_A_4662, TIP1_A_4663, TIP1_A_5671, TIP1_A_5680, TIP1_A_5681, TIP1_A_4664,
                    TIP1_A_4665, TIP1_A_4666, TIP1_A_4668, TIP1_A_4673, TIP1_A_5405, TIP1_A_5690, TIP1_A_5672, TIP1_A_5673, TIP1_A_5699, TIP1_A_4631, TIP1_A_5695, TIP1_A_5684, TIP1_A_5691, TIP1_A_5674, TIP1_A_5675, TIP1_A_5676, TIP1_A_5677,
                    TIP1_A_5678, TIP1_A_5679, GS_A_5525, GS_A_5345, GS_A_4388, GS_A_5080, GS_A_5081, GS_A_5131, GS_A_5071, GS_A_5091, TIP1_A_3314, TIP1_A_3895, TIP1_A_3315, TIP1_A_5159, TIP1_A_3896, TIP1_A_3316, TIP1_A_6131, TIP1_A_6108,
                    TIP1_A_6132, TIP1_A_6133, TIP1_A_6103, TIP1_A_6112, TIP1_A_6113, TIP1_A_6114, TIP1_A_6115, TIP1_A_6116, TIP1_A_6117, TIP1_A_6118, TIP1_A_6120, TIP1_A_6121, TIP1_A_6122, TIP1_A_6123, GS_A_4832, GS_A_4037, GS_A_4765,
                    GS_A_4766, GS_A_4042, GS_A_4048, GS_A_4772, GS_A_4773, GS_A_4837, GS_A_4774, GS_A_4891, GS_A_4052, GS_A_4053, GS_A_4054, GS_A_4069, GS_A_4070, GS_A_4884, GS_A_3829, GS_A_3932, GS_A_3834, GS_A_4849, GS_A_4811, GS_A_3931,
                    GS_A_3833, GS_A_3840, GS_A_4816, GS_A_4848, GS_A_3942, GS_A_3933, GS_A_3935, GS_A_3936, GS_A_3938, GS_A_3945, GS_A_4075, GS_A_3934, GS_A_3939, GS_A_3695, GS_A_3696, GS_A_3700, GS_A_5054, GS_A_5038, GS_A_3702, GS_A_4865,
                    GS_A_4867, GS_A_4868, GS_A_4869, GS_A_4870, GS_A_4871, GS_A_4872, GS_A_3856, GS_A_4547, GS_A_3801, GS_A_4858, GS_A_3796, GS_A_3816, GS_A_3804, GS_A_3807, GS_A_3805, GS_A_3806, GS_A_4864, GS_A_4941, GS_A_5034, GS_A_4346,
                    GS_A_5096, GS_A_5097, GS_A_5098, GS_A_4150, GS_A_5099, GS_A_5100, GS_A_5101, GS_A_4151, GS_A_5102, GS_A_5103, GS_A_5104, GS_A_5059, GS_A_5105, GS_A_5247, GS_A_4153, GS_A_5107, GS_A_5108, GS_A_5109, GS_A_5332, GS_A_5490,
                    GS_A_5130, GS_A_5325, GS_A_5327, GS_A_5328, GS_A_5333, GS_A_5334, GS_A_5519, GS_A_5520, GS_A_5521, GS_A_5522, GS_A_4637, GS_A_4829, GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648, GS_A_4649, GS_A_4650,
                    GS_A_4651, GS_A_4898, GS_A_4899, GS_A_4652, GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4900, GS_A_4658, GS_A_4660, GS_A_4749, GS_A_4661, GS_A_4662, GS_A_4663, GS_A_5077, GS_A_5078, GS_A_4750, GS_A_5484,
                    GS_A_4751, GS_A_4957, GS_A_5215, VSDM_A_2282, VSDM_A_2285, VSDM_A_2298, VSDM_A_2303, VSDM_A_2308, VSDM_A_2310, VSDM_A_2311, VSDM_A_2318, VSDM_A_2321, VSDM_A_2335, VSDM_A_2552, VSDM_A_2553, VSDM_A_3008, VSDM_A_2596,
                    VSDM_A_2608, VSDM_A_2631, VSDM_A_2633, VSDM_A_2634, VSDM_A_2647, VSDM_A_2658, VSDM_A_2675, VSDM_A_2676, VSDM_A_2677, VSDM_A_2678, VSDM_A_2682, VSDM_A_2689, VSDM_A_2690, VSDM_A_2691, VSDM_A_2692, VSDM_A_2693, VSDM_A_2695,
                    VSDM_A_2696, VSDM_A_2703, VSDM_A_2710, VSDM_A_2711, VSDM_A_2936, VSDM_A_2937, VSDM_A_2982, VSDM_A_2983, VSDM_A_2189, VSDM_A_2190, VSDM_A_2194, VSDM_A_2199, VSDM_A_2200, VSDM_A_2202, VSDM_A_2203, VSDM_A_2204, VSDM_A_2205,
                    VSDM_A_2206, VSDM_A_2207, VSDM_A_2208, VSDM_A_2209, VSDM_A_2211, VSDM_A_2212, VSDM_A_2213, VSDM_A_2214, VSDM_A_2215, VSDM_A_2216, VSDM_A_2217, VSDM_A_2218, VSDM_A_2219, VSDM_A_2225, VSDM_A_2226, VSDM_A_2235, VSDM_A_2312,
                    VSDM_A_2951, VSDM_A_2956, VSDM_A_3003, TIP1_A_5120, TIP1_A_4349, TIP1_A_4350, TIP1_A_4351, TIP1_A_4352, TIP1_A_4353, TIP1_A_4354, TIP1_A_4355, TIP1_A_4356, TIP1_A_4357, TIP1_A_4358, TIP1_A_4359, TIP1_A_4360, TIP1_A_4373,
                    TIP1_A_4374, TIP1_A_4375, TIP1_A_4376, TIP1_A_4377, TIP1_A_4397, TIP1_A_4390, TIP1_A_4391, TIP1_A_4491, TIP1_A_5566, TIP1_A_5570);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_5052, TIP1_A_6538, TIP1_A_6539, TIP1_A_6086, TIP1_A_2781, TIP1_A_6087, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772,
                    TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, VSDM_A_2635, VSDM_A_2644, VSDM_A_2649, VSDM_A_2750, VSDM_A_2874, VSDM_A_3004, TIP1_A_5148, TIP1_A_5536, TIP1_A_5387, TIP1_A_4685,
                    TIP1_A_4994, TIP1_A_5654, TIP1_A_4710, TIP1_A_6479, TIP1_A_4711, TIP1_A_5407, TIP1_A_4728, TIP1_A_4798, TIP1_A_4802, TIP1_A_5661, TIP1_A_5658, TIP1_A_5647, TIP1_A_5648, TIP1_A_5649, TIP1_A_5650, TIP1_A_5651, TIP1_A_5652,
                    TIP1_A_4829, TIP1_A_6476, TIP1_A_4841, TIP1_A_4842, TIP1_A_5685, GS_A_5542, TIP1_A_5159, TIP1_A_3317, GS_A_4009, GS_A_4831, GS_A_5199, GS_A_3931, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5039, GS_A_4875,
                    GS_A_4876, GS_A_3813, GS_A_5036, GS_A_5106, GS_A_5490, GS_A_5013, GS_A_5326, GS_A_5215, VSDM_A_2682, VSDM_A_2217, VSDM_A_3066, TIP1_A_5568, GS_A_4330, VSDM_A_2586, VSDM_A_2591, VSDM_A_2592, VSDM_A_2637, VSDM_A_2776,
                    VSDM_A_2777, VSDM_A_2789, TIP1_A_5541, TIP1_A_4503, TIP1_A_4505, TIP1_A_4507, TIP1_A_4509, TIP1_A_4597, TIP1_A_4510, TIP1_A_4515, TIP1_A_4516, TIP1_A_5009, TIP1_A_4517, TIP1_A_4518, TIP1_A_6727, TIP1_A_5433, TIP1_A_4524,
                    TIP1_A_4525, TIP1_A_4527, TIP1_A_6478, TIP1_A_4545, TIP1_A_4548, TIP1_A_4547, TIP1_A_4553, TIP1_A_4554, TIP1_A_5011, TIP1_A_4558, TIP1_A_4559, TIP1_A_4560, TIP1_A_4561, TIP1_A_5012, TIP1_A_4562, TIP1_A_4565, TIP1_A_4566,
                    TIP1_A_4567, TIP1_A_4568, TIP1_A_4569, TIP1_A_4570, TIP1_A_4571, TIP1_A_4572, TIP1_A_4579, TIP1_A_4580, TIP1_A_4581, TIP1_A_4582, TIP1_A_4583, TIP1_A_4584, TIP1_A_4593, TIP1_A_4595, TIP1_A_4614, TIP1_A_4616, TIP1_A_4617,
                    TIP1_A_4618, TIP1_A_4619, TIP1_A_4623, TIP1_A_4627, TIP1_A_5446, TIP1_A_5447, TIP1_A_5033, TIP1_A_4626, TIP1_A_4629, TIP1_A_4639, TIP1_A_4640, TIP1_A_4992, TIP1_A_4642, TIP1_A_4644, TIP1_A_4645, TIP1_A_5437, TIP1_A_4646,
                    TIP1_A_4647, TIP1_A_4648, TIP1_A_4649, TIP1_A_4651, TIP1_A_4652, TIP1_A_4653, TIP1_A_4654, TIP1_A_5545, TIP1_A_4655, TIP1_A_5113, TIP1_A_4669, TIP1_A_4670, TIP1_A_4671, TIP1_A_4672, TIP1_A_5540, TIP1_A_4680, TIP1_A_4682,
                    TIP1_A_4684, TIP1_A_6730, TIP1_A_6731, TIP1_A_5662, TIP1_A_5663, TIP1_A_4686, TIP1_A_4687, TIP1_A_4692, TIP1_A_4693, TIP1_A_6729, TIP1_A_4694, TIP1_A_4696, TIP1_A_4701, TIP1_A_4708, TIP1_A_5654, TIP1_A_4709, TIP1_A_4715,
                    TIP1_A_4716, TIP1_A_4720, TIP1_A_4721, TIP1_A_5406, TIP1_A_4724, TIP1_A_4725, TIP1_A_4726, TIP1_A_4729, TIP1_A_4730, TIP1_A_5530, TIP1_A_4731, TIP1_A_4732, TIP1_A_4733, TIP1_A_4734, TIP1_A_4735, TIP1_A_4736, TIP1_A_4737,
                    TIP1_A_4738, TIP1_A_4740, TIP1_A_4741, TIP1_A_4742, TIP1_A_4744, TIP1_A_4746, TIP1_A_4745, TIP1_A_4747, TIP1_A_4748, TIP1_A_4749, TIP1_A_4750, TIP1_A_4751, TIP1_A_4752, TIP1_A_4753, TIP1_A_4754, TIP1_A_4755, TIP1_A_4758,
                    TIP1_A_4761, TIP1_A_4762, TIP1_A_4778, TIP1_A_4782, TIP1_A_4783, TIP1_A_4784, TIP1_A_4785, TIP1_A_4786, TIP1_A_4788, TIP1_A_4792, TIP1_A_4794, TIP1_A_4806, TIP1_A_5661, TIP1_A_5658, TIP1_A_4808, TIP1_A_4810, TIP1_A_4812,
                    TIP1_A_4813, TIP1_A_4814, TIP1_A_4815, TIP1_A_4816, TIP1_A_4818, TIP1_A_4820, TIP1_A_4823, TIP1_A_4827, TIP1_A_5647, TIP1_A_5650, TIP1_A_5651, TIP1_A_5652, TIP1_A_5657, TIP1_A_5659, TIP1_A_4832, TIP1_A_4838, TIP1_A_4839,
                    TIP1_A_4840, TIP1_A_4843, GS_A_4357, GS_A_4358, GS_A_4359, GS_A_4360, GS_A_4361, GS_A_4362, GS_A_4363, GS_A_4364, GS_A_4365, GS_A_4366, GS_A_4367, GS_A_4368, GS_A_4370, GS_A_4371, GS_A_4372, GS_A_4373, GS_A_4374,
                    GS_A_4375, GS_A_4376, GS_A_4377, GS_A_4379, GS_A_4382, GS_A_4383, GS_A_4385, GS_A_4386, GS_A_5530, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5542, GS_A_5322, GS_A_5525, GS_A_5345, GS_A_4389, GS_A_4390, GS_A_5016, GS_A_5080,
                    GS_A_5081, GS_A_4393, GS_A_5131, GS_A_5071, GS_A_5207, GS_A_5208, TIP1_A_3896, GS_A_4052, GS_A_4053, GS_A_4054, GS_A_4884, GS_A_4816, GS_A_3939, GS_A_4865, GS_A_4866, GS_A_4867, GS_A_4868, GS_A_4869, GS_A_4870,
                    GS_A_4871, GS_A_4872, GS_A_4873, GS_A_4874, GS_A_4941, GS_A_4829, GS_A_4640, GS_A_4748, GS_A_4642, GS_A_4643, GS_A_4648, GS_A_4650, GS_A_4898, GS_A_4899, GS_A_4900, GS_A_4943, GS_A_5077, GS_A_5078, GS_A_5215,
                    TIP1_A_4349, TIP1_A_4350, TIP1_A_4353, TIP1_A_4354, TIP1_A_4371, TIP1_A_4373, TIP1_A_4374, TIP1_A_4397, TIP1_A_5566, TIP1_A_2579, TIP1_A_2580, TIP1_A_2582, TIP1_A_2583, TIP1_A_2584, TIP1_A_4222, TIP1_A_2590, TIP1_A_2591,
                    GS_A_4473, GS_A_4474, Card_G2_A_3593, GS_A_4529, TIP1_A_5696, GS_A_5386, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_2229, GS_A_2227, GS_A_2228, GS_A_2232, GS_A_2239, GS_A_2234, GS_A_2235, GS_A_2236,
                    GS_A_2237, GS_A_2230, GS_A_2238, GS_A_5209, GS_A_2240, GS_A_2242, GS_A_2244, GS_A_2246, GS_A_2247, GS_A_2248, GS_A_2249, GS_A_2250, GS_A_2253, GS_A_2254, GS_A_2255, GS_A_2256, GS_A_2260, GS_A_2261, GS_A_2264, GS_A_2266,
                    GS_A_2270, GS_A_2271, GS_A_2274, GS_A_2276, GS_A_2277, GS_A_2284, GS_A_2285, GS_A_5085, GS_A_2287, GS_A_2252, GS_A_2291, GS_A_2292, GS_A_2295, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737,
                    GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2087, GS_A_2213, GS_A_2076, GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328,
                    GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2345, GS_A_2347, GS_A_2361, GS_A_2363, GS_A_2366, GS_A_5387, TIP1_A_5392, TIP1_A_5393, TIP1_A_5394, TIP1_A_5395, TIP1_A_5396, TIP1_A_5397, TIP1_A_5398, TIP1_A_5399,
                    TIP1_A_5400, TIP1_A_4707, TIP1_A_4607, TIP1_A_4799, TIP1_A_3908, TIP1_A_3318, TIP1_A_3322, TIP1_A_6119, GS_A_5018, GS_A_4607, GS_A_2524, GS_A_2525, GS_A_2354, GS_A_2350, TIP1_A_5148, TIP1_A_4841, TIP1_A_4845,
                    TIP1_A_4846, GS_A_4346, GS_A_4150, GS_A_4151, GS_A_5059, GS_A_4153, GS_A_5096, GS_A_5099, GS_A_5102, GS_A_5105, GS_A_5107, GS_A_5097, GS_A_5100, GS_A_5103, GS_A_5036, GS_A_5108, GS_A_5098, GS_A_5101, GS_A_5104,
                    GS_A_5106, GS_A_5109);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_Kon_PTV1_10_0_0("gemProdT_Kon_PTV1.10.0-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(VSDM_A_2973, VSDM_A_2974, VSDM_A_2975, VSDM_A_2976, VSDM_A_2563, VSDM_A_2565, VSDM_A_2566, VSDM_A_2567, VSDM_A_2568, VSDM_A_2569, VSDM_A_2570, VSDM_A_2571, VSDM_A_2572, VSDM_A_2573, VSDM_A_2574,
                    VSDM_A_2575, VSDM_A_2576, VSDM_A_2577, VSDM_A_2578, VSDM_A_2579, VSDM_A_2580, VSDM_A_2581, VSDM_A_2582, VSDM_A_2583, VSDM_A_2584, VSDM_A_2585, VSDM_A_2586, VSDM_A_2587, VSDM_A_2588, VSDM_A_2589, VSDM_A_2590, VSDM_A_2591,
                    VSDM_A_2592, VSDM_A_2594, VSDM_A_2595, VSDM_A_2597, VSDM_A_2601, VSDM_A_2602, VSDM_A_2603, VSDM_A_2604, VSDM_A_2605, VSDM_A_2606, VSDM_A_2607, VSDM_A_2609, VSDM_A_2611, VSDM_A_2612, VSDM_A_2613, VSDM_A_2614, VSDM_A_2615,
                    VSDM_A_2616, VSDM_A_2619, VSDM_A_2620, VSDM_A_2621, VSDM_A_2622, VSDM_A_2623, VSDM_A_2624, VSDM_A_2625, VSDM_A_2626, VSDM_A_2636, VSDM_A_2638, VSDM_A_2639, VSDM_A_2642, VSDM_A_2649, VSDM_A_2650, VSDM_A_2651, VSDM_A_2652,
                    VSDM_A_2653, VSDM_A_2654, VSDM_A_2655, VSDM_A_2660, VSDM_A_2662, VSDM_A_2664, VSDM_A_2665, VSDM_A_2667, VSDM_A_2668, VSDM_A_2687, VSDM_A_2708, VSDM_A_2745, VSDM_A_2749, VSDM_A_2750, VSDM_A_2752, VSDM_A_2770, VSDM_A_2772,
                    VSDM_A_2775, VSDM_A_2776, VSDM_A_2777, VSDM_A_2778, VSDM_A_2779, VSDM_A_2784, VSDM_A_2789, VSDM_A_2791, VSDM_A_2792, VSDM_A_2793, VSDM_A_2944, VSDM_A_2979, VSDM_A_2981, VSDM_A_2989, VSDM_A_2998, VSDM_A_3007, VSDM_A_3020,
                    VSDM_A_3033, VSDM_A_3067, VSDM_A_3070, TIP1_A_5541, TIP1_A_4503, TIP1_A_4504, TIP1_A_5543, TIP1_A_4505, TIP1_A_4506, TIP1_A_4508, TIP1_A_4509, TIP1_A_4597, TIP1_A_4510, TIP1_A_4512, TIP1_A_4513, TIP1_A_4514, TIP1_A_4515,
                    TIP1_A_4516, TIP1_A_5009, TIP1_A_4517, TIP1_A_4518, TIP1_A_5401, TIP1_A_4519, TIP1_A_5058, TIP1_A_4520, TIP1_A_4521, TIP1_A_4981, TIP1_A_4707, TIP1_A_4982, TIP1_A_4522, TIP1_A_4523, TIP1_A_4524, TIP1_A_4525, TIP1_A_4526,
                    TIP1_A_4528, TIP1_A_4529, TIP1_A_4532, TIP1_A_4533, TIP1_A_4534, TIP1_A_4536, TIP1_A_6725, TIP1_A_4537, TIP1_A_4538, TIP1_A_6478, TIP1_A_4539, TIP1_A_5408, TIP1_A_4540, TIP1_A_4541, TIP1_A_4542, TIP1_A_4543, TIP1_A_4544,
                    TIP1_A_4545, TIP1_A_4546, TIP1_A_4548, TIP1_A_4985, TIP1_A_4547, TIP1_A_5409, TIP1_A_5410, TIP1_A_5411, TIP1_A_5412, TIP1_A_5413, TIP1_A_4549, TIP1_A_4550, TIP1_A_4986, TIP1_A_4551, TIP1_A_4552, TIP1_A_4553, TIP1_A_4554,
                    TIP1_A_6477, TIP1_A_4555, TIP1_A_4556, TIP1_A_4557, TIP1_A_5698, TIP1_A_5011, TIP1_A_4988, TIP1_A_6031, TIP1_A_4560, TIP1_A_4561, TIP1_A_5012, TIP1_A_4562, TIP1_A_4563, TIP1_A_4565, TIP1_A_4566, TIP1_A_4567, TIP1_A_4568,
                    TIP1_A_4569, TIP1_A_4570, TIP1_A_4572, TIP1_A_4573, TIP1_A_4574, TIP1_A_4575, TIP1_A_4577, TIP1_A_4579, TIP1_A_4580, TIP1_A_4583, TIP1_A_4584, TIP1_A_4585, TIP1_A_4586, TIP1_A_4587, TIP1_A_4588, TIP1_A_4589, TIP1_A_4590,
                    TIP1_A_4592, TIP1_A_4593, TIP1_A_5110, TIP1_A_5111, TIP1_A_4594, TIP1_A_5536, TIP1_A_4595, TIP1_A_4596, TIP1_A_4598, TIP1_A_4599, TIP1_A_4600, TIP1_A_4602, TIP1_A_4603, TIP1_A_4604, TIP1_A_4605, TIP1_A_4607, TIP1_A_4608,
                    TIP1_A_4609, TIP1_A_5112, TIP1_A_4610, TIP1_A_4611, TIP1_A_4612, TIP1_A_4613, TIP1_A_4682, TIP1_A_4684, TIP1_A_4685, TIP1_A_4686, TIP1_A_4687, TIP1_A_4994, TIP1_A_4688, TIP1_A_4689, TIP1_A_4690, TIP1_A_4691, TIP1_A_4692,
                    TIP1_A_4693, TIP1_A_4694, TIP1_A_4695, TIP1_A_4696, TIP1_A_4697, TIP1_A_4698, TIP1_A_4699, TIP1_A_4700, TIP1_A_5449, TIP1_A_4701, TIP1_A_4702, TIP1_A_4703, TIP1_A_4704, TIP1_A_4705, TIP1_A_4706, TIP1_A_5700, TIP1_A_4708,
                    TIP1_A_4710, TIP1_A_6479, TIP1_A_4712, TIP1_A_4713, TIP1_A_4714, TIP1_A_4715, TIP1_A_4716, TIP1_A_4996, TIP1_A_4717, TIP1_A_4718, TIP1_A_4719, TIP1_A_4720, TIP1_A_4721, TIP1_A_4722, TIP1_A_4723, TIP1_A_5406, TIP1_A_5407,
                    TIP1_A_4725, TIP1_A_4729, TIP1_A_5152, TIP1_A_4730, TIP1_A_5530, TIP1_A_4731, TIP1_A_4732, TIP1_A_4733, TIP1_A_4734, TIP1_A_4735, TIP1_A_4736, TIP1_A_4737, TIP1_A_4738, TIP1_A_4740, TIP1_A_4741, TIP1_A_4742, TIP1_A_4744,
                    TIP1_A_4746, TIP1_A_4745, TIP1_A_4747, TIP1_A_4748, TIP1_A_4750, TIP1_A_4751, TIP1_A_4752, TIP1_A_4753, TIP1_A_4754, TIP1_A_4755, TIP1_A_4758, TIP1_A_5414, TIP1_A_4759, TIP1_A_4760, TIP1_A_4761, TIP1_A_5537, TIP1_A_4762,
                    TIP1_A_4763, TIP1_A_4765, TIP1_A_4766, TIP1_A_4767, TIP1_A_4768, TIP1_A_4769, TIP1_A_4771, TIP1_A_4772, TIP1_A_4773, TIP1_A_4774, TIP1_A_4775, TIP1_A_4776, TIP1_A_4778, TIP1_A_4779, TIP1_A_4780, TIP1_A_4781, TIP1_A_5417,
                    TIP1_A_4782, TIP1_A_4783, TIP1_A_4784, TIP1_A_5415, TIP1_A_4785, TIP1_A_4787, TIP1_A_4788, TIP1_A_4789, TIP1_A_4790, TIP1_A_4791, TIP1_A_4792, TIP1_A_4793, TIP1_A_4794, TIP1_A_4795, TIP1_A_4796, TIP1_A_4797, TIP1_A_4799,
                    TIP1_A_4801, TIP1_A_4803, TIP1_A_4804, TIP1_A_5035, TIP1_A_5416, TIP1_A_4805, TIP1_A_4806, TIP1_A_4807, TIP1_A_5658, TIP1_A_5005, TIP1_A_4808, TIP1_A_4810, TIP1_A_4811, TIP1_A_4812, TIP1_A_4813, TIP1_A_4814, TIP1_A_4818,
                    TIP1_A_4819, TIP1_A_4820, TIP1_A_4821, TIP1_A_4822, TIP1_A_4823, TIP1_A_4824, TIP1_A_4825, TIP1_A_4826, TIP1_A_4827, TIP1_A_5655, TIP1_A_5650, TIP1_A_5651, TIP1_A_5652, TIP1_A_5653, TIP1_A_5657, TIP1_A_5659, TIP1_A_4831,
                    TIP1_A_4832, TIP1_A_4833, TIP1_A_4834, TIP1_A_5153, TIP1_A_5938, TIP1_A_4835, TIP1_A_4836, TIP1_A_4837, TIP1_A_4838, TIP1_A_4839, TIP1_A_4840, TIP1_A_5542, TIP1_A_4842, TIP1_A_4843, TIP1_A_4844, GS_A_5525, GS_A_5345,
                    GS_A_4388, GS_A_5131, GS_A_5091, TIP1_A_3314, TIP1_A_3895, TIP1_A_3315, TIP1_A_5159, TIP1_A_3896, TIP1_A_3316, TIP1_A_6131, TIP1_A_6108, TIP1_A_6132, TIP1_A_6133, TIP1_A_6103, TIP1_A_6112, TIP1_A_6113, TIP1_A_6114,
                    TIP1_A_6115, TIP1_A_6116, TIP1_A_6117, TIP1_A_6118, TIP1_A_6120, TIP1_A_6121, TIP1_A_6122, TIP1_A_6123, GS_A_4832, GS_A_4037, GS_A_4765, GS_A_4766, GS_A_4042, GS_A_4048, GS_A_4772, GS_A_4773, GS_A_4837, GS_A_4774,
                    GS_A_4891, GS_A_4052, GS_A_4053, GS_A_4054, GS_A_4069, GS_A_4070, GS_A_4884, GS_A_3829, GS_A_3932, GS_A_3834, GS_A_4849, GS_A_4811, GS_A_3931, GS_A_3833, GS_A_3840, GS_A_4816, GS_A_4848, GS_A_3942, GS_A_3933, GS_A_3935,
                    GS_A_3936, GS_A_3938, GS_A_3945, GS_A_4075, GS_A_3934, GS_A_3939, GS_A_3695, GS_A_3696, GS_A_3700, GS_A_5054, GS_A_5038, GS_A_3702, GS_A_4865, GS_A_4867, GS_A_4868, GS_A_4869, GS_A_4870, GS_A_4871, GS_A_4872, GS_A_3856,
                    GS_A_4547, GS_A_3801, GS_A_4858, GS_A_3796, GS_A_3816, GS_A_3804, GS_A_3807, GS_A_3805, GS_A_3806, GS_A_4864, GS_A_4941, GS_A_5034, GS_A_4346, GS_A_5096, GS_A_5097, GS_A_5098, GS_A_4150, GS_A_5099, GS_A_5100, GS_A_5101,
                    GS_A_5247, GS_A_4153, GS_A_5107, GS_A_5108, GS_A_5109, GS_A_5332, GS_A_5130, GS_A_5325, GS_A_5327, GS_A_5328, GS_A_5333, GS_A_5334, GS_A_4637, GS_A_4829, GS_A_4642, GS_A_4643, GS_A_4646, GS_A_4647, GS_A_5336, GS_A_4648,
                    GS_A_4649, GS_A_4650, GS_A_4651, GS_A_4898, GS_A_4899, GS_A_4652, GS_A_4653, GS_A_4654, GS_A_4655, GS_A_4656, GS_A_4657, GS_A_4900, GS_A_4658, GS_A_4660, GS_A_4749, GS_A_4661, GS_A_4662, GS_A_4663, GS_A_5077, GS_A_5078,
                    GS_A_4751, GS_A_4957, GS_A_5215, VSDM_A_2282, VSDM_A_2285, VSDM_A_2298, VSDM_A_2303, VSDM_A_2308, VSDM_A_2310, VSDM_A_2311, VSDM_A_2318, VSDM_A_2321, VSDM_A_2335, VSDM_A_2552, VSDM_A_2553, VSDM_A_3008, VSDM_A_2596,
                    VSDM_A_2608, VSDM_A_2631, VSDM_A_2633, VSDM_A_2634, VSDM_A_2647, VSDM_A_2658, VSDM_A_2675, VSDM_A_2676, VSDM_A_2677, VSDM_A_2678, VSDM_A_2682, VSDM_A_2689, VSDM_A_2690, VSDM_A_2691, VSDM_A_2692, VSDM_A_2693, VSDM_A_2695,
                    VSDM_A_2696, VSDM_A_2703, VSDM_A_2710, VSDM_A_2711, VSDM_A_2936, VSDM_A_2937, VSDM_A_2982, VSDM_A_2983, VSDM_A_2189, VSDM_A_2190, VSDM_A_2194, VSDM_A_2199, VSDM_A_2200, VSDM_A_2202, VSDM_A_2203, VSDM_A_2204, VSDM_A_2205,
                    VSDM_A_2206, VSDM_A_2207, VSDM_A_2208, VSDM_A_2209, VSDM_A_2211, VSDM_A_2212, VSDM_A_2213, VSDM_A_2214, VSDM_A_2215, VSDM_A_2216, VSDM_A_2217, VSDM_A_2218, VSDM_A_2219, VSDM_A_2225, VSDM_A_2226, VSDM_A_2235, VSDM_A_2312,
                    VSDM_A_2951, VSDM_A_2956, VSDM_A_3003, TIP1_A_5120, TIP1_A_4349, TIP1_A_4350, TIP1_A_4351, TIP1_A_4352, TIP1_A_4353, TIP1_A_4354, TIP1_A_4355, TIP1_A_4356, TIP1_A_4357, TIP1_A_4358, TIP1_A_4359, TIP1_A_4360, TIP1_A_4373,
                    TIP1_A_4374, TIP1_A_4375, TIP1_A_4376, TIP1_A_4377, TIP1_A_4397, TIP1_A_4390, TIP1_A_4391, TIP1_A_4491, TIP1_A_5570);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_5052, TIP1_A_6538, TIP1_A_6539, TIP1_A_6086, TIP1_A_2781, TIP1_A_6087, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526, TIP1_A_6772,
                    TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, VSDM_A_2635, VSDM_A_2644, VSDM_A_2649, VSDM_A_2750, VSDM_A_2874, VSDM_A_3004, TIP1_A_5148, TIP1_A_5536, TIP1_A_4685, TIP1_A_4994,
                    TIP1_A_5654, TIP1_A_4710, TIP1_A_6479, TIP1_A_4711, TIP1_A_5407, TIP1_A_4728, TIP1_A_4798, TIP1_A_4802, TIP1_A_5661, TIP1_A_5658, TIP1_A_5647, TIP1_A_5648, TIP1_A_5649, TIP1_A_5650, TIP1_A_5651, TIP1_A_5652, TIP1_A_4829,
                    TIP1_A_6476, TIP1_A_4841, TIP1_A_4842, GS_A_5542, TIP1_A_5159, TIP1_A_3317, GS_A_4009, GS_A_4831, GS_A_5199, GS_A_3931, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5038, GS_A_5039, GS_A_4875, GS_A_4876, GS_A_3813,
                    GS_A_5013, GS_A_5326, GS_A_5215, VSDM_A_2682, VSDM_A_2217, VSDM_A_3066, GS_A_4330, VSDM_A_2586, VSDM_A_2591, VSDM_A_2592, VSDM_A_2637, VSDM_A_2776, VSDM_A_2777, VSDM_A_2789, TIP1_A_5541, TIP1_A_4503, TIP1_A_4505,
                    TIP1_A_4507, TIP1_A_4509, TIP1_A_4597, TIP1_A_4510, TIP1_A_4515, TIP1_A_4516, TIP1_A_5009, TIP1_A_4517, TIP1_A_4518, TIP1_A_4524, TIP1_A_4525, TIP1_A_6478, TIP1_A_4545, TIP1_A_4548, TIP1_A_4547, TIP1_A_4553, TIP1_A_4554,
                    TIP1_A_5011, TIP1_A_4558, TIP1_A_4559, TIP1_A_4560, TIP1_A_4561, TIP1_A_5012, TIP1_A_4562, TIP1_A_4565, TIP1_A_4566, TIP1_A_4567, TIP1_A_4568, TIP1_A_4569, TIP1_A_4570, TIP1_A_4571, TIP1_A_4572, TIP1_A_4579, TIP1_A_4580,
                    TIP1_A_4583, TIP1_A_4584, TIP1_A_4593, TIP1_A_4595, TIP1_A_4682, TIP1_A_4684, TIP1_A_4686, TIP1_A_4687, TIP1_A_4692, TIP1_A_4693, TIP1_A_4694, TIP1_A_4696, TIP1_A_4701, TIP1_A_4708, TIP1_A_5654, TIP1_A_4709, TIP1_A_4715,
                    TIP1_A_4716, TIP1_A_4720, TIP1_A_4721, TIP1_A_5406, TIP1_A_4724, TIP1_A_4725, TIP1_A_4726, TIP1_A_4729, TIP1_A_4730, TIP1_A_5530, TIP1_A_4731, TIP1_A_4732, TIP1_A_4733, TIP1_A_4734, TIP1_A_4735, TIP1_A_4736, TIP1_A_4737,
                    TIP1_A_4738, TIP1_A_4740, TIP1_A_4741, TIP1_A_4742, TIP1_A_4744, TIP1_A_4746, TIP1_A_4745, TIP1_A_4747, TIP1_A_4748, TIP1_A_4749, TIP1_A_4750, TIP1_A_4751, TIP1_A_4752, TIP1_A_4753, TIP1_A_4754, TIP1_A_4755, TIP1_A_4758,
                    TIP1_A_4761, TIP1_A_4762, TIP1_A_4778, TIP1_A_4782, TIP1_A_4783, TIP1_A_4784, TIP1_A_4785, TIP1_A_4786, TIP1_A_4788, TIP1_A_4792, TIP1_A_4794, TIP1_A_4806, TIP1_A_5661, TIP1_A_5658, TIP1_A_4808, TIP1_A_4810, TIP1_A_4812,
                    TIP1_A_4813, TIP1_A_4814, TIP1_A_4815, TIP1_A_4816, TIP1_A_4818, TIP1_A_4820, TIP1_A_4823, TIP1_A_4827, TIP1_A_5647, TIP1_A_5650, TIP1_A_5651, TIP1_A_5652, TIP1_A_5657, TIP1_A_5659, TIP1_A_4832, TIP1_A_4838, TIP1_A_4839,
                    TIP1_A_4840, TIP1_A_4843, GS_A_4357, GS_A_4359, GS_A_4360, GS_A_4361, GS_A_4362, GS_A_4363, GS_A_4364, GS_A_4365, GS_A_4366, GS_A_4367, GS_A_4368, GS_A_4370, GS_A_4377, GS_A_4379, GS_A_4382, GS_A_4383, GS_A_4385,
                    GS_A_4386, GS_A_5530, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5542, GS_A_5322, GS_A_5525, GS_A_5345, GS_A_5016, GS_A_4393, GS_A_5131, GS_A_5207, GS_A_5208, TIP1_A_3896, GS_A_4052, GS_A_4053, GS_A_4054, GS_A_4884,
                    GS_A_4816, GS_A_3939, GS_A_4865, GS_A_4866, GS_A_4867, GS_A_4868, GS_A_4869, GS_A_4870, GS_A_4871, GS_A_4872, GS_A_4873, GS_A_4874, GS_A_4941, GS_A_4829, GS_A_4640, GS_A_4748, GS_A_4642, GS_A_4643, GS_A_4648, GS_A_4650,
                    GS_A_4898, GS_A_4899, GS_A_4900, GS_A_4943, GS_A_5077, GS_A_5078, GS_A_5215, TIP1_A_4349, TIP1_A_4350, TIP1_A_4353, TIP1_A_4354, TIP1_A_4371, TIP1_A_4373, TIP1_A_4374, TIP1_A_4397, TIP1_A_2579, TIP1_A_2580, TIP1_A_2582,
                    TIP1_A_2583, TIP1_A_2584, TIP1_A_4222, TIP1_A_2590, TIP1_A_2591, GS_A_4473, GS_A_4474, Card_G2_A_3593, GS_A_4529, TIP1_A_5696, GS_A_5386, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_2229, GS_A_2227,
                    GS_A_2228, GS_A_2232, GS_A_2239, GS_A_2234, GS_A_2235, GS_A_2236, GS_A_2237, GS_A_2230, GS_A_2238, GS_A_5209, GS_A_2240, GS_A_2242, GS_A_2244, GS_A_2246, GS_A_2247, GS_A_2248, GS_A_2249, GS_A_2250, GS_A_2253, GS_A_2254,
                    GS_A_2255, GS_A_2256, GS_A_2260, GS_A_2261, GS_A_2264, GS_A_2266, GS_A_2270, GS_A_2271, GS_A_2274, GS_A_2276, GS_A_2277, GS_A_2284, GS_A_2285, GS_A_5085, GS_A_2287, GS_A_2252, GS_A_2291, GS_A_2292, GS_A_2295, GS_A_3760,
                    GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2087, GS_A_2213, GS_A_2076, GS_A_2174, GS_A_2177, GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945,
                    GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2345, GS_A_2347, GS_A_2361, GS_A_2363, GS_A_2366, GS_A_5387, TIP1_A_5392, TIP1_A_5393, TIP1_A_5394,
                    TIP1_A_5395, TIP1_A_5396, TIP1_A_5397, TIP1_A_5398, TIP1_A_5399, TIP1_A_5400, TIP1_A_4707, TIP1_A_4607, TIP1_A_4799, TIP1_A_3908, TIP1_A_3318, TIP1_A_3322, TIP1_A_6119, GS_A_5018, GS_A_4607, GS_A_2524, GS_A_2525,
                    GS_A_2354, GS_A_2350, TIP1_A_5148, TIP1_A_4841, TIP1_A_4845, TIP1_A_4846, GS_A_4346, GS_A_4150, GS_A_4153, GS_A_5096, GS_A_5099, GS_A_5107, GS_A_5097, GS_A_5100, GS_A_5108, GS_A_5098, GS_A_5101, GS_A_5109);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    gemProdT_KT_PTV1_2_1_0("gemProdT_KT_PTV1.2.1-0") {
        @Override
        public Set<AFO> getTestableAFOs() {
            final List<AFO> raw = asList(GS_A_4359, GS_A_4361, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5322, GS_A_5524, TIP1_A_3314, TIP1_A_5158, TIP1_A_3315, TIP1_A_5159, TIP1_A_3897, TIP1_A_3316, TIP1_A_6131,
                    TIP1_A_6108, TIP1_A_6132, TIP1_A_6133, TIP1_A_6112, TIP1_A_6113, TIP1_A_6114, TIP1_A_6115, TIP1_A_6116, TIP1_A_6117, TIP1_A_6118, TIP1_A_6120, TIP1_A_6121, TIP1_A_6122, TIP1_A_6123, TIP1_A_6124, TIP1_A_2948, TIP1_A_3106,
                    TIP1_A_2950, TIP1_A_3034, TIP1_A_2951, TIP1_A_2952, TIP1_A_3110, TIP1_A_3111, TIP1_A_2957, TIP1_A_2958, TIP1_A_2959, TIP1_A_2960, TIP1_A_2961, TIP1_A_2962, TIP1_A_2964, TIP1_A_3107, TIP1_A_2963, TIP1_A_3105, TIP1_A_3109,
                    TIP1_A_3189, TIP1_A_5656, TIP1_A_3188, TIP1_A_3152, TIP1_A_3153, TIP1_A_2966, TIP1_A_2967, TIP1_A_2968, TIP1_A_2969, TIP1_A_2970, TIP1_A_2971, TIP1_A_3263, TIP1_A_3144, TIP1_A_3145, TIP1_A_3146, TIP1_A_3938, TIP1_A_3939,
                    TIP1_A_3160, TIP1_A_3161, TIP1_A_3162, TIP1_A_2972, TIP1_A_2973, TIP1_A_6541, TIP1_A_3245, TIP1_A_3170, TIP1_A_3038, TIP1_A_2979, TIP1_A_3415, TIP1_A_2980, TIP1_A_2981, TIP1_A_3412, TIP1_A_2982, TIP1_A_2983, TIP1_A_2984,
                    TIP1_A_3246, TIP1_A_3231, TIP1_A_3232, TIP1_A_3233, TIP1_A_3947, TIP1_A_2985, TIP1_A_2986, TIP1_A_3129, TIP1_A_3260, TIP1_A_2987, TIP1_A_3236, TIP1_A_2988, TIP1_A_2989, TIP1_A_2990, TIP1_A_2991, TIP1_A_2992, TIP1_A_2994,
                    TIP1_A_2995, TIP1_A_2996, TIP1_A_2997, TIP1_A_2998, TIP1_A_2999, TIP1_A_3000, TIP1_A_3001, TIP1_A_3002, TIP1_A_3003, TIP1_A_3004, TIP1_A_3422, TIP1_A_3423, TIP1_A_5083, TIP1_A_3005, TIP1_A_3039, TIP1_A_3040, TIP1_A_3241,
                    TIP1_A_3242, TIP1_A_3227, TIP1_A_6718, TIP1_A_6719, TIP1_A_3180, TIP1_A_3181, TIP1_A_3192, TIP1_A_3043, TIP1_A_3112, TIP1_A_3044, TIP1_A_3413, TIP1_A_3045, TIP1_A_3046, TIP1_A_3048, TIP1_A_3049, TIP1_A_3050, TIP1_A_3051,
                    TIP1_A_3006, TIP1_A_3007, TIP1_A_3067, TIP1_A_3243, TIP1_A_3244, TIP1_A_3926, TIP1_A_3247, TIP1_A_3052, TIP1_A_3053, TIP1_A_3054, TIP1_A_3248, TIP1_A_3055, TIP1_A_3056, TIP1_A_3057, TIP1_A_3249, TIP1_A_3058, TIP1_A_3059,
                    TIP1_A_3061, TIP1_A_3062, TIP1_A_3147, TIP1_A_3148, TIP1_A_3149, TIP1_A_3150, TIP1_A_3117, TIP1_A_3250, TIP1_A_3064, TIP1_A_3065, TIP1_A_3066, TIP1_A_3068, TIP1_A_3070, TIP1_A_3071, TIP1_A_3072, TIP1_A_3073, TIP1_A_3074,
                    TIP1_A_3075, TIP1_A_3077, TIP1_A_3251, TIP1_A_3264, TIP1_A_3078, TIP1_A_3125, TIP1_A_3126, TIP1_A_3127, TIP1_A_3128, TIP1_A_3113, TIP1_A_3114, TIP1_A_3115, TIP1_A_3116, TIP1_A_3177, TIP1_A_3119, TIP1_A_3120, TIP1_A_3121,
                    TIP1_A_3122, TIP1_A_3123, TIP1_A_3124, TIP1_A_3079, TIP1_A_3080, TIP1_A_3081, TIP1_A_3082, TIP1_A_3083, TIP1_A_3084, TIP1_A_3085, TIP1_A_3086, TIP1_A_3087, TIP1_A_6483, TIP1_A_3088, TIP1_A_3089, TIP1_A_3948, TIP1_A_3131,
                    TIP1_A_3118, TIP1_A_3151, TIP1_A_3265, TIP1_A_3184, TIP1_A_3191, TIP1_A_3012, TIP1_A_3013, TIP1_A_3090, TIP1_A_3091, TIP1_A_3132, TIP1_A_3133, TIP1_A_3134, TIP1_A_3135, TIP1_A_3253, TIP1_A_3255, TIP1_A_3158, TIP1_A_3159,
                    TIP1_A_3940, TIP1_A_3934, TIP1_A_3935, TIP1_A_3095, TIP1_A_3136, TIP1_A_3096, TIP1_A_3097, TIP1_A_3266, TIP1_A_3137, TIP1_A_3098, TIP1_A_3258, TIP1_A_3099, TIP1_A_3100, TIP1_A_3101, TIP1_A_3102, TIP1_A_3103, TIP1_A_3417,
                    TIP1_A_3104, TIP1_A_3424, TIP1_A_3420, TIP1_A_3154, TIP1_A_3421, TIP1_A_3425, TIP1_A_5424, TIP1_A_5425, TIP1_A_5426, TIP1_A_3418, GS_A_3695, GS_A_3696, GS_A_3700, GS_A_5054, GS_A_5038, GS_A_3702, GS_A_4865, GS_A_4867,
                    GS_A_4868, GS_A_4869, GS_A_4870, GS_A_4871, GS_A_4872, GS_A_4941, GS_A_5034, GS_A_4154, GS_A_5329, GS_A_5330);
            return unmodifiableSet(new HashSet<>(raw));
        }

        @Override
        public Set<AFO> getAFOs() {
            final List<AFO> raw = asList(TIP1_A_6516, TIP1_A_6517, TIP1_A_6518, TIP1_A_6519, TIP1_A_6523, TIP1_A_5052, TIP1_A_2769, TIP1_A_6538, TIP1_A_6539, TIP1_A_6086, TIP1_A_2781, TIP1_A_6087, TIP1_A_6524, TIP1_A_6525, TIP1_A_6526,
                    TIP1_A_6772, TIP1_A_6529, TIP1_A_6531, TIP1_A_6532, TIP1_A_6533, TIP1_A_6535, TIP1_A_6536, TIP1_A_6537, GS_A_5542, TIP1_A_5159, TIP1_A_3317, TIP1_A_3190, TIP1_A_6481, TIP1_A_6717, TIP1_A_6720, TIP1_A_6482, GS_A_4009,
                    GS_A_4831, GS_A_3695, GS_A_3696, GS_A_3697, GS_A_4541, GS_A_5039, GS_A_4875, GS_A_4876, GS_A_3813, GS_A_4330, GS_A_4359, GS_A_4361, GS_A_4367, GS_A_4368, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035, GS_A_4384, GS_A_5542,
                    GS_A_5322, GS_A_5524, GS_A_5207, TIP1_A_2965, TIP1_A_3153, TIP1_A_2966, TIP1_A_2967, TIP1_A_2968, TIP1_A_2969, TIP1_A_2970, TIP1_A_2971, TIP1_A_3036, TIP1_A_3261, TIP1_A_3262, TIP1_A_3182, TIP1_A_3185, TIP1_A_3183,
                    TIP1_A_2976, TIP1_A_2977, TIP1_A_3245, TIP1_A_2978, TIP1_A_3170, TIP1_A_3415, TIP1_A_2980, TIP1_A_2981, TIP1_A_3412, TIP1_A_2982, TIP1_A_2983, TIP1_A_2984, TIP1_A_3231, TIP1_A_3232, TIP1_A_3233, TIP1_A_2985, TIP1_A_2986,
                    TIP1_A_3129, TIP1_A_3260, TIP1_A_3234, TIP1_A_3235, TIP1_A_2987, TIP1_A_2990, TIP1_A_2991, TIP1_A_2993, TIP1_A_2994, TIP1_A_2995, TIP1_A_2997, TIP1_A_3416, TIP1_A_3000, TIP1_A_3002, TIP1_A_3003, TIP1_A_3004, TIP1_A_3422,
                    TIP1_A_3423, TIP1_A_5083, TIP1_A_3239, TIP1_A_3005, TIP1_A_3039, TIP1_A_3040, TIP1_A_3241, TIP1_A_3242, TIP1_A_3041, TIP1_A_3227, TIP1_A_3180, TIP1_A_3181, TIP1_A_3229, TIP1_A_3043, TIP1_A_3044, TIP1_A_3413, TIP1_A_3047,
                    TIP1_A_3048, TIP1_A_3049, TIP1_A_3050, TIP1_A_3051, TIP1_A_3064, TIP1_A_3065, TIP1_A_3069, TIP1_A_3070, TIP1_A_3071, TIP1_A_3072, TIP1_A_3073, TIP1_A_3074, TIP1_A_3125, TIP1_A_3126, TIP1_A_3127, TIP1_A_3128, TIP1_A_3113,
                    TIP1_A_3114, TIP1_A_3092, TIP1_A_3108, TIP1_A_3093, TIP1_A_3253, TIP1_A_3255, TIP1_A_3256, TIP1_A_3257, TIP1_A_3094, TIP1_A_3158, TIP1_A_3159, TIP1_A_3941, TIP1_A_3940, TIP1_A_3933, TIP1_A_3934, TIP1_A_3935, TIP1_A_4115,
                    TIP1_A_3936, TIP1_A_3937, TIP1_A_3095, TIP1_A_3136, TIP1_A_3096, TIP1_A_3097, TIP1_A_3266, TIP1_A_3137, TIP1_A_3098, TIP1_A_3258, TIP1_A_3259, TIP1_A_3099, TIP1_A_3100, TIP1_A_3101, TIP1_A_3102, TIP1_A_3103, TIP1_A_3417,
                    TIP1_A_3104, TIP1_A_3424, TIP1_A_3420, TIP1_A_3154, TIP1_A_3421, TIP1_A_5424, TIP1_A_5425, TIP1_A_5426, GS_A_4865, GS_A_4866, GS_A_4867, GS_A_4868, GS_A_4869, GS_A_4870, GS_A_4871, GS_A_4872, GS_A_4873, GS_A_4874,
                    GS_A_4941, TIP1_A_2579, TIP1_A_2580, TIP1_A_2582, TIP1_A_2583, TIP1_A_2584, TIP1_A_4222, TIP1_A_2590, TIP1_A_2591, GS_A_4473, GS_A_4474, GS_A_4475, GS_A_4529, GS_A_5386, GS_A_4385, GS_A_4386, GS_A_4387, GS_A_5035,
                    GS_A_4384, TIP1_A_7016, TIP1_A_6720, GS_A_3760, GS_A_4980, GS_A_4981, GS_A_4982, GS_A_4983, GS_A_4984, GS_A_3737, GS_A_3747, GS_A_3753, GS_A_3772, GS_A_3756, GS_A_2087, GS_A_2213, GS_A_2076, GS_A_2174, GS_A_2177,
                    GS_A_2012, GS_A_2021, GS_A_2046, GS_A_4944, GS_A_4945, GS_A_4946, GS_A_4947, GS_A_2047, GS_A_2309, GS_A_2326, GS_A_2328, GS_A_2329, GS_A_2330, GS_A_2331, GS_A_2332, GS_A_2345, GS_A_2347, GS_A_2361, GS_A_2363, GS_A_2366,
                    GS_A_5387, TIP1_A_3908, TIP1_A_3318, TIP1_A_3322, TIP1_A_6119, TIP1_A_3192, GS_A_2524, GS_A_2525, GS_A_2354, GS_A_2350, TIP1_A_3035, TIP1_A_2953, TIP1_A_2954, TIP1_A_3942, TIP1_A_2955, TIP1_A_2956, TIP1_A_2962,
                    TIP1_A_3930, TIP1_A_3932, TIP1_A_3927, TIP1_A_3008, TIP1_A_3009, TIP1_A_3929, TIP1_A_3130, TIP1_A_3138, TIP1_A_3944, TIP1_A_3010, TIP1_A_3011, TIP1_A_3062, TIP1_A_3147, TIP1_A_3148, TIP1_A_3149, TIP1_A_3150, TIP1_A_3063,
                    TIP1_A_5424, TIP1_A_5425, TIP1_A_5426);
            raw.stream().filter(this.getTestableAFOs()::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
            return unmodifiableSet(concat(this.getTestableAFOs().stream(), raw.stream()).collect(toSet()));
        }

    },

    ;

    private PTStBs(final String reference) {
        assert nonNull(reference) : "There must be a non-null gematik reference identifier!";
        assert !reference.isEmpty() : "There must be a non-empty gematik reference identifier!";
        this.reference = reference;
        this.testAFOs = emptySet();
        this.afos = emptySet();
    }

    private PTStBs(final String reference, final List<AFO> testAFOs, final List<AFO> nonTestAFOs) {
        assert nonNull(reference) : "There must be a non-null gematik reference identifier!";
        assert !reference.isEmpty() : "There must be a non-empty gematik reference identifier!";
        assert nonNull(testAFOs) : "There must be a non-null list of (test-relevant) AOFs!";
        assert nonNull(nonTestAFOs) : "There must be a non-null list of (test-irrelevant) AOFs!";

        this.reference = reference;
        this.testAFOs = unmodifiableSet(new HashSet<>(testAFOs));
        // assert disjoint(testAFOs, nonTestAFOs);
        nonTestAFOs.stream().filter(testAFOs::contains).forEach(afo -> System.err.format("Hey dude; Please ask yourself (or the gematik) why %1$s contains AFO %2$s that is both testable and non-testable!%n", this.name(), afo));
        this.afos = unmodifiableSet(concat(testAFOs.stream(), nonTestAFOs.stream()).collect(toSet()));
    }

    private final String reference;

    @Override
    public String getReference() {
        return this.reference;
    }

    private final Set<AFO> afos;

    @Override
    public Set<AFO> getAFOs() {
        return this.afos;
    }

    private final Set<AFO> testAFOs;

    @Override
    public Set<AFO> getTestableAFOs() {
        return this.testAFOs;
    }

}
