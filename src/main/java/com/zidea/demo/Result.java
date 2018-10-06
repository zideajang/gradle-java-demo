package com.zidea.demo;

public interface Result {

    public class Success implements Result {
    }

    public class Failure implements Result {
        private final String errorMessage;

        public Failure(String s) {
            this.errorMessage = s;
        }

        /**
         * @return the errorMessage
         */
        public String getErrorMessage() {
            return errorMessage;
        }

    }
}