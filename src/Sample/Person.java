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
 * Java class generated for IRIS class Sample.Person on version IRIS for Windows (x86-64) 2021.1 (Build 215U) Wed Jun 9 2021 09:39:22 EDT.<br>
 * Description: Use or operation of this code is subject to acceptance of the license available in the code repository for this code.
This sample persistent class represents a person.
 * @see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person</A>
**/
public class Person extends Persistent {
	private static final long serialVersionUID = 6570;
	public static String IRIS_CLASS_NAME = "Sample.Person";

	static {
		ClassnameMap cMap = ClassnameMap.getInstance();
		cMap.putJavaClass(IRIS_CLASS_NAME, Person.class);
	}

	/**
		This constructor is NOT for use in application. It is called by binding code.
	*/
	public Person(IRISObject irisObjectNew) {
		super(irisObjectNew);
	}
	/**
		This constructor is NOT for use in application. It is called by binding code.
	*/
	public Person(IRISObject irisObjectNew, Database db) {
		super(irisObjectNew, db);
	}

	/**
		Creates a new instance of class "Sample.Person" in IRIS database
		and a corresponding instance of class <code>Sample.Person</code>.
		@param db <code>Database</code> instance to connect with IRIS database
		@throws java.sql.SQLException in case of error
	*/
	public Person(Database db) throws SQLException {
		this((IRISConnection)db.getConnection());
		setDatabase(db);
	}

	public Person(IRISConnection connection) throws SQLException {
		super((IRISObject) IRIS.createIRIS(connection).classMethodObject(IRIS_CLASS_NAME, "%New"));
	}

	/**
		Runs IRIS method <code>%OpenId</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Person</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Person</code> or any of its subclasses.
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
		return new Person(irisObjectNew);
	}

	/**
		Runs IRIS method <code>%OpenId</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Person</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Person</code> or any of its subclasses.
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
		and creates corresponding object of class <code>Sample.Person</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Person</code> or any of its subclasses.
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
		return new Person(irisObjectNew);
	}

	/**
		Runs IRIS method <code>%OpenId</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Person</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Person</code> or any of its subclasses.
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
		and creates corresponding object of class <code>Sample.Person</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Person</code> or any of its subclasses.
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
		return new Person(irisObjectNew);
	}

	/**
		Runs IRIS method <code>%Open</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Person</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Person</code> or any of its subclasses.
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
		and creates corresponding object of class <code>Sample.Person</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Person</code> or any of its subclasses.
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
		return new Person(irisObjectNew);
	}

	/**
		Runs IRIS method <code>%Open</code> to open an object in IRIS database
		and creates corresponding object of class <code>Sample.Person</code>.
		@return <code>RegisteredObject</code> corresponding to opened object
		This object may be of type <code>Sample.Person</code> or any of its subclasses.
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
		Opens all instances of class Sample.Person that satisfy given simple condition, specified in SQL syntax.
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
		String sql= "SELECT %ID FROM Sample.Person WHERE " + condition;
		java.sql.PreparedStatement statement = connection.prepareStatement(sql);
		for (int i = 0;i < args.length;i++)
			statement.setObject(i + 1, args[i]);
		java.sql.ResultSet rs = statement.executeQuery();

		java.util.List<Person> list = new java.util.ArrayList<Person>();
		while (rs.next())
			list.add((Person)Person._open(connection, new Id(rs.getInt(1))));

		return list.iterator();
	}

	/**
		Opens all instances of class Sample.Person that satisfy given simple condition, specified in SQL syntax.
		@return Iterator as <code>java.util.Iterator</code> that iterates over all opened objects in specified order.
		@param db <code>Database</code> to connect with server
		@param condition Simple condition on objects, in SQL syntax.
		It can refer only to properties of a single object.
	*/
	public static java.util.Iterator openByQuery(Database db, String condition) throws SQLException {
		return openByQuery((IRISConnection)db.getConnection(), condition);
	}

