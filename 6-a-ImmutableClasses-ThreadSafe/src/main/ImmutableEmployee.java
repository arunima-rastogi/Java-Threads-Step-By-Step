package main;

//Using Builder Pattern
public class ImmutableEmployee {

	private final String name;
	private final String city;

	private ImmutableEmployee(Builder builder) {
		this.name = builder.name;
		this.city = builder.city;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public Builder toBuilder() {
		return new Builder(this);
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {

		private String name;
		private String city;

		public Builder() {
		}

		public Builder(ImmutableEmployee employee) {
			this.name = employee.name;
			this.city = employee.city;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setCity(String city) {
			this.city = city;
			return this;
		}

		public ImmutableEmployee build() {
			return new ImmutableEmployee(this);
		}
	}

}


/**
>Class:  final
>All Fields : Private and Final
>1 parametrized and Getter Methods (No setter Methods)

Note : If Immutable Class has Non-Immutable reference Object  :https://codepumpkin.com/immutable-class-with-mutable-member-fields-in-java/

in its Getter method : return address.clone() 

Address Class must implement clonable Interface





**/
