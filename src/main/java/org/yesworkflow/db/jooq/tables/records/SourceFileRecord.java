/**
 * This class is generated by jOOQ
 */
package org.yesworkflow.db.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.yesworkflow.db.jooq.tables.SourceFile;


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
public class SourceFileRecord extends UpdatableRecordImpl<SourceFileRecord> implements Record2<Integer, String> {

	private static final long serialVersionUID = 1056718097;

	/**
	 * Setter for <code>source_file.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>source_file.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>source_file.path</code>.
	 */
	public void setPath(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>source_file.path</code>.
	 */
	public String getPath() {
		return (String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return SourceFile.SOURCE_FILE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return SourceFile.SOURCE_FILE.PATH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getPath();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SourceFileRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SourceFileRecord value2(String value) {
		setPath(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SourceFileRecord values(Integer value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SourceFileRecord
	 */
	public SourceFileRecord() {
		super(SourceFile.SOURCE_FILE);
	}

	/**
	 * Create a detached, initialised SourceFileRecord
	 */
	public SourceFileRecord(Integer id, String path) {
		super(SourceFile.SOURCE_FILE);

		setValue(0, id);
		setValue(1, path);
	}
}