	public static java.util.Iterator openByQuery(IRISConnection connection, String condition) throws SQLException {
		String sql= "SELECT %ID FROM Sample.Person WHERE " + condition;
		java.sql.PreparedStatement statement = connection.prepareStatement(sql);
		java.sql.ResultSet rs = statement.executeQuery();

		java.util.List<Person> list = new java.util.ArrayList<Person>();
		while (rs.next())
			list.add((Person)Person._open(connection, new Id(rs.getInt(1))));

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
		Returns name of class Sample.Person as it is in IRIS database.
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%ClassName">Method %ClassName</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%ComposeOid">Method %ComposeOid</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%Delete">Method %Delete</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%Delete">Method %Delete</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%DeleteExtent">Method %DeleteExtent</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%DeleteId">Method %DeleteId</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%DeleteId">Method %DeleteId</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%Exists">Method %Exists</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%ExistsId">Method %ExistsId</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%IsA">Method %IsA</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%IsNull">Method %IsNull</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%KillExtent">Method %KillExtent</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%KillExtent">Method %KillExtent</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%KillExtent">Method %KillExtent</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%ObjectIsNull">Method %ObjectIsNull</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%SaveIndices">Method %SaveIndices</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%SaveIndices">Method %SaveIndices</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%SaveIndices">Method %SaveIndices</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#%SaveIndices">Method %SaveIndices</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#CurrentAge">Method CurrentAge</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#CurrentAge">Method CurrentAge</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#Populate">Method Populate</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#Populate">Method Populate</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#Populate">Method Populate</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#Populate">Method Populate</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#Populate">Method Populate</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#Populate">Method Populate</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#Populate">Method Populate</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#PopulateSerial">Method PopulateSerial</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#Random">Method Random</A>
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
		Returns value of property <code>Age<code>.
		<p>Description: Person's age.<br>
This is a calculated field whose value is derived from <property>DOB</property>.</p>
		@return current value of <code>Age</code> as <code>Integer</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#Age">Age</A>
	*/
	public Integer getAge() {
		Long _x = irisObject.getLong("Age");
		return Util.IntegerJavaFormat(_x);
	}

	/**
		Runs method AgeIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#AgeIsValid">Method AgeIsValid</A>
	*/
	public static void AgeIsValid(Database db, String _val) throws SQLException {
		AgeIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void AgeIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "AgeIsValid", _val);
	}

	/**
		Runs method AgeDisplayToLogical in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#AgeDisplayToLogical">Method AgeDisplayToLogical</A>
	*/
	public static Integer AgeDisplayToLogical(Database db, String _val) throws SQLException {
		return AgeDisplayToLogical((IRISConnection)db.getConnection(), _val);
	}

	public static Integer AgeDisplayToLogical(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		Long _x = iris.classMethodLong(IRIS_CLASS_NAME, "AgeDisplayToLogical", _val);
		return Util.IntegerJavaFormat(_x);
	}

	/**
		Runs method AgeLogicalToDisplay in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#AgeLogicalToDisplay">Method AgeLogicalToDisplay</A>
	*/
	public static String AgeLogicalToDisplay(Database db, Integer _val) throws SQLException {
		return AgeLogicalToDisplay((IRISConnection)db.getConnection(), _val);
	}

