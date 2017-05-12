package jvm.command.item.impl;

import jvm.classfile.ClassFile;
import jvm.classfile.ConstantPool;
import jvm.command.CommandIterator;
import jvm.command.item.TwoOperandCmd;

public class NewCmd extends TwoOperandCmd {

    public NewCmd(ClassFile clzFile, String opCode, CommandIterator iterator) {
        super(clzFile, opCode, iterator);
    }

    @Override
    public String toString(ConstantPool pool) {

        return super.getOperandAsClassInfo(pool);
    }
}
