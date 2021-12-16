package Sample;

import java.sql.SQLException;
import com.intersystems.jdbc.IRIS;
import com.intersystems.jdbc.IRISObject;
import com.intersystems.jdbc.IRISConnection;
import com.intersystems.binding.Database;
import com.intersystems.binding.Oid;
import com.intersystems.binding.Util;
import com.intersystems.binding.IRISReference;
import com.intersystems.binding.RegisteredObject;
import com.intersystems.binding.ClassnameMap;
import com.intersystems.binding.Id;
import com.intersystems.binding.SerialObject;

/**
 * Java class generated for IRIS class Sample.Address on version IRIS for Windows (x86-64) 2021.1 (Build 215U) Wed Jun 9 2021 09:39:22 EDT.<br>
 * Description: Use or operation of this code is subject to acceptance of the license available in the code repository for this code.
This is a sample embeddable class representing an address.
 * @see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address</A>
**/
public class Address extends SerialObject implements java.io.Serializable {
	private static final long serialVersionUID = 598;
	public static String IRIS_CLASS_NAME = "Sample.Address";

	static {
		ClassnameMap cMap = ClassnameMap.getInstance();
		cMap.putJavaClass(IRIS_CLASS_NAME, Address.class);
	}

	/**
		This constructor is NOT for use in application. It is called by binding code.
	*/
	public Address(IRISObject irisObjectNew) {
		super(irisObjectNew);
	}
	/**
		This constructor is NOT for use in application. It is called by binding code.
	*/
	public Address(IRISObject irisObjectNew, Database db) {
		super(irisObjectNew, db);
	}

	/**
		Creates a new instance of class "Sample.Address" in IRIS database
		and a corresponding instance of class <code>Sample.Address</code>.
		@param db <code>Database</code> instance to connect with IRIS database
		@throws java.sql.SQLException in case of error
	*/
	public Address(Database db) throws SQLException {
		this((IRISConnection)db.getConnection());
		setDatabase(db);
	}

	public Address(IRISConnection connection) throws SQLException {
		super((IRISObject) IRIS.createIRIS(connection).classMethodObject(IRIS_CLASS_NAME, "%New"));
	}

	/**
		Runs IRIS method <code>%OpenId</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Address</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Address</code> or any of its subclasses.
		@param db <code>Database</code> instance to connect with IRIS database
		@param id as <code>Id<code>
		@throws java.sql.SQLException in case of error
	*/
	public static RegisteredObject open(Database db, Id id) throws SQLException {
		RegisteredObject ro = open((IRISConnection)db.getConnection(), id);
		ro.setDatabase(db);
		return ro;
	}

