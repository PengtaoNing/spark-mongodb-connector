package nsmc.rdd.partitioner

import nsmc.mongo.MongoInterval
import org.apache.spark.Partition

case class MongoRDDPartition(index: Int,
                             rowCount: Long,
                             interval: MongoInterval)
  extends Partition