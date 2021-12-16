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
import Sample.Person;

/**
 * Java class generated for IRIS class Sample.Employee on version IRIS for Windows (x86-64) 2021.1 (Build 215U) Wed Jun 9 2021 09:39:22 EDT.<br>
 * Description: Use or operation of this code is subject to acceptance of the license available in the code repository for this code.
This sample persistent class represents an employee.<br>
 * @see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee</A>
**/
public class Employee extends Sample.Person {
	private static final long serialVersionUID = 1485;
	public static String IRIS_CLASS_NAME = "Sample.Employee";

	static {
		ClassnameMap cMap = ClassnameMap.getInstance();
		cMap.putJavaClass(IRIS_CLASS_NAME, Employee.class);
	}

	/**
		This constructor is NOT for use in application. It is called by binding code.
	*/
	public Employee(IRISObject irisObjectNew) {
		super(irisObjectNew);
	}
	/**
		This constructor is NOT for use in application. It is called by binding code.
	*/
	public Employee(IRISObject irisObjectNew, Database db) {
		super(irisObjectNew, db);
	}

	/**
		Creates a new instance of class "Sample.Employee" in IRIS database
		and a corresponding instance of class <code>Sample.Employee</code>.
		@param db <code>Database</code> instance to connect with IRIS database
		@throws java.sql.SQLException in case of error
	*/
	public Employee(Database db) throws SQLException {
		this((IRISConnection)db.getConnection());
		setDatabase(db);
	}

	public Employee(IRISConnection connection) throws SQLException {
		super((IRISObject) IRIS.createIRIS(connection).classMethodObject(IRIS_CLASS_NAME, "%New"));
	}

	/**
		Runs IRIS method <code>%OpenId</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Employee</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Employee</code> or any of its subclasses.
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
		return new Employee(irisObjectNew);
	}

	/**
		Runs IRIS method <code>%OpenId</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Employee</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Employee</code> or any of its subclasses.
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
		and creates corresponding object of class <code>Sample.Employee</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Employee</code> or any of its subclasses.
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
		return new Employee(irisObjectNew);
	}

	/**
		Runs IRIS method <code>%OpenId</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Employee</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Employee</code> or any of its subclasses.
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
		and creates corresponding object of class <code>Sample.Employee</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Employee</code> or any of its subclasses.
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
		return new Employee(irisObjectNew);
	}

	/**
		Runs IRIS method <code>%Open</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Employee</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Employee</code> or any of its subclasses.
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
		and creates corresponding object of class <code>Sample.Employee</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Employee</code> or any of its subclasses.
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
		return new Employee(irisObjectNew);
	}

	/**
		Runs IRIS method <code>%Open</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Employee</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Employee</code> or any of its subclasses.
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
		Opens all instances of class Sample.Employee that satisfy given simple condition, specified in SQL syntax.
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
		String sql= "SELECT %ID FROM Sample.Employee WHERE " + condition;
		java.sql.PreparedStatement statement = connection.prepareStatement(sql);
		for (int i = 0;i < args.length;i++)
			statement.setObject(i + 1, args[i]);
		java.sql.ResultSet rs = statement.executeQuery();

		java.util.List<Employee> list = new java.util.ArrayList<Employee>();
		while (rs.next())
			list.add((Employee)Employee._open(connection, new Id(rs.getInt(1))));

		return list.iterator();
	}

	/**
		Opens all instances of class Sample.Employee that satisfy given simple condition, specified in SQL syntax.
		@return Iterator as <code>java.util.Iterator</code> that iterates over all opened objects in specified order.
		@param db <code>Database</code> to connect with server
		@param condition Simple condition on objects, in SQL syntax.
		It can refer only to properties of a single object.
	*/
	public static java.util.Iterator openByQuery(Database db, String condition) throws SQLException {
		return openByQuery((IRISConnection)db.getConnection(), condition);
	}

