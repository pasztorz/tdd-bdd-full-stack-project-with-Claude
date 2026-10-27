function Contact({ onNavigate }) {
  return (
    <section className="container">
      <h1>Contact</h1>
      <p>Content coming soon.</p>
      <button type="button" className="btn btn-primary" onClick={() => onNavigate('order')}>
        Start a custom order request
      </button>
    </section>
  )
}

export default Contact
