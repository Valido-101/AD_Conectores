package conectores;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;

public class Ejemplo_procedimiento implements CallableStatement{

	public static void main(String[] args) {
		
		String preparedCall = "{ call subida_precio (?,?) }";
		
		String url = "jdbc:mysql://localhost:3306/prueba_1" + "?useUnicode=true"+ "&serverTimezone=Europe/Madrid";
		
		try 
		{
			Connection con = DriverManager.getConnection(url, "root", "usuario1usuario");
			
			CallableStatement cs = con.prepareCall(preparedCall);
			
			cs.setInt(1, 1);
			cs.setFloat(2, 3);
			cs.execute();
			
			System.out.println("Filas actualizadas: "+cs.getUpdateCount());
			
			con.close();
			cs.close();
		}
		catch(SQLException e) 
		{
			System.out.println("Error");
		}

	}

	@Override
	public void addBatch() throws SQLException {
	}

	@Override
	public void clearParameters() throws SQLException {
	}

	@Override
	public boolean execute() throws SQLException {
		
		return false;
	}

	@Override
	public ResultSet executeQuery() throws SQLException {
		
		return null;
	}

	@Override
	public int executeUpdate() throws SQLException {
		
		return 0;
	}

	@Override
	public ResultSetMetaData getMetaData() throws SQLException {
		
		return null;
	}

	@Override
	public ParameterMetaData getParameterMetaData() throws SQLException {
		
		return null;
	}

	@Override
	public void setArray(int parameterIndex, Array x) throws SQLException {
	}

	@Override
	public void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {
	}

