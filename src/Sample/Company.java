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
import com.intersystems.binding.Persistent;

/**
 * Java class generated for IRIS class Sample.Company on version IRIS for Windows (x86-64) 2021.1 (Build 215U) Wed Jun 9 2021 09:39:22 EDT.<br>
 * Description: Use or operation of this code is subject to acceptance of the license available in the code repository for this code.
This sample persistent class represents a company.<br>
 * @see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company</A>
**/
public class Company extends Persistent {
	private static final long serialVersionUID = 3860;
	public static String IRIS_CLASS_NAME = "Sample.Company";

	static {
		ClassnameMap cMap = ClassnameMap.getInstance();
		cMap.putJavaClass(IRIS_CLASS_NAME, Company.class);
	}

	/**
		This constructor is NOT for use in application. It is called by binding code.
	*/
	public Company(IRISObject irisObjectNew) {
		super(irisObjectNew);
	}
	/**
		This constructor is NOT for use in application. It is called by binding code.
	*/
	public Company(IRISObject irisObjectNew, Database db) {
		super(irisObjectNew, db);
	}

	/**
		Creates a new instance of class "Sample.Company" in IRIS database
		and a corresponding instance of class <code>Sample.Company</code>.
		@param db <code>Database</code> instance to connect with IRIS database
		@throws java.sql.SQLException in case of error
	*/
	public Company(Database db) throws SQLException {
		this((IRISConnection)db.getConnection());
		setDatabase(db);
	}

	public Company(IRISConnection connection) throws SQLException {
		super((IRISObject) IRIS.createIRIS(connection).classMethodObject(IRIS_CLASS_NAME, "%New"));
	}

	/**
		Runs IRIS method <code>%OpenId</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Company</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Company</code> or any of its subclasses.
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
		return new Company(irisObjectNew);
	}

	/**
		Runs IRIS method <code>%OpenId</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Company</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Company</code> or any of its subclasses.
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
		and creates corresponding object of class <code>Sample.Company</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Company</code> or any of its subclasses.
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
		return new Company(irisObjectNew);
	}

	/**
		Runs IRIS method <code>%OpenId</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Company</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Company</code> or any of its subclasses.
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
		and creates corresponding object of class <code>Sample.Company</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Company</code> or any of its subclasses.
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
		return new Company(irisObjectNew);
	}

	/**
		Runs IRIS method <code>%Open</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Company</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Company</code> or any of its subclasses.
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
		and creates corresponding object of class <code>Sample.Company</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Company</code> or any of its subclasses.
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
		return new Company(irisObjectNew);
	}

	/**
		Runs IRIS method <code>%Open</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Company</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Company</code> or any of its subclasses.
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
		Opens all instances of class Sample.Company that satisfy given simple condition, specified in SQL syntax.
		@return Iterator as <code>java.util.Iterator</code> that iterates over all opened objects in specified order.
		@param db <code>Database</code> to connect with server
		@param condition Simple condition on objects, in SQL syntax.
		It can refer only to properties of a single object.
		@param args Parameters to replace "?" in<code>condition</code>.
		If there are no parameters in condition, this may be null or empty array.
	*/
	public static java.util.Iterator openByQuery(Database db, String condition, Object[] args) throws SQLException {
		return openByQuery((IRISConnection)db.getConnection(), condition, args);
	}

	public static java.util.Iterator openByQuery(IRISConnection connection, String condition, Object[] args) throws SQLException {
		String sql= "SELECT %ID FROM Sample.Company WHERE " + condition;
		java.sql.PreparedStatement statement = connection.prepareStatement(sql);
		for (int i = 0;i < args.length;i++)
			statement.setObject(i + 1, args[i]);
		java.sql.ResultSet rs = statement.executeQuery();

		java.util.List<Company> list = new java.util.ArrayList<Company>();
		while (rs.next())
			list.add((Company)Company._open(connection, new Id(rs.getInt(1))));

		return list.iterator();
	}

	/**
		Opens all instances of class Sample.Company that satisfy given simple condition, specified in SQL syntax.
		@return Iterator as <code>java.util.Iterator</code> that iterates over all opened objects in specified order.
		@param db <code>Database</code> to connect with server
		@param condition Simple condition on objects, in SQL syntax.
		It can refer only to properties of a single object.
	*/
	public static java.util.Iterator openByQuery(Database db, String condition) throws SQLException {
		return openByQuery((IRISConnection)db.getConnection(), condition);
	}

	public static java.util.Iterator openByQuery(IRISConnection connection, String condition) throws SQLException {
		String sql= "SELECT %ID FROM Sample.Company WHERE " + condition;
		java.sql.PreparedStatement statement = connection.prepareStatement(sql);
		java.sql.ResultSet rs = statement.executeQuery();

		java.util.List<Company> list = new java.util.ArrayList<Company>();
		while (rs.next())
			list.add((Company)Company._open(connection, new Id(rs.getInt(1))));

		return list.iterator();
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
		Runs method <code>%ExistsId</code> in IRIS to check if an object exists.
		@param db <code>Database</code> instance to connect with IRIS database
		@param id as <code>Id<code>
		@throws java.sql.SQLException in case of error
	*/
	public static Boolean exists(Database db, Id id) throws SQLException {
		return exists((IRISConnection)db.getConnection(), id);
	}

	public static Boolean exists(IRISConnection connection, Id id) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodBoolean(IRIS_CLASS_NAME, "%ExistsId", id == null ? null : id.toString());
	}

