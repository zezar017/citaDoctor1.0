public class citasDoctor {
    private int doctorId;
    private String doctorNombre;
    private String doctorEspecialidad;

    // Constructor
    public citasDoctor(int doctorId, String doctorNombre, String doctorEspecialidad) {
        this.doctorId = doctorId;
        this.doctorNombre = doctorNombre;
        this.doctorEspecialidad = doctorEspecialidad;
    }

    // Getters
    public int getDoctorId() {
        return doctorId;
    }

    public String getDoctorNombre() {
        return doctorNombre;
    }

    public String getDoctorEspecialidad() {
        return doctorEspecialidad;
    }

    // Clase CitaPaciente
    public class CitaPaciente {
        private int pacienteId;
        private String nombrePaciente;
        private String horaPaciente;
        private String dolorPaciente;


        // Constructor
        public CitaPaciente(int pacienteId, String nombrePaciente, String horaPaciente, String dolorPaciente) {
            this.pacienteId = pacienteId;
            this.nombrePaciente = nombrePaciente;
            this.horaPaciente = horaPaciente;
            this.dolorPaciente = dolorPaciente;

        }

        // Getters
        public int getPacienteId() {
            return pacienteId;
        }

        public String getNombrePaciente() {
            return nombrePaciente;
        }

        public String getTelefonoPaciente() {
            return horaPaciente;
        }

        public String getNacimientoPaciente() {
            return dolorPaciente;
        }
    }

    // Clase CrearCita
    public class CrearCita {
        private String doctorNombre;
        private String nombrePaciente;

        // Constructor
        public CrearCita(String doctorNombre, String nombrePaciente) {
            this.doctorNombre = doctorNombre;
            this.nombrePaciente = nombrePaciente;
        }

        // Getters
        public String getDoctorNombre() {
            return doctorNombre;
        }

        public String getNombrePaciente() {
            return nombrePaciente;
        }
    }

    // Clase Administrador
    public class Administrador {
        private String username;
        private String password;

        // Constructor
        public Administrador(String username, String password) {
            this.username = username;
            this.password = password;
        }

        // Getters
        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Crear instancias de las clases
        citasDoctor doctor = new citasDoctor(123, "Daniel Horacio Cvaves Argot", "Dentista, Dolor de muela");
        citasDoctor.CitaPaciente paciente = doctor.new CitaPaciente(456, "cesar cienega serrano", "14:20   15/07/2025", "Dolor de muela");
        citasDoctor.CrearCita cita = doctor.new CrearCita("Horacio", "cesar cienega serrano");
        citasDoctor.Administrador admin = doctor.new Administrador("admin", "789");

        // Imprimir los detalles usando getters
        System.out.println("Doctor: " + doctor.getDoctorNombre() + ", Especialidad: " + doctor.getDoctorEspecialidad());
        System.out.println("Paciente: " + paciente.getNombrePaciente() + ", hora de cita y fecha de cita: " + paciente.getTelefonoPaciente());
        System.out.println("Cita: Doctor " + cita.getDoctorNombre() + " con Paciente " + cita.getNombrePaciente());
        System.out.println("Administrador: " + admin.getUsername());
        System.out.println("Dolor de  Paciente:" + paciente.dolorPaciente);
    }














}