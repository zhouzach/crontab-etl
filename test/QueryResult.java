// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed May 24 19:12:43 CST 2017
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Long bpid;
  public Long get_bpid() {
    return bpid;
  }
  public void set_bpid(Long bpid) {
    this.bpid = bpid;
  }
  public QueryResult with_bpid(Long bpid) {
    this.bpid = bpid;
    return this;
  }
  private String dataid;
  public String get_dataid() {
    return dataid;
  }
  public void set_dataid(String dataid) {
    this.dataid = dataid;
  }
  public QueryResult with_dataid(String dataid) {
    this.dataid = dataid;
    return this;
  }
  private Integer device_type;
  public Integer get_device_type() {
    return device_type;
  }
  public void set_device_type(Integer device_type) {
    this.device_type = device_type;
  }
  public QueryResult with_device_type(Integer device_type) {
    this.device_type = device_type;
    return this;
  }
  private Long userid;
  public Long get_userid() {
    return userid;
  }
  public void set_userid(Long userid) {
    this.userid = userid;
  }
  public QueryResult with_userid(Long userid) {
    this.userid = userid;
    return this;
  }
  private String deviceid;
  public String get_deviceid() {
    return deviceid;
  }
  public void set_deviceid(String deviceid) {
    this.deviceid = deviceid;
  }
  public QueryResult with_deviceid(String deviceid) {
    this.deviceid = deviceid;
    return this;
  }
  private Integer position;
  public Integer get_position() {
    return position;
  }
  public void set_position(Integer position) {
    this.position = position;
  }
  public QueryResult with_position(Integer position) {
    this.position = position;
    return this;
  }
  private Integer data_type;
  public Integer get_data_type() {
    return data_type;
  }
  public void set_data_type(Integer data_type) {
    this.data_type = data_type;
  }
  public QueryResult with_data_type(Integer data_type) {
    this.data_type = data_type;
    return this;
  }
  private Long high_bp;
  public Long get_high_bp() {
    return high_bp;
  }
  public void set_high_bp(Long high_bp) {
    this.high_bp = high_bp;
  }
  public QueryResult with_high_bp(Long high_bp) {
    this.high_bp = high_bp;
    return this;
  }
  private Long low_bp;
  public Long get_low_bp() {
    return low_bp;
  }
  public void set_low_bp(Long low_bp) {
    this.low_bp = low_bp;
  }
  public QueryResult with_low_bp(Long low_bp) {
    this.low_bp = low_bp;
    return this;
  }
  private Long heart_rate;
  public Long get_heart_rate() {
    return heart_rate;
  }
  public void set_heart_rate(Long heart_rate) {
    this.heart_rate = heart_rate;
  }
  public QueryResult with_heart_rate(Long heart_rate) {
    this.heart_rate = heart_rate;
    return this;
  }
  private Integer who;
  public Integer get_who() {
    return who;
  }
  public void set_who(Integer who) {
    this.who = who;
  }
  public QueryResult with_who(Integer who) {
    this.who = who;
    return this;
  }
  private Integer Is_arhythima;
  public Integer get_Is_arhythima() {
    return Is_arhythima;
  }
  public void set_Is_arhythima(Integer Is_arhythima) {
    this.Is_arhythima = Is_arhythima;
  }
  public QueryResult with_Is_arhythima(Integer Is_arhythima) {
    this.Is_arhythima = Is_arhythima;
    return this;
  }
  private Integer hsd;
  public Integer get_hsd() {
    return hsd;
  }
  public void set_hsd(Integer hsd) {
    this.hsd = hsd;
  }
  public QueryResult with_hsd(Integer hsd) {
    this.hsd = hsd;
    return this;
  }
  private Float inner_temp;
  public Float get_inner_temp() {
    return inner_temp;
  }
  public void set_inner_temp(Float inner_temp) {
    this.inner_temp = inner_temp;
  }
  public QueryResult with_inner_temp(Float inner_temp) {
    this.inner_temp = inner_temp;
    return this;
  }
  private Float out_temp;
  public Float get_out_temp() {
    return out_temp;
  }
  public void set_out_temp(Float out_temp) {
    this.out_temp = out_temp;
  }
  public QueryResult with_out_temp(Float out_temp) {
    this.out_temp = out_temp;
    return this;
  }
  private String weather;
  public String get_weather() {
    return weather;
  }
  public void set_weather(String weather) {
    this.weather = weather;
  }
  public QueryResult with_weather(String weather) {
    this.weather = weather;
    return this;
  }
  private Integer take_pill;
  public Integer get_take_pill() {
    return take_pill;
  }
  public void set_take_pill(Integer take_pill) {
    this.take_pill = take_pill;
  }
  public QueryResult with_take_pill(Integer take_pill) {
    this.take_pill = take_pill;
    return this;
  }
  private Integer mood;
  public Integer get_mood() {
    return mood;
  }
  public void set_mood(Integer mood) {
    this.mood = mood;
  }
  public QueryResult with_mood(Integer mood) {
    this.mood = mood;
    return this;
  }
  private java.sql.Timestamp create_time;
  public java.sql.Timestamp get_create_time() {
    return create_time;
  }
  public void set_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
  }
  public QueryResult with_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
    return this;
  }
  private java.sql.Timestamp measure_time;
  public java.sql.Timestamp get_measure_time() {
    return measure_time;
  }
  public void set_measure_time(java.sql.Timestamp measure_time) {
    this.measure_time = measure_time;
  }
  public QueryResult with_measure_time(java.sql.Timestamp measure_time) {
    this.measure_time = measure_time;
    return this;
  }
  private java.sql.Timestamp update_time;
  public java.sql.Timestamp get_update_time() {
    return update_time;
  }
  public void set_update_time(java.sql.Timestamp update_time) {
    this.update_time = update_time;
  }
  public QueryResult with_update_time(java.sql.Timestamp update_time) {
    this.update_time = update_time;
    return this;
  }
  private Integer available;
  public Integer get_available() {
    return available;
  }
  public void set_available(Integer available) {
    this.available = available;
  }
  public QueryResult with_available(Integer available) {
    this.available = available;
    return this;
  }
  private String phoneid;
  public String get_phoneid() {
    return phoneid;
  }
  public void set_phoneid(String phoneid) {
    this.phoneid = phoneid;
  }
  public QueryResult with_phoneid(String phoneid) {
    this.phoneid = phoneid;
    return this;
  }
  private String version;
  public String get_version() {
    return version;
  }
  public void set_version(String version) {
    this.version = version;
  }
  public QueryResult with_version(String version) {
    this.version = version;
    return this;
  }
  private Float longitude;
  public Float get_longitude() {
    return longitude;
  }
  public void set_longitude(Float longitude) {
    this.longitude = longitude;
  }
  public QueryResult with_longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }
  private Float latitude;
  public Float get_latitude() {
    return latitude;
  }
  public void set_latitude(Float latitude) {
    this.latitude = latitude;
  }
  public QueryResult with_latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }
  private String appid;
  public String get_appid() {
    return appid;
  }
  public void set_appid(String appid) {
    this.appid = appid;
  }
  public QueryResult with_appid(String appid) {
    this.appid = appid;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.bpid == null ? that.bpid == null : this.bpid.equals(that.bpid));
    equal = equal && (this.dataid == null ? that.dataid == null : this.dataid.equals(that.dataid));
    equal = equal && (this.device_type == null ? that.device_type == null : this.device_type.equals(that.device_type));
    equal = equal && (this.userid == null ? that.userid == null : this.userid.equals(that.userid));
    equal = equal && (this.deviceid == null ? that.deviceid == null : this.deviceid.equals(that.deviceid));
    equal = equal && (this.position == null ? that.position == null : this.position.equals(that.position));
    equal = equal && (this.data_type == null ? that.data_type == null : this.data_type.equals(that.data_type));
    equal = equal && (this.high_bp == null ? that.high_bp == null : this.high_bp.equals(that.high_bp));
    equal = equal && (this.low_bp == null ? that.low_bp == null : this.low_bp.equals(that.low_bp));
    equal = equal && (this.heart_rate == null ? that.heart_rate == null : this.heart_rate.equals(that.heart_rate));
    equal = equal && (this.who == null ? that.who == null : this.who.equals(that.who));
    equal = equal && (this.Is_arhythima == null ? that.Is_arhythima == null : this.Is_arhythima.equals(that.Is_arhythima));
    equal = equal && (this.hsd == null ? that.hsd == null : this.hsd.equals(that.hsd));
    equal = equal && (this.inner_temp == null ? that.inner_temp == null : this.inner_temp.equals(that.inner_temp));
    equal = equal && (this.out_temp == null ? that.out_temp == null : this.out_temp.equals(that.out_temp));
    equal = equal && (this.weather == null ? that.weather == null : this.weather.equals(that.weather));
    equal = equal && (this.take_pill == null ? that.take_pill == null : this.take_pill.equals(that.take_pill));
    equal = equal && (this.mood == null ? that.mood == null : this.mood.equals(that.mood));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.measure_time == null ? that.measure_time == null : this.measure_time.equals(that.measure_time));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    equal = equal && (this.available == null ? that.available == null : this.available.equals(that.available));
    equal = equal && (this.phoneid == null ? that.phoneid == null : this.phoneid.equals(that.phoneid));
    equal = equal && (this.version == null ? that.version == null : this.version.equals(that.version));
    equal = equal && (this.longitude == null ? that.longitude == null : this.longitude.equals(that.longitude));
    equal = equal && (this.latitude == null ? that.latitude == null : this.latitude.equals(that.latitude));
    equal = equal && (this.appid == null ? that.appid == null : this.appid.equals(that.appid));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.bpid == null ? that.bpid == null : this.bpid.equals(that.bpid));
    equal = equal && (this.dataid == null ? that.dataid == null : this.dataid.equals(that.dataid));
    equal = equal && (this.device_type == null ? that.device_type == null : this.device_type.equals(that.device_type));
    equal = equal && (this.userid == null ? that.userid == null : this.userid.equals(that.userid));
    equal = equal && (this.deviceid == null ? that.deviceid == null : this.deviceid.equals(that.deviceid));
    equal = equal && (this.position == null ? that.position == null : this.position.equals(that.position));
    equal = equal && (this.data_type == null ? that.data_type == null : this.data_type.equals(that.data_type));
    equal = equal && (this.high_bp == null ? that.high_bp == null : this.high_bp.equals(that.high_bp));
    equal = equal && (this.low_bp == null ? that.low_bp == null : this.low_bp.equals(that.low_bp));
    equal = equal && (this.heart_rate == null ? that.heart_rate == null : this.heart_rate.equals(that.heart_rate));
    equal = equal && (this.who == null ? that.who == null : this.who.equals(that.who));
    equal = equal && (this.Is_arhythima == null ? that.Is_arhythima == null : this.Is_arhythima.equals(that.Is_arhythima));
    equal = equal && (this.hsd == null ? that.hsd == null : this.hsd.equals(that.hsd));
    equal = equal && (this.inner_temp == null ? that.inner_temp == null : this.inner_temp.equals(that.inner_temp));
    equal = equal && (this.out_temp == null ? that.out_temp == null : this.out_temp.equals(that.out_temp));
    equal = equal && (this.weather == null ? that.weather == null : this.weather.equals(that.weather));
    equal = equal && (this.take_pill == null ? that.take_pill == null : this.take_pill.equals(that.take_pill));
    equal = equal && (this.mood == null ? that.mood == null : this.mood.equals(that.mood));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.measure_time == null ? that.measure_time == null : this.measure_time.equals(that.measure_time));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    equal = equal && (this.available == null ? that.available == null : this.available.equals(that.available));
    equal = equal && (this.phoneid == null ? that.phoneid == null : this.phoneid.equals(that.phoneid));
    equal = equal && (this.version == null ? that.version == null : this.version.equals(that.version));
    equal = equal && (this.longitude == null ? that.longitude == null : this.longitude.equals(that.longitude));
    equal = equal && (this.latitude == null ? that.latitude == null : this.latitude.equals(that.latitude));
    equal = equal && (this.appid == null ? that.appid == null : this.appid.equals(that.appid));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.bpid = JdbcWritableBridge.readLong(1, __dbResults);
    this.dataid = JdbcWritableBridge.readString(2, __dbResults);
    this.device_type = JdbcWritableBridge.readInteger(3, __dbResults);
    this.userid = JdbcWritableBridge.readLong(4, __dbResults);
    this.deviceid = JdbcWritableBridge.readString(5, __dbResults);
    this.position = JdbcWritableBridge.readInteger(6, __dbResults);
    this.data_type = JdbcWritableBridge.readInteger(7, __dbResults);
    this.high_bp = JdbcWritableBridge.readLong(8, __dbResults);
    this.low_bp = JdbcWritableBridge.readLong(9, __dbResults);
    this.heart_rate = JdbcWritableBridge.readLong(10, __dbResults);
    this.who = JdbcWritableBridge.readInteger(11, __dbResults);
    this.Is_arhythima = JdbcWritableBridge.readInteger(12, __dbResults);
    this.hsd = JdbcWritableBridge.readInteger(13, __dbResults);
    this.inner_temp = JdbcWritableBridge.readFloat(14, __dbResults);
    this.out_temp = JdbcWritableBridge.readFloat(15, __dbResults);
    this.weather = JdbcWritableBridge.readString(16, __dbResults);
    this.take_pill = JdbcWritableBridge.readInteger(17, __dbResults);
    this.mood = JdbcWritableBridge.readInteger(18, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.measure_time = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.available = JdbcWritableBridge.readInteger(22, __dbResults);
    this.phoneid = JdbcWritableBridge.readString(23, __dbResults);
    this.version = JdbcWritableBridge.readString(24, __dbResults);
    this.longitude = JdbcWritableBridge.readFloat(25, __dbResults);
    this.latitude = JdbcWritableBridge.readFloat(26, __dbResults);
    this.appid = JdbcWritableBridge.readString(27, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.bpid = JdbcWritableBridge.readLong(1, __dbResults);
    this.dataid = JdbcWritableBridge.readString(2, __dbResults);
    this.device_type = JdbcWritableBridge.readInteger(3, __dbResults);
    this.userid = JdbcWritableBridge.readLong(4, __dbResults);
    this.deviceid = JdbcWritableBridge.readString(5, __dbResults);
    this.position = JdbcWritableBridge.readInteger(6, __dbResults);
    this.data_type = JdbcWritableBridge.readInteger(7, __dbResults);
    this.high_bp = JdbcWritableBridge.readLong(8, __dbResults);
    this.low_bp = JdbcWritableBridge.readLong(9, __dbResults);
    this.heart_rate = JdbcWritableBridge.readLong(10, __dbResults);
    this.who = JdbcWritableBridge.readInteger(11, __dbResults);
    this.Is_arhythima = JdbcWritableBridge.readInteger(12, __dbResults);
    this.hsd = JdbcWritableBridge.readInteger(13, __dbResults);
    this.inner_temp = JdbcWritableBridge.readFloat(14, __dbResults);
    this.out_temp = JdbcWritableBridge.readFloat(15, __dbResults);
    this.weather = JdbcWritableBridge.readString(16, __dbResults);
    this.take_pill = JdbcWritableBridge.readInteger(17, __dbResults);
    this.mood = JdbcWritableBridge.readInteger(18, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.measure_time = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.available = JdbcWritableBridge.readInteger(22, __dbResults);
    this.phoneid = JdbcWritableBridge.readString(23, __dbResults);
    this.version = JdbcWritableBridge.readString(24, __dbResults);
    this.longitude = JdbcWritableBridge.readFloat(25, __dbResults);
    this.latitude = JdbcWritableBridge.readFloat(26, __dbResults);
    this.appid = JdbcWritableBridge.readString(27, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(bpid, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(dataid, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(device_type, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(userid, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(deviceid, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(position, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(data_type, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(high_bp, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(low_bp, 9 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(heart_rate, 10 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(who, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(Is_arhythima, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(hsd, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeFloat(inner_temp, 14 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(out_temp, 15 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(weather, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(take_pill, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(mood, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(measure_time, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(available, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(phoneid, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(version, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(longitude, 25 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(latitude, 26 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(appid, 27 + __off, 12, __dbStmt);
    return 27;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(bpid, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(dataid, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(device_type, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(userid, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(deviceid, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(position, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(data_type, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(high_bp, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(low_bp, 9 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(heart_rate, 10 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(who, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(Is_arhythima, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(hsd, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeFloat(inner_temp, 14 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(out_temp, 15 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(weather, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(take_pill, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(mood, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(measure_time, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(available, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(phoneid, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(version, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(longitude, 25 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(latitude, 26 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(appid, 27 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.bpid = null;
    } else {
    this.bpid = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.dataid = null;
    } else {
    this.dataid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.device_type = null;
    } else {
    this.device_type = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.userid = null;
    } else {
    this.userid = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.deviceid = null;
    } else {
    this.deviceid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.position = null;
    } else {
    this.position = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.data_type = null;
    } else {
    this.data_type = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.high_bp = null;
    } else {
    this.high_bp = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.low_bp = null;
    } else {
    this.low_bp = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.heart_rate = null;
    } else {
    this.heart_rate = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.who = null;
    } else {
    this.who = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Is_arhythima = null;
    } else {
    this.Is_arhythima = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.hsd = null;
    } else {
    this.hsd = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.inner_temp = null;
    } else {
    this.inner_temp = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.out_temp = null;
    } else {
    this.out_temp = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.weather = null;
    } else {
    this.weather = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.take_pill = null;
    } else {
    this.take_pill = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.mood = null;
    } else {
    this.mood = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.create_time = null;
    } else {
    this.create_time = new Timestamp(__dataIn.readLong());
    this.create_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.measure_time = null;
    } else {
    this.measure_time = new Timestamp(__dataIn.readLong());
    this.measure_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.update_time = null;
    } else {
    this.update_time = new Timestamp(__dataIn.readLong());
    this.update_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.available = null;
    } else {
    this.available = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.phoneid = null;
    } else {
    this.phoneid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.version = null;
    } else {
    this.version = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.longitude = null;
    } else {
    this.longitude = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.latitude = null;
    } else {
    this.latitude = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.appid = null;
    } else {
    this.appid = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.bpid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.bpid);
    }
    if (null == this.dataid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dataid);
    }
    if (null == this.device_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.device_type);
    }
    if (null == this.userid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.userid);
    }
    if (null == this.deviceid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, deviceid);
    }
    if (null == this.position) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.position);
    }
    if (null == this.data_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.data_type);
    }
    if (null == this.high_bp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.high_bp);
    }
    if (null == this.low_bp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.low_bp);
    }
    if (null == this.heart_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.heart_rate);
    }
    if (null == this.who) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.who);
    }
    if (null == this.Is_arhythima) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Is_arhythima);
    }
    if (null == this.hsd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hsd);
    }
    if (null == this.inner_temp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.inner_temp);
    }
    if (null == this.out_temp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.out_temp);
    }
    if (null == this.weather) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, weather);
    }
    if (null == this.take_pill) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.take_pill);
    }
    if (null == this.mood) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.mood);
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time.getTime());
    __dataOut.writeInt(this.create_time.getNanos());
    }
    if (null == this.measure_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.measure_time.getTime());
    __dataOut.writeInt(this.measure_time.getNanos());
    }
    if (null == this.update_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_time.getTime());
    __dataOut.writeInt(this.update_time.getNanos());
    }
    if (null == this.available) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.available);
    }
    if (null == this.phoneid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, phoneid);
    }
    if (null == this.version) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, version);
    }
    if (null == this.longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.longitude);
    }
    if (null == this.latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.latitude);
    }
    if (null == this.appid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, appid);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.bpid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.bpid);
    }
    if (null == this.dataid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dataid);
    }
    if (null == this.device_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.device_type);
    }
    if (null == this.userid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.userid);
    }
    if (null == this.deviceid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, deviceid);
    }
    if (null == this.position) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.position);
    }
    if (null == this.data_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.data_type);
    }
    if (null == this.high_bp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.high_bp);
    }
    if (null == this.low_bp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.low_bp);
    }
    if (null == this.heart_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.heart_rate);
    }
    if (null == this.who) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.who);
    }
    if (null == this.Is_arhythima) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Is_arhythima);
    }
    if (null == this.hsd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hsd);
    }
    if (null == this.inner_temp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.inner_temp);
    }
    if (null == this.out_temp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.out_temp);
    }
    if (null == this.weather) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, weather);
    }
    if (null == this.take_pill) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.take_pill);
    }
    if (null == this.mood) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.mood);
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time.getTime());
    __dataOut.writeInt(this.create_time.getNanos());
    }
    if (null == this.measure_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.measure_time.getTime());
    __dataOut.writeInt(this.measure_time.getNanos());
    }
    if (null == this.update_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_time.getTime());
    __dataOut.writeInt(this.update_time.getNanos());
    }
    if (null == this.available) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.available);
    }
    if (null == this.phoneid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, phoneid);
    }
    if (null == this.version) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, version);
    }
    if (null == this.longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.longitude);
    }
    if (null == this.latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.latitude);
    }
    if (null == this.appid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, appid);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 124, (char) 42, (char) 0, (char) 92, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(bpid==null?"null":"" + bpid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dataid==null?"null":dataid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(device_type==null?"null":"" + device_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(userid==null?"null":"" + userid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(deviceid==null?"null":deviceid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(position==null?"null":"" + position, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(data_type==null?"null":"" + data_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(high_bp==null?"null":"" + high_bp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(low_bp==null?"null":"" + low_bp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(heart_rate==null?"null":"" + heart_rate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(who==null?"null":"" + who, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Is_arhythima==null?"null":"" + Is_arhythima, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hsd==null?"null":"" + hsd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(inner_temp==null?"null":"" + inner_temp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(out_temp==null?"null":"" + out_temp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(weather==null?"null":weather, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(take_pill==null?"null":"" + take_pill, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mood==null?"null":"" + mood, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(measure_time==null?"null":"" + measure_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_time==null?"null":"" + update_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(available==null?"null":"" + available, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(phoneid==null?"null":phoneid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(version==null?"null":version, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(longitude==null?"null":"" + longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(latitude==null?"null":"" + latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(appid==null?"null":appid, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(bpid==null?"null":"" + bpid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dataid==null?"null":dataid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(device_type==null?"null":"" + device_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(userid==null?"null":"" + userid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(deviceid==null?"null":deviceid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(position==null?"null":"" + position, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(data_type==null?"null":"" + data_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(high_bp==null?"null":"" + high_bp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(low_bp==null?"null":"" + low_bp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(heart_rate==null?"null":"" + heart_rate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(who==null?"null":"" + who, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Is_arhythima==null?"null":"" + Is_arhythima, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hsd==null?"null":"" + hsd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(inner_temp==null?"null":"" + inner_temp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(out_temp==null?"null":"" + out_temp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(weather==null?"null":weather, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(take_pill==null?"null":"" + take_pill, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mood==null?"null":"" + mood, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(measure_time==null?"null":"" + measure_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_time==null?"null":"" + update_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(available==null?"null":"" + available, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(phoneid==null?"null":phoneid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(version==null?"null":version, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(longitude==null?"null":"" + longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(latitude==null?"null":"" + latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(appid==null?"null":appid, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 124, (char) 42, (char) 0, (char) 92, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bpid = null; } else {
      this.bpid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.dataid = null; } else {
      this.dataid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.device_type = null; } else {
      this.device_type = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.userid = null; } else {
      this.userid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.deviceid = null; } else {
      this.deviceid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.position = null; } else {
      this.position = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.data_type = null; } else {
      this.data_type = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.high_bp = null; } else {
      this.high_bp = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.low_bp = null; } else {
      this.low_bp = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.heart_rate = null; } else {
      this.heart_rate = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.who = null; } else {
      this.who = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Is_arhythima = null; } else {
      this.Is_arhythima = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hsd = null; } else {
      this.hsd = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.inner_temp = null; } else {
      this.inner_temp = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.out_temp = null; } else {
      this.out_temp = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.weather = null; } else {
      this.weather = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.take_pill = null; } else {
      this.take_pill = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.mood = null; } else {
      this.mood = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.measure_time = null; } else {
      this.measure_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_time = null; } else {
      this.update_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.available = null; } else {
      this.available = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.phoneid = null; } else {
      this.phoneid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.version = null; } else {
      this.version = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.longitude = null; } else {
      this.longitude = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.latitude = null; } else {
      this.latitude = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.appid = null; } else {
      this.appid = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bpid = null; } else {
      this.bpid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.dataid = null; } else {
      this.dataid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.device_type = null; } else {
      this.device_type = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.userid = null; } else {
      this.userid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.deviceid = null; } else {
      this.deviceid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.position = null; } else {
      this.position = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.data_type = null; } else {
      this.data_type = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.high_bp = null; } else {
      this.high_bp = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.low_bp = null; } else {
      this.low_bp = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.heart_rate = null; } else {
      this.heart_rate = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.who = null; } else {
      this.who = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Is_arhythima = null; } else {
      this.Is_arhythima = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hsd = null; } else {
      this.hsd = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.inner_temp = null; } else {
      this.inner_temp = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.out_temp = null; } else {
      this.out_temp = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.weather = null; } else {
      this.weather = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.take_pill = null; } else {
      this.take_pill = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.mood = null; } else {
      this.mood = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.measure_time = null; } else {
      this.measure_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_time = null; } else {
      this.update_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.available = null; } else {
      this.available = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.phoneid = null; } else {
      this.phoneid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.version = null; } else {
      this.version = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.longitude = null; } else {
      this.longitude = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.latitude = null; } else {
      this.latitude = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.appid = null; } else {
      this.appid = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.measure_time = (o.measure_time != null) ? (java.sql.Timestamp) o.measure_time.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.measure_time = (o.measure_time != null) ? (java.sql.Timestamp) o.measure_time.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("bpid", this.bpid);
    __sqoop$field_map.put("dataid", this.dataid);
    __sqoop$field_map.put("device_type", this.device_type);
    __sqoop$field_map.put("userid", this.userid);
    __sqoop$field_map.put("deviceid", this.deviceid);
    __sqoop$field_map.put("position", this.position);
    __sqoop$field_map.put("data_type", this.data_type);
    __sqoop$field_map.put("high_bp", this.high_bp);
    __sqoop$field_map.put("low_bp", this.low_bp);
    __sqoop$field_map.put("heart_rate", this.heart_rate);
    __sqoop$field_map.put("who", this.who);
    __sqoop$field_map.put("Is_arhythima", this.Is_arhythima);
    __sqoop$field_map.put("hsd", this.hsd);
    __sqoop$field_map.put("inner_temp", this.inner_temp);
    __sqoop$field_map.put("out_temp", this.out_temp);
    __sqoop$field_map.put("weather", this.weather);
    __sqoop$field_map.put("take_pill", this.take_pill);
    __sqoop$field_map.put("mood", this.mood);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("measure_time", this.measure_time);
    __sqoop$field_map.put("update_time", this.update_time);
    __sqoop$field_map.put("available", this.available);
    __sqoop$field_map.put("phoneid", this.phoneid);
    __sqoop$field_map.put("version", this.version);
    __sqoop$field_map.put("longitude", this.longitude);
    __sqoop$field_map.put("latitude", this.latitude);
    __sqoop$field_map.put("appid", this.appid);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("bpid", this.bpid);
    __sqoop$field_map.put("dataid", this.dataid);
    __sqoop$field_map.put("device_type", this.device_type);
    __sqoop$field_map.put("userid", this.userid);
    __sqoop$field_map.put("deviceid", this.deviceid);
    __sqoop$field_map.put("position", this.position);
    __sqoop$field_map.put("data_type", this.data_type);
    __sqoop$field_map.put("high_bp", this.high_bp);
    __sqoop$field_map.put("low_bp", this.low_bp);
    __sqoop$field_map.put("heart_rate", this.heart_rate);
    __sqoop$field_map.put("who", this.who);
    __sqoop$field_map.put("Is_arhythima", this.Is_arhythima);
    __sqoop$field_map.put("hsd", this.hsd);
    __sqoop$field_map.put("inner_temp", this.inner_temp);
    __sqoop$field_map.put("out_temp", this.out_temp);
    __sqoop$field_map.put("weather", this.weather);
    __sqoop$field_map.put("take_pill", this.take_pill);
    __sqoop$field_map.put("mood", this.mood);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("measure_time", this.measure_time);
    __sqoop$field_map.put("update_time", this.update_time);
    __sqoop$field_map.put("available", this.available);
    __sqoop$field_map.put("phoneid", this.phoneid);
    __sqoop$field_map.put("version", this.version);
    __sqoop$field_map.put("longitude", this.longitude);
    __sqoop$field_map.put("latitude", this.latitude);
    __sqoop$field_map.put("appid", this.appid);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("bpid".equals(__fieldName)) {
      this.bpid = (Long) __fieldVal;
    }
    else    if ("dataid".equals(__fieldName)) {
      this.dataid = (String) __fieldVal;
    }
    else    if ("device_type".equals(__fieldName)) {
      this.device_type = (Integer) __fieldVal;
    }
    else    if ("userid".equals(__fieldName)) {
      this.userid = (Long) __fieldVal;
    }
    else    if ("deviceid".equals(__fieldName)) {
      this.deviceid = (String) __fieldVal;
    }
    else    if ("position".equals(__fieldName)) {
      this.position = (Integer) __fieldVal;
    }
    else    if ("data_type".equals(__fieldName)) {
      this.data_type = (Integer) __fieldVal;
    }
    else    if ("high_bp".equals(__fieldName)) {
      this.high_bp = (Long) __fieldVal;
    }
    else    if ("low_bp".equals(__fieldName)) {
      this.low_bp = (Long) __fieldVal;
    }
    else    if ("heart_rate".equals(__fieldName)) {
      this.heart_rate = (Long) __fieldVal;
    }
    else    if ("who".equals(__fieldName)) {
      this.who = (Integer) __fieldVal;
    }
    else    if ("Is_arhythima".equals(__fieldName)) {
      this.Is_arhythima = (Integer) __fieldVal;
    }
    else    if ("hsd".equals(__fieldName)) {
      this.hsd = (Integer) __fieldVal;
    }
    else    if ("inner_temp".equals(__fieldName)) {
      this.inner_temp = (Float) __fieldVal;
    }
    else    if ("out_temp".equals(__fieldName)) {
      this.out_temp = (Float) __fieldVal;
    }
    else    if ("weather".equals(__fieldName)) {
      this.weather = (String) __fieldVal;
    }
    else    if ("take_pill".equals(__fieldName)) {
      this.take_pill = (Integer) __fieldVal;
    }
    else    if ("mood".equals(__fieldName)) {
      this.mood = (Integer) __fieldVal;
    }
    else    if ("create_time".equals(__fieldName)) {
      this.create_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("measure_time".equals(__fieldName)) {
      this.measure_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("update_time".equals(__fieldName)) {
      this.update_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("available".equals(__fieldName)) {
      this.available = (Integer) __fieldVal;
    }
    else    if ("phoneid".equals(__fieldName)) {
      this.phoneid = (String) __fieldVal;
    }
    else    if ("version".equals(__fieldName)) {
      this.version = (String) __fieldVal;
    }
    else    if ("longitude".equals(__fieldName)) {
      this.longitude = (Float) __fieldVal;
    }
    else    if ("latitude".equals(__fieldName)) {
      this.latitude = (Float) __fieldVal;
    }
    else    if ("appid".equals(__fieldName)) {
      this.appid = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("bpid".equals(__fieldName)) {
      this.bpid = (Long) __fieldVal;
      return true;
    }
    else    if ("dataid".equals(__fieldName)) {
      this.dataid = (String) __fieldVal;
      return true;
    }
    else    if ("device_type".equals(__fieldName)) {
      this.device_type = (Integer) __fieldVal;
      return true;
    }
    else    if ("userid".equals(__fieldName)) {
      this.userid = (Long) __fieldVal;
      return true;
    }
    else    if ("deviceid".equals(__fieldName)) {
      this.deviceid = (String) __fieldVal;
      return true;
    }
    else    if ("position".equals(__fieldName)) {
      this.position = (Integer) __fieldVal;
      return true;
    }
    else    if ("data_type".equals(__fieldName)) {
      this.data_type = (Integer) __fieldVal;
      return true;
    }
    else    if ("high_bp".equals(__fieldName)) {
      this.high_bp = (Long) __fieldVal;
      return true;
    }
    else    if ("low_bp".equals(__fieldName)) {
      this.low_bp = (Long) __fieldVal;
      return true;
    }
    else    if ("heart_rate".equals(__fieldName)) {
      this.heart_rate = (Long) __fieldVal;
      return true;
    }
    else    if ("who".equals(__fieldName)) {
      this.who = (Integer) __fieldVal;
      return true;
    }
    else    if ("Is_arhythima".equals(__fieldName)) {
      this.Is_arhythima = (Integer) __fieldVal;
      return true;
    }
    else    if ("hsd".equals(__fieldName)) {
      this.hsd = (Integer) __fieldVal;
      return true;
    }
    else    if ("inner_temp".equals(__fieldName)) {
      this.inner_temp = (Float) __fieldVal;
      return true;
    }
    else    if ("out_temp".equals(__fieldName)) {
      this.out_temp = (Float) __fieldVal;
      return true;
    }
    else    if ("weather".equals(__fieldName)) {
      this.weather = (String) __fieldVal;
      return true;
    }
    else    if ("take_pill".equals(__fieldName)) {
      this.take_pill = (Integer) __fieldVal;
      return true;
    }
    else    if ("mood".equals(__fieldName)) {
      this.mood = (Integer) __fieldVal;
      return true;
    }
    else    if ("create_time".equals(__fieldName)) {
      this.create_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("measure_time".equals(__fieldName)) {
      this.measure_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("update_time".equals(__fieldName)) {
      this.update_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("available".equals(__fieldName)) {
      this.available = (Integer) __fieldVal;
      return true;
    }
    else    if ("phoneid".equals(__fieldName)) {
      this.phoneid = (String) __fieldVal;
      return true;
    }
    else    if ("version".equals(__fieldName)) {
      this.version = (String) __fieldVal;
      return true;
    }
    else    if ("longitude".equals(__fieldName)) {
      this.longitude = (Float) __fieldVal;
      return true;
    }
    else    if ("latitude".equals(__fieldName)) {
      this.latitude = (Float) __fieldVal;
      return true;
    }
    else    if ("appid".equals(__fieldName)) {
      this.appid = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