	public static java.util.Iterator openByQuery(IRISConnection connection, String condition) throws SQLException {
		String sql= "SELECT %ID FROM Sample.Employee WHERE " + condition;
		java.sql.PreparedStatement statement = connection.prepareStatement(sql);
		java.sql.ResultSet rs = statement.executeQuery();

		java.util.List<Employee> list = new java.util.ArrayList<Employee>();
		while (rs.next())
			list.add((Employee)Employee._open(connection, new Id(rs.getInt(1))));

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
		Returns name of class Sample.Employee as it is in IRIS database.
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%ClassName">Method %ClassName</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%ComposeOid">Method %ComposeOid</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%Delete">Method %Delete</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%Delete">Method %Delete</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%DeleteExtent">Method %DeleteExtent</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%DeleteId">Method %DeleteId</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%DeleteId">Method %DeleteId</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%Exists">Method %Exists</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%ExistsId">Method %ExistsId</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%IsA">Method %IsA</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%IsNull">Method %IsNull</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%KillExtent">Method %KillExtent</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%KillExtent">Method %KillExtent</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%KillExtent">Method %KillExtent</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%ObjectIsNull">Method %ObjectIsNull</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%SaveIndices">Method %SaveIndices</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%SaveIndices">Method %SaveIndices</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%SaveIndices">Method %SaveIndices</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#%SaveIndices">Method %SaveIndices</A>
	*/
	public static void sys_SaveIndices(Database db) throws SQLException {
		sys_SaveIndices((IRISConnection)db.getConnection());
	}

	public static void sys_SaveIndices(IRISConnection connection) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "%SaveIndices");
	}

	/**
		Runs method CurrentAge in IRIS.
		<p>Description: This class method calculates a current age given a date of birth <var>date</var>.
This method is used by the Age calculated field.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@param date as <code>java.sql.Date<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#CurrentAge">Method CurrentAge</A>
	*/
	public static Integer CurrentAge(Database db, java.sql.Date date) throws SQLException {
		return CurrentAge((IRISConnection)db.getConnection(), date);
	}

	public static Integer CurrentAge(IRISConnection connection, java.sql.Date date) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		Long _x = iris.classMethodLong(IRIS_CLASS_NAME, "CurrentAge", Util.DateIRISFormat(date));
		return Util.IntegerJavaFormat(_x);
	}

	/**
		Runs method CurrentAge in IRIS.
		<p>Description: This class method calculates a current age given a date of birth <var>date</var>.
This method is used by the Age calculated field.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#CurrentAge">Method CurrentAge</A>
	*/
	public static Integer CurrentAge(Database db) throws SQLException {
		return CurrentAge((IRISConnection)db.getConnection());
	}

	public static Integer CurrentAge(IRISConnection connection) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		Long _x = iris.classMethodLong(IRIS_CLASS_NAME, "CurrentAge");
		return Util.IntegerJavaFormat(_x);
	}

	/**
		Runs method WritePicture in IRIS.
		<p>Description: Writes a .png file containing the picture, if any, of this employee
the purpose of this method is to prove that Picture really contains an image</p>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#WritePicture">Method WritePicture</A>
	*/
	public void WritePicture() {
		irisObject.invokeVoid("WritePicture");
	}

	/**
		Returns value of property <code>Company<code>.
		<p>Description: The company this employee works for.</p>
		@return current value of <code>Company</code> as <code>Sample.Company</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#Company">Company</A>
	*/
	public Sample.Company getCompany() {
		IRISObject _x = (IRISObject)irisObject.getObject("Company");
		return _x == null ? null : new Sample.Company(_x, db);
	}

	public void setCompany(Sample.Company _val) {
		irisObject.set("Company", _val == null ? null : _val.getProxy());
	}

	/**
		Runs method CompanyIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#CompanyIsValid">Method CompanyIsValid</A>
	*/
	public static void CompanyIsValid(Database db, String _val) throws SQLException {
		CompanyIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void CompanyIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "CompanyIsValid", _val);
	}

	/**
		Runs method CompanyGetObject in IRIS.
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#CompanyGetObject">Method CompanyGetObject</A>
	*/
	public Oid CompanyGetObject() {
		String _x = irisObject.invokeString("CompanyGetObject");
		return Oid.fromString((String) _x);
	}

	/**
		Runs method CompanyGetObject in IRIS.
		@param force as <code>Integer<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#CompanyGetObject">Method CompanyGetObject</A>
	*/
	public Oid CompanyGetObject(Integer force) {
		String _x = irisObject.invokeString("CompanyGetObject", force);
		return Oid.fromString((String) _x);
	}

	/**
		Runs method CompanyGetObjectId in IRIS.
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#CompanyGetObjectId">Method CompanyGetObjectId</A>
	*/
	public String CompanyGetObjectId() {
		return irisObject.invokeString("CompanyGetObjectId");
	}

	/**
		Runs method CompanyGetObjectId in IRIS.
		@param force as <code>Integer<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#CompanyGetObjectId">Method CompanyGetObjectId</A>
	*/
	public String CompanyGetObjectId(Integer force) {
		return irisObject.invokeString("CompanyGetObjectId", force);
	}

	/**
		Runs method CompanySetObject in IRIS.
		@param newvalue as <code>Oid<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#CompanySetObject">Method CompanySetObject</A>
	*/
	public void CompanySetObject(Oid newvalue) {
		irisObject.invokeVoid("CompanySetObject", newvalue == null ? null : newvalue.getData());
	}

	/**
		Runs method CompanySetObjectId in IRIS.
		@param newid as <code>String<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#CompanySetObjectId">Method CompanySetObjectId</A>
	*/
	public void CompanySetObjectId(String newid) {
		irisObject.invokeVoid("CompanySetObjectId", newid);
	}

	/**
		Returns value of property <code>Notes<code>.
		<p>Description: A character stream containing notes about this employee.</p>
		@return current value of <code>Notes</code> as <code>com.intersystems.binding.Reader</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#Notes">Notes</A>
	*/
	public com.intersystems.binding.Reader getNotesIn() {
		return new com.intersystems.binding.Reader((IRISObject)irisObject.get("Notes"), db);
	}

	/**
		Sets new value for property <code>Notes<code>.
		<p>Description: A character stream containing notes about this employee.</p>
		@param _val new value to be set as <code>com.intersystems.binding.Writer</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#Notes">Notes</A>
	*/
	public com.intersystems.binding.Writer getNotesOut() {
		return new com.intersystems.binding.Writer((IRISObject)irisObject.get("Notes"), db);
	}

	/**
		Runs method NotesIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#NotesIsValid">Method NotesIsValid</A>
	*/
	public static void NotesIsValid(Database db, String _val) throws SQLException {
		NotesIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void NotesIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "NotesIsValid", _val);
	}

	/**
		Runs method NotesGetObject in IRIS.
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#NotesGetObject">Method NotesGetObject</A>
	*/
	public Oid NotesGetObject() {
		String _x = irisObject.invokeString("NotesGetObject");
		return Oid.fromString((String) _x);
	}

	/**
		Runs method NotesGetObject in IRIS.
		@param force as <code>Integer<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#NotesGetObject">Method NotesGetObject</A>
	*/
	public Oid NotesGetObject(Integer force) {
		String _x = irisObject.invokeString("NotesGetObject", force);
		return Oid.fromString((String) _x);
	}

	/**
		Runs method NotesGetObjectId in IRIS.
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#NotesGetObjectId">Method NotesGetObjectId</A>
	*/
	public String NotesGetObjectId() {
		return irisObject.invokeString("NotesGetObjectId");
	}

	/**
		Runs method NotesGetObjectId in IRIS.
		@param force as <code>Integer<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#NotesGetObjectId">Method NotesGetObjectId</A>
	*/
	public String NotesGetObjectId(Integer force) {
		return irisObject.invokeString("NotesGetObjectId", force);
	}

	/**
		Runs method NotesSetObject in IRIS.
		@param newvalue as <code>Oid<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#NotesSetObject">Method NotesSetObject</A>
	*/
	public void NotesSetObject(Oid newvalue) {
		irisObject.invokeVoid("NotesSetObject", newvalue == null ? null : newvalue.getData());
	}

	/**
		Runs method NotesSetObjectId in IRIS.
		@param newid as <code>String<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#NotesSetObjectId">Method NotesSetObjectId</A>
	*/
	public void NotesSetObjectId(String newid) {
		irisObject.invokeVoid("NotesSetObjectId", newid);
	}

	/**
		Returns value of property <code>Picture<code>.
		<p>Description: A picture of the employee</p>
		@return current value of <code>Picture</code> as <code>com.intersystems.binding.InputStream</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#Picture">Picture</A>
	*/
	public com.intersystems.binding.InputStream getPictureIn() {
		return new com.intersystems.binding.InputStream((IRISObject)irisObject.get("Picture"), db);
	}

	/**
		Sets new value for property <code>Picture<code>.
		<p>Description: A picture of the employee</p>
		@param _val new value to be set as <code>com.intersystems.binding.OutputStream</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#Picture">Picture</A>
	*/
	public com.intersystems.binding.OutputStream getPictureOut() {
		return new com.intersystems.binding.OutputStream((IRISObject)irisObject.get("Picture"), db);
	}

	/**
		Runs method PictureIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#PictureIsValid">Method PictureIsValid</A>
	*/
	public static void PictureIsValid(Database db, String _val) throws SQLException {
		PictureIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void PictureIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "PictureIsValid", _val);
	}

	/**
		Runs method PictureGetObject in IRIS.
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#PictureGetObject">Method PictureGetObject</A>
	*/
	public Oid PictureGetObject() {
		String _x = irisObject.invokeString("PictureGetObject");
		return Oid.fromString((String) _x);
	}

	/**
		Runs method PictureGetObject in IRIS.
		@param force as <code>Integer<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#PictureGetObject">Method PictureGetObject</A>
	*/
	public Oid PictureGetObject(Integer force) {
		String _x = irisObject.invokeString("PictureGetObject", force);
		return Oid.fromString((String) _x);
	}

	/**
		Runs method PictureGetObjectId in IRIS.
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#PictureGetObjectId">Method PictureGetObjectId</A>
	*/
	public String PictureGetObjectId() {
		return irisObject.invokeString("PictureGetObjectId");
	}

	/**
		Runs method PictureGetObjectId in IRIS.
		@param force as <code>Integer<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#PictureGetObjectId">Method PictureGetObjectId</A>
	*/
	public String PictureGetObjectId(Integer force) {
		return irisObject.invokeString("PictureGetObjectId", force);
	}

	/**
		Runs method PictureSetObject in IRIS.
		@param newvalue as <code>Oid<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#PictureSetObject">Method PictureSetObject</A>
	*/
	public void PictureSetObject(Oid newvalue) {
		irisObject.invokeVoid("PictureSetObject", newvalue == null ? null : newvalue.getData());
	}

	/**
		Runs method PictureSetObjectId in IRIS.
		@param newid as <code>String<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#PictureSetObjectId">Method PictureSetObjectId</A>
	*/
	public void PictureSetObjectId(String newid) {
		irisObject.invokeVoid("PictureSetObjectId", newid);
	}

	/**
		Returns value of property <code>Salary<code>.
		<p>Description: The employee's current salary.</p>
		@return current value of <code>Salary</code> as <code>Integer</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#Salary">Salary</A>
	*/
	public Integer getSalary() {
		Long _x = irisObject.getLong("Salary");
		return Util.IntegerJavaFormat(_x);
	}

	/**
		Sets new value for property <code>Salary<code>.
		<p>Description: The employee's current salary.</p>
		@param _val new value to be set as <code>Integer</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#Salary">Salary</A>
	*/
	public void setSalary(Integer _val) {
		irisObject.set("Salary", _val);
	}

	/**
		Runs method SalaryIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#SalaryIsValid">Method SalaryIsValid</A>
	*/
	public static void SalaryIsValid(Database db, String _val) throws SQLException {
		SalaryIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void SalaryIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "SalaryIsValid", _val);
	}

	/**
		Runs method SalaryDisplayToLogical in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#SalaryDisplayToLogical">Method SalaryDisplayToLogical</A>
	*/
	public static Integer SalaryDisplayToLogical(Database db, String _val) throws SQLException {
		return SalaryDisplayToLogical((IRISConnection)db.getConnection(), _val);
	}

	public static Integer SalaryDisplayToLogical(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		Long _x = iris.classMethodLong(IRIS_CLASS_NAME, "SalaryDisplayToLogical", _val);
		return Util.IntegerJavaFormat(_x);
	}

	/**
		Runs method SalaryLogicalToDisplay in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#SalaryLogicalToDisplay">Method SalaryLogicalToDisplay</A>
	*/
	public static String SalaryLogicalToDisplay(Database db, Integer _val) throws SQLException {
		return SalaryLogicalToDisplay((IRISConnection)db.getConnection(), _val);
	}

	public static String SalaryLogicalToDisplay(IRISConnection connection, Integer _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "SalaryLogicalToDisplay", _val);
	}

	/**
		Returns value of property <code>Title<code>.
		<p>Description: The employee's job title.</p>
		@return current value of <code>Title</code> as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#Title">Title</A>
	*/
	public String getTitle() {
		return irisObject.getString("Title");
	}

	/**
		Sets new value for property <code>Title<code>.
		<p>Description: The employee's job title.</p>
		@param _val new value to be set as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#Title">Title</A>
	*/
	public void setTitle(String _val) {
		irisObject.set("Title", _val);
	}

	/**
		Runs method TitleIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#TitleIsValid">Method TitleIsValid</A>
	*/
	public static void TitleIsValid(Database db, String _val) throws SQLException {
		TitleIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void TitleIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "TitleIsValid", _val);
	}

	/**
		Runs method TitleDisplayToLogical in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#TitleDisplayToLogical">Method TitleDisplayToLogical</A>
	*/
	public static String TitleDisplayToLogical(Database db, String _val) throws SQLException {
		return TitleDisplayToLogical((IRISConnection)db.getConnection(), _val);
	}

	public static String TitleDisplayToLogical(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "TitleDisplayToLogical", _val);
	}

	/**
		Runs method TitleLogicalToDisplay in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#TitleLogicalToDisplay">Method TitleLogicalToDisplay</A>
	*/
	public static String TitleLogicalToDisplay(Database db, String _val) throws SQLException {
		return TitleLogicalToDisplay((IRISConnection)db.getConnection(), _val);
	}

	public static String TitleLogicalToDisplay(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "TitleLogicalToDisplay", _val);
	}

	/**
		Runs method IDKEYDelete in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param K1 as <code>String<code>
		@param concurrency as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#IDKEYDelete">Method IDKEYDelete</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#IDKEYDelete">Method IDKEYDelete</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#IDKEYExists">Method IDKEYExists</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#IDKEYExists">Method IDKEYExists</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#IDKEYOpen">Method IDKEYOpen</A>
	*/
	public static Sample.Employee IDKEYOpen(Database db, String K1, Integer concurrency, com.intersystems.binding.IRISReference sc) throws SQLException {
		Sample.Employee obj = IDKEYOpen((IRISConnection)db.getConnection(), K1, concurrency, sc);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Employee IDKEYOpen(IRISConnection connection, String K1, Integer concurrency, com.intersystems.binding.IRISReference sc) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "IDKEYOpen", K1, concurrency, sc);
		return _x == null ? null : new Sample.Employee(_x);
	}

	/**
		Runs method IDKEYOpen in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param K1 as <code>String<code>
		@param concurrency as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#IDKEYOpen">Method IDKEYOpen</A>
	*/
	public static Sample.Employee IDKEYOpen(Database db, String K1, Integer concurrency) throws SQLException {
		Sample.Employee obj = IDKEYOpen((IRISConnection)db.getConnection(), K1, concurrency);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Employee IDKEYOpen(IRISConnection connection, String K1, Integer concurrency) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "IDKEYOpen", K1, concurrency);
		return _x == null ? null : new Sample.Employee(_x);
	}

	/**
		Runs method IDKEYOpen in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param K1 as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#IDKEYOpen">Method IDKEYOpen</A>
	*/
	public static Sample.Employee IDKEYOpen(Database db, String K1) throws SQLException {
		Sample.Employee obj = IDKEYOpen((IRISConnection)db.getConnection(), K1);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Employee IDKEYOpen(IRISConnection connection, String K1) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "IDKEYOpen", K1);
		return _x == null ? null : new Sample.Employee(_x);
	}

	/**
		Runs method NameIDXExists in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param Name as <code>String<code>
		@param id as <code>com.intersystems.binding.IRISReference<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#NameIDXExists">Method NameIDXExists</A>
	*/
	public static Boolean NameIDXExists(Database db, String Name, com.intersystems.binding.IRISReference id) throws SQLException {
		return NameIDXExists((IRISConnection)db.getConnection(), Name, id);
	}

	public static Boolean NameIDXExists(IRISConnection connection, String Name, com.intersystems.binding.IRISReference id) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodBoolean(IRIS_CLASS_NAME, "NameIDXExists", Name, id);
	}

	/**
		Runs method NameIDXExists in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param Name as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#NameIDXExists">Method NameIDXExists</A>
	*/
	public static Boolean NameIDXExists(Database db, String Name) throws SQLException {
		return NameIDXExists((IRISConnection)db.getConnection(), Name);
	}

	public static Boolean NameIDXExists(IRISConnection connection, String Name) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodBoolean(IRIS_CLASS_NAME, "NameIDXExists", Name);
	}

	/**
		Runs method SSNKeyDelete in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param SSN as <code>String<code>
		@param concurrency as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#SSNKeyDelete">Method SSNKeyDelete</A>
	*/
	public static void SSNKeyDelete(Database db, String SSN, Integer concurrency) throws SQLException {
		SSNKeyDelete((IRISConnection)db.getConnection(), SSN, concurrency);
	}

	public static void SSNKeyDelete(IRISConnection connection, String SSN, Integer concurrency) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "SSNKeyDelete", SSN, concurrency);
	}

	/**
		Runs method SSNKeyDelete in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param SSN as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#SSNKeyDelete">Method SSNKeyDelete</A>
	*/
	public static void SSNKeyDelete(Database db, String SSN) throws SQLException {
		SSNKeyDelete((IRISConnection)db.getConnection(), SSN);
	}

	public static void SSNKeyDelete(IRISConnection connection, String SSN) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "SSNKeyDelete", SSN);
	}

	/**
		Runs method SSNKeyExists in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param SSN as <code>String<code>
		@param id as <code>com.intersystems.binding.IRISReference<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#SSNKeyExists">Method SSNKeyExists</A>
	*/
	public static Boolean SSNKeyExists(Database db, String SSN, com.intersystems.binding.IRISReference id) throws SQLException {
		return SSNKeyExists((IRISConnection)db.getConnection(), SSN, id);
	}

	public static Boolean SSNKeyExists(IRISConnection connection, String SSN, com.intersystems.binding.IRISReference id) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodBoolean(IRIS_CLASS_NAME, "SSNKeyExists", SSN, id);
	}

	/**
		Runs method SSNKeyExists in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param SSN as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#SSNKeyExists">Method SSNKeyExists</A>
	*/
	public static Boolean SSNKeyExists(Database db, String SSN) throws SQLException {
		return SSNKeyExists((IRISConnection)db.getConnection(), SSN);
	}

	public static Boolean SSNKeyExists(IRISConnection connection, String SSN) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodBoolean(IRIS_CLASS_NAME, "SSNKeyExists", SSN);
	}

	/**
		Runs method SSNKeyOpen in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param SSN as <code>String<code>
		@param concurrency as <code>Integer<code>
		@param sc as <code>com.intersystems.binding.IRISReference<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#SSNKeyOpen">Method SSNKeyOpen</A>
	*/
	public static Sample.Employee SSNKeyOpen(Database db, String SSN, Integer concurrency, com.intersystems.binding.IRISReference sc) throws SQLException {
		Sample.Employee obj = SSNKeyOpen((IRISConnection)db.getConnection(), SSN, concurrency, sc);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Employee SSNKeyOpen(IRISConnection connection, String SSN, Integer concurrency, com.intersystems.binding.IRISReference sc) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "SSNKeyOpen", SSN, concurrency, sc);
		return _x == null ? null : new Sample.Employee(_x);
	}

	/**
		Runs method SSNKeyOpen in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param SSN as <code>String<code>
		@param concurrency as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#SSNKeyOpen">Method SSNKeyOpen</A>
	*/
	public static Sample.Employee SSNKeyOpen(Database db, String SSN, Integer concurrency) throws SQLException {
		Sample.Employee obj = SSNKeyOpen((IRISConnection)db.getConnection(), SSN, concurrency);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Employee SSNKeyOpen(IRISConnection connection, String SSN, Integer concurrency) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "SSNKeyOpen", SSN, concurrency);
		return _x == null ? null : new Sample.Employee(_x);
	}

	/**
		Runs method SSNKeyOpen in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param SSN as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Employee#SSNKeyOpen">Method SSNKeyOpen</A>
	*/
	public static Sample.Employee SSNKeyOpen(Database db, String SSN) throws SQLException {
		Sample.Employee obj = SSNKeyOpen((IRISConnection)db.getConnection(), SSN);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Employee SSNKeyOpen(IRISConnection connection, String SSN) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "SSNKeyOpen", SSN);
		return _x == null ? null : new Sample.Employee(_x);
	}

	/**
		Returns a CallableStatement for query ByName.
		<p>Description: A sample class query that defines a result set that returns Person data 
ordered by <property>Name</property>.<br>
This query can be used within another method (using 
dynamic SQL), or it can be used from Java.<br>
This query is also accessible from JDBC and/or ODBC as the SQL stored procedure 
<b>SP_Sample_By_Name</b>.</p>
		@param db <code>Database</code> instance to connect with IRIS database
		@throws java.sql.SQLException in case of error
	*/
	public static com.intersystems.binding.IRISQuery query_ByName(Database db) throws SQLException {
		return query_ByName((IRISConnection)db.getConnection());
	}

	public static com.intersystems.binding.IRISQuery query_ByName(IRISConnection connection) throws SQLException {
		return new com.intersystems.binding.IRISQuery(connection, "Sample.Employee_ByName", 1);
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
		return new com.intersystems.binding.IRISQuery(connection, "Sample.Employee_Extent", 0);
	}

}