	/**
		Runs method <code>%ExistsId</code> in IRIS to check if an object exists.
		@param db <code>Database</code> instance to connect with IRIS database
		@param id as <code>Id<code>
		@throws java.sql.SQLException in case of error
	*/
	public static Boolean _existsId(Database db, Id id) throws SQLException {
		return exists((IRISConnection)db.getConnection(), id);
	}

	public static Boolean _existsId(IRISConnection connection, Id id) throws SQLException {
		return exists(connection, id);
	}

	/**
		Runs method <code>%Exists</code> in IRIS to check if an object exists.
		@param db <code>Database</code> instance to connect with IRIS database
		@param oid as <code>Oid<code>
		@throws java.sql.SQLException in case of error
	*/
	public static boolean exists(Database db, Oid oid) throws SQLException {
		return exists((IRISConnection)db.getConnection(), oid);
	}

	public static boolean exists(IRISConnection connection, Oid oid) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodBoolean(IRIS_CLASS_NAME, "%Exists", oid == null ? null : oid.getData());
	}

	/**
		Returns name of class Sample.Company as it is in IRIS database.
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%ClassName">Method %ClassName</A>
	*/
	public static String sys_ClassName(Database db, Boolean fullname) throws SQLException {
		return sys_ClassName((IRISConnection)db.getConnection(), fullname);
	}

	public static String sys_ClassName(IRISConnection connection, Boolean fullname) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "%ClassName", fullname);
	}

	/**
		Runs method %ComposeOid in IRIS.
		<p>Description: %ComposeOid()

		This class method accepts an ID and returns a fully qualified OID, containing the most specific type class of the object identified by the
		<var>id</var> argument. If default storage is used then the %%CLASSNAME value is used to determine the most specific type class, otherwise call
		%OnDetermineClass to determine the most specific type class. If neither case is true then the current class is
		used. If there is a problem determining the most specific type class then null ("") is returned.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param id as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%ComposeOid">Method %ComposeOid</A>
	*/
	public static void sys_ComposeOid(Database db, String id) throws SQLException {
		sys_ComposeOid((IRISConnection)db.getConnection(), id);
	}

	public static void sys_ComposeOid(IRISConnection connection, String id) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodVoid(IRIS_CLASS_NAME, "%ComposeOid", id);
	}

	/**
		Runs method %Delete in IRIS.
		<p>Description: Deletes the stored version of the object with OID <var>oid</var> from the database. 
It does not remove any in-memory versions of the object that may be present.

Refer to <a href="/csp/docbook/DocBook.UI.Page.cls?KEY=GOBJ_concurrency" target="_blank">Object Concurrency Options</a> for more details 
on the optional <var>concurrency</var> argument.  For classes defined as Sharded=1, concurrency=0 is always used.

<p>Returns a <CLASS>%Status</CLASS> value indicating success or failure.

<p>Internally, <METHOD>%Delete</METHOD> initiates a transaction and then invokes the storage 
interface method <METHOD>%DeleteData</METHOD>. If <METHOD>%DeleteData</METHOD> succeeds, the 
transaction is committed, otherwise it is rolled back.  No transaction is initiated if this class is defined as Sharded=1</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param oid as <code>Oid<code>
		@param concurrency as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%Delete">Method %Delete</A>
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
		<p>Description: Deletes the stored version of the object with OID <var>oid</var> from the database. 
It does not remove any in-memory versions of the object that may be present.

Refer to <a href="/csp/docbook/DocBook.UI.Page.cls?KEY=GOBJ_concurrency" target="_blank">Object Concurrency Options</a> for more details 
on the optional <var>concurrency</var> argument.  For classes defined as Sharded=1, concurrency=0 is always used.

<p>Returns a <CLASS>%Status</CLASS> value indicating success or failure.

<p>Internally, <METHOD>%Delete</METHOD> initiates a transaction and then invokes the storage 
interface method <METHOD>%DeleteData</METHOD>. If <METHOD>%DeleteData</METHOD> succeeds, the 
transaction is committed, otherwise it is rolled back.  No transaction is initiated if this class is defined as Sharded=1</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param oid as <code>Oid<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%Delete">Method %Delete</A>
	*/
	public static void sys_Delete(Database db, Oid oid) throws SQLException {
		sys_Delete((IRISConnection)db.getConnection(), oid);
	}

	public static void sys_Delete(IRISConnection connection, Oid oid) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "%Delete", oid == null ? null : oid.getData());
	}

	/**
		Runs method %DeleteExtent in IRIS.
		<p>Description: Delete all instances of this class from its extent. On exit <var>instancecount</var> 
contains the original number of instances while <var>deletecount</var> contains 
the number of instances actually deleted.<br>

<p>Internally, <METHOD>%DeleteExtent</METHOD> iterates over the set of instances in the 
collection and invokes the <METHOD>%Delete</METHOD> method.<br>

Refer to <a href="/csp/docbook/DocBook.UI.Page.cls?KEY=GOBJ_concurrency" target="_blank">Object Concurrency Options</a> for more details 
on the optional <var>concurrency</var> argument.<br>

The option <var>pInitializeExtent</var> argument allows the user to override the default behavior
of calling <method>%KillExtent</method> when all instances are successfully deleted. <method>%KillExtent</method>
is called by default when the extent is empty so that empty globals can be killed. If <method>%KillExtent</method>
is not called then some empty globals can remain as well as the ID counter if it exists. The default value for <var>pInitializeExtent</var>
is 1. Unless the caller specifies a false value for <var>pInitializeExtent</var> the globals used by the extent will be killed. In some
cases, the globals used by the extent are not used exclusively by the extent. In those cases it is possible that some globals will still be defined
even when pInitializeExtent is true. By default this call to <method>%KillExtent</method> will not delete default stream storage global, but if you pass '2' in
<var>pInitializeExtent</var> and if the entire extent was deleted we will call %KillExtent passing the 'killstreams' flag to ask it to remove kill the default
storage global.

<p>Returns a <CLASS>%Status</CLASS> value indicating success or failure.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param concurrency as <code>Integer<code>
		@param deletecount as <code>com.intersystems.binding.IRISReference<code>
		@param instancecount as <code>com.intersystems.binding.IRISReference<code>
		@param pInitializeExtent as <code>Integer<code>
		@param errorLog as <code>com.intersystems.binding.IRISReference<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%DeleteExtent">Method %DeleteExtent</A>
	*/
	public static void sys_DeleteExtent(Database db, Integer concurrency, com.intersystems.binding.IRISReference deletecount, com.intersystems.binding.IRISReference instancecount, Integer pInitializeExtent, com.intersystems.binding.IRISReference errorLog) throws SQLException {
		sys_DeleteExtent((IRISConnection)db.getConnection(), concurrency, deletecount, instancecount, pInitializeExtent, errorLog);
	}

	public static void sys_DeleteExtent(IRISConnection connection, Integer concurrency, com.intersystems.binding.IRISReference deletecount, com.intersystems.binding.IRISReference instancecount, Integer pInitializeExtent, com.intersystems.binding.IRISReference errorLog) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "%DeleteExtent", concurrency, deletecount, instancecount, pInitializeExtent, errorLog);
	}

	/**
		Runs method %DeleteId in IRIS.
		<p>Description: Deletes the stored version of the object with ID <var>id</var> from the database. 

<p><METHOD>%DeleteId</METHOD> is identical in operation to the <METHOD>%Delete</METHOD> method except 
that it uses an Id value instead of an OID value to find an object.

Refer to <a href="/csp/docbook/DocBook.UI.Page.cls?KEY=GOBJ_concurrency" target="_blank">Object Concurrency Options</a> for more details 
on the optional <var>concurrency</var> argument.  For classes defined as Sharded=1, concurrency=0 is always used.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param id as <code>String<code>
		@param concurrency as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%DeleteId">Method %DeleteId</A>
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
that it uses an Id value instead of an OID value to find an object.

Refer to <a href="/csp/docbook/DocBook.UI.Page.cls?KEY=GOBJ_concurrency" target="_blank">Object Concurrency Options</a> for more details 
on the optional <var>concurrency</var> argument.  For classes defined as Sharded=1, concurrency=0 is always used.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param id as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%DeleteId">Method %DeleteId</A>
	*/
	public static void sys_DeleteId(Database db, String id) throws SQLException {
		sys_DeleteId((IRISConnection)db.getConnection(), id);
	}

	public static void sys_DeleteId(IRISConnection connection, String id) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "%DeleteId", id);
	}

	/**
		Runs method %Exists in IRIS.
		<p>Description: %Exists()
	Check to see if an OID exists in the extent of this class...</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param oid as <code>Oid<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%Exists">Method %Exists</A>
	*/
	public static Boolean sys_Exists(Database db, Oid oid) throws SQLException {
		return sys_Exists((IRISConnection)db.getConnection(), oid);
	}

	public static Boolean sys_Exists(IRISConnection connection, Oid oid) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodBoolean(IRIS_CLASS_NAME, "%Exists", oid == null ? null : oid.getData());
	}

	/**
		Runs method %ExistsId in IRIS.
		<p>Description: %ExistsId()
	Check to see if an ID exists in the extent of this class...</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param id as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%ExistsId">Method %ExistsId</A>
	*/
	public static Boolean sys_ExistsId(Database db, String id) throws SQLException {
		return sys_ExistsId((IRISConnection)db.getConnection(), id);
	}

	public static Boolean sys_ExistsId(IRISConnection connection, String id) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodBoolean(IRIS_CLASS_NAME, "%ExistsId", id);
	}

	/**
		Runs method %IsA in IRIS.
		<p>Description: Returns true (1) if instances of this class are also instances of the isclass parameter.
That is 'isclass' is a primary superclass of this object.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param isclass as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%IsA">Method %IsA</A>
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
		<p>Description: %IsNull() returns true if the current object is NULL. A NULL object is one whose serialized value is NULL. This instance method
predicts whether or not the serialization of the current object will be NULL and returns TRUE (1) if the serialization will be null.
Persistent objects can not ever be NULL since at least the %ID is not null. Streams can return a non-NULL serialization but the stream
is determined to be NULL if it has not ever been written to. This method is expected to be overridden by more specific subclasses.</p>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%IsNull">Method %IsNull</A>
	*/
	public Boolean sys_IsNull() {
		return irisObject.invokeBoolean("%IsNull");
	}

	/**
		Runs method %KillExtent in IRIS.
		<p>Description: %KillExtent performs a physical kill of the extent. No constraints are enforced. This method should not be
used in place of %DeleteExtent. Only physical storage occupied by this extent will be killed. If this extent
is a subextent of another class then no data is killed. Indexes that originate with this extent will be killed.
%KillExtent will be called on any subextents and on any child extents (the extent of the type class of a
relationship whose cardinality = children is a 'child' extent) of this extent.<br>

This method is not meant for production applications. It is meant to be a development utility to quickly clear
extent physical data. Also this will not remove stream data associated with these instances.<br>
If <var>killstreams</var> is true (default is false) it will also kill the default stream storage global.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param pDirect as <code>Integer<code>
		@param killstreams as <code>Boolean<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%KillExtent">Method %KillExtent</A>
	*/
	public static void sys_KillExtent(Database db, Integer pDirect, Boolean killstreams) throws SQLException {
		sys_KillExtent((IRISConnection)db.getConnection(), pDirect, killstreams);
	}

	public static void sys_KillExtent(IRISConnection connection, Integer pDirect, Boolean killstreams) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "%KillExtent", pDirect, killstreams);
	}

	/**
		Runs method %KillExtent in IRIS.
		<p>Description: %KillExtent performs a physical kill of the extent. No constraints are enforced. This method should not be
used in place of %DeleteExtent. Only physical storage occupied by this extent will be killed. If this extent
is a subextent of another class then no data is killed. Indexes that originate with this extent will be killed.
%KillExtent will be called on any subextents and on any child extents (the extent of the type class of a
relationship whose cardinality = children is a 'child' extent) of this extent.<br>

This method is not meant for production applications. It is meant to be a development utility to quickly clear
extent physical data. Also this will not remove stream data associated with these instances.<br>
If <var>killstreams</var> is true (default is false) it will also kill the default stream storage global.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param pDirect as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%KillExtent">Method %KillExtent</A>
	*/
	public static void sys_KillExtent(Database db, Integer pDirect) throws SQLException {
		sys_KillExtent((IRISConnection)db.getConnection(), pDirect);
	}

	public static void sys_KillExtent(IRISConnection connection, Integer pDirect) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "%KillExtent", pDirect);
	}

	/**
		Runs method %KillExtent in IRIS.
		<p>Description: %KillExtent performs a physical kill of the extent. No constraints are enforced. This method should not be
used in place of %DeleteExtent. Only physical storage occupied by this extent will be killed. If this extent
is a subextent of another class then no data is killed. Indexes that originate with this extent will be killed.
%KillExtent will be called on any subextents and on any child extents (the extent of the type class of a
relationship whose cardinality = children is a 'child' extent) of this extent.<br>

This method is not meant for production applications. It is meant to be a development utility to quickly clear
extent physical data. Also this will not remove stream data associated with these instances.<br>
If <var>killstreams</var> is true (default is false) it will also kill the default stream storage global.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%KillExtent">Method %KillExtent</A>
	*/
	public static void sys_KillExtent(Database db) throws SQLException {
		sys_KillExtent((IRISConnection)db.getConnection());
	}

	public static void sys_KillExtent(IRISConnection connection) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "%KillExtent");
	}

	/**
		Runs method %ObjectIsNull in IRIS.
		<p>Description: Return true if pOID is a null object and false if the object is not null</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param pOID as <code>Oid<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%ObjectIsNull">Method %ObjectIsNull</A>
	*/
	public static Boolean sys_ObjectIsNull(Database db, Oid pOID) throws SQLException {
		return sys_ObjectIsNull((IRISConnection)db.getConnection(), pOID);
	}

	public static Boolean sys_ObjectIsNull(IRISConnection connection, Oid pOID) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodBoolean(IRIS_CLASS_NAME, "%ObjectIsNull", pOID == null ? null : pOID.getData());
	}

	/**
		Runs method %SaveIndices in IRIS.
		<p>Description: Files the indices for all objects whose ID is in the range defined by <var>pStartId</var> and <var>pEndId</var>.
If <var>pEndID</var> is null then it defaults to <var>pStartId</var>. If <var>pStartId</var> is null then the
range is empty and no filing will occur.

If <var>lockExtent</var> is true then an extent lock will be acquired before the indices
are built. If the lock cannot be acquired then an error is returned. The lock is released
after the index filing is completed.


<p>Returns a <CLASS>%Status</CLASS> value indicating success or failure.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param pStartId as <code>String<code>
		@param pEndId as <code>String<code>
		@param lockExtent as <code>Boolean<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%SaveIndices">Method %SaveIndices</A>
	*/
	public static void sys_SaveIndices(Database db, String pStartId, String pEndId, Boolean lockExtent) throws SQLException {
		sys_SaveIndices((IRISConnection)db.getConnection(), pStartId, pEndId, lockExtent);
	}

	public static void sys_SaveIndices(IRISConnection connection, String pStartId, String pEndId, Boolean lockExtent) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "%SaveIndices", pStartId, pEndId, lockExtent);
	}

	/**
		Runs method %SaveIndices in IRIS.
		<p>Description: Files the indices for all objects whose ID is in the range defined by <var>pStartId</var> and <var>pEndId</var>.
If <var>pEndID</var> is null then it defaults to <var>pStartId</var>. If <var>pStartId</var> is null then the
range is empty and no filing will occur.

If <var>lockExtent</var> is true then an extent lock will be acquired before the indices
are built. If the lock cannot be acquired then an error is returned. The lock is released
after the index filing is completed.


<p>Returns a <CLASS>%Status</CLASS> value indicating success or failure.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param pStartId as <code>String<code>
		@param pEndId as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%SaveIndices">Method %SaveIndices</A>
	*/
	public static void sys_SaveIndices(Database db, String pStartId, String pEndId) throws SQLException {
		sys_SaveIndices((IRISConnection)db.getConnection(), pStartId, pEndId);
	}

	public static void sys_SaveIndices(IRISConnection connection, String pStartId, String pEndId) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "%SaveIndices", pStartId, pEndId);
	}

	/**
		Runs method %SaveIndices in IRIS.
		<p>Description: Files the indices for all objects whose ID is in the range defined by <var>pStartId</var> and <var>pEndId</var>.
If <var>pEndID</var> is null then it defaults to <var>pStartId</var>. If <var>pStartId</var> is null then the
range is empty and no filing will occur.

If <var>lockExtent</var> is true then an extent lock will be acquired before the indices
are built. If the lock cannot be acquired then an error is returned. The lock is released
after the index filing is completed.


<p>Returns a <CLASS>%Status</CLASS> value indicating success or failure.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param pStartId as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%SaveIndices">Method %SaveIndices</A>
	*/
	public static void sys_SaveIndices(Database db, String pStartId) throws SQLException {
		sys_SaveIndices((IRISConnection)db.getConnection(), pStartId);
	}

	public static void sys_SaveIndices(IRISConnection connection, String pStartId) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "%SaveIndices", pStartId);
	}

	/**
		Runs method %SaveIndices in IRIS.
		<p>Description: Files the indices for all objects whose ID is in the range defined by <var>pStartId</var> and <var>pEndId</var>.
If <var>pEndID</var> is null then it defaults to <var>pStartId</var>. If <var>pStartId</var> is null then the
range is empty and no filing will occur.

If <var>lockExtent</var> is true then an extent lock will be acquired before the indices
are built. If the lock cannot be acquired then an error is returned. The lock is released
after the index filing is completed.


<p>Returns a <CLASS>%Status</CLASS> value indicating success or failure.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#%SaveIndices">Method %SaveIndices</A>
	*/
	public static void sys_SaveIndices(Database db) throws SQLException {
		sys_SaveIndices((IRISConnection)db.getConnection());
	}

	public static void sys_SaveIndices(IRISConnection connection) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "%SaveIndices");
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#Populate">Method Populate</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#Populate">Method Populate</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#Populate">Method Populate</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#Populate">Method Populate</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#Populate">Method Populate</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#Populate">Method Populate</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#Populate">Method Populate</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#PopulateSerial">Method PopulateSerial</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#Random">Method Random</A>
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
		Returns value of property <code>Employees<code>.
		<p>Description: The <class>Employee</class> objects associated with this <class>Company</class>.</p>
		@return current value of <code>Employees</code> as <code>com.intersystems.binding.RelationshipObject</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#Employees">Employees</A>
	*/
	public com.intersystems.binding.RelationshipObject getEmployees() {
		IRISObject _x = (IRISObject)irisObject.getObject("Employees");
		return _x == null ? null : new com.intersystems.binding.RelationshipObject(_x, db, "Sample.Employee");
	}

	/**
		Runs method EmployeesIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#EmployeesIsValid">Method EmployeesIsValid</A>
	*/
	public static void EmployeesIsValid(Database db, String _val) throws SQLException {
		EmployeesIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void EmployeesIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "EmployeesIsValid", _val);
	}

	/**
		Runs method EmployeesGetObject in IRIS.
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#EmployeesGetObject">Method EmployeesGetObject</A>
	*/
	public Oid EmployeesGetObject() {
		String _x = irisObject.invokeString("EmployeesGetObject");
		return Oid.fromString((String) _x);
	}

	/**
		Runs method EmployeesGetObject in IRIS.
		@param force as <code>Integer<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#EmployeesGetObject">Method EmployeesGetObject</A>
	*/
	public Oid EmployeesGetObject(Integer force) {
		String _x = irisObject.invokeString("EmployeesGetObject", force);
		return Oid.fromString((String) _x);
	}

	/**
		Runs method EmployeesGetObjectId in IRIS.
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#EmployeesGetObjectId">Method EmployeesGetObjectId</A>
	*/
	public String EmployeesGetObjectId() {
		return irisObject.invokeString("EmployeesGetObjectId");
	}

	/**
		Runs method EmployeesGetObjectId in IRIS.
		@param force as <code>Integer<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#EmployeesGetObjectId">Method EmployeesGetObjectId</A>
	*/
	public String EmployeesGetObjectId(Integer force) {
		return irisObject.invokeString("EmployeesGetObjectId", force);
	}

	/**
		Runs method EmployeesSetObject in IRIS.
		@param newvalue as <code>Oid<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#EmployeesSetObject">Method EmployeesSetObject</A>
	*/
	public void EmployeesSetObject(Oid newvalue) {
		irisObject.invokeVoid("EmployeesSetObject", newvalue == null ? null : newvalue.getData());
	}

	/**
		Runs method EmployeesSetObjectId in IRIS.
		@param newid as <code>String<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#EmployeesSetObjectId">Method EmployeesSetObjectId</A>
	*/
	public void EmployeesSetObjectId(String newid) {
		irisObject.invokeVoid("EmployeesSetObjectId", newid);
	}

	/**
		Returns value of property <code>Mission<code>.
		<p>Description: The company's mission statement.</p>
		@return current value of <code>Mission</code> as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#Mission">Mission</A>
	*/
	public String getMission() {
		return irisObject.getString("Mission");
	}

	/**
		Sets new value for property <code>Mission<code>.
		<p>Description: The company's mission statement.</p>
		@param _val new value to be set as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#Mission">Mission</A>
	*/
	public void setMission(String _val) {
		irisObject.set("Mission", _val);
	}

	/**
		Runs method MissionIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#MissionIsValid">Method MissionIsValid</A>
	*/
	public static void MissionIsValid(Database db, String _val) throws SQLException {
		MissionIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void MissionIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "MissionIsValid", _val);
	}

	/**
		Runs method MissionDisplayToLogical in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#MissionDisplayToLogical">Method MissionDisplayToLogical</A>
	*/
	public static String MissionDisplayToLogical(Database db, String _val) throws SQLException {
		return MissionDisplayToLogical((IRISConnection)db.getConnection(), _val);
	}

	public static String MissionDisplayToLogical(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "MissionDisplayToLogical", _val);
	}

	/**
		Runs method MissionLogicalToDisplay in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#MissionLogicalToDisplay">Method MissionLogicalToDisplay</A>
	*/
	public static String MissionLogicalToDisplay(Database db, String _val) throws SQLException {
		return MissionLogicalToDisplay((IRISConnection)db.getConnection(), _val);
	}

	public static String MissionLogicalToDisplay(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "MissionLogicalToDisplay", _val);
	}

	/**
		Returns value of property <code>Name<code>.
		<p>Description: The company's name.</p>
		@return current value of <code>Name</code> as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#Name">Name</A>
	*/
	public String getName() {
		return irisObject.getString("Name");
	}

	/**
		Sets new value for property <code>Name<code>.
		<p>Description: The company's name.</p>
		@param _val new value to be set as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#Name">Name</A>
	*/
	public void setName(String _val) {
		irisObject.set("Name", _val);
	}

	/**
		Runs method NameIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#NameIsValid">Method NameIsValid</A>
	*/
	public static void NameIsValid(Database db, String _val) throws SQLException {
		NameIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void NameIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "NameIsValid", _val);
	}

	/**
		Runs method NameDisplayToLogical in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#NameDisplayToLogical">Method NameDisplayToLogical</A>
	*/
	public static String NameDisplayToLogical(Database db, String _val) throws SQLException {
		return NameDisplayToLogical((IRISConnection)db.getConnection(), _val);
	}

	public static String NameDisplayToLogical(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "NameDisplayToLogical", _val);
	}

	/**
		Runs method NameLogicalToDisplay in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#NameLogicalToDisplay">Method NameLogicalToDisplay</A>
	*/
	public static String NameLogicalToDisplay(Database db, String _val) throws SQLException {
		return NameLogicalToDisplay((IRISConnection)db.getConnection(), _val);
	}

	public static String NameLogicalToDisplay(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "NameLogicalToDisplay", _val);
	}

	/**
		Returns value of property <code>Revenue<code>.
		<p>Description: The last reported revenue for the company.</p>
		@return current value of <code>Revenue</code> as <code>Integer</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#Revenue">Revenue</A>
	*/
	public Integer getRevenue() {
		Long _x = irisObject.getLong("Revenue");
		return Util.IntegerJavaFormat(_x);
	}

	/**
		Sets new value for property <code>Revenue<code>.
		<p>Description: The last reported revenue for the company.</p>
		@param _val new value to be set as <code>Integer</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#Revenue">Revenue</A>
	*/
	public void setRevenue(Integer _val) {
		irisObject.set("Revenue", _val);
	}

	/**
		Runs method RevenueIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#RevenueIsValid">Method RevenueIsValid</A>
	*/
	public static void RevenueIsValid(Database db, String _val) throws SQLException {
		RevenueIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void RevenueIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "RevenueIsValid", _val);
	}

	/**
		Runs method RevenueDisplayToLogical in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#RevenueDisplayToLogical">Method RevenueDisplayToLogical</A>
	*/
	public static Integer RevenueDisplayToLogical(Database db, String _val) throws SQLException {
		return RevenueDisplayToLogical((IRISConnection)db.getConnection(), _val);
	}

	public static Integer RevenueDisplayToLogical(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		Long _x = iris.classMethodLong(IRIS_CLASS_NAME, "RevenueDisplayToLogical", _val);
		return Util.IntegerJavaFormat(_x);
	}

	/**
		Runs method RevenueLogicalToDisplay in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#RevenueLogicalToDisplay">Method RevenueLogicalToDisplay</A>
	*/
	public static String RevenueLogicalToDisplay(Database db, Integer _val) throws SQLException {
		return RevenueLogicalToDisplay((IRISConnection)db.getConnection(), _val);
	}

	public static String RevenueLogicalToDisplay(IRISConnection connection, Integer _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "RevenueLogicalToDisplay", _val);
	}

	/**
		Returns value of property <code>TaxID<code>.
		<p>Description: The unique Tax ID number for the company.</p>
		@return current value of <code>TaxID</code> as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#TaxID">TaxID</A>
	*/
	public String getTaxID() {
		return irisObject.getString("TaxID");
	}

	/**
		Sets new value for property <code>TaxID<code>.
		<p>Description: The unique Tax ID number for the company.</p>
		@param _val new value to be set as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#TaxID">TaxID</A>
	*/
	public void setTaxID(String _val) {
		irisObject.set("TaxID", _val);
	}

	/**
		Runs method TaxIDIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#TaxIDIsValid">Method TaxIDIsValid</A>
	*/
	public static void TaxIDIsValid(Database db, String _val) throws SQLException {
		TaxIDIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void TaxIDIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "TaxIDIsValid", _val);
	}

	/**
		Runs method TaxIDDisplayToLogical in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#TaxIDDisplayToLogical">Method TaxIDDisplayToLogical</A>
	*/
	public static String TaxIDDisplayToLogical(Database db, String _val) throws SQLException {
		return TaxIDDisplayToLogical((IRISConnection)db.getConnection(), _val);
	}

	public static String TaxIDDisplayToLogical(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "TaxIDDisplayToLogical", _val);
	}

	/**
		Runs method TaxIDLogicalToDisplay in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#TaxIDLogicalToDisplay">Method TaxIDLogicalToDisplay</A>
	*/
	public static String TaxIDLogicalToDisplay(Database db, String _val) throws SQLException {
		return TaxIDLogicalToDisplay((IRISConnection)db.getConnection(), _val);
	}

	public static String TaxIDLogicalToDisplay(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "TaxIDLogicalToDisplay", _val);
	}

	/**
		Runs method IDKEYDelete in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param K1 as <code>String<code>
		@param concurrency as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#IDKEYDelete">Method IDKEYDelete</A>
	*/
	public static void IDKEYDelete(Database db, String K1, Integer concurrency) throws SQLException {
		IDKEYDelete((IRISConnection)db.getConnection(), K1, concurrency);
	}

	public static void IDKEYDelete(IRISConnection connection, String K1, Integer concurrency) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "IDKEYDelete", K1, concurrency);
	}

	/**
		Runs method IDKEYDelete in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param K1 as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#IDKEYDelete">Method IDKEYDelete</A>
	*/
	public static void IDKEYDelete(Database db, String K1) throws SQLException {
		IDKEYDelete((IRISConnection)db.getConnection(), K1);
	}

	public static void IDKEYDelete(IRISConnection connection, String K1) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "IDKEYDelete", K1);
	}

	/**
		Runs method IDKEYExists in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param K1 as <code>String<code>
		@param id as <code>com.intersystems.binding.IRISReference<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#IDKEYExists">Method IDKEYExists</A>
	*/
	public static Boolean IDKEYExists(Database db, String K1, com.intersystems.binding.IRISReference id) throws SQLException {
		return IDKEYExists((IRISConnection)db.getConnection(), K1, id);
	}

	public static Boolean IDKEYExists(IRISConnection connection, String K1, com.intersystems.binding.IRISReference id) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodBoolean(IRIS_CLASS_NAME, "IDKEYExists", K1, id);
	}

	/**
		Runs method IDKEYExists in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param K1 as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#IDKEYExists">Method IDKEYExists</A>
	*/
	public static Boolean IDKEYExists(Database db, String K1) throws SQLException {
		return IDKEYExists((IRISConnection)db.getConnection(), K1);
	}

	public static Boolean IDKEYExists(IRISConnection connection, String K1) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodBoolean(IRIS_CLASS_NAME, "IDKEYExists", K1);
	}

	/**
		Runs method IDKEYOpen in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param K1 as <code>String<code>
		@param concurrency as <code>Integer<code>
		@param sc as <code>com.intersystems.binding.IRISReference<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#IDKEYOpen">Method IDKEYOpen</A>
	*/
	public static Sample.Company IDKEYOpen(Database db, String K1, Integer concurrency, com.intersystems.binding.IRISReference sc) throws SQLException {
		Sample.Company obj = IDKEYOpen((IRISConnection)db.getConnection(), K1, concurrency, sc);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Company IDKEYOpen(IRISConnection connection, String K1, Integer concurrency, com.intersystems.binding.IRISReference sc) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "IDKEYOpen", K1, concurrency, sc);
		return _x == null ? null : new Sample.Company(_x);
	}

	/**
		Runs method IDKEYOpen in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param K1 as <code>String<code>
		@param concurrency as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#IDKEYOpen">Method IDKEYOpen</A>
	*/
	public static Sample.Company IDKEYOpen(Database db, String K1, Integer concurrency) throws SQLException {
		Sample.Company obj = IDKEYOpen((IRISConnection)db.getConnection(), K1, concurrency);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Company IDKEYOpen(IRISConnection connection, String K1, Integer concurrency) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "IDKEYOpen", K1, concurrency);
		return _x == null ? null : new Sample.Company(_x);
	}

	/**
		Runs method IDKEYOpen in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param K1 as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#IDKEYOpen">Method IDKEYOpen</A>
	*/
	public static Sample.Company IDKEYOpen(Database db, String K1) throws SQLException {
		Sample.Company obj = IDKEYOpen((IRISConnection)db.getConnection(), K1);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Company IDKEYOpen(IRISConnection connection, String K1) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "IDKEYOpen", K1);
		return _x == null ? null : new Sample.Company(_x);
	}

	/**
		Runs method NameIdxExists in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param Name as <code>String<code>
		@param id as <code>com.intersystems.binding.IRISReference<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#NameIdxExists">Method NameIdxExists</A>
	*/
	public static Boolean NameIdxExists(Database db, String Name, com.intersystems.binding.IRISReference id) throws SQLException {
		return NameIdxExists((IRISConnection)db.getConnection(), Name, id);
	}

	public static Boolean NameIdxExists(IRISConnection connection, String Name, com.intersystems.binding.IRISReference id) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodBoolean(IRIS_CLASS_NAME, "NameIdxExists", Name, id);
	}

	/**
		Runs method NameIdxExists in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param Name as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#NameIdxExists">Method NameIdxExists</A>
	*/
	public static Boolean NameIdxExists(Database db, String Name) throws SQLException {
		return NameIdxExists((IRISConnection)db.getConnection(), Name);
	}

	public static Boolean NameIdxExists(IRISConnection connection, String Name) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodBoolean(IRIS_CLASS_NAME, "NameIdxExists", Name);
	}

	/**
		Runs method TaxIDIdxDelete in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param TaxID as <code>String<code>
		@param concurrency as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#TaxIDIdxDelete">Method TaxIDIdxDelete</A>
	*/
	public static void TaxIDIdxDelete(Database db, String TaxID, Integer concurrency) throws SQLException {
		TaxIDIdxDelete((IRISConnection)db.getConnection(), TaxID, concurrency);
	}

	public static void TaxIDIdxDelete(IRISConnection connection, String TaxID, Integer concurrency) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "TaxIDIdxDelete", TaxID, concurrency);
	}

	/**
		Runs method TaxIDIdxDelete in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param TaxID as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#TaxIDIdxDelete">Method TaxIDIdxDelete</A>
	*/
	public static void TaxIDIdxDelete(Database db, String TaxID) throws SQLException {
		TaxIDIdxDelete((IRISConnection)db.getConnection(), TaxID);
	}

	public static void TaxIDIdxDelete(IRISConnection connection, String TaxID) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "TaxIDIdxDelete", TaxID);
	}

	/**
		Runs method TaxIDIdxExists in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param TaxID as <code>String<code>
		@param id as <code>com.intersystems.binding.IRISReference<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#TaxIDIdxExists">Method TaxIDIdxExists</A>
	*/
	public static Boolean TaxIDIdxExists(Database db, String TaxID, com.intersystems.binding.IRISReference id) throws SQLException {
		return TaxIDIdxExists((IRISConnection)db.getConnection(), TaxID, id);
	}

	public static Boolean TaxIDIdxExists(IRISConnection connection, String TaxID, com.intersystems.binding.IRISReference id) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodBoolean(IRIS_CLASS_NAME, "TaxIDIdxExists", TaxID, id);
	}

	/**
		Runs method TaxIDIdxExists in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param TaxID as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#TaxIDIdxExists">Method TaxIDIdxExists</A>
	*/
	public static Boolean TaxIDIdxExists(Database db, String TaxID) throws SQLException {
		return TaxIDIdxExists((IRISConnection)db.getConnection(), TaxID);
	}

	public static Boolean TaxIDIdxExists(IRISConnection connection, String TaxID) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodBoolean(IRIS_CLASS_NAME, "TaxIDIdxExists", TaxID);
	}

	/**
		Runs method TaxIDIdxOpen in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param TaxID as <code>String<code>
		@param concurrency as <code>Integer<code>
		@param sc as <code>com.intersystems.binding.IRISReference<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#TaxIDIdxOpen">Method TaxIDIdxOpen</A>
	*/
	public static Sample.Company TaxIDIdxOpen(Database db, String TaxID, Integer concurrency, com.intersystems.binding.IRISReference sc) throws SQLException {
		Sample.Company obj = TaxIDIdxOpen((IRISConnection)db.getConnection(), TaxID, concurrency, sc);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Company TaxIDIdxOpen(IRISConnection connection, String TaxID, Integer concurrency, com.intersystems.binding.IRISReference sc) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "TaxIDIdxOpen", TaxID, concurrency, sc);
		return _x == null ? null : new Sample.Company(_x);
	}

	/**
		Runs method TaxIDIdxOpen in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param TaxID as <code>String<code>
		@param concurrency as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#TaxIDIdxOpen">Method TaxIDIdxOpen</A>
	*/
	public static Sample.Company TaxIDIdxOpen(Database db, String TaxID, Integer concurrency) throws SQLException {
		Sample.Company obj = TaxIDIdxOpen((IRISConnection)db.getConnection(), TaxID, concurrency);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Company TaxIDIdxOpen(IRISConnection connection, String TaxID, Integer concurrency) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "TaxIDIdxOpen", TaxID, concurrency);
		return _x == null ? null : new Sample.Company(_x);
	}

	/**
		Runs method TaxIDIdxOpen in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param TaxID as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Company#TaxIDIdxOpen">Method TaxIDIdxOpen</A>
	*/
	public static Sample.Company TaxIDIdxOpen(Database db, String TaxID) throws SQLException {
		Sample.Company obj = TaxIDIdxOpen((IRISConnection)db.getConnection(), TaxID);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Company TaxIDIdxOpen(IRISConnection connection, String TaxID) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "TaxIDIdxOpen", TaxID);
		return _x == null ? null : new Sample.Company(_x);
	}

	/**
		Returns a CallableStatement for query Extent.
		<p>Description: <p>This is a system provided query that returns a row for each instance within this extent. The first column of the row is the
object ID. Additional columns can be included in the select list by adding the desired columns to the <parameter>EXTENTQUERYSPEC</parameter> parameter.</p>
<p>
The Extent query default implementation is generated by <class>%Library.ExtentSQLQuery</class>. That class
supports the <var>COMPILEMODE</var> parameter with possible values of IMMEDIATE and DYNAMIC. If DYNAMIC is specified
then the SQL statement used to implement the query will be generated as a dynamic SQL statement. If IMMEDIATE is specified
then the statement is generated as an embedded SQL statement.</p>
<br><p>This query can be overridden by a subclass so long as two requirements are met. The list of columns must include %ID as the first column and
it must return a row corresponding to each instance/row in the extent.</p></p>
		@param db <code>Database</code> instance to connect with IRIS database
		@throws java.sql.SQLException in case of error
	*/
	public static com.intersystems.binding.IRISQuery query_Extent(Database db) throws SQLException {
		return query_Extent((IRISConnection)db.getConnection());
	}

	public static com.intersystems.binding.IRISQuery query_Extent(IRISConnection connection) throws SQLException {
		return new com.intersystems.binding.IRISQuery(connection, "Sample.Company_Extent", 0);
	}

}
