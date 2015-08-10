/**
 * This class is generated by jOOQ
 */
package org.yesworkflow.db.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.yesworkflow.db.jooq.DefaultSchema;
import org.yesworkflow.db.jooq.Keys;
import org.yesworkflow.db.jooq.tables.records.UriVariableRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UriVariable extends TableImpl<UriVariableRecord> {

	private static final long serialVersionUID = 1446297246;

	/**
	 * The reference instance of <code>uri_variable</code>
	 */
	public static final UriVariable URI_VARIABLE = new UriVariable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UriVariableRecord> getRecordType() {
		return UriVariableRecord.class;
	}

	/**
	 * The column <code>uri_variable.id</code>.
	 */
	public final TableField<UriVariableRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>uri_variable.port_id</code>.
	 */
	public final TableField<UriVariableRecord, Integer> PORT_ID = createField("port_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>uri_variable.name</code>.
	 */
	public final TableField<UriVariableRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>uri_variable</code> table reference
	 */
	public UriVariable() {
		this("uri_variable", null);
	}

	/**
	 * Create an aliased <code>uri_variable</code> table reference
	 */
	public UriVariable(String alias) {
		this(alias, URI_VARIABLE);
	}

	private UriVariable(String alias, Table<UriVariableRecord> aliased) {
		this(alias, aliased, null);
	}

	private UriVariable(String alias, Table<UriVariableRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<UriVariableRecord> getPrimaryKey() {
		return Keys.PK_URI_VARIABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<UriVariableRecord>> getKeys() {
		return Arrays.<UniqueKey<UriVariableRecord>>asList(Keys.PK_URI_VARIABLE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<UriVariableRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<UriVariableRecord, ?>>asList(Keys.FK_URI_VARIABLE_PORT_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UriVariable as(String alias) {
		return new UriVariable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public UriVariable rename(String name) {
		return new UriVariable(name, null);
	}
}
