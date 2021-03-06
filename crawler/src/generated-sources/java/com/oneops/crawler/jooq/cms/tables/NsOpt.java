/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables;


import com.oneops.crawler.jooq.cms.Indexes;
import com.oneops.crawler.jooq.cms.Keys;
import com.oneops.crawler.jooq.cms.Kloopzcm;
import com.oneops.crawler.jooq.cms.tables.records.NsOptRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NsOpt extends TableImpl<NsOptRecord> {

    private static final long serialVersionUID = -149195027;

    /**
     * The reference instance of <code>kloopzcm.ns_opt</code>
     */
    public static final NsOpt NS_OPT = new NsOpt();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NsOptRecord> getRecordType() {
        return NsOptRecord.class;
    }

    /**
     * The column <code>kloopzcm.ns_opt.ci_id</code>.
     */
    public final TableField<NsOptRecord, Long> CI_ID = createField("ci_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.ns_opt.ns_id</code>.
     */
    public final TableField<NsOptRecord, Long> NS_ID = createField("ns_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.ns_opt.created</code>.
     */
    public final TableField<NsOptRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>kloopzcm.ns_opt</code> table reference
     */
    public NsOpt() {
        this(DSL.name("ns_opt"), null);
    }

    /**
     * Create an aliased <code>kloopzcm.ns_opt</code> table reference
     */
    public NsOpt(String alias) {
        this(DSL.name(alias), NS_OPT);
    }

    /**
     * Create an aliased <code>kloopzcm.ns_opt</code> table reference
     */
    public NsOpt(Name alias) {
        this(alias, NS_OPT);
    }

    private NsOpt(Name alias, Table<NsOptRecord> aliased) {
        this(alias, aliased, null);
    }

    private NsOpt(Name alias, Table<NsOptRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Kloopzcm.KLOOPZCM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.NS_OPT_NS_ID_IDX, Indexes.NS_OPT_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<NsOptRecord> getPrimaryKey() {
        return Keys.NS_OPT_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<NsOptRecord>> getKeys() {
        return Arrays.<UniqueKey<NsOptRecord>>asList(Keys.NS_OPT_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<NsOptRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<NsOptRecord, ?>>asList(Keys.NS_OPT__NS_PATH_NS_OPT_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NsOpt as(String alias) {
        return new NsOpt(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NsOpt as(Name alias) {
        return new NsOpt(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public NsOpt rename(String name) {
        return new NsOpt(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public NsOpt rename(Name name) {
        return new NsOpt(name, null);
    }
}
