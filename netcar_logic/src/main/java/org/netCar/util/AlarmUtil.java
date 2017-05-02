package org.netCar.util;

import org.netCar.vo.SpotVo;

/**
 * 判断围栏工具类
 */
public class AlarmUtil {
	

	
	/**
	 * 判断当前经纬度是否在圆形围栏中
	 * @param vo
	 * @param center
	 * @param radius
	 * @return
	 */
	public static boolean isInCircle(SpotVo vo, Double[] center, Integer radius) {
		double distance = DistanceUtil.distance(vo.getLng(), vo.getLat(), center[0], center[1]);
		return distance < radius;
	}
	
	public static boolean isInCircle(double aLon, double aLat, Double[] center, Integer radius) {
		double distance = DistanceUtil.distance(aLon, aLat, center[0], center[1]);
		return distance < radius;
	}

    ///  判断指定的经纬度坐标点是否落在指定的多边形区域内
    /// </summary>
    /// <param name="ALon">指定点的经度</param>
    /// <param name="ALat">指定点的纬度</param>
    /// <param name="APoints">指定多边形区域各个节点坐标</param>
    /// <returns>True 落在范围内 False 不在范围内</returns>
    public static boolean isPtInPoly(double aLon, double aLat, SpotVo[] region)
    {
        int iSum, iCount, iIndex;
        double dLon1 = 0, dLon2 = 0, dLat1 = 0, dLat2 = 0, dLon;

        if (region.length < 3)
        {
            return false;
        }

        iSum = 0;
        iCount = region.length;

        for (iIndex = 0; iIndex < iCount - 1; iIndex++)
        {
            if (iIndex == iCount - 1)
            {
                dLon1 = region[iIndex].getLng();
                dLat1 = region[iIndex].getLat();
                dLon2 = region[0].getLng();
                dLat2 = region[0].getLat();
            }
            else
            {
                dLon1 = region[iIndex].getLng();
                dLat1 = region[iIndex].getLat();
                dLon2 = region[iIndex + 1].getLng();
                dLat2 = region[iIndex + 1].getLat();
            }

            if (((aLat >= dLat1) && (aLat < dLat2)) || ((aLat >= dLat2) && (aLat < dLat1)))
            {
                if (Math.abs(dLat1 - dLat2) > 0)
                {
                    dLon = dLon1 - ((dLon1 - dLon2) * (dLat1 - aLat)) / (dLat1 - dLat2);
                    if (dLon < aLon)
                        iSum++;
                }
            }
        }

        if ((iSum % 2) != 0)
            return true;
        return false;
    }

    public static boolean isPtInPoly(SpotVo vo, SpotVo[] region){
        int length = region.length;
        boolean boundOrVertex = true;//如果点位于多边形的顶点或边上，也算做点在多边形内，直接返回true
        int intersectCount = 0;//焦点个数
        float  precision = 2e-10f; //浮点类型计算时候与0比较时候的容差
        SpotVo p1, p2;//neighbour bound vertices
        SpotVo p = vo; //标点
        p1 = region[0];//left vertex
        for(int i = 1; i <= length; ++i){//check all rays
            if(p.equals(p1)){
                return boundOrVertex;//p is an vertex
            }

            p2 = region[i % length];//right vertex
            if(p.getLat() < Math.min(p1.getLat(), p2.getLat()) || p.getLat() > Math.max(p1.getLat(), p2.getLat())){//ray is outside of our interests
                p1 = p2;
                continue;//next ray left point
            }

            if(p.getLat() > Math.min(p1.getLat(), p2.getLat()) && p.getLat() < Math.max(p1.getLat(), p2.getLat())){//ray is crossing over by the algorithm (common part of)
                if(p.getLng() <= Math.max(p1.getLng(), p2.getLng())){//x is before of ray
                    if(p1.getLat() == p2.getLat() && p.getLng() >= Math.min(p1.getLng(), p2.getLng())){//overlies on a horizontal ray
                        return boundOrVertex;
                    }

                    if(p1.getLng() == p2.getLng()){//ray is vertical
                        if(p1.getLng() == p.getLng()){//overlies on a vertical ray
                            return boundOrVertex;
                        }else{//before ray
                            ++intersectCount;
                        }
                    }else{//cross point on the left side
                        double xinters = (p.getLat() - p1.getLat()) * (p2.getLng() - p1.getLng()) / (p2.getLat() - p1.getLat()) + p1.getLng();//cross point of lng
                        if(Math.abs(p.getLng() - xinters) < precision){//overlies on a ray
                            return boundOrVertex;
                        }

                        if(p.getLng() < xinters){//before ray
                            ++intersectCount;
                        }
                    }
                }
            }else{//special case when ray is crossing through the vertex
                if(p.getLat() == p2.getLat() && p.getLng() <= p2.getLng()){//p crossing over p2
                    SpotVo p3 = region[(i+1) % length]; //next vertex
                    if(p.getLat() >= Math.min(p1.getLat(), p3.getLat()) && p.getLat() <= Math.max(p1.getLat(), p3.getLat())){//p.lat lies between p1.lat & p3.lat
                        ++intersectCount;
                    }else{
                        intersectCount += 2;
                    }
                }
            }
            p1 = p2;//next ray left point
        }

        if(intersectCount % 2 == 0){//偶数在多边形外
            return false;
        } else { //奇数在多边形内
            return true;
        }
    }


}