	@Override
	public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
	}

	@Override
	public void setAsciiStream(int parameterIndex, InputStream x, long length) throws SQLException {
	}

	@Override
	public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
	}

	@Override
	public void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {
	}

	@Override
	public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
	}

	@Override
	public void setBinaryStream(int parameterIndex, InputStream x, long length) throws SQLException {
	}

	@Override
	public void setBlob(int parameterIndex, Blob x) throws SQLException {
	}

	@Override
	public void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {
	}

	@Override
	public void setBlob(int parameterIndex, InputStream inputStream, long length) throws SQLException {
	}

	@Override
	public void setBoolean(int parameterIndex, boolean x) throws SQLException {
	}

	@Override
	public void setByte(int parameterIndex, byte x) throws SQLException {
	}

	@Override
	public void setBytes(int parameterIndex, byte[] x) throws SQLException {
	}

	@Override
	public void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {
	}

	@Override
	public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {
	}

	@Override
	public void setCharacterStream(int parameterIndex, Reader reader, long length) throws SQLException {
	}

	@Override
	public void setClob(int parameterIndex, Clob x) throws SQLException {
	}

	@Override
	public void setClob(int parameterIndex, Reader reader) throws SQLException {
	}

	@Override
	public void setClob(int parameterIndex, Reader reader, long length) throws SQLException {
	}

	@Override
	public void setDate(int parameterIndex, Date x) throws SQLException {
	}

	@Override
	public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
	}

	@Override
	public void setDouble(int parameterIndex, double x) throws SQLException {
	}

	@Override
	public void setFloat(int parameterIndex, float x) throws SQLException {
	}

	@Override
	public void setInt(int parameterIndex, int x) throws SQLException {
	}

	@Override
	public void setLong(int parameterIndex, long x) throws SQLException {
	}

	@Override
	public void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {
	}

	@Override
	public void setNCharacterStream(int parameterIndex, Reader value, long length) throws SQLException {
	}

	@Override
	public void setNClob(int parameterIndex, NClob value) throws SQLException {
	}

	@Override
	public void setNClob(int parameterIndex, Reader reader) throws SQLException {
	}

	@Override
	public void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {
	}

	@Override
	public void setNString(int parameterIndex, String value) throws SQLException {
	}

	@Override
	public void setNull(int parameterIndex, int sqlType) throws SQLException {
	}

	@Override
	public void setNull(int parameterIndex, int sqlType, String typeName) throws SQLException {
	}

	@Override
	public void setObject(int parameterIndex, Object x) throws SQLException {
	}

	@Override
	public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
	}

	@Override
	public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) throws SQLException {
	}

	@Override
	public void setRef(int parameterIndex, Ref x) throws SQLException {
	}

	@Override
	public void setRowId(int parameterIndex, RowId x) throws SQLException {
	}

	@Override
	public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException {
	}

	@Override
	public void setShort(int parameterIndex, short x) throws SQLException {
	}

	@Override
	public void setString(int parameterIndex, String x) throws SQLException {
	}

	@Override
	public void setTime(int parameterIndex, Time x) throws SQLException {
	}

	@Override
	public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
	}

	@Override
	public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
	}

	@Override
	public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
	}

	@Override
	public void setURL(int parameterIndex, URL x) throws SQLException {
	}

	@Override
	public void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException {
	}

	@Override
	public void addBatch(String arg0) throws SQLException {
	}

	@Override
	public void cancel() throws SQLException {
	}

	@Override
	public void clearBatch() throws SQLException {
	}

	@Override
	public void clearWarnings() throws SQLException {
	}

	@Override
	public void close() throws SQLException {
	}

	@Override
	public void closeOnCompletion() throws SQLException {
	}

	@Override
	public boolean execute(String arg0) throws SQLException {
		
		return false;
	}

	@Override
	public boolean execute(String arg0, int arg1) throws SQLException {
		
		return false;
	}

	@Override
	public boolean execute(String arg0, int[] arg1) throws SQLException {
		
		return false;
	}

	@Override
	public boolean execute(String arg0, String[] arg1) throws SQLException {
		
		return false;
	}

	@Override
	public int[] executeBatch() throws SQLException {
		
		return null;
	}

	@Override
	public ResultSet executeQuery(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public int executeUpdate(String arg0) throws SQLException {
		
		return 0;
	}

	@Override
	public int executeUpdate(String arg0, int arg1) throws SQLException {
		
		return 0;
	}

	@Override
	public int executeUpdate(String arg0, int[] arg1) throws SQLException {
		
		return 0;
	}

	@Override
	public int executeUpdate(String arg0, String[] arg1) throws SQLException {
		
		return 0;
	}

	@Override
	public Connection getConnection() throws SQLException {
		
		return null;
	}

	@Override
	public int getFetchDirection() throws SQLException {
		
		return 0;
	}

	@Override
	public int getFetchSize() throws SQLException {
		
		return 0;
	}

	@Override
	public ResultSet getGeneratedKeys() throws SQLException {
		
		return null;
	}

	@Override
	public int getMaxFieldSize() throws SQLException {
		
		return 0;
	}

	@Override
	public int getMaxRows() throws SQLException {
		
		return 0;
	}

	@Override
	public boolean getMoreResults() throws SQLException {
		
		return false;
	}

	@Override
	public boolean getMoreResults(int arg0) throws SQLException {
		
		return false;
	}

	@Override
	public int getQueryTimeout() throws SQLException {
		
		return 0;
	}

	@Override
	public ResultSet getResultSet() throws SQLException {
		
		return null;
	}

	@Override
	public int getResultSetConcurrency() throws SQLException {
		
		return 0;
	}

	@Override
	public int getResultSetHoldability() throws SQLException {
		
		return 0;
	}

	@Override
	public int getResultSetType() throws SQLException {
		
		return 0;
	}

	@Override
	public int getUpdateCount() throws SQLException {
		
		return 0;
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		
		return null;
	}

	@Override
	public boolean isCloseOnCompletion() throws SQLException {
		
		return false;
	}

	@Override
	public boolean isClosed() throws SQLException {
		
		return false;
	}

	@Override
	public boolean isPoolable() throws SQLException {
		
		return false;
	}

	@Override
	public void setCursorName(String arg0) throws SQLException {
	}

	@Override
	public void setEscapeProcessing(boolean arg0) throws SQLException {
	}

	@Override
	public void setFetchDirection(int arg0) throws SQLException {
	}

	@Override
	public void setFetchSize(int arg0) throws SQLException {
	}

	@Override
	public void setMaxFieldSize(int arg0) throws SQLException {
	}

	@Override
	public void setMaxRows(int arg0) throws SQLException {
	}

	@Override
	public void setPoolable(boolean arg0) throws SQLException {
	}

	@Override
	public void setQueryTimeout(int arg0) throws SQLException {
	}

	@Override
	public boolean isWrapperFor(Class<?> arg0) throws SQLException {
		
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Array getArray(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Array getArray(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public BigDecimal getBigDecimal(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public BigDecimal getBigDecimal(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public BigDecimal getBigDecimal(int arg0, int arg1) throws SQLException {
		
		return null;
	}

	@Override
	public Blob getBlob(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Blob getBlob(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public boolean getBoolean(int arg0) throws SQLException {
		
		return false;
	}

	@Override
	public boolean getBoolean(String arg0) throws SQLException {
		
		return false;
	}

	@Override
	public byte getByte(int arg0) throws SQLException {
		
		return 0;
	}

	@Override
	public byte getByte(String arg0) throws SQLException {
		
		return 0;
	}

	@Override
	public byte[] getBytes(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public byte[] getBytes(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Reader getCharacterStream(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Reader getCharacterStream(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Clob getClob(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Clob getClob(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Date getDate(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Date getDate(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Date getDate(int arg0, Calendar arg1) throws SQLException {
		
		return null;
	}

	@Override
	public Date getDate(String arg0, Calendar arg1) throws SQLException {
		
		return null;
	}

	@Override
	public double getDouble(int arg0) throws SQLException {
		
		return 0;
	}

	@Override
	public double getDouble(String arg0) throws SQLException {
		
		return 0;
	}

	@Override
	public float getFloat(int arg0) throws SQLException {
		
		return 0;
	}

	@Override
	public float getFloat(String arg0) throws SQLException {
		
		return 0;
	}

	@Override
	public int getInt(int arg0) throws SQLException {
		
		return 0;
	}

	@Override
	public int getInt(String arg0) throws SQLException {
		
		return 0;
	}

	@Override
	public long getLong(int arg0) throws SQLException {
		
		return 0;
	}

	@Override
	public long getLong(String arg0) throws SQLException {
		
		return 0;
	}

	@Override
	public Reader getNCharacterStream(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Reader getNCharacterStream(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public NClob getNClob(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public NClob getNClob(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public String getNString(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public String getNString(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Object getObject(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Object getObject(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Object getObject(int arg0, Map<String, Class<?>> arg1) throws SQLException {
		
		return null;
	}

	@Override
	public Object getObject(String arg0, Map<String, Class<?>> arg1) throws SQLException {
		
		return null;
	}

	@Override
	public <T> T getObject(int arg0, Class<T> arg1) throws SQLException {
		
		return null;
	}

	@Override
	public <T> T getObject(String arg0, Class<T> arg1) throws SQLException {
		
		return null;
	}

	@Override
	public Ref getRef(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Ref getRef(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public RowId getRowId(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public RowId getRowId(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public SQLXML getSQLXML(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public SQLXML getSQLXML(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public short getShort(int arg0) throws SQLException {
		
		return 0;
	}

	@Override
	public short getShort(String arg0) throws SQLException {
		
		return 0;
	}

	@Override
	public String getString(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public String getString(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Time getTime(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Time getTime(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Time getTime(int arg0, Calendar arg1) throws SQLException {
		
		return null;
	}

	@Override
	public Time getTime(String arg0, Calendar arg1) throws SQLException {
		
		return null;
	}

	@Override
	public Timestamp getTimestamp(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Timestamp getTimestamp(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public Timestamp getTimestamp(int arg0, Calendar arg1) throws SQLException {
		
		return null;
	}

	@Override
	public Timestamp getTimestamp(String arg0, Calendar arg1) throws SQLException {
		
		return null;
	}

	@Override
	public URL getURL(int arg0) throws SQLException {
		
		return null;
	}

	@Override
	public URL getURL(String arg0) throws SQLException {
		
		return null;
	}

	@Override
	public void registerOutParameter(int arg0, int arg1) throws SQLException {
	}

	@Override
	public void registerOutParameter(String arg0, int arg1) throws SQLException {
	}

	@Override
	public void registerOutParameter(int arg0, int arg1, int arg2) throws SQLException {
	}

	@Override
	public void registerOutParameter(int arg0, int arg1, String arg2) throws SQLException {
	}

	@Override
	public void registerOutParameter(String parameterName, int sqlType, int scale) throws SQLException {
	}

	@Override
	public void registerOutParameter(String parameterName, int sqlType, String typeName) throws SQLException {
	}

	@Override
	public void setAsciiStream(String parameterName, InputStream x) throws SQLException {
	}

	@Override
	public void setAsciiStream(String parameterName, InputStream x, int length) throws SQLException {
	}

	@Override
	public void setAsciiStream(String parameterName, InputStream x, long length) throws SQLException {
	}

	@Override
	public void setBigDecimal(String parameterName, BigDecimal x) throws SQLException {
	}

	@Override
	public void setBinaryStream(String parameterName, InputStream x) throws SQLException {
	}

	@Override
	public void setBinaryStream(String parameterName, InputStream x, int length) throws SQLException {
	}

	@Override
	public void setBinaryStream(String parameterName, InputStream x, long length) throws SQLException {
	}

	@Override
	public void setBlob(String parameterName, Blob x) throws SQLException {
	}

	@Override
	public void setBlob(String parameterName, InputStream inputStream) throws SQLException {
	}

	@Override
	public void setBlob(String parameterName, InputStream inputStream, long length) throws SQLException {
	}

	@Override
	public void setBoolean(String parameterName, boolean x) throws SQLException {
	}

	@Override
	public void setByte(String parameterName, byte x) throws SQLException {
	}

	@Override
	public void setBytes(String parameterName, byte[] x) throws SQLException {
	}

	@Override
	public void setCharacterStream(String parameterName, Reader reader) throws SQLException {
	}

	@Override
	public void setCharacterStream(String parameterName, Reader reader, int length) throws SQLException {
	}

	@Override
	public void setCharacterStream(String parameterName, Reader reader, long length) throws SQLException {
	}

	@Override
	public void setClob(String parameterName, Clob x) throws SQLException {
	}

	@Override
	public void setClob(String parameterName, Reader reader) throws SQLException {
	}

	@Override
	public void setClob(String parameterName, Reader reader, long length) throws SQLException {
	}

	@Override
	public void setDate(String parameterName, Date x) throws SQLException {
	}

	@Override
	public void setDate(String parameterName, Date x, Calendar cal) throws SQLException {
	}

	@Override
	public void setDouble(String parameterName, double x) throws SQLException {
	}

	@Override
	public void setFloat(String parameterName, float x) throws SQLException {
	}

	@Override
	public void setInt(String parameterName, int x) throws SQLException {
	}

	@Override
	public void setLong(String parameterName, long x) throws SQLException {
	}

	@Override
	public void setNCharacterStream(String parameterName, Reader value) throws SQLException {
	}

	@Override
	public void setNCharacterStream(String parameterName, Reader value, long length) throws SQLException {
	}

	@Override
	public void setNClob(String parameterName, NClob value) throws SQLException {
	}

	@Override
	public void setNClob(String parameterName, Reader reader) throws SQLException {
	}

	@Override
	public void setNClob(String parameterName, Reader reader, long length) throws SQLException {
	}

	@Override
	public void setNString(String parameterName, String value) throws SQLException {
	}

	@Override
	public void setNull(String parameterName, int sqlType) throws SQLException {
	}

	@Override
	public void setNull(String parameterName, int sqlType, String typeName) throws SQLException {
	}

	@Override
	public void setObject(String parameterName, Object x) throws SQLException {
	}

	@Override
	public void setObject(String parameterName, Object x, int targetSqlType) throws SQLException {
	}

	@Override
	public void setObject(String parameterName, Object x, int targetSqlType, int scale) throws SQLException {
	}

	@Override
	public void setRowId(String parameterName, RowId x) throws SQLException {
	}

	@Override
	public void setSQLXML(String parameterName, SQLXML xmlObject) throws SQLException {
	}

	@Override
	public void setShort(String parameterName, short x) throws SQLException {
	}

	@Override
	public void setString(String parameterName, String x) throws SQLException {
	}

	@Override
	public void setTime(String parameterName, Time x) throws SQLException {
	}

	@Override
	public void setTime(String parameterName, Time x, Calendar cal) throws SQLException {
	}

	@Override
	public void setTimestamp(String parameterName, Timestamp x) throws SQLException {
	}

	@Override
	public void setTimestamp(String parameterName, Timestamp x, Calendar cal) throws SQLException {
	}

	@Override
	public void setURL(String parameterName, URL val) throws SQLException {
	}

	@Override
	public boolean wasNull() throws SQLException {
		
		return false;
	}

}