	public static RegisteredObject open(IRISConnection connection, Id id) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISReference ref = new IRISReference(null);
		IRISObject irisObjectNew = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "%OpenId", id.toString(), -1, ref);
		if (irisObjectNew == null)
			RegisteredObject.ParseStatusForOpenMethods(iris, IRIS_CLASS_NAME, id.toString(), ref.getValue());
		return new Address(irisObjectNew);
	}

	/**
		Runs IRIS method <code>%OpenId</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Address</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Address</code> or any of its subclasses.
		@param db <code>Database</code> instance to connect with IRIS database
		@param id as <code>Id<code>
		@throws java.sql.SQLException in case of error
	*/
	public static RegisteredObject _open(Database db, Id id) throws SQLException {
		RegisteredObject ro = _open((IRISConnection)db.getConnection(), id);
		ro.setDatabase(db);
		return ro;
	}

	public static RegisteredObject _open(IRISConnection connection, Id id) throws SQLException {
		return open(connection, id);
	}

	/**
		Runs IRIS method <code>%OpenId</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Address</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Address</code> or any of its subclasses.
		@param db <code>Database</code> instance to connect with IRIS database
		@param id as <code>Id<code>
		@param concurrency as <code>int<code>
		@throws java.sql.SQLException in case of error
		See Object Concurrency Options in your online IRIS documentation for more information.
		@see <a href = "https://docs.intersystems.com/irislatest/csp/docbook/DocBook.UI.Page.cls?KEY=GOBJ_persobj#GOBJ_concurrency">Object Concurrency Options.</A>
	*/
	public static RegisteredObject open(Database db, Id id, int concurrency) throws SQLException {
		RegisteredObject ro = open((IRISConnection)db.getConnection(), id, concurrency);
		ro.setDatabase(db);
		return ro;
	}

	public static RegisteredObject open(IRISConnection connection, Id id, int concurrency) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISReference ref = new IRISReference(null);
		IRISObject irisObjectNew = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "%OpenId", id.toString(), concurrency, ref);
		if (irisObjectNew == null)
			RegisteredObject.ParseStatusForOpenMethods(iris, IRIS_CLASS_NAME, id.toString(), ref.getValue());
		return new Address(irisObjectNew);
	}

	/**
		Runs IRIS method <code>%OpenId</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Address</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Address</code> or any of its subclasses.
		@param db <code>Database</code> instance to connect with IRIS database
		@param id as <code>Id<code>
		@param concurrency as <code>int<code>
		@throws java.sql.SQLException in case of error
		See Object Concurrency Options in your online IRIS documentation for more information.
		@see <a href = "https://docs.intersystems.com/irislatest/csp/docbook/DocBook.UI.Page.cls?KEY=GOBJ_persobj#GOBJ_concurrency">Object Concurrency Options.</A>
	*/
	public static RegisteredObject _open(Database db, Id id, int concurrency) throws SQLException {
		RegisteredObject ro = _open((IRISConnection)db.getConnection(), id, concurrency);
		ro.setDatabase(db);
		return ro;
	}

	public static RegisteredObject _open(IRISConnection connection, Id id, int concurrency) throws SQLException {
		return open(connection, id, concurrency);
	}

	/**
		Runs IRIS method <code>%Open</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Address</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Address</code> or any of its subclasses.
		@param db <code>Database</code> instance to connect with IRIS database
		@param oid as <code>Oid<code>
		@throws java.sql.SQLException in case of error
	*/
	public static RegisteredObject open(Database db, Oid oid) throws SQLException {
		RegisteredObject ro = open((IRISConnection)db.getConnection(), oid);
		ro.setDatabase(db);
		return ro;
	}

	public static RegisteredObject open(IRISConnection connection, Oid oid) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISReference ref = new IRISReference(null);
		IRISObject irisObjectNew = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "%Open", oid.getData(), -1, ref);
		if (irisObjectNew == null)
			RegisteredObject.ParseStatusForOpenMethods(iris, IRIS_CLASS_NAME, oid.getData(), ref.getValue());
		return new Address(irisObjectNew);
	}

	/**
		Runs IRIS method <code>%Open</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Address</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Address</code> or any of its subclasses.
		@param db <code>Database</code> instance to connect with IRIS database
		@param oid as <code>Oid<code>
		@throws java.sql.SQLException in case of error
	*/
	public static RegisteredObject _open(Database db, Oid oid) throws SQLException {
		RegisteredObject ro = _open((IRISConnection)db.getConnection(), oid);
		ro.setDatabase(db);
		return ro;
	}

	public static RegisteredObject _open(IRISConnection connection, Oid oid) throws SQLException {
		return open(connection, oid);
	}

	/**
		Runs IRIS method <code>%Open</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Address</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Address</code> or any of its subclasses.
		@param db <code>Database</code> instance to connect with IRIS database
		@param oid as <code>Oid<code>
		@param concurrency as <code>int<code>
		@throws java.sql.SQLException in case of error
		See Object Concurrency Options in your online IRIS documentation for more information.
		@see <a href = "https://docs.intersystems.com/irislatest/csp/docbook/DocBook.UI.Page.cls?KEY=GOBJ_persobj#GOBJ_concurrency">Object Concurrency Options.</A>
	*/
	public static RegisteredObject open(Database db, Oid oid, int concurrency) throws SQLException {
		RegisteredObject ro = open((IRISConnection)db.getConnection(), oid, concurrency);
		ro.setDatabase(db);
		return ro;
	}

	public static RegisteredObject open(IRISConnection connection, Oid oid, int concurrency) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISReference ref = new IRISReference(null);
		IRISObject irisObjectNew = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "%Open", oid.getData(), concurrency, ref);
		if (irisObjectNew == null)
			RegisteredObject.ParseStatusForOpenMethods(iris, IRIS_CLASS_NAME, oid.getData(), ref.getValue());
		return new Address(irisObjectNew);
	}

	/**
		Runs IRIS method <code>%Open</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Address</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Address</code> or any of its subclasses.
		@param db <code>Database</code> instance to connect with IRIS database
		@param oid as <code>Oid<code>
		@param concurrency as <code>int<code>
		@throws java.sql.SQLException in case of error
		See Object Concurrency Options in your online IRIS documentation for more information.
		@see <a href = "https://docs.intersystems.com/irislatest/csp/docbook/DocBook.UI.Page.cls?KEY=GOBJ_persobj#GOBJ_concurrency">Object Concurrency Options.</A>
	*/
	public static RegisteredObject _open(Database db, Oid oid, int concurrency) throws SQLException {
		RegisteredObject ro = _open((IRISConnection)db.getConnection(), oid, concurrency);
		ro.setDatabase(db);
		return ro;
	}

	public static RegisteredObject _open(IRISConnection connection, Oid oid, int concurrency) throws SQLException {
		return open(connection, oid, concurrency);
	}

	/**
		Runs method <code>%DeleteId</code> in IRIS to delete an object from the database.
		Deletes the stored version of the object with OID <var>oid</var> from the database.
		It does not remove any in-memory versions of the object that may be present.
		@param db <code>Database</code> instance to connect with IRIS database
		@param id as <code>Id<code>
		@throws java.sql.SQLException in case of error
	*/
	public static void delete(Database db, Id id) throws SQLException {
		delete((IRISConnection)db.getConnection(), id);
	}

	public static void delete(IRISConnection connection, Id id) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "%DeleteId", id == null ? null : id.toString());
	}

	/**
		Runs method <code>%DeleteId</code> in IRIS to delete an object from the database.
		Deletes the stored version of the object with OID <var>oid</var> from the database.
		It does not remove any in-memory versions of the object that may be present.
		@param db <code>Database</code> instance to connect with IRIS database
		@param id as <code>Id<code>
		@throws java.sql.SQLException in case of error
	*/
	public static void _deleteId(Database db, Id id) throws SQLException {
		delete((IRISConnection)db.getConnection(), id);
	}

	public static void _deleteId(IRISConnection connection, Id id) throws SQLException {
		delete(connection, id);
	}

	/**
		Runs method <code>%DeleteId</code> in IRIS to delete an object from the database.
		Deletes the stored version of the object with OID <var>oid</var> from the database.
		It does not remove any in-memory versions of the object that may be present.
		@param db <code>Database</code> instance to connect with IRIS database
		@param id as <code>Id<code>
		@param concurrency as <code>int<code>
		@throws java.sql.SQLException in case of error
		See Object Concurrency Options in your online IRIS documentation for more information.
		@see <a href = "https://docs.intersystems.com/irislatest/csp/docbook/DocBook.UI.Page.cls?KEY=GOBJ_persobj#GOBJ_concurrency">Object Concurrency Options.</A>
	*/
	public static void delete(Database db, Id id, int concurrency) throws SQLException {
		delete((IRISConnection)db.getConnection(), id, concurrency);
	}

	public static void delete(IRISConnection connection, Id id, int concurrency) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "%DeleteId", id == null ? null : id.toString(), concurrency);
	}

	/**
		Runs method <code>%DeleteId</code> in IRIS to delete an object from the database.
		Deletes the stored version of the object with OID <var>oid</var> from the database.
		It does not remove any in-memory versions of the object that may be present.
		@param db <code>Database</code> instance to connect with IRIS database
		@param id as <code>Id<code>
		@param concurrency as <code>int<code>
		@throws java.sql.SQLException in case of error
		See Object Concurrency Options in your online IRIS documentation for more information.
		@see <a href = "https://docs.intersystems.com/irislatest/csp/docbook/DocBook.UI.Page.cls?KEY=GOBJ_persobj#GOBJ_concurrency">Object Concurrency Options.</A>
	*/
	public static void _deleteId(Database db, Id id, int concurrency) throws SQLException {
		delete((IRISConnection)db.getConnection(), id, concurrency);
	}

	public static void _deleteId(IRISConnection connection, Id id, int concurrency) throws SQLException {
		delete(connection, id, concurrency);
	}

	/**
		Returns name of class Sample.Address as it is in IRIS database.
		@return IRIS class name as <code>String</code>
	*/
	public static String getIRISClassName() {
		return IRIS_CLASS_NAME;
	}

	/**
		Runs method %ClassName in IRIS.
		<p>Description: Returns the object's class name. The <var>fullname</var> determines how the
class name is represented. If it is 1 then it returns the full class name
including any package qualifier. If it is 0 (the default) then it returns the
name of the class without the package, this is mainly for backward compatibility
with the pre-package behaviour of %ClassName.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param fullname as <code>Boolean<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#%ClassName">Method %ClassName</A>
	*/
	public static String sys_ClassName(Database db, Boolean fullname) throws SQLException {
		return sys_ClassName((IRISConnection)db.getConnection(), fullname);
	}

	public static String sys_ClassName(IRISConnection connection, Boolean fullname) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "%ClassName", fullname);
	}

	/**
		Runs method %Delete in IRIS.
		<p>Description: Deletes streams referenced by this object and calls %Delete on any embedded objects

Refer to <a href="/csp/docbook/DocBook.UI.Page.cls?KEY=GOBJ_concurrency" target="_blank">Object Concurrency Options</a> for more details 
on the optional <var>concurrency</var> argument.

<p>Returns a <CLASS>%Status</CLASS> value indicating success or failure.
</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param oid as <code>Oid<code>
		@param concurrency as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#%Delete">Method %Delete</A>
	*/
	public static void sys_Delete(Database db, Oid oid, Integer concurrency) throws SQLException {
		sys_Delete((IRISConnection)db.getConnection(), oid, concurrency);
	}

	public static void sys_Delete(IRISConnection connection, Oid oid, Integer concurrency) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "%Delete", oid == null ? null : oid.getData(), concurrency);
	}

	/**
		Runs method %Delete in IRIS.
		<p>Description: Deletes streams referenced by this object and calls %Delete on any embedded objects

Refer to <a href="/csp/docbook/DocBook.UI.Page.cls?KEY=GOBJ_concurrency" target="_blank">Object Concurrency Options</a> for more details 
on the optional <var>concurrency</var> argument.

<p>Returns a <CLASS>%Status</CLASS> value indicating success or failure.
</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param oid as <code>Oid<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#%Delete">Method %Delete</A>
	*/
	public static void sys_Delete(Database db, Oid oid) throws SQLException {
		sys_Delete((IRISConnection)db.getConnection(), oid);
	}

	public static void sys_Delete(IRISConnection connection, Oid oid) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "%Delete", oid == null ? null : oid.getData());
	}

	/**
		Runs method %DeleteId in IRIS.
		<p>Description: Deletes the stored version of the object with ID <var>id</var> from the database. 

<p><METHOD>%DeleteId</METHOD> is identical in operation to the <METHOD>%Delete</METHOD> method except 
that it uses and Id value instead of an OID value to find an object.

Refer to <a href="/csp/docbook/DocBook.UI.Page.cls?KEY=GOBJ_concurrency" target="_blank">Object Concurrency Options</a> for more details 
on the optional <var>concurrency</var> argument.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param id as <code>String<code>
		@param concurrency as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#%DeleteId">Method %DeleteId</A>
	*/
	public static void sys_DeleteId(Database db, String id, Integer concurrency) throws SQLException {
		sys_DeleteId((IRISConnection)db.getConnection(), id, concurrency);
	}

	public static void sys_DeleteId(IRISConnection connection, String id, Integer concurrency) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "%DeleteId", id, concurrency);
	}

	/**
		Runs method %DeleteId in IRIS.
		<p>Description: Deletes the stored version of the object with ID <var>id</var> from the database. 

<p><METHOD>%DeleteId</METHOD> is identical in operation to the <METHOD>%Delete</METHOD> method except 
that it uses and Id value instead of an OID value to find an object.

Refer to <a href="/csp/docbook/DocBook.UI.Page.cls?KEY=GOBJ_concurrency" target="_blank">Object Concurrency Options</a> for more details 
on the optional <var>concurrency</var> argument.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param id as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#%DeleteId">Method %DeleteId</A>
	*/
	public static void sys_DeleteId(Database db, String id) throws SQLException {
		sys_DeleteId((IRISConnection)db.getConnection(), id);
	}

	public static void sys_DeleteId(IRISConnection connection, String id) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "%DeleteId", id);
	}

	/**
		Runs method %IsA in IRIS.
		<p>Description: Returns true (1) if instances of this class are also instances of the isclass parameter.
That is 'isclass' is a primary superclass of this object.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param isclass as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#%IsA">Method %IsA</A>
	*/
	public static Integer sys_IsA(Database db, String isclass) throws SQLException {
		return sys_IsA((IRISConnection)db.getConnection(), isclass);
	}

	public static Integer sys_IsA(IRISConnection connection, String isclass) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		Long _x = iris.classMethodLong(IRIS_CLASS_NAME, "%IsA", isclass);
		return Util.IntegerJavaFormat(_x);
	}

	/**
		Runs method %IsNull in IRIS.
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#%IsNull">Method %IsNull</A>
	*/
	public Boolean sys_IsNull() {
		return irisObject.invokeBoolean("%IsNull");
	}

	/**
		Runs method %ObjectIsNull in IRIS.
		<p>Description: Return true if pOID is a null object and false if the object is not null</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param pOID as <code>Oid<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#%ObjectIsNull">Method %ObjectIsNull</A>
	*/
	public static Boolean sys_ObjectIsNull(Database db, Oid pOID) throws SQLException {
		return sys_ObjectIsNull((IRISConnection)db.getConnection(), pOID);
	}

	public static Boolean sys_ObjectIsNull(IRISConnection connection, Oid pOID) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodBoolean(IRIS_CLASS_NAME, "%ObjectIsNull", pOID == null ? null : pOID.getData());
	}

	/**
		Runs method LogicalToOdbc in IRIS.
		<p>Description: 	LogicalToOdbc()
		Construct a string delimited by ODBCDELIMITER from an object's serialized state.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#LogicalToOdbc">Method LogicalToOdbc</A>
	*/
	public static String LogicalToOdbc(Database db, String val) throws SQLException {
		return LogicalToOdbc((IRISConnection)db.getConnection(), val);
	}

	public static String LogicalToOdbc(IRISConnection connection, String val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "LogicalToOdbc", val);
	}

	/**
		Runs method LogicalToOdbc in IRIS.
		<p>Description: 	LogicalToOdbc()
		Construct a string delimited by ODBCDELIMITER from an object's serialized state.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#LogicalToOdbc">Method LogicalToOdbc</A>
	*/
	public static String LogicalToOdbc(Database db) throws SQLException {
		return LogicalToOdbc((IRISConnection)db.getConnection());
	}

	public static String LogicalToOdbc(IRISConnection connection) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "LogicalToOdbc");
	}

	/**
		Runs method OdbcToLogical in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#OdbcToLogical">Method OdbcToLogical</A>
	*/
	public static String OdbcToLogical(Database db, String val) throws SQLException {
		return OdbcToLogical((IRISConnection)db.getConnection(), val);
	}

	public static String OdbcToLogical(IRISConnection connection, String val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "OdbcToLogical", val);
	}

	/**
		Runs method OdbcToLogical in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#OdbcToLogical">Method OdbcToLogical</A>
	*/
	public static String OdbcToLogical(Database db) throws SQLException {
		return OdbcToLogical((IRISConnection)db.getConnection());
	}

	public static String OdbcToLogical(IRISConnection connection) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "OdbcToLogical");
	}

	/**
		Runs method Populate in IRIS.
		<p>Description: Creates up to <var>count</var> instances an object and stores 
them in the database.

<p>If <var>verbose</var> is true, then details are echoed to the console.
<p>If <var>DeferIndices</var> is true, then indices are sorted at the end of the operation.
<p>If <var>objects</var> is true, then each object that is created is returned in the objects array
<p>If <var>tune</var> is true, then $SYSTEM.SQL.TuneTable is called after the instances of the class have been created. 
If tune>1, then $SYSTEM.SQL.TuneTable is also called for any tables projected by persistent superclasses of this class
<p>If <var>deterministic</var> is true, then the set of objects produced by identical calls to Populate at different times will be identical. 

<P>Returns the number of instances successfully created.

<p>For more information refer to 
<LINK href=DocBook.UI.Page.cls?KEY=GOBJ_populate>The Populate Utility</LINK>.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param count as <code>Integer<code>
		@param verbose as <code>Integer<code>
		@param DeferIndices as <code>Integer<code>
		@param objects as <code>com.intersystems.binding.IRISReference<code>
		@param tune as <code>Integer<code>
		@param deterministic as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#Populate">Method Populate</A>
	*/
	public static Integer Populate(Database db, Integer count, Integer verbose, Integer DeferIndices, com.intersystems.binding.IRISReference objects, Integer tune, Integer deterministic) throws SQLException {
		return Populate((IRISConnection)db.getConnection(), count, verbose, DeferIndices, objects, tune, deterministic);
	}

	public static Integer Populate(IRISConnection connection, Integer count, Integer verbose, Integer DeferIndices, com.intersystems.binding.IRISReference objects, Integer tune, Integer deterministic) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		Long _x = iris.classMethodLong(IRIS_CLASS_NAME, "Populate", count, verbose, DeferIndices, objects, tune, deterministic);
		return Util.IntegerJavaFormat(_x);
	}

	/**
		Runs method Populate in IRIS.
		<p>Description: Creates up to <var>count</var> instances an object and stores 
them in the database.

<p>If <var>verbose</var> is true, then details are echoed to the console.
<p>If <var>DeferIndices</var> is true, then indices are sorted at the end of the operation.
<p>If <var>objects</var> is true, then each object that is created is returned in the objects array
<p>If <var>tune</var> is true, then $SYSTEM.SQL.TuneTable is called after the instances of the class have been created. 
If tune>1, then $SYSTEM.SQL.TuneTable is also called for any tables projected by persistent superclasses of this class
<p>If <var>deterministic</var> is true, then the set of objects produced by identical calls to Populate at different times will be identical. 

<P>Returns the number of instances successfully created.

<p>For more information refer to 
<LINK href=DocBook.UI.Page.cls?KEY=GOBJ_populate>The Populate Utility</LINK>.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param count as <code>Integer<code>
		@param verbose as <code>Integer<code>
		@param DeferIndices as <code>Integer<code>
		@param objects as <code>com.intersystems.binding.IRISReference<code>
		@param tune as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#Populate">Method Populate</A>
	*/
	public static Integer Populate(Database db, Integer count, Integer verbose, Integer DeferIndices, com.intersystems.binding.IRISReference objects, Integer tune) throws SQLException {
		return Populate((IRISConnection)db.getConnection(), count, verbose, DeferIndices, objects, tune);
	}

	public static Integer Populate(IRISConnection connection, Integer count, Integer verbose, Integer DeferIndices, com.intersystems.binding.IRISReference objects, Integer tune) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		Long _x = iris.classMethodLong(IRIS_CLASS_NAME, "Populate", count, verbose, DeferIndices, objects, tune);
		return Util.IntegerJavaFormat(_x);
	}

	/**
		Runs method Populate in IRIS.
		<p>Description: Creates up to <var>count</var> instances an object and stores 
them in the database.

<p>If <var>verbose</var> is true, then details are echoed to the console.
<p>If <var>DeferIndices</var> is true, then indices are sorted at the end of the operation.
<p>If <var>objects</var> is true, then each object that is created is returned in the objects array
<p>If <var>tune</var> is true, then $SYSTEM.SQL.TuneTable is called after the instances of the class have been created. 
If tune>1, then $SYSTEM.SQL.TuneTable is also called for any tables projected by persistent superclasses of this class
<p>If <var>deterministic</var> is true, then the set of objects produced by identical calls to Populate at different times will be identical. 

<P>Returns the number of instances successfully created.

<p>For more information refer to 
<LINK href=DocBook.UI.Page.cls?KEY=GOBJ_populate>The Populate Utility</LINK>.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param count as <code>Integer<code>
		@param verbose as <code>Integer<code>
		@param DeferIndices as <code>Integer<code>
		@param objects as <code>com.intersystems.binding.IRISReference<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#Populate">Method Populate</A>
	*/
	public static Integer Populate(Database db, Integer count, Integer verbose, Integer DeferIndices, com.intersystems.binding.IRISReference objects) throws SQLException {
		return Populate((IRISConnection)db.getConnection(), count, verbose, DeferIndices, objects);
	}

	public static Integer Populate(IRISConnection connection, Integer count, Integer verbose, Integer DeferIndices, com.intersystems.binding.IRISReference objects) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		Long _x = iris.classMethodLong(IRIS_CLASS_NAME, "Populate", count, verbose, DeferIndices, objects);
		return Util.IntegerJavaFormat(_x);
	}

	/**
		Runs method Populate in IRIS.
		<p>Description: Creates up to <var>count</var> instances an object and stores 
them in the database.

<p>If <var>verbose</var> is true, then details are echoed to the console.
<p>If <var>DeferIndices</var> is true, then indices are sorted at the end of the operation.
<p>If <var>objects</var> is true, then each object that is created is returned in the objects array
<p>If <var>tune</var> is true, then $SYSTEM.SQL.TuneTable is called after the instances of the class have been created. 
If tune>1, then $SYSTEM.SQL.TuneTable is also called for any tables projected by persistent superclasses of this class
<p>If <var>deterministic</var> is true, then the set of objects produced by identical calls to Populate at different times will be identical. 

<P>Returns the number of instances successfully created.

<p>For more information refer to 
<LINK href=DocBook.UI.Page.cls?KEY=GOBJ_populate>The Populate Utility</LINK>.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param count as <code>Integer<code>
		@param verbose as <code>Integer<code>
		@param DeferIndices as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#Populate">Method Populate</A>
	*/
	public static Integer Populate(Database db, Integer count, Integer verbose, Integer DeferIndices) throws SQLException {
		return Populate((IRISConnection)db.getConnection(), count, verbose, DeferIndices);
	}

	public static Integer Populate(IRISConnection connection, Integer count, Integer verbose, Integer DeferIndices) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		Long _x = iris.classMethodLong(IRIS_CLASS_NAME, "Populate", count, verbose, DeferIndices);
		return Util.IntegerJavaFormat(_x);
	}

	/**
		Runs method Populate in IRIS.
		<p>Description: Creates up to <var>count</var> instances an object and stores 
them in the database.

<p>If <var>verbose</var> is true, then details are echoed to the console.
<p>If <var>DeferIndices</var> is true, then indices are sorted at the end of the operation.
<p>If <var>objects</var> is true, then each object that is created is returned in the objects array
<p>If <var>tune</var> is true, then $SYSTEM.SQL.TuneTable is called after the instances of the class have been created. 
If tune>1, then $SYSTEM.SQL.TuneTable is also called for any tables projected by persistent superclasses of this class
<p>If <var>deterministic</var> is true, then the set of objects produced by identical calls to Populate at different times will be identical. 

<P>Returns the number of instances successfully created.

<p>For more information refer to 
<LINK href=DocBook.UI.Page.cls?KEY=GOBJ_populate>The Populate Utility</LINK>.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param count as <code>Integer<code>
		@param verbose as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#Populate">Method Populate</A>
	*/
	public static Integer Populate(Database db, Integer count, Integer verbose) throws SQLException {
		return Populate((IRISConnection)db.getConnection(), count, verbose);
	}

	public static Integer Populate(IRISConnection connection, Integer count, Integer verbose) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		Long _x = iris.classMethodLong(IRIS_CLASS_NAME, "Populate", count, verbose);
		return Util.IntegerJavaFormat(_x);
	}

	/**
		Runs method Populate in IRIS.
		<p>Description: Creates up to <var>count</var> instances an object and stores 
them in the database.

<p>If <var>verbose</var> is true, then details are echoed to the console.
<p>If <var>DeferIndices</var> is true, then indices are sorted at the end of the operation.
<p>If <var>objects</var> is true, then each object that is created is returned in the objects array
<p>If <var>tune</var> is true, then $SYSTEM.SQL.TuneTable is called after the instances of the class have been created. 
If tune>1, then $SYSTEM.SQL.TuneTable is also called for any tables projected by persistent superclasses of this class
<p>If <var>deterministic</var> is true, then the set of objects produced by identical calls to Populate at different times will be identical. 

<P>Returns the number of instances successfully created.

<p>For more information refer to 
<LINK href=DocBook.UI.Page.cls?KEY=GOBJ_populate>The Populate Utility</LINK>.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param count as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#Populate">Method Populate</A>
	*/
	public static Integer Populate(Database db, Integer count) throws SQLException {
		return Populate((IRISConnection)db.getConnection(), count);
	}

	public static Integer Populate(IRISConnection connection, Integer count) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		Long _x = iris.classMethodLong(IRIS_CLASS_NAME, "Populate", count);
		return Util.IntegerJavaFormat(_x);
	}

	/**
		Runs method Populate in IRIS.
		<p>Description: Creates up to <var>count</var> instances an object and stores 
them in the database.

<p>If <var>verbose</var> is true, then details are echoed to the console.
<p>If <var>DeferIndices</var> is true, then indices are sorted at the end of the operation.
<p>If <var>objects</var> is true, then each object that is created is returned in the objects array
<p>If <var>tune</var> is true, then $SYSTEM.SQL.TuneTable is called after the instances of the class have been created. 
If tune>1, then $SYSTEM.SQL.TuneTable is also called for any tables projected by persistent superclasses of this class
<p>If <var>deterministic</var> is true, then the set of objects produced by identical calls to Populate at different times will be identical. 

<P>Returns the number of instances successfully created.

<p>For more information refer to 
<LINK href=DocBook.UI.Page.cls?KEY=GOBJ_populate>The Populate Utility</LINK>.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#Populate">Method Populate</A>
	*/
	public static Integer Populate(Database db) throws SQLException {
		return Populate((IRISConnection)db.getConnection());
	}

	public static Integer Populate(IRISConnection connection) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		Long _x = iris.classMethodLong(IRIS_CLASS_NAME, "Populate");
		return Util.IntegerJavaFormat(_x);
	}

	/**
		Runs method PopulateSerial in IRIS.
		<p>Description: Create a single instance of a serial object.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#PopulateSerial">Method PopulateSerial</A>
	*/
	public static String PopulateSerial(Database db) throws SQLException {
		return PopulateSerial((IRISConnection)db.getConnection());
	}

	public static String PopulateSerial(IRISConnection connection) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "PopulateSerial");
	}

	/**
		Runs method Random in IRIS.
		<p>Description: Return a random number from 0-<var>n</var> using a seeded RNG. Identical to $$$PRand</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param n as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#Random">Method Random</A>
	*/
	public static Integer Random(Database db, Integer n) throws SQLException {
		return Random((IRISConnection)db.getConnection(), n);
	}

	public static Integer Random(IRISConnection connection, Integer n) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		Long _x = iris.classMethodLong(IRIS_CLASS_NAME, "Random", n);
		return Util.IntegerJavaFormat(_x);
	}

	/**
		Returns value of property <code>City<code>.
		<p>Description: The city name.</p>
		@return current value of <code>City</code> as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#City">City</A>
	*/
	public String getCity() {
		return irisObject.getString("City");
	}

	/**
		Sets new value for property <code>City<code>.
		<p>Description: The city name.</p>
		@param _val new value to be set as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#City">City</A>
	*/
	public void setCity(String _val) {
		irisObject.set("City", _val);
	}

	/**
		Runs method CityIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#CityIsValid">Method CityIsValid</A>
	*/
	public static void CityIsValid(Database db, String _val) throws SQLException {
		CityIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void CityIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "CityIsValid", _val);
	}

	/**
		Runs method CityDisplayToLogical in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#CityDisplayToLogical">Method CityDisplayToLogical</A>
	*/
	public static String CityDisplayToLogical(Database db, String _val) throws SQLException {
		return CityDisplayToLogical((IRISConnection)db.getConnection(), _val);
	}

	public static String CityDisplayToLogical(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "CityDisplayToLogical", _val);
	}

	/**
		Runs method CityLogicalToDisplay in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#CityLogicalToDisplay">Method CityLogicalToDisplay</A>
	*/
	public static String CityLogicalToDisplay(Database db, String _val) throws SQLException {
		return CityLogicalToDisplay((IRISConnection)db.getConnection(), _val);
	}

	public static String CityLogicalToDisplay(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "CityLogicalToDisplay", _val);
	}

	/**
		Returns value of property <code>State<code>.
		<p>Description: The 2-letter state abbreviation.</p>
		@return current value of <code>State</code> as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#State">State</A>
	*/
	public String getState() {
		return irisObject.getString("State");
	}

	/**
		Sets new value for property <code>State<code>.
		<p>Description: The 2-letter state abbreviation.</p>
		@param _val new value to be set as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#State">State</A>
	*/
	public void setState(String _val) {
		irisObject.set("State", _val);
	}

	/**
		Runs method StateIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#StateIsValid">Method StateIsValid</A>
	*/
	public static void StateIsValid(Database db, String _val) throws SQLException {
		StateIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void StateIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "StateIsValid", _val);
	}

	/**
		Runs method StateDisplayToLogical in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#StateDisplayToLogical">Method StateDisplayToLogical</A>
	*/
	public static String StateDisplayToLogical(Database db, String _val) throws SQLException {
		return StateDisplayToLogical((IRISConnection)db.getConnection(), _val);
	}

	public static String StateDisplayToLogical(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "StateDisplayToLogical", _val);
	}

	/**
		Runs method StateLogicalToDisplay in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#StateLogicalToDisplay">Method StateLogicalToDisplay</A>
	*/
	public static String StateLogicalToDisplay(Database db, String _val) throws SQLException {
		return StateLogicalToDisplay((IRISConnection)db.getConnection(), _val);
	}

	public static String StateLogicalToDisplay(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "StateLogicalToDisplay", _val);
	}

	/**
		Returns value of property <code>Street<code>.
		<p>Description: The street address.</p>
		@return current value of <code>Street</code> as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#Street">Street</A>
	*/
	public String getStreet() {
		return irisObject.getString("Street");
	}

	/**
		Sets new value for property <code>Street<code>.
		<p>Description: The street address.</p>
		@param _val new value to be set as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#Street">Street</A>
	*/
	public void setStreet(String _val) {
		irisObject.set("Street", _val);
	}

	/**
		Runs method StreetIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#StreetIsValid">Method StreetIsValid</A>
	*/
	public static void StreetIsValid(Database db, String _val) throws SQLException {
		StreetIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void StreetIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "StreetIsValid", _val);
	}

	/**
		Runs method StreetDisplayToLogical in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#StreetDisplayToLogical">Method StreetDisplayToLogical</A>
	*/
	public static String StreetDisplayToLogical(Database db, String _val) throws SQLException {
		return StreetDisplayToLogical((IRISConnection)db.getConnection(), _val);
	}

	public static String StreetDisplayToLogical(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "StreetDisplayToLogical", _val);
	}

	/**
		Runs method StreetLogicalToDisplay in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#StreetLogicalToDisplay">Method StreetLogicalToDisplay</A>
	*/
	public static String StreetLogicalToDisplay(Database db, String _val) throws SQLException {
		return StreetLogicalToDisplay((IRISConnection)db.getConnection(), _val);
	}

	public static String StreetLogicalToDisplay(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "StreetLogicalToDisplay", _val);
	}

	/**
		Returns value of property <code>Zip<code>.
		<p>Description: The 5-digit U.S. Zone Improvement Plan (ZIP) code.</p>
		@return current value of <code>Zip</code> as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#Zip">Zip</A>
	*/
	public String getZip() {
		return irisObject.getString("Zip");
	}

	/**
		Sets new value for property <code>Zip<code>.
		<p>Description: The 5-digit U.S. Zone Improvement Plan (ZIP) code.</p>
		@param _val new value to be set as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#Zip">Zip</A>
	*/
	public void setZip(String _val) {
		irisObject.set("Zip", _val);
	}

	/**
		Runs method ZipIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#ZipIsValid">Method ZipIsValid</A>
	*/
	public static void ZipIsValid(Database db, String _val) throws SQLException {
		ZipIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void ZipIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "ZipIsValid", _val);
	}

	/**
		Runs method ZipDisplayToLogical in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#ZipDisplayToLogical">Method ZipDisplayToLogical</A>
	*/
	public static String ZipDisplayToLogical(Database db, String _val) throws SQLException {
		return ZipDisplayToLogical((IRISConnection)db.getConnection(), _val);
	}

	public static String ZipDisplayToLogical(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "ZipDisplayToLogical", _val);
	}

	/**
		Runs method ZipLogicalToDisplay in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Address#ZipLogicalToDisplay">Method ZipLogicalToDisplay</A>
	*/
	public static String ZipLogicalToDisplay(Database db, String _val) throws SQLException {
		return ZipLogicalToDisplay((IRISConnection)db.getConnection(), _val);
	}

	public static String ZipLogicalToDisplay(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "ZipLogicalToDisplay", _val);
	}

}