	public static String AgeLogicalToDisplay(IRISConnection connection, Integer _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "AgeLogicalToDisplay", _val);
	}

	/**
		Returns value of property <code>DOB<code>.
		<p>Description: Person's Date of Birth.</p>
		@return current value of <code>DOB</code> as <code>java.sql.Date</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#DOB">DOB</A>
	*/
	public java.sql.Date getDOB() {
		Long _x = irisObject.getLong("DOB");
		return Util.DateJavaFormat(_x);
	}

	/**
		Sets new value for property <code>DOB<code>.
		<p>Description: Person's Date of Birth.</p>
		@param _val new value to be set as <code>java.sql.Date</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#DOB">DOB</A>
	*/
	public void setDOB(java.sql.Date _val) {
		irisObject.set("DOB", Util.DateIRISFormat(_val));
	}

	public static void DOBIsValid(Database db, String _val) throws SQLException {
		DOBIsValid((IRISConnection)db.getConnection(), _val);
	}
	
	public static void DOBIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "DOBIsValid", Util.DateIRISFormat(_val));
	}
	
	/**
		Runs method DOBDisplayToLogical in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#DOBDisplayToLogical">Method DOBDisplayToLogical</A>
	*/
	public static java.sql.Date DOBDisplayToLogical(Database db, String _val) throws SQLException {
		return DOBDisplayToLogical((IRISConnection)db.getConnection(), _val);
	}

	public static java.sql.Date DOBDisplayToLogical(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		Long _x = iris.classMethodLong(IRIS_CLASS_NAME, "DOBDisplayToLogical", _val);
		return Util.DateJavaFormat(_x);
	}

	/**
		Runs method DOBLogicalToDisplay in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>java.sql.Date<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#DOBLogicalToDisplay">Method DOBLogicalToDisplay</A>
	*/
	public static String DOBLogicalToDisplay(Database db, java.sql.Date _val) throws SQLException {
		return DOBLogicalToDisplay((IRISConnection)db.getConnection(), _val);
	}

	public static String DOBLogicalToDisplay(IRISConnection connection, java.sql.Date _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "DOBLogicalToDisplay", Util.DateIRISFormat(_val));
	}

	/**
		Returns value of property <code>FavoriteColors<code>.
		<p>Description: A collection of strings representing the person's favorite colors.</p>
		@return current value of <code>FavoriteColors</code> as <code>java.util.List</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#FavoriteColors">FavoriteColors</A>
	*/
	public java.util.List getFavoriteColors() {
		IRISObject _x = (IRISObject)irisObject.getObject("FavoriteColors");
		return _x == null ? null : new com.intersystems.binding.ListOfDataTypes(_x, db, "java.lang.String");
	}

	/**
		Runs method FavoriteColorsIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#FavoriteColorsIsValid">Method FavoriteColorsIsValid</A>
	*/
	public static void FavoriteColorsIsValid(Database db, String _val) throws SQLException {
		FavoriteColorsIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void FavoriteColorsIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "FavoriteColorsIsValid", _val);
	}

	/**
		Runs method FavoriteColorsDisplayToLogical in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#FavoriteColorsDisplayToLogical">Method FavoriteColorsDisplayToLogical</A>
	*/
	public static String FavoriteColorsDisplayToLogical(Database db, String _val) throws SQLException {
		return FavoriteColorsDisplayToLogical((IRISConnection)db.getConnection(), _val);
	}

	public static String FavoriteColorsDisplayToLogical(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "FavoriteColorsDisplayToLogical", _val);
	}

	/**
		Runs method FavoriteColorsLogicalToDisplay in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#FavoriteColorsLogicalToDisplay">Method FavoriteColorsLogicalToDisplay</A>
	*/
	public static String FavoriteColorsLogicalToDisplay(Database db, String _val) throws SQLException {
		return FavoriteColorsLogicalToDisplay((IRISConnection)db.getConnection(), _val);
	}

	public static String FavoriteColorsLogicalToDisplay(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "FavoriteColorsLogicalToDisplay", _val);
	}

	/**
		Runs method FavoriteColorsGetObject in IRIS.
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#FavoriteColorsGetObject">Method FavoriteColorsGetObject</A>
	*/
	public Oid FavoriteColorsGetObject() {
		String _x = irisObject.invokeString("FavoriteColorsGetObject");
		return Oid.fromString((String) _x);
	}

	/**
		Runs method FavoriteColorsGetObject in IRIS.
		@param force as <code>Integer<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#FavoriteColorsGetObject">Method FavoriteColorsGetObject</A>
	*/
	public Oid FavoriteColorsGetObject(Integer force) {
		String _x = irisObject.invokeString("FavoriteColorsGetObject", force);
		return Oid.fromString((String) _x);
	}

	/**
		Runs method FavoriteColorsGetObjectId in IRIS.
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#FavoriteColorsGetObjectId">Method FavoriteColorsGetObjectId</A>
	*/
	public String FavoriteColorsGetObjectId() {
		return irisObject.invokeString("FavoriteColorsGetObjectId");
	}

	/**
		Runs method FavoriteColorsGetObjectId in IRIS.
		@param force as <code>Integer<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#FavoriteColorsGetObjectId">Method FavoriteColorsGetObjectId</A>
	*/
	public String FavoriteColorsGetObjectId(Integer force) {
		return irisObject.invokeString("FavoriteColorsGetObjectId", force);
	}

	/**
		Runs method FavoriteColorsSetObject in IRIS.
		@param newvalue as <code>Oid<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#FavoriteColorsSetObject">Method FavoriteColorsSetObject</A>
	*/
	public void FavoriteColorsSetObject(Oid newvalue) {
		irisObject.invokeVoid("FavoriteColorsSetObject", newvalue == null ? null : newvalue.getData());
	}

	/**
		Runs method FavoriteColorsSetObjectId in IRIS.
		@param newid as <code>String<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#FavoriteColorsSetObjectId">Method FavoriteColorsSetObjectId</A>
	*/
	public void FavoriteColorsSetObjectId(String newid) {
		irisObject.invokeVoid("FavoriteColorsSetObjectId", newid);
	}

	/**
		Returns value of property <code>Home<code>.
		<p>Description: Person's home address. This uses an embedded object.</p>
		@return current value of <code>Home</code> as <code>Sample.Address</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#Home">Home</A>
	*/
	public Sample.Address getHome() {
		IRISObject _x = (IRISObject)irisObject.getObject("Home");
		return _x == null ? null : new Sample.Address(_x, db);
	}

	/**
		Sets new value for property <code>Home<code>.
		<p>Description: Person's home address. This uses an embedded object.</p>
		@param _val new value to be set as <code>Sample.Address</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#Home">Home</A>
	*/
	public void setHome(Sample.Address _val) {
		irisObject.set("Home", _val == null ? null : _val.getProxy());
	}

	/**
		Runs method HomeIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#HomeIsValid">Method HomeIsValid</A>
	*/
	public static void HomeIsValid(Database db, String _val) throws SQLException {
		HomeIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void HomeIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "HomeIsValid", _val);
	}

	/**
		Runs method HomeGetObject in IRIS.
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#HomeGetObject">Method HomeGetObject</A>
	*/
	public Oid HomeGetObject() {
		String _x = irisObject.invokeString("HomeGetObject");
		return Oid.fromString((String) _x);
	}

	/**
		Runs method HomeGetObject in IRIS.
		@param force as <code>Integer<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#HomeGetObject">Method HomeGetObject</A>
	*/
	public Oid HomeGetObject(Integer force) {
		String _x = irisObject.invokeString("HomeGetObject", force);
		return Oid.fromString((String) _x);
	}

	/**
		Runs method HomeGetObjectId in IRIS.
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#HomeGetObjectId">Method HomeGetObjectId</A>
	*/
	public String HomeGetObjectId() {
		return irisObject.invokeString("HomeGetObjectId");
	}

	/**
		Runs method HomeGetObjectId in IRIS.
		@param force as <code>Integer<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#HomeGetObjectId">Method HomeGetObjectId</A>
	*/
	public String HomeGetObjectId(Integer force) {
		return irisObject.invokeString("HomeGetObjectId", force);
	}

	/**
		Runs method HomeSetObject in IRIS.
		@param newvalue as <code>Oid<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#HomeSetObject">Method HomeSetObject</A>
	*/
	public void HomeSetObject(Oid newvalue) {
		irisObject.invokeVoid("HomeSetObject", newvalue == null ? null : newvalue.getData());
	}

	/**
		Runs method HomeSetObjectId in IRIS.
		@param newid as <code>String<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#HomeSetObjectId">Method HomeSetObjectId</A>
	*/
	public void HomeSetObjectId(String newid) {
		irisObject.invokeVoid("HomeSetObjectId", newid);
	}

	/**
		Returns value of property <code>Name<code>.
		<p>Description: Person's name.</p>
		@return current value of <code>Name</code> as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#Name">Name</A>
	*/
	public String getName() {
		return irisObject.getString("Name");
	}

	/**
		Sets new value for property <code>Name<code>.
		<p>Description: Person's name.</p>
		@param _val new value to be set as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#Name">Name</A>
	*/
	public void setName(String _val) {
		irisObject.set("Name", _val);
	}

	/**
		Runs method NameIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#NameIsValid">Method NameIsValid</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#NameDisplayToLogical">Method NameDisplayToLogical</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#NameLogicalToDisplay">Method NameLogicalToDisplay</A>
	*/
	public static String NameLogicalToDisplay(Database db, String _val) throws SQLException {
		return NameLogicalToDisplay((IRISConnection)db.getConnection(), _val);
	}

	public static String NameLogicalToDisplay(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "NameLogicalToDisplay", _val);
	}

	/**
		Returns value of property <code>Office<code>.
		<p>Description: Person's office address. This uses an embedded object.</p>
		@return current value of <code>Office</code> as <code>Sample.Address</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#Office">Office</A>
	*/
	public Sample.Address getOffice() {
		IRISObject _x = (IRISObject)irisObject.getObject("Office");
		return _x == null ? null : new Sample.Address(_x, db);
	}

	/**
		Sets new value for property <code>Office<code>.
		<p>Description: Person's office address. This uses an embedded object.</p>
		@param _val new value to be set as <code>Sample.Address</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#Office">Office</A>
	*/
	public void setOffice(Sample.Address _val) {
		irisObject.set("Office", _val == null ? null : _val.getProxy());
	}

	/**
		Runs method OfficeIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#OfficeIsValid">Method OfficeIsValid</A>
	*/
	public static void OfficeIsValid(Database db, String _val) throws SQLException {
		OfficeIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void OfficeIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "OfficeIsValid", _val);
	}

	/**
		Runs method OfficeGetObject in IRIS.
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#OfficeGetObject">Method OfficeGetObject</A>
	*/
	public Oid OfficeGetObject() {
		String _x = irisObject.invokeString("OfficeGetObject");
		return Oid.fromString((String) _x);
	}

	/**
		Runs method OfficeGetObject in IRIS.
		@param force as <code>Integer<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#OfficeGetObject">Method OfficeGetObject</A>
	*/
	public Oid OfficeGetObject(Integer force) {
		String _x = irisObject.invokeString("OfficeGetObject", force);
		return Oid.fromString((String) _x);
	}

	/**
		Runs method OfficeGetObjectId in IRIS.
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#OfficeGetObjectId">Method OfficeGetObjectId</A>
	*/
	public String OfficeGetObjectId() {
		return irisObject.invokeString("OfficeGetObjectId");
	}

	/**
		Runs method OfficeGetObjectId in IRIS.
		@param force as <code>Integer<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#OfficeGetObjectId">Method OfficeGetObjectId</A>
	*/
	public String OfficeGetObjectId(Integer force) {
		return irisObject.invokeString("OfficeGetObjectId", force);
	}

	/**
		Runs method OfficeSetObject in IRIS.
		@param newvalue as <code>Oid<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#OfficeSetObject">Method OfficeSetObject</A>
	*/
	public void OfficeSetObject(Oid newvalue) {
		irisObject.invokeVoid("OfficeSetObject", newvalue == null ? null : newvalue.getData());
	}

	/**
		Runs method OfficeSetObjectId in IRIS.
		@param newid as <code>String<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#OfficeSetObjectId">Method OfficeSetObjectId</A>
	*/
	public void OfficeSetObjectId(String newid) {
		irisObject.invokeVoid("OfficeSetObjectId", newid);
	}

	/**
		Returns value of property <code>SSN<code>.
		<p>Description: Person's Social Security number. This is validated using pattern match.</p>
		@return current value of <code>SSN</code> as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SSN">SSN</A>
	*/
	public String getSSN() {
		return irisObject.getString("SSN");
	}

	/**
		Sets new value for property <code>SSN<code>.
		<p>Description: Person's Social Security number. This is validated using pattern match.</p>
		@param _val new value to be set as <code>String</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SSN">SSN</A>
	*/
	public void setSSN(String _val) {
		irisObject.set("SSN", _val);
	}

	/**
		Runs method SSNIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SSNIsValid">Method SSNIsValid</A>
	*/
	public static void SSNIsValid(Database db, String _val) throws SQLException {
		SSNIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void SSNIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "SSNIsValid", _val);
	}

	/**
		Runs method SSNDisplayToLogical in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SSNDisplayToLogical">Method SSNDisplayToLogical</A>
	*/
	public static String SSNDisplayToLogical(Database db, String _val) throws SQLException {
		return SSNDisplayToLogical((IRISConnection)db.getConnection(), _val);
	}

	public static String SSNDisplayToLogical(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "SSNDisplayToLogical", _val);
	}

	/**
		Runs method SSNLogicalToDisplay in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SSNLogicalToDisplay">Method SSNLogicalToDisplay</A>
	*/
	public static String SSNLogicalToDisplay(Database db, String _val) throws SQLException {
		return SSNLogicalToDisplay((IRISConnection)db.getConnection(), _val);
	}

	public static String SSNLogicalToDisplay(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		return iris.classMethodString(IRIS_CLASS_NAME, "SSNLogicalToDisplay", _val);
	}

	/**
		Returns value of property <code>Spouse<code>.
		<p>Description: Person's spouse. This is a reference to another persistent object.</p>
		@return current value of <code>Spouse</code> as <code>Sample.Person</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#Spouse">Spouse</A>
	*/
	public Sample.Person getSpouse() {
		IRISObject _x = (IRISObject)irisObject.getObject("Spouse");
		return _x == null ? null : new Sample.Person(_x, db);
	}

	/**
		Sets new value for property <code>Spouse<code>.
		<p>Description: Person's spouse. This is a reference to another persistent object.</p>
		@param _val new value to be set as <code>Sample.Person</code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#Spouse">Spouse</A>
	*/
	public void setSpouse(Sample.Person _val) {
		irisObject.set("Spouse", _val == null ? null : _val.getProxy());
	}

	/**
		Runs method SpouseIsValid in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param _val as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SpouseIsValid">Method SpouseIsValid</A>
	*/
	public static void SpouseIsValid(Database db, String _val) throws SQLException {
		SpouseIsValid((IRISConnection)db.getConnection(), _val);
	}

	public static void SpouseIsValid(IRISConnection connection, String _val) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		iris.classMethodStatusCode(IRIS_CLASS_NAME, "SpouseIsValid", _val);
	}

	/**
		Runs method SpouseGetObject in IRIS.
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SpouseGetObject">Method SpouseGetObject</A>
	*/
	public Oid SpouseGetObject() {
		String _x = irisObject.invokeString("SpouseGetObject");
		return Oid.fromString((String) _x);
	}

	/**
		Runs method SpouseGetObject in IRIS.
		@param force as <code>Integer<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SpouseGetObject">Method SpouseGetObject</A>
	*/
	public Oid SpouseGetObject(Integer force) {
		String _x = irisObject.invokeString("SpouseGetObject", force);
		return Oid.fromString((String) _x);
	}

	/**
		Runs method SpouseGetObjectId in IRIS.
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SpouseGetObjectId">Method SpouseGetObjectId</A>
	*/
	public String SpouseGetObjectId() {
		return irisObject.invokeString("SpouseGetObjectId");
	}

	/**
		Runs method SpouseGetObjectId in IRIS.
		@param force as <code>Integer<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SpouseGetObjectId">Method SpouseGetObjectId</A>
	*/
	public String SpouseGetObjectId(Integer force) {
		return irisObject.invokeString("SpouseGetObjectId", force);
	}

	/**
		Runs method SpouseSetObject in IRIS.
		@param newvalue as <code>Oid<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SpouseSetObject">Method SpouseSetObject</A>
	*/
	public void SpouseSetObject(Oid newvalue) {
		irisObject.invokeVoid("SpouseSetObject", newvalue == null ? null : newvalue.getData());
	}

	/**
		Runs method SpouseSetObjectId in IRIS.
		@param newid as <code>String<code>
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SpouseSetObjectId">Method SpouseSetObjectId</A>
	*/
	public void SpouseSetObjectId(String newid) {
		irisObject.invokeVoid("SpouseSetObjectId", newid);
	}

	/**
		Runs method IDKEYDelete in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param K1 as <code>String<code>
		@param concurrency as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#IDKEYDelete">Method IDKEYDelete</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#IDKEYDelete">Method IDKEYDelete</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#IDKEYExists">Method IDKEYExists</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#IDKEYExists">Method IDKEYExists</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#IDKEYOpen">Method IDKEYOpen</A>
	*/
	public static Sample.Person IDKEYOpen(Database db, String K1, Integer concurrency, com.intersystems.binding.IRISReference sc) throws SQLException {
		Sample.Person obj = IDKEYOpen((IRISConnection)db.getConnection(), K1, concurrency, sc);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Person IDKEYOpen(IRISConnection connection, String K1, Integer concurrency, com.intersystems.binding.IRISReference sc) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "IDKEYOpen", K1, concurrency, sc);
		return _x == null ? null : new Sample.Person(_x);
	}

	/**
		Runs method IDKEYOpen in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param K1 as <code>String<code>
		@param concurrency as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#IDKEYOpen">Method IDKEYOpen</A>
	*/
	public static Sample.Person IDKEYOpen(Database db, String K1, Integer concurrency) throws SQLException {
		Sample.Person obj = IDKEYOpen((IRISConnection)db.getConnection(), K1, concurrency);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Person IDKEYOpen(IRISConnection connection, String K1, Integer concurrency) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "IDKEYOpen", K1, concurrency);
		return _x == null ? null : new Sample.Person(_x);
	}

	/**
		Runs method IDKEYOpen in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param K1 as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#IDKEYOpen">Method IDKEYOpen</A>
	*/
	public static Sample.Person IDKEYOpen(Database db, String K1) throws SQLException {
		Sample.Person obj = IDKEYOpen((IRISConnection)db.getConnection(), K1);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Person IDKEYOpen(IRISConnection connection, String K1) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "IDKEYOpen", K1);
		return _x == null ? null : new Sample.Person(_x);
	}

	/**
		Runs method NameIDXExists in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param Name as <code>String<code>
		@param id as <code>com.intersystems.binding.IRISReference<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#NameIDXExists">Method NameIDXExists</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#NameIDXExists">Method NameIDXExists</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SSNKeyDelete">Method SSNKeyDelete</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SSNKeyDelete">Method SSNKeyDelete</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SSNKeyExists">Method SSNKeyExists</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SSNKeyExists">Method SSNKeyExists</A>
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
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SSNKeyOpen">Method SSNKeyOpen</A>
	*/
	public static Sample.Person SSNKeyOpen(Database db, String SSN, Integer concurrency, com.intersystems.binding.IRISReference sc) throws SQLException {
		Sample.Person obj = SSNKeyOpen((IRISConnection)db.getConnection(), SSN, concurrency, sc);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Person SSNKeyOpen(IRISConnection connection, String SSN, Integer concurrency, com.intersystems.binding.IRISReference sc) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "SSNKeyOpen", SSN, concurrency, sc);
		return _x == null ? null : new Sample.Person(_x);
	}

	/**
		Runs method SSNKeyOpen in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param SSN as <code>String<code>
		@param concurrency as <code>Integer<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SSNKeyOpen">Method SSNKeyOpen</A>
	*/
	public static Sample.Person SSNKeyOpen(Database db, String SSN, Integer concurrency) throws SQLException {
		Sample.Person obj = SSNKeyOpen((IRISConnection)db.getConnection(), SSN, concurrency);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Person SSNKeyOpen(IRISConnection connection, String SSN, Integer concurrency) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "SSNKeyOpen", SSN, concurrency);
		return _x == null ? null : new Sample.Person(_x);
	}

	/**
		Runs method SSNKeyOpen in IRIS.
		@param db <code>Database</code> instance to connect with IRIS database
		@param SSN as <code>String<code>
		@throws java.sql.SQLException in case of error
		@see <a href = "localhost:52773/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Person#SSNKeyOpen">Method SSNKeyOpen</A>
	*/
	public static Sample.Person SSNKeyOpen(Database db, String SSN) throws SQLException {
		Sample.Person obj = SSNKeyOpen((IRISConnection)db.getConnection(), SSN);
		obj.setDatabase(db);
		return obj;
	}

	public static Sample.Person SSNKeyOpen(IRISConnection connection, String SSN) throws SQLException {
		IRIS iris = IRIS.createIRIS(connection);
		IRISObject _x = (IRISObject)iris.classMethodObject(IRIS_CLASS_NAME, "SSNKeyOpen", SSN);
		return _x == null ? null : new Sample.Person(_x);
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
		return new com.intersystems.binding.IRISQuery(connection, "Sample.SP_Sample_By_Name", 1);
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
		return new com.intersystems.binding.IRISQuery(connection, "Sample.Person_Extent", 0);
	}

}
