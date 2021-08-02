package edu.tec.ic6821.fulltextsearch.indexer.tokenizer;

import java.io.File;
import java.util.Optional;

public final class PdfFileTokenizerFactory implements FileTokenizerFactory {
    @Override
    public Optional<FileTokenizer> fileTokenizer(File file) {
        return Optional.of(new PdfFileTokenizer(file));
    }
}
