import java.util

import com.alibaba.fastjson.{JSONArray, JSONObject}

/**
 * Created by bigbully on 15/2/9.
 */
object Json extends App{

  println(getDataResult)
  println(getCaseResult)

  def getDataResult:JSONObject = {
    val json = new JSONObject()
    val array = new JSONArray()
    val obj = new JSONObject()
    obj.put("name", "myKey")

    val dataMap = new util.HashMap[String, Any]()
    dataMap.put("2013-04-28 10:49:00" ,10)
    dataMap.put("2013-04-28 10:50:00" ,11)
    dataMap.put("2013-04-28 10:51:00", 12)
    dataMap.put("2013-04-28 10:52:00", 13)
    dataMap.put("2013-04-28 10:53:00", 14)
    dataMap.put("2013-04-28 10:54:00", 15)
    dataMap.put("2013-04-28 10:55:00", 16)
    dataMap.put("2013-04-28 10:56:00", 17)
    dataMap.put("2013-04-28 10:57:00", 18)
    dataMap.put("2013-04-28 10:58:00", 19)

    obj.put("data", dataMap)
    array.add(obj)

    json.put("historyData", array)
    json
  }


  def getCaseResult:JSONObject = {
    val json = new JSONObject()
    val data = new JSONArray()
    val ioqos = new JSONObject()
    ioqos.put("name", "ioqos")
    ioqos.put("current", 20)
    val ioqosData = new JSONObject()

    ioqosData.put("2013-04-28 10:49:00" ,10)
    ioqosData.put("2013-04-28 10:50:00" ,11)
    ioqosData.put("2013-04-28 10:51:00", 12)
    ioqos.put("data", ioqosData)
    data.add(ioqos)

    val record = new JSONObject()
    record.put("current", "阿里云已备案，未接入")
    record.put("name", "record")

    json.put("data", data)
    json.put("status", "normal")
    json.put("fault", "场景故障信息信息")


    json
  }

}
