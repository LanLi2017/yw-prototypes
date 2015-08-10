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
import org.yesworkflow.db.jooq.tables.records.ChannelRecord;


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
public class Channel extends TableImpl<ChannelRecord> {

	private static final long serialVersionUID = -1524339443;

	/**
	 * The reference instance of <code>channel</code>
	 */
	public static final Channel CHANNEL = new Channel();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ChannelRecord> getRecordType() {
		return ChannelRecord.class;
	}

	/**
	 * The column <code>channel.id</code>.
	 */
	public final TableField<ChannelRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>channel.data_id</code>.
	 */
	public final TableField<ChannelRecord, Integer> DATA_ID = createField("data_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>channel.out_port_id</code>.
	 */
	public final TableField<ChannelRecord, Integer> OUT_PORT_ID = createField("out_port_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>channel.in_port_id</code>.
	 */
	public final TableField<ChannelRecord, Integer> IN_PORT_ID = createField("in_port_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>channel.is_inflow</code>.
	 */
	public final TableField<ChannelRecord, Boolean> IS_INFLOW = createField("is_inflow", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>channel.is_outflow</code>.
	 */
	public final TableField<ChannelRecord, Boolean> IS_OUTFLOW = createField("is_outflow", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * Create a <code>channel</code> table reference
	 */
	public Channel() {
		this("channel", null);
	}

	/**
	 * Create an aliased <code>channel</code> table reference
	 */
	public Channel(String alias) {
		this(alias, CHANNEL);
	}

	private Channel(String alias, Table<ChannelRecord> aliased) {
		this(alias, aliased, null);
	}

	private Channel(String alias, Table<ChannelRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ChannelRecord> getPrimaryKey() {
		return Keys.PK_CHANNEL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ChannelRecord>> getKeys() {
		return Arrays.<UniqueKey<ChannelRecord>>asList(Keys.PK_CHANNEL);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<ChannelRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<ChannelRecord, ?>>asList(Keys.FK_CHANNEL_DATA_1, Keys.FK_CHANNEL_PORT_2, Keys.FK_CHANNEL_PORT_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Channel as(String alias) {
		return new Channel(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Channel rename(String name) {
		return new Channel(name, null);
	}
}
